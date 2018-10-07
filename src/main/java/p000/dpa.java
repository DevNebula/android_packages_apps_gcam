package p000;

import android.annotation.TargetApi;
import android.graphics.Rect;
import com.google.android.apps.camera.stats.CameraDeviceInstrumentationSession;
import java.util.List;

@TargetApi(21)
/* compiled from: PG */
/* renamed from: dpa */
public final class dpa implements doz {
    /* renamed from: a */
    private static final String f14288a = bli.m887a("OneCameraSelector");
    /* renamed from: b */
    private final doy f14289b;
    /* renamed from: c */
    private final fgw f14290c;
    /* renamed from: d */
    private final bkw f14291d;
    /* renamed from: e */
    private final hjf f14292e;
    /* renamed from: f */
    private final bmh f14293f;
    /* renamed from: g */
    private final ird f14294g;
    /* renamed from: h */
    private final bmb f14295h;
    /* renamed from: i */
    private final ilp f14296i;

    public dpa(doy doy, fgw fgw, bkw bkw, hjf hjf, bmh bmh, ird ird, bmb bmb, ilp ilp) {
        this.f14289b = doy;
        this.f14290c = fgw;
        this.f14291d = bkw;
        this.f14292e = hjf;
        this.f14293f = bmh;
        this.f14294g = ird;
        this.f14295h = bmb;
        this.f14296i = ilp;
    }

    /* renamed from: a */
    private static fyz m9363a(fhd fhd, ffc ffc, fxg fxg) {
        try {
            fyy a;
            String str;
            switch (fhd.ordinal()) {
                case 0:
                    a = fyy.m2475a(ffc, fxg.f5006a, 35);
                    break;
                case 1:
                case 2:
                    a = fyy.m2475a(ffc, fxg.f5006a, 256);
                    break;
                case 3:
                case 4:
                    Object str2;
                    iqp iqp = fxg.f5006a;
                    List a2 = ffc.mo9059a(35);
                    boolean isEmpty = a2.isEmpty() ^ 1;
                    String valueOf = String.valueOf(ion.m4019b(35));
                    str = "No reprocessing input sizes supported for ImageFormat: ";
                    if (valueOf.length() == 0) {
                        str2 = new String(str);
                    } else {
                        str2 = str.concat(valueOf);
                    }
                    jri.m13406b(isEmpty, str2);
                    jri.m13406b(r0.contains(iqp), String.format("TargetSize (%s) is not supported for ImageFormat (%s).  SupportedSizes = %s", new Object[]{iqp.toString(), ion.m4019b(256), ffc.mo9063b(256)}));
                    ive ive = new ive(35, ion.m3998a(a2));
                    a = new fyy(ive, ive, kbg.m4804c(new ive(256, iqp)), iqp, new Rect(0, 0, iqp.f7695a, iqp.f7696b));
                    break;
                default:
                    throw new UnsupportedOperationException("Unknown capture support level");
            }
            String str3 = f14288a;
            String valueOf2 = String.valueOf(a.toString());
            str = "Selected picture configuration: ";
            if (valueOf2.length() == 0) {
                valueOf2 = new String(str);
            } else {
                valueOf2 = str.concat(valueOf2);
            }
            bli.m894c(str3, valueOf2);
            return new fyz(a);
        } catch (fyx e) {
            throw new IllegalStateException("Unable to access OneCamera.");
        }
    }

    /* renamed from: a */
    private static C0232for m9362a(fhc fhc, ffc ffc) {
        Object a = dpa.m9364a(ffc, 37, 38, 32);
        jri.m13404b(a);
        return new C0232for((fhc.f4783c + 3) + 2, a.f7861b, a.f7860a);
    }

    /* renamed from: a */
    private final dul m9361a() {
        int a = this.f14290c.mo6780a("persist.gcam.sm.denom");
        bli.m888a(f14288a, String.format(null, "Smart metering configuration for auto-HDR+ decision:period = %d, max image count = %d", new Object[]{Integer.valueOf(a), Integer.valueOf(2)}));
        return new dul(a);
    }

    /* renamed from: a */
    private static ive m9364a(ffc ffc, int... iArr) {
        for (int i : iArr) {
            List b = ffc.mo9063b(i);
            if (!b.isEmpty()) {
                return new ive(i, ion.m3998a(b));
            }
        }
        return null;
    }

    /* renamed from: b */
    private final boolean m9365b() {
        if (this.f14296i.mo13673b() == hhx.IMAGE_INTENT) {
        }
        return false;
    }

    /* renamed from: a */
    public final dox mo6038a(kpk kpk, ffc ffc, dof dof, fhc fhc, fxg fxg, CameraDeviceInstrumentationSession cameraDeviceInstrumentationSession) {
        jri.m13404b((Object) kpk);
        jri.m13404b((Object) ffc);
        jri.m13404b((Object) dof);
        jri.m13404b((Object) fhc);
        jri.m13404b((Object) fxg);
        this.f14294g.mo8856a("OneCameraDependencies#new");
        fxh fxh = new fxh(fxg);
        fjf fjf = new fjf(kny.m18475a(kpk, new dpb(cameraDeviceInstrumentationSession), kpq.f8776a), ffc);
        fhd a = fhc.mo6789a(ffc);
        dpl a2 = this.f14289b.mo6037a(fjf, dof, fxh, dpa.m9363a(a, ffc, fxg));
        fof fof = new fof(fhc.f4782b);
        fnk fnk = new fnk(fhc.f4782b);
        fpn fpn = new fpn(new ixf());
        fnu fnu = new fnu();
        this.f14294g.mo8857b();
        fgw.m2327d();
        fgw.m2328e();
        ivy ivy = this.f14292e.f6633b;
        if ((ivy.f7875e || ivy.f7874d) && this.f14290c.mo6782a("persist.camera.cam_component", "nexus2016_tuning")) {
            this.f14293f.mo2027a("EXPERIMENTAL CONFIG: Pixel2016 Tuning", 1);
            bli.m894c(f14288a, "Selected nexus2016Tuning OneCamera configuration.");
            Object a3 = dpa.m9364a(ffc, 37, 38, 32);
            jri.m13404b(a3);
            return new dph(a2, fof, new C0232for(fhc.f4782b, a3.f7861b, a3.f7860a), fpn, fnu, m9361a());
        }
        hjf hjf = this.f14292e;
        ivy ivy2 = hjf.f6633b;
        if ((ivy2.f7875e || ivy2.f7874d || hjf.mo7905c() || this.f14292e.mo7906d()) && this.f14290c.mo6782a("persist.camera.cam_component", "experimental_features")) {
            this.f14293f.mo2027a("EXPERIMENTAL CONFIG: Experimental Features (Pixel)", 1);
            bli.m894c(f14288a, "Selected pixelExperimentalFeatures OneCamera configuration.");
            return new dpg(a2, fof, dpa.m9362a(fhc, ffc), fpn, fnu, m9361a());
        }
        ivy = this.f14292e.f6633b;
        if ((ivy.f7875e || ivy.f7874d) && this.f14291d.mo2002e() && a.equals(fhd.NEXUS_2015)) {
            bli.m894c(f14288a, "Selected Pixel 2016 Zsl Hdr OneCamera configuration.");
            return new dpm(a2, fof, dpa.m9362a(fhc, ffc), fpn, fnu, m9361a());
        }
        if (this.f14292e.mo7905c() && ffc.mo9084w()) {
            m9365b();
        }
        if (this.f14292e.mo7905c()) {
            if (ffc.mo9084w()) {
                m9365b();
            }
            if (this.f14291d.mo2002e() && a.equals(fhd.NEXUS_2015)) {
                bli.m894c(f14288a, "Selected Pixel 2017 Zsl Hdr+ OneCamera configuration.");
                return new dpn(a2, fof, dpa.m9362a(fhc, ffc), fpn, fnu, m9361a());
            }
        }
        switch (a.ordinal()) {
            case 0:
                bli.m894c(f14288a, "Selected zslYuvSoftwareJpeg OneCamera configuration.");
                return new dpt(a2, fof);
            case 1:
                bli.m894c(f14288a, "Selected legacyJpeg OneCamera configuration.");
                return new dpq(a2, fof);
            case 2:
                bli.m894c(f14288a, "Selected limitedJpeg OneCamera configuration.");
                return new dpr(a2, fof);
            case 3:
            case 4:
                bli.m894c(f14288a, "Selected zslYuvReprocessing OneCamera configuration.");
                return new dps(a2, fof, fpn, fnu);
            default:
                String str = f14288a;
                String valueOf = String.valueOf(a);
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 39);
                stringBuilder.append("No camera configuration was available! ");
                stringBuilder.append(valueOf);
                bli.m891b(str, stringBuilder.toString());
                throw new UnsupportedOperationException("Unknown capture support level");
        }
    }
}
