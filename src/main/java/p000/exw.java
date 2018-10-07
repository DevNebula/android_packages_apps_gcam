package p000;

/* compiled from: PG */
/* renamed from: exw */
public final class exw implements kwk {
    /* renamed from: a */
    private final kwk f17994a;
    /* renamed from: b */
    private final kwk f17995b;
    /* renamed from: c */
    private final kwk f17996c;
    /* renamed from: d */
    private final kwk f17997d;

    private exw(kwk kwk, kwk kwk2, kwk kwk3, kwk kwk4) {
        this.f17994a = kwk;
        this.f17995b = kwk2;
        this.f17996c = kwk3;
        this.f17997d = kwk4;
    }

    /* renamed from: a */
    public static exw m10238a(kwk kwk, kwk kwk2, kwk kwk3, kwk kwk4) {
        return new exw(kwk, kwk2, kwk3, kwk4);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo10566a() {
        int i;
        kwk kwk = this.f17994a;
        kwk kwk2 = this.f17995b;
        kwk kwk3 = this.f17996c;
        ixb ixb = (ixb) kwk.mo10566a();
        ikb ikb = (ikb) kwk2.mo10566a();
        bmb bmb = (bmb) kwk3.mo10566a();
        etg etg = (etg) this.f17997d.mo10566a();
        if (bmb.mo2021c()) {
            i = 3;
        } else {
            i = 0;
        }
        if (euh.m2182b(bmb, etg)) {
            i += 45;
        }
        iqo exj = new exj(bmb, ixb, i);
        ikb.mo8557a(exj);
        return (exi) ktm.m14219a(exj, "Cannot return null from a non-@Nullable @Provides method");
    }
}
