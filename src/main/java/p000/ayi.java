package p000;

/* compiled from: PG */
/* renamed from: ayi */
public final class ayi implements kwk {
    /* renamed from: a */
    private final kwk f11039a;
    /* renamed from: b */
    private final kwk f11040b;
    /* renamed from: c */
    private final kwk f11041c;

    public ayi(kwk kwk, kwk kwk2, kwk kwk3) {
        this.f11039a = kwk;
        this.f11040b = kwk2;
        this.f11041c = kwk3;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo10566a() {
        kwk kwk = this.f11039a;
        kwk kwk2 = this.f11040b;
        Object obj = (axu) kwk2.mo10566a();
        axz axz = (axz) this.f11041c.mo10566a();
        if (!((kbg) kwk.mo10566a()).mo9709b()) {
            obj = axz;
        }
        return (ayw) ktm.m14219a(obj, "Cannot return null from a non-@Nullable @Provides method");
    }
}
