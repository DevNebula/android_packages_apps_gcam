package p000;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: imn */
public final class imn implements ilp {
    /* renamed from: a */
    public final iml f24641a = new iml(Integer.valueOf(0));
    /* renamed from: b */
    public final Object f24642b = new Object();
    /* renamed from: c */
    public int f24643c = 0;
    /* renamed from: d */
    private final ilp f24644d;
    /* renamed from: e */
    private final ilp f24645e = ilq.m3875a(ilq.m3880a(this.f24644d, this.f24641a), new imo());

    public imn(ilp ilp) {
        this.f24644d = ilp;
    }

    /* renamed from: a */
    public final iqo mo13672a(iqt iqt, Executor executor) {
        return this.f24645e.mo13672a(iqt, executor);
    }

    /* renamed from: a */
    public final iqo mo15009a() {
        synchronized (this.f24642b) {
            this.f24643c++;
            this.f24641a.f24640b = Integer.valueOf(this.f24643c);
        }
        this.f24641a.f24639a.m2973a();
        return new imp(this);
    }

    /* renamed from: b */
    public final Object mo13673b() {
        return this.f24645e.mo13673b();
    }
}
