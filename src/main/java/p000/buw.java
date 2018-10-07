package p000;

/* compiled from: PG */
/* renamed from: buw */
public final class buw implements kwk {
    /* renamed from: a */
    private final kwk f11822a;
    /* renamed from: b */
    private final kwk f11823b;

    public buw(kwk kwk, kwk kwk2) {
        this.f11822a = kwk;
        this.f11823b = kwk2;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo10566a() {
        Object obj;
        kwk kwk = this.f11822a;
        kwk kwk2 = this.f11823b;
        if (((bmb) kwk.mo10566a()).mo2020b()) {
            obj = (bus) kwk2.mo10566a();
        } else {
            obj = new bun();
        }
        return (bus) ktm.m14219a(obj, "Cannot return null from a non-@Nullable @Provides method");
    }
}
