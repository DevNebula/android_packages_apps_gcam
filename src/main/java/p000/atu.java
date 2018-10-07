package p000;

/* compiled from: PG */
/* renamed from: atu */
public final class atu implements kwk {
    /* renamed from: a */
    private final kwk f10741a;
    /* renamed from: b */
    private final kwk f10742b;
    /* renamed from: c */
    private final kwk f10743c;
    /* renamed from: d */
    private final kwk f10744d;
    /* renamed from: e */
    private final kwk f10745e;

    private atu(kwk kwk, kwk kwk2, kwk kwk3, kwk kwk4, kwk kwk5) {
        this.f10741a = kwk;
        this.f10742b = kwk2;
        this.f10743c = kwk3;
        this.f10744d = kwk4;
        this.f10745e = kwk5;
    }

    /* renamed from: a */
    public static atu m7062a(kwk kwk, kwk kwk2, kwk kwk3, kwk kwk4, kwk kwk5) {
        return new atu(kwk, kwk2, kwk3, kwk4, kwk5);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo10566a() {
        Object obj;
        kwk kwk = this.f10741a;
        kwk kwk2 = this.f10742b;
        kwk kwk3 = this.f10744d;
        kwk kwk4 = this.f10745e;
        ffc ffc = (ffc) kwk.mo10566a();
        kwk2.mo10566a();
        if (ffc.mo9080s()) {
            obj = (fiw) kwk3.mo10566a();
        } else {
            fiw obj2 = (fiw) kwk4.mo10566a();
        }
        return (fiw) ktm.m14219a(obj2, "Cannot return null from a non-@Nullable @Provides method");
    }
}
