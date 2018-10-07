package p000;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: ilf */
public final class ilf implements ilp {
    /* renamed from: a */
    private final ilp f24631a;

    ilf(ilp ilp) {
        this.f24631a = ilp;
    }

    /* renamed from: a */
    public final iqo mo13672a(iqt iqt, Executor executor) {
        iqo ikb = new ikb();
        ikb.mo8557a(this.f24631a.mo13672a(new ilg(iqt, executor, ikb), new imk()));
        return ikb;
    }

    /* renamed from: b */
    public final Object mo13673b() {
        return ((ilp) this.f24631a.mo13673b()).mo13673b();
    }

    public final String toString() {
        kbd b = jqk.m13351b("DerefObs");
        b.mo9704a().f8551b = this.f24631a;
        return b.toString();
    }
}
