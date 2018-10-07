package p000;

import android.hardware.camera2.TotalCaptureResult;
import com.google.android.libraries.camera.exif.ExifInterface;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* renamed from: bke */
final class bke implements iju {
    /* renamed from: a */
    private final /* synthetic */ long f11489a;
    /* renamed from: b */
    private final /* synthetic */ Boolean f11490b;
    /* renamed from: c */
    private final /* synthetic */ Float f11491c;
    /* renamed from: d */
    private final /* synthetic */ bjz f11492d;

    bke(bjz bjz, long j, Boolean bool, Float f) {
        this.f11492d = bjz;
        this.f11489a = j;
        this.f11490b = bool;
        this.f11491c = f;
    }

    /* renamed from: a */
    private final kpk m7585a(iwp iwp, iwz iwz) {
        boolean z;
        long f = iwz.mo13744f();
        Object obj = (Long) iwp.mo13730a(TotalCaptureResult.SENSOR_TIMESTAMP);
        jri.m13404b(obj);
        if (f == obj.longValue()) {
            z = true;
        } else {
            z = false;
        }
        jri.m13405b(z);
        long currentTimeMillis = System.currentTimeMillis();
        jri.m13404b((Integer) iwp.mo13730a(TotalCaptureResult.JPEG_ORIENTATION));
        ByteBuffer a = ((ixa) iwz.mo13743e().get(0)).mo9144a();
        byte[] bArr = new byte[a.capacity()];
        a.get(bArr);
        iwz.close();
        ExifInterface exifInterface = new ExifInterface();
        try {
            int intValue;
            int intValue2;
            exifInterface.mo12673a(bArr);
            Integer a2 = exifInterface.mo8965a(ExifInterface.f13034x);
            if (a2 != null) {
                intValue = a2.intValue();
            } else {
                intValue = 0;
            }
            Integer a3 = exifInterface.mo8965a(ExifInterface.f13035y);
            if (a3 != null) {
                intValue2 = a3.intValue();
            } else {
                intValue2 = 0;
            }
            if (exifInterface.mo12678e(ExifInterface.f12988b) == null || exifInterface.mo12678e(ExifInterface.f12935a) == null) {
                exifInterface.mo12669a(exifInterface.mo12668a(ExifInterface.f12935a, Integer.valueOf(intValue)));
                exifInterface.mo12669a(exifInterface.mo12668a(ExifInterface.f12988b, Integer.valueOf(intValue2)));
            }
            File a4 = this.f11492d.f22794d.mo7436a(this.f11492d.f22794d.mo7437a(currentTimeMillis), ixx.JPEG);
            if (a4.exists()) {
                return kow.m13874a(new IOException("snapshot file already exists."));
            }
            this.f11492d.f22795e.mo7392a(a4, new ByteArrayInputStream(bArr), kbg.m4804c(exifInterface));
            iqm a5 = isx.m4216a(isx.m4217a(exifInterface));
            iqp iqp = new iqp(intValue, intValue2);
            kbg kbg = kau.f21835a;
            if (this.f11492d.f22797g.mo9709b()) {
                kbg = kbg.m4803b(((hjw) this.f11492d.f22797g.mo9706a()).mo7915d());
            }
            Object bju = new bju(exifInterface, a4, kbg, ixx.JPEG, iqp, this.f11490b.booleanValue(), this.f11491c.floatValue(), a5.f7692e, currentTimeMillis, System.currentTimeMillis() - this.f11489a);
            this.f11492d.mo14569b();
            return kow.m13873a(bju);
        } catch (IOException e) {
            bli.m891b(bjz.f22791a, "fail to read EXIF from JPEG byte array.");
            throw e;
        }
    }
}
