package p000;

import android.hardware.camera2.CameraManager;

/* compiled from: PG */
/* renamed from: iuq */
public final class iuq implements kwk {
    /* renamed from: a */
    private final kwk f21294a;
    /* renamed from: b */
    private final kwk f21295b;
    /* renamed from: c */
    private final kwk f21296c;

    private iuq(kwk kwk, kwk kwk2, kwk kwk3) {
        this.f21294a = kwk;
        this.f21295b = kwk2;
        this.f21296c = kwk3;
    }

    /* renamed from: a */
    public static iuq m12755a(kwk kwk, kwk kwk2, kwk kwk3) {
        return new iuq(kwk, kwk2, kwk3);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo10566a() {
        return new iup((CameraManager) this.f21294a.mo10566a(), (iui) this.f21295b.mo10566a(), (iqz) this.f21296c.mo10566a());
    }
}
