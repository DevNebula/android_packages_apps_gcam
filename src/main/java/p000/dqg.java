package p000;

/* renamed from: dqg */
final /* synthetic */ class dqg implements Runnable {
    /* renamed from: a */
    private final dqf f3404a;

    dqg(dqf dqf) {
        this.f3404a = dqf;
    }

    public final void run() {
        dqf dqf = this.f3404a;
        dqf.f24051d.mo8836d("Closing one camera.");
        ikw.m3864a(dqf.f24049b, dqf.f24048a, "OneCameraLifetime");
        synchronized (dqf) {
            kpk kpk = dqf.f24052e;
            if (kpk != null) {
                kpk.cancel(true);
            }
        }
        kow.m13878a(dqf.f24050c, new dqh(dqf), kpq.f8776a);
        dqf.f24051d.mo8836d("OneCamera closed.");
    }
}
