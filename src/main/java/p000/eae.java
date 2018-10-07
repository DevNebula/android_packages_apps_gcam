package p000;

import java.util.HashSet;
import java.util.List;

/* compiled from: PG */
/* renamed from: eae */
public final class eae {
    /* renamed from: a */
    private static final String f3649a = bli.m887a("ResolutionSettings");
    /* renamed from: b */
    private final gos f3650b;
    /* renamed from: c */
    private final fbn f3651c;
    /* renamed from: d */
    private final String f3652d;
    /* renamed from: e */
    private final String f3653e;

    public eae(gos gos, fbn fbn, bkw bkw) {
        this.f3650b = gos;
        this.f3651c = fbn;
        this.f3652d = bkw.mo1997a();
        this.f3653e = ije.m3831a(bkw.f1283a, "camera:blacklisted_resolutions_front", "");
    }

    /* renamed from: a */
    public final iqp mo6160a(iur iur, iut iut) {
        String str;
        String str2;
        iqp b;
        Object obj = null;
        if (iut == iut.FRONT) {
            str = "pref_camera_picturesize_front_key";
        } else {
            str = "pref_camera_picturesize_back_key";
        }
        if (iut != iut.BACK) {
            str2 = "";
            if (iut == iut.FRONT) {
                str2 = this.f3653e;
            }
        } else {
            str2 = this.f3652d;
        }
        boolean e = this.f3650b.mo7302e("default_scope", str);
        Object obj2;
        if (e) {
            b = ion.m4016b(this.f3650b.mo7301d("default_scope", str));
            if (b == null) {
                obj2 = 1;
            } else {
                boolean a;
                Object[] split = str2.split(",");
                if (split.length != 0) {
                    a = gly.m11394a(b, new HashSet(khb.m4924a(split)));
                } else {
                    a = false;
                }
                if (a) {
                    int obj22 = 1;
                } else {
                    obj22 = null;
                }
            }
        } else {
            b = null;
            obj22 = null;
        }
        List b2 = this.f3651c.mo13218b(iur).mo9063b(256);
        if (b != null && b.f7695a > 0 && b.f7696b > 0 && b2.contains(b)) {
            int obj3 = 1;
        }
        if (e && obj22 == null && obj3 != null) {
            return b;
        }
        b = ion.m3998a(gly.m11392a(b2, str2));
        this.f3650b.mo7290a("default_scope", str, ion.m4020b(b));
        str = f3649a;
        str2 = String.valueOf(b);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(str2).length() + 53);
        stringBuilder.append("Picture size setting is not set. Selecting fallback: ");
        stringBuilder.append(str2);
        bli.m898e(str, stringBuilder.toString());
        return b;
    }
}
