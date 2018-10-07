package p000;

/* compiled from: PG */
/* renamed from: bxg */
public final class bxg {
    /* renamed from: b */
    public static final bsb f1714b = new bsb("camera.raisr");
    /* renamed from: c */
    public static final bsa f1715c = new bsa("camera.p3");
    /* renamed from: d */
    public static final bsa f1716d = new bsa("camera.slowraw.RESTART");
    /* renamed from: e */
    public static final bsa f1717e = new bsa("camera.tbinning.RESTART");
    /* renamed from: f */
    public static final bsa f1718f = new bsa("camera.gcam_awb");
    /* renamed from: a */
    public final bmb f1719a;
    /* renamed from: g */
    public final int f1720g = 3;
    /* renamed from: h */
    public final int f1721h;
    /* renamed from: i */
    public final int f1722i;

    bxg(bkw bkw, bmb bmb, iwc iwc) {
        boolean z;
        boolean z2 = true;
        this.f1719a = bmb;
        this.f1721h = Math.max(this.f1720g, iwc.mo9115a("persist.gcam.max_burst_size", bkw.mo2001d()));
        this.f1722i = Math.max(this.f1720g, iwc.mo9115a("persist.gcam.zsl_buffer_size", ije.m3829a(bkw.f1283a, "camera:hdr_plus_zsl_buffer_count", bkw.mo2001d() + 2)));
        if (this.f1720g <= this.f1721h) {
            z = true;
        } else {
            z = false;
        }
        jri.m13405b(z);
        if (this.f1721h > this.f1722i) {
            z2 = false;
        }
        jri.m13405b(z2);
    }
}
