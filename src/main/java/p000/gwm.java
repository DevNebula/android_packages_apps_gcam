package p000;

/* compiled from: PG */
/* renamed from: gwm */
public final class gwm implements kwk {
    /* renamed from: a */
    private final kwk f19732a;
    /* renamed from: b */
    private final kwk f19733b;
    /* renamed from: c */
    private final kwk f19734c;
    /* renamed from: d */
    private final kwk f19735d;
    /* renamed from: e */
    private final kwk f19736e;
    /* renamed from: f */
    private final kwk f19737f;

    public gwm(gwl gwl, kwk kwk, kwk kwk2, kwk kwk3, kwk kwk4, kwk kwk5, kwk kwk6) {
        this.f19732a = kwk;
        this.f19733b = kwk2;
        this.f19734c = kwk3;
        this.f19735d = kwk4;
        this.f19736e = kwk5;
        this.f19737f = kwk6;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo10566a() {
        Object gwn;
        kwk kwk = this.f19732a;
        kwk kwk2 = this.f19733b;
        kwk kwk3 = this.f19734c;
        kwk kwk4 = this.f19735d;
        kwk kwk5 = this.f19736e;
        kwk kwk6 = this.f19737f;
        boolean booleanValue = ((Boolean) kwk.mo10566a()).booleanValue();
        ena ena = (ena) kwk4.mo10566a();
        ikd ikd = (ikd) kwk5.mo10566a();
        if (awl.m739b((awr) kwk6.mo10566a())) {
            gwn = new gwn();
        } else if (booleanValue) {
            gwa gwn2 = (gwa) kwk3.mo10566a();
            eio.m1804a(ikd, ena, gwn2);
        } else {
            gvv gwn22 = (gvv) kwk2.mo10566a();
            eio.m1804a(ikd, ena, gwn22);
        }
        return (gvt) ktm.m14219a(gwn22, "Cannot return null from a non-@Nullable @Provides method");
    }
}
