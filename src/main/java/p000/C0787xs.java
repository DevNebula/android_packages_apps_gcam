package p000;

import android.hardware.camera2.CameraCharacteristics;

/* compiled from: PG */
/* renamed from: xs */
final class C0787xs extends abh {
    /* renamed from: a */
    private CameraCharacteristics f22392a;

    C0787xs(CameraCharacteristics cameraCharacteristics) {
        this.f22392a = cameraCharacteristics;
    }

    /* renamed from: a */
    public final int mo54a() {
        return ((Integer) this.f22392a.get(CameraCharacteristics.SENSOR_ORIENTATION)).intValue();
    }

    /* renamed from: b */
    public final boolean mo56b() {
        return ((Integer) this.f22392a.get(CameraCharacteristics.LENS_FACING)).equals(Integer.valueOf(1));
    }

    /* renamed from: c */
    public final boolean mo57c() {
        return ((Integer) this.f22392a.get(CameraCharacteristics.LENS_FACING)).equals(Integer.valueOf(0));
    }
}
