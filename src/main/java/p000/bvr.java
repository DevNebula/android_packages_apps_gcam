package p000;

/* compiled from: PG */
/* renamed from: bvr */
public final class bvr implements kwk {
    /* renamed from: a */
    private final kwk f11845a;
    /* renamed from: b */
    private final kwk f11846b;

    public bvr(kwk kwk, kwk kwk2) {
        this.f11845a = kwk;
        this.f11846b = kwk2;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo10566a() {
        Object obj;
        kwk kwk = this.f11845a;
        kwk kwk2 = this.f11846b;
        if (((bmb) kwk.mo10566a()).mo2020b()) {
            obj = (bvm) kwk2.mo10566a();
        } else {
            obj = new bvd();
        }
        return (bvm) ktm.m14219a(obj, "Cannot return null from a non-@Nullable @Provides method");
    }
}
