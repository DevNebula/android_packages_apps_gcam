package p000;

/* renamed from: hew */
final /* synthetic */ class hew implements Runnable {
    /* renamed from: a */
    private final hev f6503a;
    /* renamed from: b */
    private final ird f6504b;
    /* renamed from: c */
    private final kpw f6505c;

    hew(hev hev, ird ird, kpw kpw) {
        this.f6503a = hev;
        this.f6504b = ird;
        this.f6505c = kpw;
    }

    public final void run() {
        hev hev = this.f6503a;
        ird ird = this.f6504b;
        knk knk = this.f6505c;
        ird.mo8856a("CameraActivityUi#mainInflate");
        hev.f6501b.f6487a.inflate();
        hev.f6501b.f6488b.inflate();
        knk.mo15641a(new hes(hev.f6501b.f6494h));
        ird.mo8857b();
    }
}
