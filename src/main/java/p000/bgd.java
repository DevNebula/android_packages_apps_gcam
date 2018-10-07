package p000;

/* compiled from: PG */
/* renamed from: bgd */
final class bgd implements iqt {
    /* renamed from: a */
    private boolean f11281a = true;
    /* renamed from: b */
    private final /* synthetic */ bib f11282b;
    /* renamed from: c */
    private final /* synthetic */ bgb f11283c;

    bgd(bgb bgb, bib bib) {
        this.f11283c = bgb;
        this.f11282b = bib;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo8826a(Object obj) {
        if (this.f11281a) {
            this.f11281a = false;
            return;
        }
        synchronized (this.f11283c.f22691d) {
            if (!this.f11283c.f22694g.equals(bgj.RECORDING)) {
                if (!this.f11283c.f22694g.equals(bgj.PAUSED)) {
                    String str = bgb.f22688a;
                    String valueOf = String.valueOf(this.f11283c.f22694g);
                    StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 56);
                    stringBuilder.append("Ignore observableAeExposureCompensation callback: state=");
                    stringBuilder.append(valueOf);
                    bli.m898e(str, stringBuilder.toString());
                    return;
                }
            }
            this.f11282b.run();
        }
    }
}
