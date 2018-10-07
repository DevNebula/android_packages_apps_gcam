package p000;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraManager;

/* compiled from: PG */
/* renamed from: xr */
final class C0786xr implements abg {
    /* renamed from: a */
    private final CameraManager f22389a;
    /* renamed from: b */
    private final String[] f22390b;
    /* renamed from: c */
    private final int f22391c;

    public C0786xr(CameraManager cameraManager, String[] strArr) {
        this.f22389a = cameraManager;
        this.f22390b = strArr;
        int i = -1;
        int i2 = -1;
        for (int i3 = 0; i3 < strArr.length; i3++) {
            try {
                int intValue = ((Integer) cameraManager.getCameraCharacteristics(strArr[i3]).get(CameraCharacteristics.LENS_FACING)).intValue();
                if (i2 == -1 && intValue == 1) {
                    i2 = i3;
                }
                if (i == -1 && intValue == 0) {
                    i = i3;
                }
            } catch (Throwable e) {
                aby aby = C0785xq.f22379a;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Couldn't get characteristics of camera '");
                stringBuilder.append(i3);
                stringBuilder.append("'");
                abx.m88b(aby, stringBuilder.toString(), e);
            }
        }
        this.f22391c = i2;
    }

    /* renamed from: a */
    public final abh mo53a(int i) {
        try {
            return new C0787xs(this.f22389a.getCameraCharacteristics(this.f22390b[i]));
        } catch (CameraAccessException e) {
            return null;
        }
    }

    /* renamed from: a */
    public final int mo52a() {
        return this.f22391c;
    }
}
