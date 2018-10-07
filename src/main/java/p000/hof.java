package p000;

/* compiled from: PG */
/* renamed from: hof */
final class hof implements kov {
    /* renamed from: a */
    private final /* synthetic */ hod f20221a;

    hof(hod hod) {
        this.f20221a = hod;
    }

    /* renamed from: a */
    public final void mo10185a(Throwable th) {
        bli.m898e(hod.f24495a, "Fail to connect to GoogleApiClient");
    }

    /* renamed from: b_ */
    public final /* synthetic */ void mo10186b_(Object obj) {
        hjk hjk = (hjk) obj;
        igl igl = this.f20221a;
        huq huq = hjk.f6637a.f20167a;
        huq.mo8134a(new ihz(huq, igl));
        hod hod = this.f20221a;
        Runnable hog = new hog(hjk);
        igo a = igo.m3801a("/camera_packet");
        a.f7367b.f7365a.put("camera_ready", Boolean.valueOf(false));
        hod.mo14939a(a, hog);
    }
}
