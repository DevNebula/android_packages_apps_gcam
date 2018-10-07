package p000;

import android.os.Handler;
import android.os.Handler.Callback;
import android.os.HandlerThread;
import com.google.googlex.gcam.hdrplus.MetadataConverter;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: PG */
/* renamed from: hs */
public final class C0275hs {
    /* renamed from: a */
    public final Object f6904a = new Object();
    /* renamed from: b */
    public HandlerThread f6905b;
    /* renamed from: c */
    public Handler f6906c;
    /* renamed from: d */
    public final int f6907d;
    /* renamed from: e */
    private int f6908e;
    /* renamed from: f */
    private Callback f6909f = new C0276ht(this);
    /* renamed from: g */
    private final int f6910g;
    /* renamed from: h */
    private final String f6911h;

    public C0275hs(String str) {
        this.f6911h = str;
        this.f6910g = 10;
        this.f6907d = MetadataConverter.COLOR_SPACE_TRANSFORM_MATRIX_RATIONAL_DENOMINATOR;
        this.f6908e = 0;
    }

    /* renamed from: a */
    final void mo8082a(Runnable runnable) {
        synchronized (this.f6904a) {
            if (this.f6905b == null) {
                this.f6905b = new HandlerThread(this.f6911h, this.f6910g);
                this.f6905b.start();
                this.f6906c = new Handler(this.f6905b.getLooper(), this.f6909f);
                this.f6908e++;
            }
            this.f6906c.removeMessages(0);
            Handler handler = this.f6906c;
            handler.sendMessage(handler.obtainMessage(1, runnable));
        }
    }

    /* renamed from: a */
    public final Object mo8081a(Callable callable, int i) {
        ReentrantLock reentrantLock = new ReentrantLock();
        Condition newCondition = reentrantLock.newCondition();
        AtomicReference atomicReference = new AtomicReference();
        AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        mo8082a(new C0279hw(atomicReference, callable, reentrantLock, atomicBoolean, newCondition));
        reentrantLock.lock();
        try {
            Object obj;
            if (atomicBoolean.get()) {
                long toNanos = TimeUnit.MILLISECONDS.toNanos((long) i);
                while (true) {
                    try {
                        toNanos = newCondition.awaitNanos(toNanos);
                    } catch (InterruptedException e) {
                    }
                    if (!atomicBoolean.get()) {
                        obj = atomicReference.get();
                        reentrantLock.unlock();
                        break;
                    } else if (toNanos <= 0) {
                        throw new InterruptedException("timeout");
                    }
                }
            }
            obj = atomicReference.get();
            return obj;
        } finally {
            reentrantLock.unlock();
        }
    }
}
