package p000;

import android.content.ContentResolver;
import android.location.Location;
import com.google.android.apps.camera.stats.BurstSessionStatistics;
import com.google.android.apps.camera.stats.Instrumentation;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* renamed from: cwj */
public class cwj implements chx {
    /* renamed from: A */
    private iqo f13328A;
    /* renamed from: a */
    public final iqz f13329a;
    /* renamed from: b */
    public final ikd f13330b;
    /* renamed from: c */
    public final Object f13331c = new Object();
    /* renamed from: d */
    public final gtf f13332d;
    /* renamed from: e */
    public final bmb f13333e;
    /* renamed from: f */
    public final bag f13334f;
    /* renamed from: g */
    public final gpn f13335g;
    /* renamed from: h */
    public final glj f13336h;
    /* renamed from: i */
    public final hjw f13337i;
    /* renamed from: j */
    public final kwa f13338j;
    /* renamed from: k */
    public final Map f13339k = new HashMap();
    /* renamed from: l */
    public bnv f13340l;
    /* renamed from: m */
    public cwc f13341m;
    /* renamed from: n */
    public final ilb f13342n;
    /* renamed from: o */
    public final AtomicBoolean f13343o = new AtomicBoolean(false);
    /* renamed from: p */
    private final chu f13344p;
    /* renamed from: q */
    private final bna f13345q;
    /* renamed from: r */
    private final Instrumentation f13346r;
    /* renamed from: s */
    private final gci f13347s;
    /* renamed from: t */
    private final gkp f13348t;
    /* renamed from: u */
    private final czw f13349u;
    /* renamed from: v */
    private cfh f13350v;
    /* renamed from: w */
    private cze f13351w;
    /* renamed from: x */
    private gbv f13352x;
    /* renamed from: y */
    private axm f13353y;
    /* renamed from: z */
    private ffc f13354z;

    public cwj(czg czg, iqz iqz, ikd ikd, gtf gtf, bmb bmb, Instrumentation instrumentation, gci gci, bag bag, gpn gpn, gkp gkp, glj glj, hjw hjw, czw czw, kwa kwa) {
        this.f13329a = iqz.mo8830a(bli.m887a(cwj.class.getSimpleName()));
        this.f13330b = ikd;
        this.f13332d = gtf;
        this.f13333e = bmb;
        this.f13346r = instrumentation;
        this.f13347s = gci;
        this.f13334f = bag;
        this.f13335g = gpn;
        this.f13348t = gkp;
        this.f13336h = glj;
        this.f13337i = hjw;
        this.f13349u = czw;
        this.f13338j = kwa;
        this.f13342n = new ilb(Boolean.valueOf(true));
        this.f13344p = czg.f3060b;
        this.f13345q = czg.f3061c;
    }

    /* renamed from: a */
    public final /* synthetic */ ilp mo2305a() {
        return this.f13342n;
    }

    /* renamed from: a */
    public final iqp mo12938a(iqp iqp) {
        if (gcb.m2523a(this.f13347s.mo7039d())) {
            return iqp.mo8814b();
        }
        return iqp.mo8815c();
    }

    /* renamed from: a */
    public final void mo2308a(cfh cfh, cze cze, hcd hcd, gbv gbv) {
        this.f13350v = cfh;
        this.f13351w = cze;
        this.f13340l = new bnv(hcd, this.f13350v.mo12481l().f17171c);
        this.f13352x = gbv;
    }

    /* renamed from: b */
    public final void mo2310b() {
        mo2307a(chw.FORCE_STOP, false);
    }

    /* renamed from: a */
    public final kpk mo2306a(chw chw) {
        if (this.f13343o.compareAndSet(false, true)) {
            kpk b = m8956b(chw);
            kow.m13878a(b, new cwm(this), this.f13330b);
            return b;
        }
        this.f13329a.mo8838f("Burst not started as one is running already.");
        return kow.m13873a(Boolean.FALSE);
    }

    /* renamed from: b */
    private final kpk m8956b(chw chw) {
        boolean g_ = ((chy) this.f13338j.mo10562a()).mo2313g_();
        if (this.f13351w.f3057c.mo13532b() || g_) {
            iqz iqz = this.f13329a;
            boolean b = this.f13351w.f3057c.mo13532b();
            StringBuilder stringBuilder = new StringBuilder(81);
            stringBuilder.append("Burst cannot start in this state [timer-on: ");
            stringBuilder.append(b);
            stringBuilder.append(", switching-to-filmstrip: ");
            stringBuilder.append(g_);
            stringBuilder.append("]");
            iqz.mo8838f(stringBuilder.toString());
            return kow.m13873a(Boolean.FALSE);
        }
        cfh cfh = this.f13350v;
        if (cfh == null || cfh.mo12481l().f17175g.getVisibility() != 0) {
            Object obj;
            czw czw = this.f13349u;
            long j = czw.f3100c.f6057c;
            if (j == -1) {
                obj = null;
            } else if (j < 120000000) {
                iqz iqz2 = czw.f3104g;
                StringBuilder stringBuilder2 = new StringBuilder(70);
                stringBuilder2.append("Burst not started due to low storage: ");
                stringBuilder2.append(j);
                stringBuilder2.append(" bytes free.");
                iqz2.mo8838f(stringBuilder2.toString());
                obj = 1;
            } else {
                obj = null;
            }
            if (obj != null) {
                this.f13340l.mo2061a();
                ((chy) this.f13338j.mo10562a()).mo2315i_();
                return kow.m13873a(Boolean.FALSE);
            }
            kpk a;
            this.f13329a.mo8832b("startBurst invoked");
            ((chy) this.f13338j.mo10562a()).mo2312a();
            BurstSessionStatistics burstSessionStatistics = (BurstSessionStatistics) this.f13346r.burstStats().create();
            burstSessionStatistics.mo12609k();
            synchronized (this.f13331c) {
                czw = this.f13349u;
                czw.f3100c.mo7451a(1000, czw.f3103f);
                this.f13328A = new daa(czw);
                cjo cjo = new cjo(this.f13347s, new cjm(this));
                boolean a2 = this.f13333e.mo2019a();
                if (a2) {
                    this.f13329a.mo8832b("Starting burst (lightweight).");
                    bna bna = this.f13345q;
                    long currentTimeMillis = System.currentTimeMillis();
                    Location d = this.f13337i.mo7915d();
                    String a3 = this.f13332d.mo7437a(currentTimeMillis);
                    gln gln = this.f13334f.f1069a;
                    gkp gkp = this.f13348t;
                    gkr gkk = new gkk((ContentResolver) gkp.m2640a((ContentResolver) gkp.f5555a.mo10566a(), 1), (glt) gkp.m2640a((glt) gkp.f5556b.mo10566a(), 2), (gmp) gkp.m2640a((gmp) gkp.f5557c.mo10566a(), 3), (eqa) gkp.m2640a((eqa) gkp.f5558d.mo10566a(), 4), (gsi) gkp.f5559e.mo10566a(), (gtf) gkp.f5560f.mo10566a(), (gsp) gkp.m2640a((gsp) gkp.f5561g.mo10566a(), 7), (gtg) gkp.m2640a((gtg) gkp.f5562h.mo10566a(), 8), (gsx) gkp.m2640a((gsx) gkp.f5563i.mo10566a(), 9), (gsl) gkp.m2640a((gsl) gkp.f5564j.mo10566a(), 10), (grg) gkp.m2640a((grg) gkp.f5565k.mo10566a(), 11), (bcv) gkp.m2640a((bcv) gkp.f5566l.mo10566a(), 12), (ixv) gkp.m2640a((ixv) gkp.f5567m.mo10566a(), 13), (ird) gkp.m2640a((ird) gkp.f5568n.mo10566a(), 14), (bls) gkp.f5569o.mo10566a(), (hju) gkp.f5570p.mo10566a(), (gnh) gkp.m2640a((gnh) gkp.f5571q.mo10566a(), 17), (irs) gkp.m2640a((irs) gkp.f5572r.mo10566a(), 18), (String) gkp.m2640a(a3, 19), (kbg) gkp.m2640a(kbg.m4803b(d), 20), (iut) gkp.m2640a(this.f13354z.mo9064c(), 21), currentTimeMillis, (Executor) gkp.m2640a(cht.m1159e(), 23), (gev) gkp.m2640a((gev) gkp.f5573s.mo10566a(), 24));
                    iqp a4 = mo12938a(this.f13341m.f3023d.f6471a);
                    gln.mo7199a(gkk);
                    gkk.mo13371a(a4, glw.BURST);
                    iqm a5 = this.f13353y.mo1836a();
                    bnv bnv = this.f13340l;
                    bnx bnw = new bnw(bnv);
                    bnw bnw2 = (bnw) bnv.f1378b.getAndSet(bnw);
                    if (bnw2 != null) {
                        bnw2.f11624a = false;
                    }
                    a = bna.mo2034a(gkk, a5, new cwk(this, bnw), this.f13341m.f3022c);
                    this.f13345q.mo2037c();
                    this.f13345q.mo2036b();
                    this.f13345q.mo2038d();
                } else {
                    this.f13329a.mo8832b("Starting burst (legacy).");
                    a = this.f13344p.mo2300a(chw, new gks(this), this.f13334f.f1069a, this.f13347s.mo7034a(), this.f13354z.mo9064c(), this.f13353y.mo1836a().f7692e, this.f13350v.mo12481l().f17171c, cjo, this.f13341m.f3022c);
                }
                a = kny.m18475a(a, new cwn(this, a2, burstSessionStatistics), this.f13330b);
                kow.m13878a(a, new cwo(this), this.f13330b);
                this.f13339k.put(chw, a);
            }
            return a;
        }
        this.f13329a.mo8838f("Burst cannot start when app is not available / visible.");
        return kow.m13873a(Boolean.FALSE);
    }

    /* renamed from: a */
    public final void mo2309a(cwc cwc, ffc ffc) {
        boolean z;
        this.f13341m = cwc;
        this.f13354z = ffc;
        gbv gbv = this.f13352x;
        int o = ffc.mo9076o();
        if (ffc.mo9064c() == iut.FRONT) {
            z = true;
        } else {
            z = false;
        }
        this.f13353y = new axm(gbv, o, z);
    }

    /* renamed from: c */
    public final void mo2311c() {
        this.f13344p.mo2304c();
    }

    /* renamed from: a */
    public final kpk mo2307a(chw chw, boolean z) {
        kpk a;
        if (z) {
            ((chy) this.f13338j.mo10562a()).mo2314h_();
        }
        this.f13329a.mo8832b("burst stopped");
        BurstSessionStatistics burstSessionStatistics = (BurstSessionStatistics) this.f13346r.burstStats().getCurrentSession();
        burstSessionStatistics.mo12588c();
        synchronized (this.f13331c) {
            mo12939d();
            if (this.f13333e.mo2019a()) {
                this.f13345q.mo2039e();
                this.f13345q.mo2040f();
                this.f13345q.mo2035a();
                a = kow.m13873a(Boolean.valueOf(true));
            } else {
                a = this.f13344p.mo2299a(chw);
            }
            kow.m13878a(a, new cwp(this, chw, burstSessionStatistics), this.f13330b);
        }
        return a;
    }

    /* renamed from: d */
    final void mo12939d() {
        iqo iqo = this.f13328A;
        if (iqo != null) {
            iqo.close();
            this.f13328A = null;
        }
    }
}
