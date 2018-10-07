package p000;

/* compiled from: PG */
/* renamed from: flo */
public final class flo implements kwk {
    /* renamed from: a */
    private final fln f18404a;
    /* renamed from: b */
    private final kwk f18405b;
    /* renamed from: c */
    private final kwk f18406c;
    /* renamed from: d */
    private final kwk f18407d;

    public flo(fln fln, kwk kwk, kwk kwk2, kwk kwk3) {
        this.f18404a = fln;
        this.f18405b = kwk;
        this.f18406c = kwk2;
        this.f18407d = kwk3;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo10566a() {
        fjm fjm;
        fln fln = this.f18404a;
        kwk kwk = this.f18405b;
        kwk kwk2 = this.f18406c;
        fyt fyt = (fyt) this.f18407d.mo10566a();
        if (fln.f4845a) {
            fjm = (fjm) kwk2.mo10566a();
        } else {
            fjm = (fjm) kwk.mo10566a();
        }
        return (fjm) ktm.m14219a(new fkv(fjm, fyt), "Cannot return null from a non-@Nullable @Provides method");
    }
}
