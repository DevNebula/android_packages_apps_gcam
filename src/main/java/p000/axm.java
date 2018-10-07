package p000;

import android.annotation.TargetApi;
import android.hardware.camera2.CameraCharacteristics;

@TargetApi(21)
/* compiled from: PG */
/* renamed from: axm */
public final class axm {
    /* renamed from: a */
    public final int f1039a;
    /* renamed from: b */
    public final boolean f1040b;
    /* renamed from: c */
    private final gbv f1041c;

    public axm(gbv gbv, int i, boolean z) {
        this.f1039a = i;
        this.f1040b = z;
        this.f1041c = gbv;
    }

    public axm(gbv gbv, ffc ffc) {
        boolean z;
        int o = ffc.mo9076o();
        if (ffc.mo9064c() == iut.FRONT) {
            z = true;
        } else {
            z = false;
        }
        this(gbv, o, z);
    }

    /* renamed from: a */
    public final iqm mo1836a() {
        return iqm.m4095a(axm.m758a(this.f1039a, this.f1041c.f5283e.f7692e, this.f1040b));
    }

    /* renamed from: a */
    public static int m758a(int i, int i2, boolean z) {
        if (z) {
            i2 = (360 - i2) % 360;
        }
        return (i + i2) % 360;
    }

    /* renamed from: a */
    public static int m759a(int i, ffc ffc) {
        if (i == -1) {
            return 0;
        }
        Integer num = (Integer) ffc.mo9056a(CameraCharacteristics.LENS_FACING);
        Integer num2 = (Integer) ffc.mo9056a(CameraCharacteristics.SENSOR_ORIENTATION);
        if (num == null || num2 == null) {
            return 0;
        }
        boolean z;
        if (num.intValue() == 0) {
            z = true;
        } else {
            z = false;
        }
        return axm.m758a(num2.intValue(), i, z);
    }

    /* renamed from: b */
    public final ilp mo1837b() {
        return ilq.m3875a(new gcc(this.f1041c), new axn(this));
    }
}
