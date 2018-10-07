package p000;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import com.google.android.apps.camera.stats.Instrumentation;
import com.google.android.libraries.smartburst.filterfw.SurfaceTexTransform;
import com.google.android.libraries.smartburst.filterfw.SurfaceTextureStreamer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* renamed from: chz */
public final class chz implements chu {
    /* renamed from: d */
    private static final String f12544d = bli.m887a("BurstFacadeImpl");
    /* renamed from: e */
    private static final iqp f12545e = new iqp(640, 480);
    /* renamed from: f */
    private static final iqp f12546f = new iqp(640, 360);
    /* renamed from: a */
    public final AtomicReference f12547a = new AtomicReference();
    /* renamed from: b */
    public volatile SurfaceTextureStreamer f12548b;
    /* renamed from: c */
    public cig f12549c = null;
    /* renamed from: g */
    private final AtomicReference f12550g = new AtomicReference(f12545e);
    /* renamed from: h */
    private volatile chv f12551h;
    /* renamed from: i */
    private final Context f12552i;
    /* renamed from: j */
    private final ilp f12553j;
    /* renamed from: k */
    private final dod f12554k;
    /* renamed from: l */
    private final bcz f12555l = new bcz();
    /* renamed from: m */
    private final ilp f12556m = ilq.m3874a(this.f12555l, Integer.valueOf(0));
    /* renamed from: n */
    private final gsp f12557n;
    /* renamed from: o */
    private final gsl f12558o;
    /* renamed from: p */
    private final gev f12559p;
    /* renamed from: q */
    private final ird f12560q;
    /* renamed from: r */
    private final Instrumentation f12561r;
    /* renamed from: s */
    private final irs f12562s;
    /* renamed from: t */
    private final gqw f12563t;
    /* renamed from: u */
    private final glj f12564u;

    public chz(Context context, gev gev, gsl gsl, ilp ilp, ilp ilp2, bkw bkw, gsp gsp, ird ird, Instrumentation instrumentation, irs irs, glj glj) {
        this.f12552i = (Context) jri.m13404b((Object) context);
        this.f12559p = (gev) jri.m13404b((Object) gev);
        this.f12558o = (gsl) jri.m13404b((Object) gsl);
        this.f12557n = (gsp) jri.m13404b((Object) gsp);
        this.f12560q = ird;
        this.f12561r = instrumentation;
        this.f12562s = irs;
        this.f12564u = glj;
        this.f12553j = ilp;
        this.f12554k = new dod(bkw.mo2003f(), ilp2);
        this.f12548b = null;
        this.f12563t = new gqw(new cia(irs));
    }

    /* renamed from: a */
    public final Surface mo2298a() {
        if (this.f12547a.get() == null) {
            return null;
        }
        return ((clh) this.f12547a.get()).f12699b;
    }

    /* renamed from: a */
    public final synchronized void mo2301a(SurfaceTexture surfaceTexture, List list, fyy fyy) {
        iqp iqp;
        jri.m13404b((Object) surfaceTexture);
        this.f12560q.mo8856a("BurstFacadeRunner#initialize");
        float d = fyy.f5062d.mo8816d();
        if (Math.abs(f12545e.mo8816d() - d) < Math.abs(f12546f.mo8816d() - d)) {
            iqp = f12545e;
        } else {
            iqp = f12546f;
        }
        if (list.isEmpty()) {
            throw new IllegalArgumentException("No valid sizes for SmartBurst preview stream.");
        }
        iqp iqp2;
        if (list.contains(iqp)) {
            iqp2 = iqp;
        } else {
            iqp iqp3;
            Comparator cie = new cie(iqp);
            iqp2 = (iqp) Collections.min(list, cie);
            Collection arrayList = new ArrayList();
            for (iqp iqp32 : list) {
                int i = iqp32.f7695a;
                int i2 = iqp.f7696b;
                if (i >= i2 && iqp32.f7696b >= i2) {
                    arrayList.add(iqp32);
                }
            }
            if (!arrayList.isEmpty()) {
                iqp32 = (iqp) Collections.min(arrayList, cie);
                float a = (float) iqp.mo8812a();
                if (((float) iqp32.mo8812a()) <= a + a) {
                    iqp2 = iqp32;
                }
            }
        }
        this.f12550g.set(iqp2);
        surfaceTexture.setDefaultBufferSize(iqp2.f7695a, iqp2.f7696b);
        surfaceTexture.detachFromGLContext();
        this.f12548b = new SurfaceTextureStreamer(surfaceTexture, iqp2.f7695a, iqp2.f7696b, SurfaceTexTransform.create(0, false, true));
        this.f12547a.set(new clh(surfaceTexture));
        clh clh = (clh) this.f12547a.get();
        cic cic = new cic(this);
        synchronized (clh.f12698a) {
            clh.f12700c.add(cic);
        }
        this.f12560q.mo8857b();
    }

    /* renamed from: b */
    public final ilp mo2303b() {
        return this.f12556m;
    }

    /* renamed from: c */
    public final void mo2304c() {
        ikd.m12501a();
        jli.m13191a(mo2299a(chw.FORCE_STOP)).mo9279a(khx.m5000a(), new cid(this)).mo9282a(izw.f21401a);
    }

    /* renamed from: a */
    public final void mo2302a(chv chv) {
        this.f12551h = chv;
    }

    /* renamed from: a */
    public final kpk mo2300a(chw chw, gks gks, gln gln, iqm iqm, iut iut, int i, bcy bcy, cjo cjo, iqp iqp) {
        ikd.m12501a();
        this.f12563t.f6008a = kbg.m4804c(Long.valueOf(System.currentTimeMillis()));
        if (this.f12547a.get() == null) {
            bli.m891b(f12544d, "Burst not started, null surface.");
            this.f12563t.mo7361c();
            return kow.m13873a(Boolean.FALSE);
        } else if (this.f12549c != null) {
            bli.m891b(f12544d, "Burst not started: A burst runner already exists");
            this.f12563t.mo7361c();
            return kow.m13873a(Boolean.FALSE);
        } else {
            chv chv = this.f12551h;
            if (chv == null) {
                bli.m891b(f12544d, "Burst not started due to missing injected fields.");
                this.f12563t.mo7361c();
                return kow.m13873a(Boolean.FALSE);
            }
            Object obj;
            chg chg = chv.f2185a;
            if (chg.f2167e == null) {
                obj = null;
            } else if (chf.m8297a(chg.f2165c, 8)) {
                obj = 1;
            } else {
                obj = null;
            }
            if (obj == null) {
                bli.m891b(f12544d, "Burst not started because the factory told us not to start one.");
                gqw gqw = this.f12563t;
                if (gqw.f6009b != null) {
                    gqw.mo7360b();
                } else {
                    gqw.f6009b = new klu();
                    klu klu = gqw.f6009b;
                    klu.f25297a = false;
                    klu.f25298b = true;
                    gqw.mo7358a();
                }
                return kow.m13873a(Boolean.FALSE);
            }
            this.f12560q.mo8856a("BurstFacadeRunner#startBurst");
            this.f12549c = new cig(this.f12552i, (iqp) this.f12550g.get(), chv, gks, gln, this.f12559p, iqm, iut, i, this.f12554k, bcy, cjo, this.f12553j, this.f12547a, this.f12548b, this.f12555l.mo15475a(), this.f12557n, this.f12558o, this.f12560q, this.f12561r, this.f12562s, iqp, this.f12564u);
            this.f12549c.f2231m.mo10200a(new cib(this), new ikd());
            kpk b = this.f12549c.mo2329b();
            this.f12560q.mo8857b();
            return b;
        }
    }

    /* renamed from: a */
    public final kpk mo2299a(chw chw) {
        ikd.m12501a();
        cig cig = this.f12549c;
        if (cig == null) {
            return kow.m13873a(Boolean.TRUE);
        }
        this.f12560q.mo8856a("BurstFacadeRunner#stopBurst");
        kpk c = cig.mo2330c();
        this.f12560q.mo8857b();
        return c;
    }
}
