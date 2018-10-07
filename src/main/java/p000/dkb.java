package p000;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* renamed from: dkb */
public final class dkb {
    /* renamed from: b */
    private static final String f3318b = bli.m887a("CdrVideoSettings");
    /* renamed from: a */
    public final bsn f3319a;
    /* renamed from: c */
    private final bkw f3320c;
    /* renamed from: d */
    private final gos f3321d;
    /* renamed from: e */
    private final hjf f3322e;

    public dkb(bsn bsn, bkw bkw, gos gos, hjf hjf) {
        this.f3319a = bsn;
        this.f3320c = bkw;
        this.f3321d = gos;
        this.f3322e = hjf;
    }

    /* renamed from: a */
    public final boolean mo5998a() {
        return this.f3321d.mo7293a("default_scope", "pref_camera_grid_lines");
    }

    /* renamed from: a */
    public final int mo5996a(inc inc, ine ine) {
        if (inc.mo8636c()) {
            if (ine == ine.RES_2160P) {
                return ije.m3829a(this.f3320c.f1283a, "camera:max_2160p_video_duration_seconds", 0);
            }
            if (ine == ine.RES_1080P) {
                return ije.m3829a(this.f3320c.f1283a, "camera:max_1080p_video_duration_seconds", 0);
            }
        }
        if (inc.mo8637d()) {
            return ije.m3829a(this.f3320c.f1283a, "camera:max_hfr_video_duration_seconds", 0);
        }
        return 0;
    }

    /* renamed from: b */
    public final int mo6000b(inc inc, ine ine) {
        if (inc.mo8636c()) {
            if (ine == ine.RES_2160P) {
                return ije.m3829a(this.f3320c.f1283a, "camera:max_2160p_torch_video_duration_seconds", 0);
            }
            if (ine == ine.RES_1080P) {
                return ije.m3829a(this.f3320c.f1283a, "camera:max_1080p_torch_video_duration_seconds", 0);
            }
        }
        if (inc.mo8637d()) {
            return ije.m3829a(this.f3320c.f1283a, "camera:max_hfr_torch_video_duration_seconds", 0);
        }
        return 0;
    }

    /* renamed from: a */
    public final ine mo5997a(iut iut, bez bez, inc inc, boolean z) {
        if (inc.mo8636c()) {
            bst bst;
            if (iut == iut.FRONT) {
                bst = bin.f1220d;
            } else {
                bst = bin.f1221e;
            }
            kbg a = this.f3319a.mo2105a(bst);
            String str;
            String d;
            if (a == null || !a.mo9709b()) {
                Object obj;
                if (iut == iut.FRONT) {
                    str = "pref_video_quality_front_key";
                } else {
                    str = "pref_video_quality_back_key";
                }
                d = this.f3321d.mo7301d("default_scope", str);
                List arrayList = new ArrayList(bez.mo1931a(inc.FPS_30));
                eap eap = new eap();
                if (!arrayList.isEmpty()) {
                    eap.f3671a = (ine) arrayList.get(0);
                    arrayList.remove(0);
                }
                if (!arrayList.isEmpty()) {
                    eap.f3672b = (ine) arrayList.get(0);
                    arrayList.remove(0);
                }
                if (!arrayList.isEmpty()) {
                    eap.f3673c = (ine) arrayList.get(0);
                    arrayList.remove(0);
                }
                String str2 = f3318b;
                StringBuilder stringBuilder = new StringBuilder((String.valueOf(str).length() + 24) + String.valueOf(d).length());
                stringBuilder.append("video quality setting: ");
                stringBuilder.append(str);
                stringBuilder.append("=");
                stringBuilder.append(d);
                bli.m888a(str2, stringBuilder.toString());
                if ("small".equals(d)) {
                    str2 = d;
                } else if ("medium".equals(d)) {
                    str2 = d;
                } else {
                    obj = "large";
                }
                if ("large".equals(obj)) {
                    return eap.f3671a;
                }
                if ("medium".equals(obj)) {
                    return eap.f3672b;
                }
                return eap.f3673c;
            }
            switch (((Integer) a.mo9706a()).intValue()) {
                case 144:
                    return ine.RES_QCIF;
                case 240:
                    return ine.RES_QVGA;
                case 288:
                    return ine.RES_CIF;
                case 480:
                    return ine.RES_480P;
                case 720:
                    return ine.RES_720P;
                case 1080:
                    return ine.RES_1080P;
                case 2160:
                    return ine.RES_2160P;
                default:
                    d = String.valueOf(a.mo9706a());
                    str = String.valueOf(bst);
                    StringBuilder stringBuilder2 = new StringBuilder((String.valueOf(d).length() + 35) + String.valueOf(str).length());
                    stringBuilder2.append("Value ");
                    stringBuilder2.append(d);
                    stringBuilder2.append(" for ADB flag ");
                    stringBuilder2.append(str);
                    stringBuilder2.append(" not supported.");
                    throw new IllegalArgumentException(stringBuilder2.toString());
            }
        }
        List a2 = bez.mo1931a(inc);
        jri.m13405b(a2.isEmpty() ^ 1);
        if (z) {
            return (ine) a2.get(a2.size() - 1);
        }
        return (ine) a2.get(0);
    }

    /* renamed from: a */
    public final boolean mo5999a(inc inc, ine ine, boolean z) {
        if (mo6002b(inc, ine, z) && this.f3321d.mo7295b("default_scope", "pref_camera_video_flashmode_key") == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final boolean mo6002b(inc inc, ine ine, boolean z) {
        bkw bkw;
        if (inc.mo8636c()) {
            if (ine == ine.RES_2160P) {
                bkw = this.f3320c;
                if (!bkw.mo1998a(bkw.f1283a, "camera:torch_2160p_video_enabled", true)) {
                    return false;
                }
            }
            if (ine == ine.RES_1080P) {
                bkw = this.f3320c;
                if (!bkw.mo1998a(bkw.f1283a, "camera:torch_1080p_video_enabled", true)) {
                    return false;
                }
            }
        }
        if (!inc.mo8637d()) {
            return z;
        }
        bkw = this.f3320c;
        if (bkw.mo1998a(bkw.f1283a, "camera:torch_hfr_video_enabled", true)) {
            return z;
        }
        return false;
    }

    /* renamed from: b */
    public final boolean mo6001b() {
        return this.f3321d.mo7293a("default_scope", "pref_video_stabilization_key");
    }

    /* renamed from: c */
    public final boolean mo6003c() {
        return this.f3321d.mo7293a("default_scope", "pref_camera_recordlocation_key");
    }

    /* renamed from: d */
    public final boolean mo6004d() {
        return this.f3322e.mo7905c() || this.f3322e.mo7906d();
    }
}
