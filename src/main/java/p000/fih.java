package p000;

/* compiled from: PG */
/* renamed from: fih */
class fih extends fiw {
    /* renamed from: a */
    private final /* synthetic */ fie f18318a;

    fih(fie fie) {
        this.f18318a = fie;
    }

    /* renamed from: a */
    public void mo6824a(fhq fhq) {
        synchronized (this.f18318a.f18310c) {
            fie fie = this.f18318a;
            fie.f18312e++;
            fie.f18311d++;
            if (fie.f18311d >= fie.f18308a) {
                fie.f18311d = 0;
                fie.f18309b.mo8837e("Backing off");
                fie = this.f18318a;
                fie.f18312e--;
            }
        }
        try {
            this.f18318a.mo13244a();
        } catch (isr e) {
        }
    }
}
