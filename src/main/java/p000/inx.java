package p000;

import android.media.CamcorderProfile;

/* compiled from: PG */
/* renamed from: inx */
public final class inx {
    /* renamed from: a */
    public static ioa m3957a(iur iur, inz inz) {
        return ioc.m12559a(CamcorderProfile.get(Integer.parseInt(iur.f7848b), inz.f7555a)).mo8669a();
    }

    /* renamed from: a */
    public static ioa m3958a(iur iur, iob iob) {
        return ioc.m12559a(CamcorderProfile.get(Integer.parseInt(iur.f7848b), iob.f7574a)).mo8669a();
    }

    /* renamed from: b */
    public static boolean m3959b(iur iur, inz inz) {
        return CamcorderProfile.hasProfile(Integer.parseInt(iur.f7848b), inz.f7555a);
    }
}
