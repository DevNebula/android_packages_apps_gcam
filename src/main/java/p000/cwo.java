package p000;

/* compiled from: PG */
/* renamed from: cwo */
final class cwo implements kov {
    /* renamed from: a */
    private final /* synthetic */ cwj f13361a;

    cwo(cwj cwj) {
        this.f13361a = cwj;
    }

    /* renamed from: a */
    public final void mo10185a(Throwable th) {
        this.f13361a.f13329a.mo8831a("Cannot start burst", th);
        synchronized (this.f13361a.f13331c) {
            this.f13361a.mo12939d();
        }
        ((chy) this.f13361a.f13338j.mo10562a()).mo2314h_();
    }

    /* renamed from: b_ */
    public final /* synthetic */ void mo10186b_(Object obj) {
        if (!((Boolean) obj).booleanValue()) {
            this.f13361a.f13329a.mo8832b("Burst was not started.");
            synchronized (this.f13361a.f13331c) {
                this.f13361a.mo12939d();
            }
        }
    }
}
