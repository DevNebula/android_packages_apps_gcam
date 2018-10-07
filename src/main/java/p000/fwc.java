package p000;

import com.google.android.libraries.camera.exif.ExifInterface;

/* compiled from: PG */
/* renamed from: fwc */
public final class fwc {
    /* renamed from: a */
    public final byte[] f4985a;
    /* renamed from: b */
    public final iqp f4986b;
    /* renamed from: c */
    public final int f4987c;
    /* renamed from: d */
    public final ExifInterface f4988d;

    public fwc(byte[] bArr, iqp iqp, int i, ExifInterface exifInterface, hju hju) {
        this.f4985a = bArr;
        this.f4986b = iqp;
        this.f4987c = i;
        if (hju != null) {
            hju.mo7914a(exifInterface);
        }
        this.f4988d = exifInterface;
    }
}
