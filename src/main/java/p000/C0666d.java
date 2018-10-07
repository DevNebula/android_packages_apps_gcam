package p000;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* compiled from: PG */
/* renamed from: d */
public final class C0666d extends C0202e {
    /* renamed from: a */
    private final Object f13649a = new Object();
    /* renamed from: b */
    private ExecutorService f13650b = Executors.newFixedThreadPool(2);
    /* renamed from: c */
    private volatile Handler f13651c;

    /* renamed from: a */
    public final void mo6151a(Runnable runnable) {
        this.f13650b.execute(runnable);
    }

    /* renamed from: b */
    public final boolean mo6153b() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    /* renamed from: b */
    public final void mo6152b(Runnable runnable) {
        if (this.f13651c == null) {
            synchronized (this.f13649a) {
                if (this.f13651c == null) {
                    this.f13651c = new Handler(Looper.getMainLooper());
                }
            }
        }
        this.f13651c.post(runnable);
    }
}
