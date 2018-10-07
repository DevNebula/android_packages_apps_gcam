package p000;

/* compiled from: PG */
/* renamed from: blg */
public final class blg implements kwk {
    /* renamed from: a */
    private final kwk f11510a;

    private blg(ble ble, kwk kwk) {
        this.f11510a = kwk;
    }

    /* renamed from: a */
    public static blg m7601a(ble ble, kwk kwk) {
        return new blg(ble, kwk);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo10566a() {
        return blg.m7602a((iqz) this.f11510a.mo10566a());
    }

    /* renamed from: a */
    public static ira m7602a(iqz iqz) {
        Object obj;
        if (iqz instanceof ira) {
            obj = (ira) iqz;
        } else {
            blk obj2 = new blk(iqz);
        }
        return (ira) ktm.m14219a(obj2, "Cannot return null from a non-@Nullable @Provides method");
    }
}
