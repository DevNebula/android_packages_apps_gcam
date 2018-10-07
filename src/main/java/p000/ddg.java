package p000;

/* compiled from: PG */
/* renamed from: ddg */
final class ddg implements Runnable {
    /* renamed from: a */
    public final /* synthetic */ dbn f3209a;
    /* renamed from: b */
    public final /* synthetic */ dcr f3210b;
    /* renamed from: c */
    private final /* synthetic */ int f3211c;

    ddg(dcr dcr, dbn dbn, int i) {
        this.f3210b = dcr;
        this.f3209a = dbn;
        this.f3211c = i;
    }

    public final void run() {
        dak H = ((dbu) this.f3210b.mo2152d()).mo12978H();
        H.mo5913a(new ddh(this));
        int i = this.f3211c;
        ikd.m12501a();
        H.f3111b.mo13530a(i);
        ((dbu) this.f3210b.mo2152d()).mo13008o().mo13453u();
    }
}
