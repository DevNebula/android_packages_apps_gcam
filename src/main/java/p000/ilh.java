package p000;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: ilh */
final class ilh implements ilp {
    /* renamed from: a */
    private final ilp f24632a;

    ilh(ilp ilp) {
        this.f24632a = ilp;
    }

    /* renamed from: a */
    public final iqo mo13672a(iqt iqt, Executor executor) {
        return this.f24632a.mo13672a(new ili(executor, iqt), new imk());
    }

    /* renamed from: b */
    public final Object mo13673b() {
        return this.f24632a.mo13673b();
    }

    public final String toString() {
        kbd b = jqk.m13351b("filtered");
        b.mo9704a().f8551b = this.f24632a;
        return b.toString();
    }
}
