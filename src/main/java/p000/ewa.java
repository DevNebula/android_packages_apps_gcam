package p000;

/* renamed from: ewa */
public final /* synthetic */ class ewa implements fvg {
    /* renamed from: a */
    private final ird f17885a;
    /* renamed from: b */
    private final kwk f17886b;
    /* renamed from: c */
    private final kwk f17887c;
    /* renamed from: d */
    private final kwk f17888d;

    public ewa(ird ird, kwk kwk, kwk kwk2, kwk kwk3) {
        this.f17885a = ird;
        this.f17886b = kwk;
        this.f17887c = kwk2;
        this.f17888d = kwk3;
    }

    public final void run() {
        ird ird = this.f17885a;
        kwk kwk = this.f17886b;
        kwk kwk2 = this.f17887c;
        kwk kwk3 = this.f17888d;
        ird.mo8856a("MICRO_EncoderModule#shutdown_controller");
        ((etl) kwk.mo10566a()).close();
        ((etc) kwk2.mo10566a()).mo6586b((esu) kwk3.mo10566a());
        ird.mo8857b();
    }
}
