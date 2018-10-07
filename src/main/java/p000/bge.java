package p000;

/* compiled from: PG */
/* renamed from: bge */
final class bge implements iqt {
    /* renamed from: a */
    private boolean f11284a = true;
    /* renamed from: b */
    private final /* synthetic */ bib f11285b;
    /* renamed from: c */
    private final /* synthetic */ bgb f11286c;

    bge(bgb bgb, bib bib) {
        this.f11286c = bgb;
        this.f11285b = bib;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo8826a(Object obj) {
        if (this.f11284a) {
            this.f11284a = false;
            return;
        }
        synchronized (this.f11286c.f22691d) {
            if (!this.f11286c.f22694g.equals(bgj.RECORDING)) {
                if (!this.f11286c.f22694g.equals(bgj.PAUSED)) {
                    String str = bgb.f22688a;
                    String valueOf = String.valueOf(this.f11286c.f22694g);
                    StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 50);
                    stringBuilder.append("Ignore observableZoomedCropRegion callback: state=");
                    stringBuilder.append(valueOf);
                    bli.m898e(str, stringBuilder.toString());
                    return;
                }
            }
            this.f11285b.run();
        }
    }
}
