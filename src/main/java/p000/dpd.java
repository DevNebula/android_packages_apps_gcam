package p000;

import com.google.android.apps.camera.stats.CameraDeviceInstrumentationSession;
import java.util.List;

/* compiled from: PG */
/* renamed from: dpd */
public final class dpd implements doz {
    /* renamed from: a */
    private static final String f14306a = bli.m887a("Port1CameraSelector");
    /* renamed from: b */
    private final doy f14307b;
    /* renamed from: c */
    private final fgw f14308c;
    /* renamed from: d */
    private final bkw f14309d;
    /* renamed from: e */
    private final hjf f14310e;
    /* renamed from: f */
    private final ird f14311f;
    /* renamed from: g */
    private final bmb f14312g;
    /* renamed from: h */
    private final int f14313h;

    public dpd(doy doy, fgw fgw, bkw bkw, hjf hjf, ird ird, bmb bmb, int i) {
        this.f14307b = doy;
        this.f14308c = fgw;
        this.f14309d = bkw;
        this.f14310e = hjf;
        this.f14311f = ird;
        this.f14312g = bmb;
        this.f14313h = i;
    }

    /* renamed from: a */
    private static fyz m9372a(ffc ffc, fxg fxg) {
        try {
            fyy a = fyy.m2475a(ffc, fxg.f5006a, 37);
            String str = f14306a;
            String valueOf = String.valueOf(a.toString());
            String str2 = "Selected picture configuration: ";
            if (valueOf.length() == 0) {
                valueOf = new String(str2);
            } else {
                valueOf = str2.concat(valueOf);
            }
            bli.m894c(str, valueOf);
            return new fyz(a);
        } catch (fyx e) {
            throw new IllegalStateException("Unable to access OneCamera.");
        }
    }

    /* renamed from: a */
    private static C0232for m9371a(fhc fhc, ffc ffc) {
        Object a = dpd.m9373a(ffc, 37, 38, 32);
        jri.m13404b(a);
        return new C0232for(dpd.m9369a(fhc), a.f7861b, a.f7860a);
    }

    /* renamed from: a */
    private final dul m9370a() {
        int a = this.f14308c.mo6780a("persist.gcam.sm.denom");
        bli.m888a(f14306a, String.format("Smart metering configuration for auto-HDR+ decision:period = %d, max image count = %d", new Object[]{Integer.valueOf(a), Integer.valueOf(2)}));
        return new dul(a);
    }

    /* renamed from: a */
    private static int m9369a(fhc fhc) {
        return (fhc.f4783c + 3) + 2;
    }

    /* renamed from: a */
    private static ive m9373a(ffc ffc, int... iArr) {
        for (int i : iArr) {
            List b = ffc.mo9063b(i);
            if (!b.isEmpty()) {
                return new ive(i, ion.m3998a(b));
            }
        }
        return null;
    }

    /* renamed from: a */
    public final dox mo6038a(kpk kpk, ffc ffc, dof dof, fhc fhc, fxg fxg, CameraDeviceInstrumentationSession cameraDeviceInstrumentationSession) {
        jri.m13404b((Object) kpk);
        jri.m13404b((Object) ffc);
        jri.m13404b((Object) dof);
        jri.m13404b((Object) fhc);
        jri.m13404b((Object) fxg);
        this.f14311f.mo8856a("OneCameraDependencies#new");
        fxh fxh = new fxh(fxg);
        fjf fjf = new fjf(kny.m18475a(kpk, new dpe(cameraDeviceInstrumentationSession), kpq.f8776a), ffc);
        fhd a = fhc.mo6789a(ffc);
        dpl a2 = this.f14307b.mo6037a(fjf, dof, fxh, dpd.m9372a(ffc, fxg));
        this.f14311f.mo8857b();
        if ((this.f14310e.mo7905c() || this.f14310e.mo7906d()) && this.f14309d.mo2002e() && a.equals(fhd.NEXUS_2015) && ffc.mo9064c() == iut.BACK) {
            bli.m894c(f14306a, "Selected Pixel Portrait Zsl Hdr PD OneCamera configuration.");
            C0232for a3 = dpd.m9371a(fhc, ffc);
            Object a4 = dpd.m9373a(ffc, this.f14313h);
            jri.m13404b(a4);
            return new dpp(a2, a3, new fok(dpd.m9369a(fhc), a4.f7861b), m9370a());
        } else if ((this.f14310e.mo7905c() || this.f14310e.mo7906d()) && ffc.mo9064c() == iut.FRONT && this.f14309d.mo2002e()) {
            bli.m894c(f14306a, "Selected Pixel Portrait Zsl Hdr No PD OneCamera configuration.");
            return new dpo(a2, dpd.m9371a(fhc, ffc), m9370a());
        } else {
            String str = f14306a;
            String valueOf = String.valueOf(a);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 39);
            stringBuilder.append("No camera configuration was available! ");
            stringBuilder.append(valueOf);
            bli.m891b(str, stringBuilder.toString());
            throw new UnsupportedOperationException("Unknown capture support level");
        }
    }
}
