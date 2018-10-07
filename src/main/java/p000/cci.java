package p000;

import android.hardware.Sensor;
import android.hardware.SensorDirectChannel;
import com.google.googlex.gcam.DngColorCalibration.Illuminant;

/* compiled from: PG */
/* renamed from: cci */
public final class cci implements kwk {
    /* renamed from: a */
    public final cdi f12145a;
    /* renamed from: b */
    public final SensorDirectChannel f12146b;
    /* renamed from: c */
    public final Sensor f12147c;
    /* renamed from: d */
    public final ccl f12148d;

    public cci(cdi cdi, SensorDirectChannel sensorDirectChannel, Sensor sensor, ccl ccl) {
        this.f12145a = cdi;
        this.f12146b = sensorDirectChannel;
        this.f12147c = sensor;
        this.f12148d = ccl;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo10566a() {
        throw new NoSuchMethodError();
    }

    /* renamed from: a */
    public static float m8090a(byte[] bArr, int i) {
        return Float.intBitsToFloat(cci.m8091b(bArr, i));
    }

    /* renamed from: b */
    public static int m8091b(byte[] bArr, int i) {
        return (((bArr[i] & Illuminant.kOther) | ((bArr[i + 1] & Illuminant.kOther) << 8)) | ((bArr[i + 2] & Illuminant.kOther) << 16)) | ((bArr[i + 3] & Illuminant.kOther) << 24);
    }

    /* renamed from: c */
    public static long m8092c(byte[] bArr, int i) {
        return ((long) cci.m8091b(bArr, i + 12)) & 4294967295L;
    }

    /* renamed from: d */
    public static long m8093d(byte[] bArr, int i) {
        int i2 = i + 16;
        return (((long) (bArr[i2 + 7] & Illuminant.kOther)) << 56) + ((((((((long) (bArr[i2] & Illuminant.kOther)) + (((long) (bArr[i2 + 1] & Illuminant.kOther)) << 8)) + (((long) (bArr[i2 + 2] & Illuminant.kOther)) << 16)) + (((long) (bArr[i2 + 3] & Illuminant.kOther)) << 24)) + (((long) (bArr[i2 + 4] & Illuminant.kOther)) << 32)) + (((long) (bArr[i2 + 5] & Illuminant.kOther)) << 40)) + (((long) (bArr[i2 + 6] & Illuminant.kOther)) << 48));
    }
}
