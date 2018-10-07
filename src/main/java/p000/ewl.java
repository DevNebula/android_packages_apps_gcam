package p000;

/* renamed from: ewl */
public final /* synthetic */ class ewl implements Runnable {
    /* renamed from: a */
    private final ird f4525a;
    /* renamed from: b */
    private final kwk f4526b;
    /* renamed from: c */
    private final kwk f4527c;

    public ewl(ird ird, kwk kwk, kwk kwk2) {
        this.f4525a = ird;
        this.f4526b = kwk;
        this.f4527c = kwk2;
    }

    public final void run() {
        ird ird = this.f4525a;
        kwk kwk = this.f4526b;
        kwk kwk2 = this.f4527c;
        ird.mo8856a("MICRO_GyroModule#runGyroStartupTask");
        ((kpw) kwk.mo10566a()).mo15641a(Boolean.valueOf(((exx) kwk2.mo10566a()).mo6671a()));
        ird.mo8857b();
    }
}
