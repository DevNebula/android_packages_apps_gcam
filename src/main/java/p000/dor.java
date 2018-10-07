package p000;

import android.hardware.camera2.CameraCharacteristics;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* renamed from: dor */
public final class dor {
    /* renamed from: a */
    public static final String f3379a = bli.m887a("OneCamFtrCnfgCrtr");

    /* renamed from: a */
    static kbg m1711a(ffc ffc, bkw bkw) {
        Integer num = (Integer) ffc.mo9056a(CameraCharacteristics.LENS_FACING);
        if (num == null) {
            bli.m891b(f3379a, "Camera not facing anywhere.");
            return kau.f21835a;
        }
        switch (num.intValue()) {
            case 0:
                return fhd.m2340a(ije.m3829a(bkw.f1283a, "camera:capture_support_level_override_front", -1));
            case 1:
                return fhd.m2340a(ije.m3829a(bkw.f1283a, "camera:capture_support_level_override_back", -1));
            default:
                bli.m891b(f3379a, "Not sure where camera is facing to.");
                return kau.f21835a;
        }
    }

    /* renamed from: a */
    public static fhc m1710a(bkw bkw, bmp bmp, hjf hjf, ird ird) {
        Throwable e;
        ird.mo8856a("OneFeatureConfig#provide");
        try {
            if (((Boolean) bmp.mo2029a().get()).booleanValue()) {
                int i;
                ird.mo8856a("HdrPlus#getSupportLevel");
                if (bkw.mo2002e()) {
                    i = C0252go.f5850aw;
                } else {
                    i = C0252go.f5849av;
                }
                ird.mo8858b("CaptureModuleDetector#new");
                kaw dos = new dos(bkw, hjf);
                ird.mo8858b("OneFeatureConfig#new");
                int c = bkw.mo2000c();
                bkw.mo2001d();
                fhc fhc = new fhc(dos, i, c, bkw.mo1999b());
                ird.mo8857b();
                ird.mo8857b();
                return fhc;
            }
            throw new IllegalStateException("No Cameras are currently available.");
        } catch (InterruptedException e2) {
            e = e2;
            throw new IllegalStateException("No Cameras are currently available.", e);
        } catch (ExecutionException e3) {
            e = e3;
            throw new IllegalStateException("No Cameras are currently available.", e);
        }
    }

    /* renamed from: a */
    public static fgw m1709a() {
        return fgw.m2329f();
    }
}
