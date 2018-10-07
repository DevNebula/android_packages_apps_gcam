package p000;

/* compiled from: PG */
/* renamed from: bfw */
final class bfw implements iqt {
    /* renamed from: a */
    private boolean f11271a = true;
    /* renamed from: b */
    private final /* synthetic */ bib f11272b;
    /* renamed from: c */
    private final /* synthetic */ bft f11273c;

    bfw(bft bft, bib bib) {
        this.f11273c = bft;
        this.f11272b = bib;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo8826a(Object obj) {
        if (this.f11271a) {
            this.f11271a = false;
            return;
        }
        synchronized (this.f11273c.f22668g) {
            if (!this.f11273c.f22671j.equals(bga.RECORDING)) {
                if (!this.f11273c.f22671j.equals(bga.PAUSED)) {
                    String str = bft.f22658a;
                    String valueOf = String.valueOf(this.f11273c.f22671j);
                    StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 50);
                    stringBuilder.append("Ignore observableZoomedCropRegion callback: state=");
                    stringBuilder.append(valueOf);
                    bli.m898e(str, stringBuilder.toString());
                    return;
                }
            }
            this.f11272b.run();
        }
    }
}
