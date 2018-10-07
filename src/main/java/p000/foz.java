package p000;

import com.google.android.libraries.camera.exif.ExifInterface;

/* compiled from: PG */
/* renamed from: foz */
public final class foz {
    /* renamed from: a */
    public final long f4881a;
    /* renamed from: b */
    public final byte[] f4882b;
    /* renamed from: c */
    public final int f4883c;
    /* renamed from: d */
    public final ExifInterface f4884d;
    /* renamed from: e */
    public final iqp f4885e;
    /* renamed from: f */
    public final boolean f4886f;

    private foz(long j, byte[] bArr, iqp iqp, int i, ExifInterface exifInterface, boolean z) {
        this.f4881a = j;
        this.f4882b = bArr;
        this.f4883c = i;
        this.f4885e = iqp;
        this.f4884d = exifInterface;
        this.f4886f = z;
    }

    /* renamed from: a */
    public static foz m2410a(long j, byte[] bArr, iqp iqp, int i, ExifInterface exifInterface, hju hju, boolean z) {
        if (hju != null) {
            hju.mo7914a(exifInterface);
        }
        return new foz(j, bArr, iqp, i, exifInterface, z);
    }
}
