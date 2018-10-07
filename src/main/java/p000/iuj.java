package p000;

import android.hardware.camera2.CameraManager;

/* compiled from: PG */
/* renamed from: iuj */
public final class iuj implements kwk {
    /* renamed from: a */
    private final kwk f21280a;
    /* renamed from: b */
    private final kwk f21281b;

    private iuj(kwk kwk, kwk kwk2) {
        this.f21280a = kwk;
        this.f21281b = kwk2;
    }

    /* renamed from: a */
    public static iuj m12709a(kwk kwk, kwk kwk2) {
        return new iuj(kwk, kwk2);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo10566a() {
        return new iui((CameraManager) this.f21280a.mo10566a(), (iuk) this.f21281b.mo10566a());
    }
}
