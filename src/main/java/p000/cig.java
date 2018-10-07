package p000;

import android.content.Context;
import android.location.Location;
import android.os.HandlerThread;
import android.os.SystemClock;
import com.google.android.GoogleCamera.R;
import com.google.android.apps.camera.stats.Instrumentation;
import com.google.android.libraries.smartburst.filterfw.SurfaceTexTransform;
import com.google.android.libraries.smartburst.filterfw.SurfaceTextureStreamer;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* renamed from: cig */
public final class cig {
    /* renamed from: a */
    public static final String f2211a = bli.m887a("BurstFacadeRun");
    /* renamed from: A */
    private final gev f2212A;
    /* renamed from: B */
    private final iqm f2213B;
    /* renamed from: C */
    private final int f2214C;
    /* renamed from: D */
    private final dod f2215D;
    /* renamed from: E */
    private final bcy f2216E;
    /* renamed from: F */
    private final ilp f2217F;
    /* renamed from: G */
    private final iqp f2218G;
    /* renamed from: H */
    private kpk f2219H = null;
    /* renamed from: b */
    public final Context f2220b;
    /* renamed from: c */
    public final chv f2221c;
    /* renamed from: d */
    public final gln f2222d;
    /* renamed from: e */
    public final iut f2223e;
    /* renamed from: f */
    public final AtomicReference f2224f;
    /* renamed from: g */
    public final AtomicReference f2225g;
    /* renamed from: h */
    public kpk f2226h = null;
    /* renamed from: i */
    public final AtomicReference f2227i = new AtomicReference();
    /* renamed from: j */
    public final AtomicReference f2228j = new AtomicReference();
    /* renamed from: k */
    public final AtomicReference f2229k = new AtomicReference();
    /* renamed from: l */
    public final AtomicReference f2230l = new AtomicReference();
    /* renamed from: m */
    public final kpw f2231m = kpw.m18486d();
    /* renamed from: n */
    public final iqo f2232n;
    /* renamed from: o */
    public final AtomicReference f2233o = new AtomicReference();
    /* renamed from: p */
    public final gsp f2234p;
    /* renamed from: q */
    public final gsl f2235q;
    /* renamed from: r */
    public final ird f2236r;
    /* renamed from: s */
    public final Instrumentation f2237s;
    /* renamed from: t */
    public final SurfaceTextureStreamer f2238t;
    /* renamed from: u */
    public final gqw f2239u;
    /* renamed from: v */
    public final irs f2240v;
    /* renamed from: w */
    public final glj f2241w;
    /* renamed from: x */
    public volatile long f2242x = 0;
    /* renamed from: y */
    private final iqp f2243y;
    /* renamed from: z */
    private final gks f2244z;

    public cig(Context context, iqp iqp, chv chv, gks gks, gln gln, gev gev, iqm iqm, iut iut, int i, dod dod, bcy bcy, cjo cjo, ilp ilp, AtomicReference atomicReference, SurfaceTextureStreamer surfaceTextureStreamer, iqo iqo, gsp gsp, gsl gsl, ird ird, Instrumentation instrumentation, irs irs, iqp iqp2, glj glj) {
        this.f2220b = (Context) jri.m13404b((Object) context);
        this.f2243y = (iqp) jri.m13404b((Object) iqp);
        this.f2221c = (chv) jri.m13404b((Object) chv);
        this.f2244z = (gks) jri.m13404b((Object) gks);
        this.f2222d = (gln) jri.m13404b((Object) gln);
        this.f2212A = (gev) jri.m13404b((Object) gev);
        this.f2213B = (iqm) jri.m13404b((Object) iqm);
        this.f2223e = (iut) jri.m13404b((Object) iut);
        this.f2214C = i;
        this.f2215D = (dod) jri.m13404b((Object) dod);
        this.f2216E = (bcy) jri.m13404b((Object) bcy);
        this.f2217F = (ilp) jri.m13404b((Object) ilp);
        this.f2225g = (AtomicReference) jri.m13404b((Object) atomicReference);
        this.f2224f = new AtomicReference(cjo);
        this.f2232n = (iqo) jri.m13404b((Object) iqo);
        this.f2234p = (gsp) jri.m13404b((Object) gsp);
        this.f2235q = (gsl) jri.m13404b((Object) gsl);
        this.f2236r = ird;
        this.f2237s = instrumentation;
        this.f2238t = surfaceTextureStreamer;
        this.f2240v = irs;
        this.f2218G = iqp2;
        this.f2241w = glj;
        this.f2239u = new gqw(new cih(irs));
    }

    /* renamed from: a */
    public final void mo2328a() {
        jli.m13191a(mo2330c()).mo9279a(khx.m5000a(), new cin(this)).mo9282a(izw.f21401a);
    }

    /* renamed from: b */
    public final synchronized kpk mo2329b() {
        boolean z;
        this.f2236r.mo8856a("BurstFacadeRunner#run");
        HandlerThread handlerThread = new HandlerThread("burst_handler");
        this.f2227i.set(handlerThread);
        handlerThread.start();
        ijx a = cht.m1153a(handlerThread);
        UUID randomUUID = UUID.randomUUID();
        cwj cwj = this.f2244z.f5574a;
        long currentTimeMillis = System.currentTimeMillis();
        Location d = cwj.f13337i.mo7915d();
        String a2 = cwj.f13332d.mo7437a(currentTimeMillis);
        gln gln = cwj.f13334f.f1069a;
        gkr a3 = cwj.f13336h.mo7187a(a2, currentTimeMillis, kbg.m4803b(d));
        iqp a4 = cwj.mo12938a(cwj.f13341m.f3023d.f6471a);
        gln.mo7199a(a3);
        a3.mo13371a(a4, glw.BURST);
        a3.mo13374b(0);
        a3.mo13370a(hci.m11979a((int) R.string.burst_process_start, new Object[0]));
        this.f2233o.set(a3);
        cjo cjo = (cjo) this.f2224f.get();
        ikd.m12501a();
        if (!cjo.f2266c) {
            cjo.f2264a.mo7038c();
            cjo.f2265b.mo2336a(false);
            cjo.f2266c = true;
        }
        jmr jmr = (jmr) this.f2215D.mo13673b();
        boolean booleanValue = ((Boolean) this.f2217F.mo13673b()).booleanValue();
        String str = f2211a;
        int i = this.f2213B.f7692e;
        int i2 = this.f2214C;
        String valueOf = String.valueOf(jmr);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 116);
        stringBuilder.append("Starting burst. Device orientation: ");
        stringBuilder.append(i);
        stringBuilder.append(" image orientation: ");
        stringBuilder.append(i2);
        stringBuilder.append(" mode: ");
        stringBuilder.append(valueOf);
        stringBuilder.append(" auto generate artifacts: ");
        stringBuilder.append(booleanValue);
        bli.m888a(str, stringBuilder.toString());
        iqp iqp = this.f2243y;
        i = iqp.f7695a;
        i2 = iqp.f7696b;
        int i3 = this.f2214C;
        if (this.f2223e == iut.FRONT) {
            z = true;
        } else {
            z = false;
        }
        chi chi = new chi(i, i2, i3, z, this.f2213B.f7692e);
        Object d2 = kpw.m18486d();
        this.f2238t.setTransform(SurfaceTexTransform.create(chi.f2175d, chi.f2176e, true));
        jmr jmr2 = jmr;
        chi chi2 = chi;
        kpk a5 = kpl.m13884a(new cil(this, jmr2, d2, this.f2216E, chi2, (cjo) this.f2224f.get(), a3, booleanValue, randomUUID, this.f2221c));
        this.f2226h = kow.m13873a(Boolean.valueOf(true));
        try {
            Object obj;
            ckj ckr;
            ckl ckl = this.f2221c.f2188d;
            iqm a6 = iqm.m4095a(this.f2214C);
            if (jmr == jmr.HYBRID_BURST) {
                obj = 1;
            } else if (jmr != jmr.FIXED_FPS) {
                obj = null;
            } else {
                obj = 1;
            }
            if (obj != null) {
                ckj cke = new cke(ckl.f2293a, ckl.f2294b, d2, a6);
            } else {
                ckr = new ckr();
            }
            AtomicReference atomicReference = this.f2230l;
            chg chg = this.f2221c.f2185a;
            iqp iqp2 = this.f2218G;
            jri.m13404b(chg.f2167e);
            atomicReference.set(new chf(chg.f2163a, chg.f2166d, (fxi) chg.f2164b.mo13673b(), chg.f2165c, chg.f2167e, a5, ckr, chg.f2168f, 8, 14, chg.f2171i, jmr, randomUUID, iqp2));
            a.execute(a5);
            this.f2221c.f2187c.mo6772a((ffe) this.f2230l.get());
        } catch (Throwable e) {
            this.f2226h = kow.m13874a(e);
        }
        this.f2226h = cig.m1180a(kow.m13877a(this.f2226h, cig.m1180a(a5)));
        this.f2226h = kny.m18475a(this.f2226h, new cip(this, d2), (Executor) a);
        kow.m13878a(this.f2226h, new cii(this), kpq.f8776a);
        this.f2236r.mo8857b();
        return this.f2226h;
    }

    /* renamed from: c */
    public final synchronized kpk mo2330c() {
        kpk kpk;
        kpk = this.f2219H;
        if (kpk == null) {
            if (this.f2226h == null) {
                this.f2219H = kow.m13874a(new IllegalStateException("Running burst had no start future"));
                kpk = this.f2219H;
            } else {
                Executor ikd = new ikd();
                this.f2242x = SystemClock.elapsedRealtime();
                this.f2219H = kny.m18476a(this.f2226h, new cij(this, ikd), ikd);
                kpk = this.f2219H;
            }
        }
        return kpk;
    }

    /* renamed from: a */
    private static kpk m1180a(kpk kpk) {
        return kny.m18475a(kpk, new cio(), kpq.f8776a);
    }
}
