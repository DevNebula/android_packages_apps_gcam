package com.google.android.libraries.smartburst.filterfw.filterpacks.base;

import android.util.Log;
import com.google.android.libraries.smartburst.filterfw.Filter;
import com.google.android.libraries.smartburst.filterfw.MffContext;
import com.google.android.libraries.smartburst.filterfw.Signature;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
public class ExecutorFilter extends Filter {
    public static final boolean DEBUG = false;
    public static final String TAG = "ExecutorFilter";
    public volatile boolean mIsShutdown = false;
    public final Queue mRunnableQueue = new ConcurrentLinkedQueue();

    /* compiled from: PG */
    /* renamed from: com.google.android.libraries.smartburst.filterfw.filterpacks.base.ExecutorFilter$1 */
    class C01351 implements Runnable {
        C01351() {
        }

        public void run() {
            ExecutorFilter.this.access$100();
        }
    }

    /* compiled from: PG */
    /* renamed from: com.google.android.libraries.smartburst.filterfw.filterpacks.base.ExecutorFilter$2 */
    class C01362 implements Runnable {
        C01362() {
        }

        public void run() {
            ExecutorFilter.this.access$100();
        }
    }

    /* compiled from: PG */
    /* renamed from: com.google.android.libraries.smartburst.filterfw.filterpacks.base.ExecutorFilter$3 */
    class C01373 extends AbstractExecutorService {
        C01373() {
        }

        public boolean awaitTermination(long j, TimeUnit timeUnit) {
            long nanoTime = System.nanoTime() + timeUnit.toNanos(j);
            while (!isTerminated()) {
                if (System.nanoTime() >= nanoTime) {
                    return false;
                }
                if (Thread.interrupted()) {
                    throw new InterruptedException();
                }
            }
            return true;
        }

        public void execute(Runnable runnable) {
            ExecutorFilter.this.execute(runnable);
        }

        public boolean isShutdown() {
            return ExecutorFilter.this.isShutdown();
        }

        public boolean isTerminated() {
            if (ExecutorFilter.this.isShutdown() && ExecutorFilter.this.mRunnableQueue.isEmpty()) {
                return true;
            }
            return false;
        }

        public void shutdown() {
            ExecutorFilter.this.shutdown();
        }

        public List shutdownNow() {
            return ExecutorFilter.this.shutdownNow();
        }
    }

    public ExecutorFilter(MffContext mffContext, String str) {
        super(mffContext, str);
    }

    public void execute(Runnable runnable) {
        if (isShutdown()) {
            throw new IllegalStateException("Attempting to post a command to an executor filter that has been shut down");
        }
        this.mRunnableQueue.add(runnable);
        wakeUp();
    }

    public ExecutorService getExecutorService() {
        return new C01373();
    }

    public Signature getSignature() {
        return new Signature().disallowOtherPorts();
    }

    public boolean isShutdown() {
        return this.mIsShutdown;
    }

    protected void onClose() {
        if (this.mRunnableQueue.isEmpty()) {
            Log.w(TAG, "Closing filter with non-empty runnable set");
        }
        this.mRunnableQueue.clear();
    }

    protected void onProcess() {
        Runnable runnable = (Runnable) this.mRunnableQueue.poll();
        if (runnable != null) {
            try {
                runnable.run();
                return;
            } catch (Throwable th) {
                String valueOf = String.valueOf(runnable);
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 25);
                stringBuilder.append("Error executing command: ");
                stringBuilder.append(valueOf);
                Log.e(TAG, stringBuilder.toString(), th);
                return;
            }
        }
        enterSleepState();
    }

    public void shutdown() {
        this.mIsShutdown = true;
        this.mRunnableQueue.add(new C01351());
        wakeUp();
    }

    public List shutdownNow() {
        this.mIsShutdown = true;
        List arrayList = new ArrayList(this.mRunnableQueue.size());
        Object obj = (Runnable) this.mRunnableQueue.poll();
        while (obj != null) {
            arrayList.add(obj);
            Runnable obj2 = (Runnable) this.mRunnableQueue.poll();
        }
        this.mRunnableQueue.add(new C01362());
        wakeUp();
        return arrayList;
    }
}
