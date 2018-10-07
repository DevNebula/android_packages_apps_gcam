package p000;

/* compiled from: PG */
/* renamed from: bfv */
final class bfv implements iqt {
    /* renamed from: a */
    private boolean f11268a = true;
    /* renamed from: b */
    private final /* synthetic */ bib f11269b;
    /* renamed from: c */
    private final /* synthetic */ bft f11270c;

    bfv(bft bft, bib bib) {
        this.f11270c = bft;
        this.f11269b = bib;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo8826a(Object obj) {
        if (this.f11268a) {
            this.f11268a = false;
            return;
        }
        synchronized (this.f11270c.f22668g) {
            if (!this.f11270c.f22671j.equals(bga.RECORDING)) {
                if (!this.f11270c.f22671j.equals(bga.PAUSED)) {
                    String str = bft.f22658a;
                    String valueOf = String.valueOf(this.f11270c.f22671j);
                    StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 56);
                    stringBuilder.append("Ignore observableAeExposureCompensation callback: state=");
                    stringBuilder.append(valueOf);
                    bli.m898e(str, stringBuilder.toString());
                    return;
                }
            }
            this.f11269b.run();
        }
    }
}
