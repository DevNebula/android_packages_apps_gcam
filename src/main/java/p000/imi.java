package p000;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: imi */
final class imi implements ilp {
    /* renamed from: a */
    private final /* synthetic */ Object f24638a;

    imi(Object obj) {
        this.f24638a = obj;
    }

    /* renamed from: a */
    public final iqo mo13672a(iqt iqt, Executor executor) {
        executor.execute(new imj(iqt, this.f24638a));
        return imh.f7458a;
    }

    /* renamed from: b */
    public final Object mo13673b() {
        return this.f24638a;
    }

    public final String toString() {
        kbd b = jqk.m13351b("Prop.of");
        b.mo9704a().f8551b = this.f24638a;
        return b.toString();
    }

    /* renamed from: a */
    public final void mo8826a(Object obj) {
    }
}
