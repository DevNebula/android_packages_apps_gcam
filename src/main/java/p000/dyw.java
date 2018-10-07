package p000;

/* compiled from: PG */
/* renamed from: dyw */
public final class dyw implements kwk {
    /* renamed from: a */
    private final kwk f16997a;
    /* renamed from: b */
    private final kwk f16998b;

    public dyw(kwk kwk, kwk kwk2) {
        this.f16997a = kwk;
        this.f16998b = kwk2;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo10566a() {
        Object a;
        kwk kwk = this.f16997a;
        gor gor = (gor) kwk.mo10566a();
        if (((kbg) this.f16998b.mo10566a()).mo9709b()) {
            a = gor.mo7282a("default_scope", "pref_camera_rect_key_ver_1", true);
        } else {
            a = imh.m3903a(Boolean.valueOf(false));
        }
        return (ilp) ktm.m14219a(a, "Cannot return null from a non-@Nullable @Provides method");
    }
}
