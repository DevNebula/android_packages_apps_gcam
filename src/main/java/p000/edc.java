package p000;

/* compiled from: PG */
/* renamed from: edc */
class edc extends gqj {
    /* renamed from: a */
    private final /* synthetic */ edb f24127a;

    edc(edb edb) {
        this.f24127a = edb;
        super(null);
    }

    /* renamed from: a */
    public final void mo7343a() {
        bli.m894c(edb.f24118a, "Capture state enter");
        this.f24127a.f24120c.mo13553a(C0252go.f5861bG);
        this.f24127a.f24124g.mo7672b(true);
        this.f24127a.f24121d.setClickable(true);
    }

    /* renamed from: b */
    public final void mo7344b() {
        bli.m894c(edb.f24118a, "Capture state exit");
        this.f24127a.f24120c.mo13553a(C0252go.f5863bI);
        this.f24127a.f24124g.mo7672b(false);
        this.f24127a.f24121d.setClickable(false);
    }
}
