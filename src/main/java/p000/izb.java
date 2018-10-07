package p000;

import java.util.concurrent.Callable;

/* compiled from: PG */
/* renamed from: izb */
public final class izb implements AutoCloseable {
    /* renamed from: a */
    public final kpw f7946a;
    /* renamed from: b */
    private final Object f7947b = new Object();
    /* renamed from: c */
    private final Callable f7948c;
    /* renamed from: d */
    private Object f7949d;

    private izb(Callable callable) {
        this.f7948c = callable;
        this.f7946a = kpw.m18486d();
        this.f7949d = null;
    }

    public final void close() {
        synchronized (this.f7947b) {
            if (this.f7946a.isDone()) {
                return;
            }
            this.f7946a.mo15641a(this.f7949d);
        }
    }

    /* renamed from: a */
    public static izb m4419a(Callable callable) {
        return new izb(callable);
    }

    /* renamed from: a */
    public final Object mo9210a() {
        Object obj;
        synchronized (this.f7947b) {
            obj = this.f7949d;
            if (obj != null) {
            } else {
                this.f7949d = this.f7948c.call();
                obj = this.f7949d;
            }
        }
        return obj;
    }
}
