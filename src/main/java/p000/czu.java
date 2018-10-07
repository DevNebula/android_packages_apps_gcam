package p000;

import android.content.ContentResolver;
import android.content.Context;
import android.hardware.SensorManager;
import android.location.Location;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: czu */
public final class czu implements czm {
    /* renamed from: a */
    private final hjw f13620a;
    /* renamed from: b */
    private final gtf f13621b;
    /* renamed from: c */
    private final gln f13622c;
    /* renamed from: d */
    private final gci f13623d;
    /* renamed from: e */
    private final gke f13624e;
    /* renamed from: f */
    private final Context f13625f;
    /* renamed from: g */
    private final ilp f13626g;
    /* renamed from: h */
    private final ilp f13627h;
    /* renamed from: i */
    private final ilp f13628i;
    /* renamed from: j */
    private final ilp f13629j;
    /* renamed from: k */
    private final ilp f13630k;
    /* renamed from: l */
    private final ilp f13631l;
    /* renamed from: m */
    private final gos f13632m;
    /* renamed from: n */
    private final gmt f13633n;

    public czu(hjw hjw, gtf gtf, gln gln, gci gci, SensorManager sensorManager, Context context, ilp ilp, ilp ilp2, ilp ilp3, ilp ilp4, ilp ilp5, ilp ilp6, gos gos, gmt gmt) {
        this.f13620a = hjw;
        this.f13621b = gtf;
        this.f13622c = gln;
        this.f13623d = gci;
        this.f13624e = new gke(sensorManager);
        this.f13625f = context;
        this.f13626g = ilp;
        this.f13627h = ilp2;
        this.f13628i = ilp3;
        this.f13629j = ilp4;
        this.f13630k = ilp5;
        this.f13631l = ilp6;
        this.f13632m = gos;
        this.f13633n = gmt;
    }

    /* renamed from: a */
    public final kpk mo5906a(fbj fbj, cwc cwc, fbl fbl, fbm fbm, ffc ffc, boolean z) {
        throw new UnsupportedOperationException("Method is Deprecated");
    }

    /* renamed from: a */
    public final kpk mo5905a(cwh cwh, fbl fbl, fbm fbm, boolean z) {
        boolean z2;
        boolean z3;
        kbg c;
        cwc cwc = cwh.f23700b;
        glw glw = glw.PORTRAIT;
        long currentTimeMillis = System.currentTimeMillis();
        Location d = this.f13620a.mo7915d();
        gmt gmt = this.f13633n;
        gkr c0849gms = new C0849gms((ContentResolver) gmt.m2679a((ContentResolver) gmt.f5699a.mo10566a(), 1), (glt) gmt.m2679a((glt) gmt.f5700b.mo10566a(), 2), (gmp) gmt.m2679a((gmp) gmt.f5701c.mo10566a(), 3), (eqa) gmt.m2679a((eqa) gmt.f5702d.mo10566a(), 4), (gsp) gmt.m2679a((gsp) gmt.f5703e.mo10566a(), 5), (gtg) gmt.m2679a((gtg) gmt.f5704f.mo10566a(), 6), (gsx) gmt.m2679a((gsx) gmt.f5705g.mo10566a(), 7), (gsl) gmt.m2679a((gsl) gmt.f5706h.mo10566a(), 8), (grg) gmt.m2679a((grg) gmt.f5707i.mo10566a(), 9), (bcv) gmt.m2679a((bcv) gmt.f5708j.mo10566a(), 10), (ixv) gmt.m2679a((ixv) gmt.f5709k.mo10566a(), 11), (ird) gmt.m2679a((ird) gmt.f5710l.mo10566a(), 12), (bvm) gmt.m2679a((bvm) gmt.f5711m.mo10566a(), 13), (gnh) gmt.m2679a((gnh) gmt.f5712n.mo10566a(), 14), (irs) gmt.m2679a((irs) gmt.f5713o.mo10566a(), 15), (String) gmt.m2679a(this.f13621b.mo7437a(currentTimeMillis), 16), (kbg) gmt.m2679a(kbg.m4803b(d), 17), (iut) gmt.m2679a(cwc.f3021b, 18), currentTimeMillis, (Executor) gmt.m2679a(cht.m1159e(), 20), (gev) gmt.m2679a((gev) gmt.f5714p.mo10566a(), 21));
        iqp iqp = cwc.f3023d.f6471a;
        if (gcb.m2523a(this.f13623d.mo7039d())) {
            iqp = iqp.mo8814b();
        } else {
            iqp = iqp.mo8815c();
        }
        this.f13622c.mo7199a(c0849gms);
        c0849gms.mo13371a(iqp, glw);
        int i = this.f13623d.mo7034a().f7692e;
        this.f13625f.getExternalCacheDir();
        int i2 = this.f13624e.f5535a;
        iut c2 = cwh.f23701c.mo9064c();
        ((Float) this.f13629j.mo13673b()).floatValue();
        fbk fbk = new fbk(i, fbl, fbm, i2, c2, cwh.f23701c.mo9074m(), imh.m3903a(Boolean.valueOf(false)));
        cwc cwc2 = cwh.f23700b;
        ffc ffc = cwh.f23701c;
        String d2 = this.f13632m.mo7301d(gos.m2721a(cwc2.f3020a.f7848b), "pref_camera_hdr_plus_key");
        if (((Integer) this.f13628i.mo13673b()).intValue() != gxk.OFF.f6131e) {
            z2 = true;
        } else {
            z2 = false;
        }
        fbp a = cwh.mo13214a();
        grg h = c0849gms.mo7077h();
        eps a2 = epr.m2002o().mo6467a(1);
        String valueOf = String.valueOf(c0849gms.mo13385n());
        String valueOf2 = String.valueOf(ixx.JPEG.f7912j);
        if (valueOf2.length() == 0) {
            valueOf2 = new String(valueOf);
        } else {
            valueOf2 = valueOf.concat(valueOf2);
        }
        a2 = a2.mo6470a(valueOf2);
        if (ffc.mo9064c() == iut.FRONT) {
            z3 = true;
        } else {
            z3 = false;
        }
        eps a3 = a2.mo6472a(z3).mo6479c(((Boolean) this.f13626g.mo13673b()).booleanValue()).mo6473b(((Float) this.f13629j.mo13673b()).floatValue()).mo6475b((String) this.f13631l.mo13673b()).mo6478c(d2).mo6477b(z2).mo6466a((float) ((Integer) this.f13627h.mo13673b()).intValue()).mo6476b(kbg.m4803b(null)).mo6474b(Boolean.valueOf(z)).mo6468a(ffc.mo9075n());
        if (a != null) {
            c = kbg.m4804c((klf) a.f4688g.mo13673b());
        } else {
            c = kau.f21835a;
        }
        h.mo7368a(a3.mo6471a(c).mo6469a((Boolean) this.f13630k.mo13673b()).mo6465a());
        return cwh.mo13215a(fbk, c0849gms);
    }
}
