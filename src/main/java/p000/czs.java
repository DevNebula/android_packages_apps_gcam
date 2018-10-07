package p000;

import android.content.Context;
import android.hardware.SensorManager;
import android.location.Location;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: czs */
public final class czs implements czm {
    /* renamed from: a */
    private final hjw f13583a;
    /* renamed from: b */
    private final kbg f13584b;
    /* renamed from: c */
    private final gtf f13585c;
    /* renamed from: d */
    private final gln f13586d;
    /* renamed from: e */
    private final gci f13587e;
    /* renamed from: f */
    private final gke f13588f;
    /* renamed from: g */
    private final Context f13589g;
    /* renamed from: h */
    private final fxe f13590h;
    /* renamed from: i */
    private final ilp f13591i;
    /* renamed from: j */
    private final ilp f13592j;
    /* renamed from: k */
    private final ilp f13593k;
    /* renamed from: l */
    private final ilp f13594l;
    /* renamed from: m */
    private final ilp f13595m;
    /* renamed from: n */
    private final ilp f13596n;
    /* renamed from: o */
    private final gos f13597o;
    /* renamed from: p */
    private final bmb f13598p;
    /* renamed from: q */
    private final gmg f13599q;

    public czs(hjw hjw, kbg kbg, gtf gtf, gln gln, gci gci, SensorManager sensorManager, Context context, fxe fxe, ilp ilp, ilp ilp2, ilp ilp3, ilp ilp4, ilp ilp5, ilp ilp6, ilp ilp7, gos gos, ilp ilp8, bmb bmb, gmg gmg, gmx gmx) {
        this.f13583a = hjw;
        this.f13584b = kbg;
        this.f13585c = gtf;
        this.f13586d = gln;
        this.f13587e = gci;
        this.f13588f = new gke(sensorManager);
        this.f13589g = context;
        this.f13590h = fxe;
        this.f13591i = ilp;
        this.f13592j = ilp2;
        this.f13593k = ilp3;
        this.f13594l = ilp4;
        this.f13595m = ilp5;
        this.f13596n = ilp7;
        this.f13597o = gos;
        this.f13598p = bmb;
        this.f13599q = gmg;
    }

    /* renamed from: a */
    public final kpk mo5906a(fbj fbj, cwc cwc, fbl fbl, fbm fbm, ffc ffc, boolean z) {
        glw glw;
        boolean z2;
        boolean z3;
        kbg c;
        ilb ilb = new ilb(Boolean.valueOf(false));
        glw glw2 = glw.NORMAL;
        if (this.f13590h.mo13673b() == fxj.ON) {
            glw = glw.HDR_PLUS;
        } else if (this.f13590h.mo13673b() == fxj.AUTO) {
            glw = glw.HDR_PLUS_AUTO;
        } else {
            glw = glw2;
        }
        long currentTimeMillis = System.currentTimeMillis();
        Location d = this.f13583a.mo7915d();
        String a = this.f13585c.mo7437a(currentTimeMillis);
        gmg gmg = this.f13599q;
        gkr gmb = new gmb((Executor) gmg.m2668a((Executor) gmg.f5658a.mo10566a(), 1), (gmp) gmg.m2668a((gmp) gmg.f5659b.mo10566a(), 2), (glt) gmg.m2668a((glt) gmg.f5660c.mo10566a(), 3), (eqa) gmg.m2668a((eqa) gmg.f5661d.mo10566a(), 4), (gsi) gmg.m2668a((gsi) gmg.f5662e.mo10566a(), 5), (gtf) gmg.m2668a((gtf) gmg.f5663f.mo10566a(), 6), (gsp) gmg.m2668a((gsp) gmg.f5664g.mo10566a(), 7), (grg) gmg.m2668a((grg) gmg.f5665h.mo10566a(), 8), (bcv) gmg.m2668a((bcv) gmg.f5666i.mo10566a(), 9), (ird) gmg.m2668a((ird) gmg.f5667j.mo10566a(), 10), (bls) gmg.m2668a((bls) gmg.f5668k.mo10566a(), 11), (hju) gmg.m2668a((hju) gmg.f5669l.mo10566a(), 12), (gev) gmg.m2668a((gev) gmg.f5670m.mo10566a(), 13), (gnh) gmg.m2668a((gnh) gmg.f5671n.mo10566a(), 14), (String) gmg.m2668a(a, 15), (kbg) gmg.m2668a(kbg.m4803b(d), 16), currentTimeMillis, (kbg) gmg.m2668a(this.f13584b, 18), (ilp) gmg.m2668a(ilb, 19));
        iqp iqp = cwc.f3023d.f6471a;
        if (gcb.m2523a(this.f13587e.mo7039d())) {
            iqp = iqp.mo8814b();
        } else {
            iqp = iqp.mo8815c();
        }
        this.f13586d.mo7199a(gmb);
        gmb.mo13371a(iqp, glw);
        int i = this.f13587e.mo7034a().f7692e;
        this.f13589g.getExternalCacheDir();
        int i2 = this.f13588f.f5535a;
        iut c2 = ffc.mo9064c();
        ((Float) this.f13594l.mo13673b()).floatValue();
        fbk fbk = new fbk(i, fbl, fbm, i2, c2, ffc.mo9074m(), ilb);
        String d2 = this.f13597o.mo7301d(gos.m2721a(cwc.f3020a.f7848b), "pref_camera_hdr_plus_key");
        if (((Integer) this.f13593k.mo13673b()).intValue() != gxk.OFF.f6131e) {
            z2 = true;
        } else {
            z2 = false;
        }
        fbp a2 = fbj.mo13214a();
        grg h = gmb.mo7077h();
        eps a3 = epr.m2002o().mo6467a(1);
        String valueOf = String.valueOf(gmb.mo13385n());
        String valueOf2 = String.valueOf(ixx.JPEG.f7912j);
        if (valueOf2.length() == 0) {
            valueOf2 = new String(valueOf);
        } else {
            valueOf2 = valueOf.concat(valueOf2);
        }
        a3 = a3.mo6470a(valueOf2);
        if (ffc.mo9064c() == iut.FRONT) {
            z3 = true;
        } else {
            z3 = false;
        }
        eps a4 = a3.mo6472a(z3).mo6479c(((Boolean) this.f13591i.mo13673b()).booleanValue()).mo6473b(((Float) this.f13594l.mo13673b()).floatValue()).mo6475b((String) this.f13596n.mo13673b()).mo6478c(d2).mo6477b(z2).mo6466a((float) ((Integer) this.f13592j.mo13673b()).intValue()).mo6476b(kbg.m4803b(null)).mo6474b(Boolean.valueOf(z)).mo6468a(ffc.mo9075n());
        if (a2 != null) {
            c = kbg.m4804c((klf) a2.f4688g.mo13673b());
        } else {
            c = kau.f21835a;
        }
        h.mo7368a(a4.mo6471a(c).mo6469a((Boolean) this.f13595m.mo13673b()).mo6465a());
        return fbj.mo13215a(fbk, gmb);
    }

    /* renamed from: a */
    public final kpk mo5905a(cwh cwh, fbl fbl, fbm fbm, boolean z) {
        return mo5906a(cwh, cwh.f23700b, fbl, fbm, cwh.f23701c, z);
    }
}
