package p000;

import android.graphics.drawable.Drawable;
import android.os.Handler;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* renamed from: aqd */
public final class aqd implements aqa, aqf, Runnable {
    /* renamed from: a */
    private static final aqe f25482a = new aqe();
    /* renamed from: b */
    private final Handler f25483b;
    /* renamed from: c */
    private final int f25484c;
    /* renamed from: d */
    private final int f25485d;
    /* renamed from: e */
    private final boolean f25486e;
    /* renamed from: f */
    private Object f25487f;
    /* renamed from: g */
    private aqb f25488g;
    /* renamed from: h */
    private boolean f25489h;
    /* renamed from: i */
    private boolean f25490i;
    /* renamed from: j */
    private boolean f25491j;
    /* renamed from: k */
    private agg f25492k;

    public aqd(Handler handler, int i, int i2) {
        this(handler, i, i2, (byte) 0);
    }

    private aqd(Handler handler, int i, int i2, byte b) {
        this.f25483b = handler;
        this.f25484c = i;
        this.f25485d = i2;
        this.f25486e = true;
    }

    public final synchronized boolean cancel(boolean z) {
        boolean z2 = true;
        synchronized (this) {
            if (isDone()) {
                z2 = false;
            } else {
                this.f25489h = true;
                notifyAll();
                if (z) {
                    this.f25483b.post(this);
                }
            }
        }
        return z2;
    }

    /* renamed from: a */
    private final synchronized Object m17182a(Long l) {
        Object obj;
        if (this.f25486e && !isDone() && (arq.m680b() ^ 1) == 0) {
            throw new IllegalArgumentException("You must call this method on a background thread");
        } else if (this.f25489h) {
            throw new CancellationException();
        } else if (this.f25491j) {
            throw new ExecutionException(this.f25492k);
        } else if (this.f25490i) {
            obj = this.f25487f;
        } else {
            if (l == null) {
                wait(0);
            } else if (l.longValue() > 0) {
                long currentTimeMillis = System.currentTimeMillis();
                long longValue = l.longValue() + currentTimeMillis;
                while (!isDone() && currentTimeMillis < longValue) {
                    wait(longValue - currentTimeMillis);
                    currentTimeMillis = System.currentTimeMillis();
                }
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            } else if (this.f25491j) {
                throw new ExecutionException(this.f25492k);
            } else if (this.f25489h) {
                throw new CancellationException();
            } else if (this.f25490i) {
                obj = this.f25487f;
            } else {
                throw new TimeoutException();
            }
        }
        return obj;
    }

    public final Object get() {
        try {
            return m17182a(null);
        } catch (TimeoutException e) {
            throw new AssertionError(e);
        }
    }

    public final Object get(long j, TimeUnit timeUnit) {
        return m17182a(Long.valueOf(timeUnit.toMillis(j)));
    }

    /* renamed from: a */
    public final aqb mo12303a() {
        return this.f25488g;
    }

    /* renamed from: a */
    public final void mo12306a(aqr aqr) {
        aqr.mo1717a(this.f25484c, this.f25485d);
    }

    public final synchronized boolean isCancelled() {
        return this.f25489h;
    }

    public final synchronized boolean isDone() {
        boolean z;
        z = this.f25489h || this.f25490i || this.f25491j;
        return z;
    }

    /* renamed from: b */
    public final void mo1645b() {
    }

    /* renamed from: a */
    public final void mo12304a(Drawable drawable) {
    }

    /* renamed from: b */
    public final synchronized void mo12308b(Drawable drawable) {
    }

    /* renamed from: a */
    public final synchronized boolean mo1691a(agg agg) {
        this.f25491j = true;
        this.f25492k = agg;
        notifyAll();
        return false;
    }

    /* renamed from: c */
    public final void mo12310c(Drawable drawable) {
    }

    /* renamed from: a */
    public final synchronized void mo12307a(Object obj, ara ara) {
    }

    /* renamed from: a */
    public final synchronized boolean mo1692a(Object obj) {
        this.f25490i = true;
        this.f25487f = obj;
        notifyAll();
        return false;
    }

    /* renamed from: c */
    public final void mo1646c() {
    }

    /* renamed from: d */
    public final void mo1647d() {
    }

    /* renamed from: b */
    public final void mo12309b(aqr aqr) {
    }

    public final void run() {
        aqb aqb = this.f25488g;
        if (aqb != null) {
            aqb.mo1678c();
            this.f25488g = null;
        }
    }

    /* renamed from: a */
    public final void mo12305a(aqb aqb) {
        this.f25488g = aqb;
    }
}
