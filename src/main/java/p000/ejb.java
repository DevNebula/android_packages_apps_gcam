package p000;

/* compiled from: PG */
/* renamed from: ejb */
public final class ejb implements kov {
    /* renamed from: a */
    private final /* synthetic */ eja f17465a;

    public ejb(eja eja) {
        this.f17465a = eja;
    }

    /* renamed from: a */
    public final void mo10185a(Throwable th) {
        bli.m898e(eja.f17458a, "Fail to connect to GoogleApiClient");
        this.f17465a.f17460c = null;
    }

    /* renamed from: b_ */
    public final /* synthetic */ void mo10186b_(Object obj) {
        hjk hjk = (hjk) obj;
        bli.m894c(eja.f17458a, "Disconnecting");
        hut hut = hjk.f6637a;
        hut.f20167a.mo8140b((hus) hut);
        hut.f20167a.mo8141b(hut);
        hut.f20167a.mo8142c();
        this.f17465a.f17460c = null;
    }
}
