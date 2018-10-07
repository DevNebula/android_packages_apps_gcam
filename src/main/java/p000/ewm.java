package p000;

/* renamed from: ewm */
public final /* synthetic */ class ewm implements fvg {
    /* renamed from: a */
    private final ird f17920a;
    /* renamed from: b */
    private final kwk f17921b;

    public ewm(ird ird, kwk kwk) {
        this.f17920a = ird;
        this.f17921b = kwk;
    }

    public final void run() {
        ird ird = this.f17920a;
        kwk kwk = this.f17921b;
        ird.mo8856a("MICRO_GyroModule#stopGyroCapture");
        ((exx) kwk.mo10566a()).mo6672b();
        ird.mo8857b();
    }
}
