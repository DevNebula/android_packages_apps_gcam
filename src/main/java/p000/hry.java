package p000;

import com.google.android.apps.camera.metadata.refocus.GDepthUtil;

/* compiled from: PG */
/* renamed from: hry */
public final class hry {
    /* renamed from: a */
    public String f6898a;
    /* renamed from: b */
    public byte[] f6899b;

    /* renamed from: a */
    public static hry m3376a(C0556wd c0556wd) {
        if (c0556wd == null) {
            return null;
        }
        hry.m3377a();
        if (!c0556wd.mo11449b("http://ns.google.com/photos/1.0/image/", GDepthUtil.MIME) || !c0556wd.mo11449b("http://ns.google.com/photos/1.0/image/", "Data")) {
            return null;
        }
        hry hry = new hry();
        try {
            hry.f6898a = c0556wd.mo11458j("http://ns.google.com/photos/1.0/image/", GDepthUtil.MIME);
            if (!GDepthUtil.MIME_PNG.equals(hry.f6898a) && !GDepthUtil.MIME_JPEG.equals(hry.f6898a)) {
                return null;
            }
            hry.f6899b = c0556wd.mo11453e("http://ns.google.com/photos/1.0/image/", "Data");
            return hry;
        } catch (Throwable e) {
            kqg.f8786a.mo10213b(e);
            return null;
        }
    }

    /* renamed from: a */
    public static void m3377a() {
        try {
            C0557we.f9955a.mo11459a("http://ns.google.com/photos/1.0/image/", "GImage");
        } catch (Throwable e) {
            kqg.f8786a.mo10213b(e);
        }
    }
}
