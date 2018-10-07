package p000;

/* compiled from: PG */
/* renamed from: gdp */
public final class gdp {
    /* renamed from: a */
    public static final bsq f5329a = new bsq("camera.gouda_sec_img", false);
    /* renamed from: b */
    public static final bsq f5330b = new bsq("camera.gouda_debug_img", false);
    /* renamed from: c */
    public static final bsq f5331c = new bsq("camera.gouda.raw", false);
    /* renamed from: d */
    public static final bsq f5332d = new bsq("camera.gouda.front", true);
    /* renamed from: e */
    public static final bsq f5333e = new bsq("camera.gouda.depthdata", false);

    /* renamed from: a */
    public static kbg m2541a(kwk kwk, hjf hjf) {
        Object obj = 1;
        if ((!hjf.mo7905c() || hsz.f6974b == null) && !hjf.mo7906d()) {
            obj = null;
        }
        if (obj != null) {
            return (kbg) kwk.mo10566a();
        }
        return kau.f21835a;
    }

    /* renamed from: a */
    public static fyt m2540a(bkw bkw) {
        return new fxr(ije.m3829a(bkw.f1283a, "camera:max_gouda_inflight_shots", 5));
    }
}
