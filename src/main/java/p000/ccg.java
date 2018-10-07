package p000;

import android.hardware.camera2.CameraManager;

/* compiled from: PG */
/* renamed from: ccg */
public final class ccg implements kwk {
    /* renamed from: a */
    private final kwk f12143a;

    private ccg(kwk kwk) {
        this.f12143a = kwk;
    }

    /* renamed from: a */
    public static ccg m8087a(kwk kwk) {
        return new ccg(kwk);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo10566a() {
        return (CameraManager) ktm.m14219a((CameraManager) ((ccb) this.f12143a.mo10566a()).mo2252a("camera"), "Cannot return null from a non-@Nullable @Provides method");
    }
}
