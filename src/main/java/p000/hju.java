package p000;

import com.google.android.libraries.camera.exif.ExifInterface;

/* compiled from: PG */
/* renamed from: hju */
public final class hju {
    /* renamed from: a */
    public static final bsc f6646a = new bsc("camera.debug_hw_ver");
    /* renamed from: b */
    private final hjf f6647b;

    public hju(hjf hjf, bsn bsn) {
        this.f6647b = hjf;
    }

    /* renamed from: a */
    public final void mo7914a(ExifInterface exifInterface) {
        int i = ExifInterface.f13013c;
        exifInterface.f13038P.mo8959a(ExifInterface.m8590g(i), exifInterface.mo12677d(i));
        if (this.f6647b.mo7906d()) {
            exifInterface.mo12669a(exifInterface.mo12668a(ExifInterface.f13015e, (Object) "QCAM-AA"));
            exifInterface.mo12669a(exifInterface.mo12668a(ExifInterface.f13014d, (Object) "QCAM-AA"));
        }
    }
}
