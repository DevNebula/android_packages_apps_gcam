package p000;

import com.google.android.apps.camera.p005ui.shutterbutton.ShutterButton;
import com.google.android.apps.camera.stats.CameraDeviceInstrumentationSession;
import com.google.android.apps.camera.stats.Instrumentation;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: din */
public final class din implements dil {
    /* renamed from: a */
    public static final String f23927a = bli.m887a("CdrOpenedFastDev");
    /* renamed from: A */
    public final hjf f23928A;
    /* renamed from: B */
    public final fbr f23929B;
    /* renamed from: C */
    public final djq f23930C;
    /* renamed from: D */
    public final ilp f23931D;
    /* renamed from: E */
    public final fer f23932E;
    /* renamed from: F */
    public final kbg f23933F;
    /* renamed from: G */
    public final gal f23934G;
    /* renamed from: H */
    public final kwk f23935H;
    /* renamed from: I */
    public final Object f23936I = new Object();
    /* renamed from: J */
    public dis f23937J = dis.NO_SESSION;
    /* renamed from: K */
    public dix f23938K;
    /* renamed from: L */
    public final gnh f23939L;
    /* renamed from: M */
    private final ilb f23940M;
    /* renamed from: N */
    private final bpq f23941N;
    /* renamed from: O */
    private final hfz f23942O;
    /* renamed from: P */
    private final gci f23943P;
    /* renamed from: Q */
    private final gxz f23944Q;
    /* renamed from: R */
    private final heo f23945R;
    /* renamed from: S */
    private final irh f23946S;
    /* renamed from: T */
    private final ipv f23947T;
    /* renamed from: U */
    private final hek f23948U;
    /* renamed from: V */
    private ikb f23949V = new ikb();
    /* renamed from: b */
    public final bez f23950b;
    /* renamed from: c */
    public final bfe f23951c;
    /* renamed from: d */
    public final ilp f23952d;
    /* renamed from: e */
    public final bbv f23953e;
    /* renamed from: f */
    public final Executor f23954f;
    /* renamed from: g */
    public final ikd f23955g;
    /* renamed from: h */
    public final iut f23956h;
    /* renamed from: i */
    public final cqm f23957i;
    /* renamed from: j */
    public final hat f23958j;
    /* renamed from: k */
    public final cqx f23959k;
    /* renamed from: l */
    public final djo f23960l;
    /* renamed from: m */
    public final dju f23961m;
    /* renamed from: n */
    public final djz f23962n;
    /* renamed from: o */
    public final dkd f23963o;
    /* renamed from: p */
    public final erk f23964p;
    /* renamed from: q */
    public final ehx f23965q;
    /* renamed from: r */
    public final eqa f23966r;
    /* renamed from: s */
    public final gsp f23967s;
    /* renamed from: t */
    public final bcv f23968t;
    /* renamed from: u */
    public final asu f23969u;
    /* renamed from: v */
    public final hks f23970v;
    /* renamed from: w */
    public final dkb f23971w;
    /* renamed from: x */
    public final inc f23972x;
    /* renamed from: y */
    public final ine f23973y;
    /* renamed from: z */
    public final iur f23974z;

    public din(ilp ilp, bpq bpq, Executor executor, hfz hfz, ikd ikd, gci gci, cqm cqm, hat hat, cqx cqx, djo djo, dju dju, dkd dkd, erk erk, ehx ehx, gxz gxz, eqa eqa, gsp gsp, bcv bcv, hek hek, hks hks, dkb dkb, irh irh, hjf hjf, fbr fbr, djq djq, fer fer, gal gal, kwk kwk, gnh gnh, bez bez, bfe bfe, ilb ilb, iut iut, djz djz, inc inc, ine ine, asu asu, heo heo, iur iur, ipv ipv, ilp ilp2, kbg kbg) {
        this.f23950b = bez;
        this.f23951c = bfe;
        this.f23940M = ilb;
        this.f23952d = ilp;
        this.f23953e = new bbv("V2CamDev", ShutterButton.BUTTON_CLICK_SPLASH_IN_DURATION_MS);
        this.f23941N = bpq;
        this.f23954f = executor;
        this.f23942O = hfz;
        this.f23955g = ikd;
        this.f23956h = iut;
        this.f23943P = gci;
        this.f23957i = cqm;
        this.f23958j = hat;
        this.f23959k = cqx;
        this.f23960l = djo;
        this.f23961m = dju;
        this.f23962n = djz;
        this.f23963o = dkd;
        this.f23964p = erk;
        this.f23965q = ehx;
        this.f23944Q = gxz;
        this.f23966r = eqa;
        this.f23967s = gsp;
        this.f23968t = bcv;
        this.f23969u = asu;
        this.f23948U = hek;
        this.f23945R = heo;
        this.f23970v = hks;
        this.f23971w = dkb;
        this.f23972x = inc;
        this.f23973y = ine;
        this.f23974z = iur;
        this.f23946S = irh;
        this.f23947T = ipv;
        this.f23928A = hjf;
        this.f23929B = fbr;
        this.f23930C = djq;
        this.f23931D = ilp2;
        this.f23932E = fer;
        this.f23933F = kbg;
        this.f23934G = gal;
        this.f23935H = kwk;
        this.f23939L = gnh;
        this.f23949V.mo8557a(bfe);
        this.f23949V.mo8557a(this.f23953e);
    }

    public final void close() {
        synchronized (this.f23936I) {
            if (this.f23937J.equals(dis.CLOSED)) {
                return;
            }
            this.f23937J = dis.CLOSED;
            bli.m888a(f23927a, "close");
            this.f23962n.close();
            dix dix = this.f23938K;
            if (dix != null) {
                dix.close();
                this.f23938K = null;
            }
            this.f23955g.execute(new dip(this));
            this.f23949V.close();
        }
    }

    /* renamed from: a */
    public final void mo13025a(hkv hkv, boolean z) {
        synchronized (this.f23936I) {
            if (this.f23937J.equals(dis.CLOSED)) {
                bli.m898e(f23927a, "has been closed");
                return;
            }
            jri.m13395a(this.f23937J.equals(dis.NO_SESSION));
            this.f23937J = dis.CREATING_SESSION;
            kpk d = kpw.m18486d();
            CameraDeviceInstrumentationSession cameraDeviceInstrumentationSession = (CameraDeviceInstrumentationSession) Instrumentation.instance().cameraDevice().create();
            cameraDeviceInstrumentationSession.mo12625b();
            this.f23946S.mo8867a(this.f23974z, new diq(this, cameraDeviceInstrumentationSession, d));
            kow.m13878a(iel.m3774a(d, this.f23948U.mo7769a(this.f23945R), new dio(this), kpq.f8776a), new dir(this, hkv, z), this.f23955g);
        }
    }

    /* renamed from: a */
    public final void mo13026a(boolean z) {
        this.f23940M.mo8826a(Boolean.valueOf(z));
    }

    /* renamed from: a */
    public final boolean mo13027a() {
        synchronized (this.f23936I) {
            dix dix = this.f23938K;
            if (dix != null) {
                boolean d = dix.mo13036d();
                return d;
            }
            return false;
        }
    }

    /* renamed from: b */
    public final void mo13028b(boolean z) {
        synchronized (this.f23936I) {
            if (this.f23938K != null) {
                if (z) {
                    this.f23940M.mo8826a(Boolean.valueOf(this.f23971w.mo5999a(this.f23972x, this.f23973y, this.f23950b.mo1932a())));
                } else {
                    this.f23940M.mo8826a(Boolean.FALSE);
                }
            }
        }
    }

    /* renamed from: b */
    public final boolean mo13029b() {
        synchronized (this.f23936I) {
            dix dix = this.f23938K;
            if (dix != null) {
                boolean e = dix.mo13037e();
                return e;
            }
            return false;
        }
    }

    /* renamed from: c */
    public final void mo13030c() {
        synchronized (this.f23936I) {
            dix dix = this.f23938K;
            if (dix != null) {
                ikd.m12501a();
                synchronized (dix.f14097l) {
                    if (dix.f14105t.equals(djn.STARTING_RECORDING)) {
                    } else {
                        if (dix.f14105t == djn.RECORDING) {
                            dix.mo13040h();
                        } else if (dix.f14105t == djn.NO_RECORDING) {
                            synchronized (dix.f14097l) {
                                if (dix.f14100o) {
                                    dix.f14100o = false;
                                } else {
                                    dix.f14105t = djn.STARTING_RECORDING;
                                    bli.m888a(dix.f14082a, "startRecording");
                                    dix.f14091f.mo7617b();
                                    dix.f14090e.mo7038c();
                                    dix.f14094i.mo13042a();
                                    dix.f14095j.mo6006b();
                                    hkv hkv = dix.f14093h;
                                    hkv.mo7929a(false);
                                    hkv.f6686f.mo7536b();
                                    hkv.f6684d.mo6226z();
                                    hkv.f6681a.mo7474a(true);
                                    eiu eiu = hkv.f6687g.f17140C;
                                    ikd.m12501a();
                                    eiu.f3849a.setVisibility(8);
                                    dix.f14088c.execute(new djg(dix));
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: d */
    public final void mo13031d() {
        synchronized (this.f23936I) {
            dix dix = this.f23938K;
            if (dix != null) {
                ikd.m12501a();
                synchronized (dix.f14097l) {
                    hkk hkk = dix.f14102q;
                    if (hkk != null) {
                        bli.m888a(hkk.f6656a, "onSnapshotButtonClicked");
                        ikd.m12501a();
                        synchronized (hkk.f6662g) {
                            if (hkk.f6665j == C0252go.f5906bz || hkk.f6665j == C0252go.f5855bA) {
                                hkk.f6660e.mo7935d(false);
                                jri.m13404b(hkk.f6657b);
                                bjv l = hkk.f6657b.mo12375l();
                                kow.m13878a(l.f1251a, new hkp(hkk), hkk.f6658c);
                                kow.m13878a(l.f1252b, new hkq(hkk), hkk.f6658c);
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: e */
    public final void mo13032e() {
        synchronized (this.f23936I) {
            dix dix = this.f23938K;
            if (dix != null) {
                synchronized (dix.f14097l) {
                    dix.f14100o = true;
                }
            }
        }
    }
}
