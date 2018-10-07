package p000;

/* compiled from: PG */
/* renamed from: mj */
final class C0372mj implements Runnable {
    /* renamed from: a */
    public final /* synthetic */ C0713mg f9195a;

    C0372mj(C0713mg c0713mg) {
        this.f9195a = c0713mg;
    }

    public final void run() {
        C0713mg c0713mg = this.f9195a;
        c0713mg.f22065h.showAtLocation(c0713mg.f22064g, 55, 0, 0);
        this.f9195a.mo14224l();
        if (this.f9195a.mo14225n()) {
            this.f9195a.f22064g.setAlpha(0.0f);
            c0713mg = this.f9195a;
            c0713mg.f22067j = C0315jm.m4606a(c0713mg.f22064g).mo9758a(1.0f);
            this.f9195a.f22067j.mo9760a(new C0823mk(this));
            return;
        }
        this.f9195a.f22064g.setAlpha(1.0f);
        this.f9195a.f22064g.setVisibility(0);
    }
}
