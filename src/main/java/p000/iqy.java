package p000;

/* compiled from: PG */
/* renamed from: iqy */
public final class iqy implements kwk {
    /* renamed from: a */
    private final kwk f21213a;

    private iqy(kwk kwk) {
        this.f21213a = kwk;
    }

    /* renamed from: a */
    public static iqy m12643a(kwk kwk) {
        return new iqy(kwk);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo10566a() {
        return iqy.m12644a((kbg) this.f21213a.mo10566a());
    }

    /* renamed from: a */
    public static iqz m12644a(kbg kbg) {
        Object obj;
        if (kbg.mo9709b()) {
            obj = (iqz) kbg.mo9706a();
        } else {
            obj = new iqw("libcamera").mo8827a("libcamera");
        }
        return (iqz) ktm.m14219a(obj, "Cannot return null from a non-@Nullable @Provides method");
    }
}
