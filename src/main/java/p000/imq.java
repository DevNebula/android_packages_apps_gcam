package p000;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: imq */
public abstract class imq implements ilp {
    /* renamed from: a */
    public final ilp f24646a;
    /* renamed from: b */
    private final ilp f24647b;

    public imq(ilp ilp) {
        this.f24646a = ilp;
        this.f24647b = ilq.m3889b(new imr(this, ilp));
    }

    /* renamed from: b */
    public abstract Object mo15010b(Object obj);

    /* renamed from: a */
    public final iqo mo13672a(iqt iqt, Executor executor) {
        return this.f24647b.mo13672a(iqt, executor);
    }

    /* renamed from: b */
    public final Object mo13673b() {
        return this.f24647b.mo13673b();
    }
}
