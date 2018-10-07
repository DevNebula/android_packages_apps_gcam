package p000;

import android.hardware.Camera.CameraInfo;

/* compiled from: PG */
/* renamed from: yt */
final class C0799yt extends abh {
    /* renamed from: a */
    private CameraInfo f22451a;

    C0799yt(CameraInfo cameraInfo) {
        this.f22451a = cameraInfo;
    }

    /* renamed from: a */
    public final int mo54a() {
        return this.f22451a.orientation;
    }

    /* renamed from: b */
    public final boolean mo56b() {
        return this.f22451a.facing == 0;
    }

    /* renamed from: c */
    public final boolean mo57c() {
        return this.f22451a.facing == 1;
    }
}
