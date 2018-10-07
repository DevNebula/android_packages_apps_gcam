package p000;

import com.google.googlex.gcam.ProgressCallback;

/* compiled from: PG */
/* renamed from: bzf */
final class bzf extends ProgressCallback {
    /* renamed from: a */
    private final /* synthetic */ bzx f12035a;

    bzf(bzx bzx) {
        this.f12035a = bzx;
    }

    public final void Run(int i, float f) {
        jri.m13405b(this.f12035a.mo2240g().mo9709b());
        caf caf = (caf) this.f12035a.mo2240g().mo9706a();
        ccy ccy = caf.f1818a;
        fwa fwa = caf.f1819b;
        if (ccy.f12192d.mo9709b()) {
            ccy.f12192d.mo9706a();
            f *= 0.5f;
        }
        fwa.f4984d.mo13288a(f);
    }
}
