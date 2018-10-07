package p000;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: imc */
final class imc implements ilp {
    /* renamed from: a */
    private final /* synthetic */ Object f24634a;

    imc(Object obj) {
        this.f24634a = obj;
    }

    /* renamed from: a */
    public final iqo mo13672a(iqt iqt, Executor executor) {
        executor.execute(new imd(iqt, this.f24634a));
        return ilq.f7453a;
    }

    /* renamed from: b */
    public final Object mo13673b() {
        return this.f24634a;
    }

    public final String toString() {
        kbd b = jqk.m13351b("Obs.of");
        b.mo9704a().f8551b = this.f24634a;
        return b.toString();
    }
}
