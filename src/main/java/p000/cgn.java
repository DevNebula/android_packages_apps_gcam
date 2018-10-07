package p000;

import android.app.NotificationManager;
import android.os.PowerManager;
import com.google.android.apps.camera.legacy.app.activity.main.CameraActivity;
import com.google.android.apps.camera.legacy.app.app.CameraApp;
import com.google.android.apps.camera.legacy.app.settings.ManagedSwitchPreference;
import com.google.android.apps.camera.prewarm.NoOpPrewarmService;
import com.google.android.apps.camera.prewarm.ProcessingBoostService;
import com.google.android.apps.camera.processing.ProcessingService;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: cgn */
public final class cgn implements cgm {
    /* renamed from: a */
    public static final kwk f25544a = kwd.m14275a(kau.f21835a);
    /* renamed from: A */
    public kwk f25545A;
    /* renamed from: B */
    public kwk f25546B;
    /* renamed from: C */
    public kwk f25547C;
    /* renamed from: D */
    public kwk f25548D;
    /* renamed from: E */
    public kwk f25549E;
    /* renamed from: F */
    public kwk f25550F;
    /* renamed from: G */
    public kwk f25551G;
    /* renamed from: H */
    public kwk f25552H;
    /* renamed from: I */
    public kwk f25553I;
    /* renamed from: J */
    public kwk f25554J;
    /* renamed from: K */
    public kwk f25555K;
    /* renamed from: L */
    public kwk f25556L;
    /* renamed from: M */
    public kwk f25557M;
    /* renamed from: N */
    public kwk f25558N;
    /* renamed from: O */
    public kwk f25559O;
    /* renamed from: P */
    public bpb f25560P;
    /* renamed from: Q */
    public cch f25561Q;
    /* renamed from: R */
    public kwk f25562R;
    /* renamed from: S */
    public gow f25563S;
    /* renamed from: T */
    public kwk f25564T;
    /* renamed from: U */
    public bak f25565U;
    /* renamed from: V */
    public kwk f25566V;
    /* renamed from: W */
    public kwk f25567W;
    /* renamed from: X */
    public kwk f25568X;
    /* renamed from: Y */
    public bcg f25569Y;
    /* renamed from: Z */
    public kwk f25570Z;
    /* renamed from: aA */
    public ccd f25571aA;
    /* renamed from: aB */
    public kwk f25572aB;
    /* renamed from: aC */
    public kwk f25573aC;
    /* renamed from: aD */
    public kwk f25574aD;
    /* renamed from: aE */
    public kwk f25575aE;
    /* renamed from: aF */
    public kwk f25576aF;
    /* renamed from: aG */
    public kwk f25577aG;
    /* renamed from: aH */
    public kwk f25578aH;
    /* renamed from: aI */
    public kwk f25579aI;
    /* renamed from: aJ */
    public kwk f25580aJ;
    /* renamed from: aK */
    public kwk f25581aK;
    /* renamed from: aL */
    public kwk f25582aL;
    /* renamed from: aM */
    public kwk f25583aM;
    /* renamed from: aN */
    public kwk f25584aN;
    /* renamed from: aO */
    public kwk f25585aO;
    /* renamed from: aP */
    public kwk f25586aP;
    /* renamed from: aQ */
    public kwk f25587aQ;
    /* renamed from: aR */
    public brh f25588aR;
    /* renamed from: aS */
    public kwk f25589aS;
    /* renamed from: aT */
    public kwk f25590aT;
    /* renamed from: aU */
    public ccx f25591aU;
    /* renamed from: aV */
    public gur f25592aV;
    /* renamed from: aW */
    public kwk f25593aW;
    /* renamed from: aX */
    public kwk f25594aX;
    /* renamed from: aY */
    public kwk f25595aY;
    /* renamed from: aZ */
    public kwk f25596aZ;
    /* renamed from: aa */
    public kwk f25597aa;
    /* renamed from: ab */
    public dov f25598ab;
    /* renamed from: ac */
    public cco f25599ac;
    /* renamed from: ad */
    public kwk f25600ad;
    /* renamed from: ae */
    public kwk f25601ae;
    /* renamed from: af */
    public kwk f25602af;
    /* renamed from: ag */
    public kwk f25603ag;
    /* renamed from: ah */
    public gtj f25604ah;
    /* renamed from: ai */
    public kwk f25605ai;
    /* renamed from: aj */
    public kwk f25606aj;
    /* renamed from: ak */
    public gmr f25607ak;
    /* renamed from: al */
    public kwk f25608al;
    /* renamed from: am */
    public gri f25609am;
    /* renamed from: an */
    public kwk f25610an;
    /* renamed from: ao */
    public gls f25611ao;
    /* renamed from: ap */
    public kwk f25612ap;
    /* renamed from: aq */
    public kwk f25613aq;
    /* renamed from: ar */
    public kwk f25614ar;
    /* renamed from: as */
    public kwk f25615as;
    /* renamed from: at */
    public dow f25616at;
    /* renamed from: au */
    public ccm f25617au;
    /* renamed from: av */
    public kwk f25618av;
    /* renamed from: aw */
    public kwk f25619aw;
    /* renamed from: ax */
    public kwk f25620ax;
    /* renamed from: ay */
    public cbz f25621ay;
    /* renamed from: az */
    public kwk f25622az;
    /* renamed from: b */
    public cbw f25623b;
    /* renamed from: bA */
    public kwk f25624bA;
    /* renamed from: bB */
    public kwk f25625bB;
    /* renamed from: bC */
    public gph f25626bC;
    /* renamed from: bD */
    public kwk f25627bD;
    /* renamed from: bE */
    public ivi f25628bE;
    /* renamed from: bF */
    public kwk f25629bF;
    /* renamed from: bG */
    public kwk f25630bG;
    /* renamed from: bH */
    public kwk f25631bH;
    /* renamed from: bI */
    public bmj f25632bI;
    /* renamed from: bJ */
    public bpc f25633bJ;
    /* renamed from: bK */
    public kwk f25634bK;
    /* renamed from: bL */
    public kwk f25635bL;
    /* renamed from: bM */
    public kwk f25636bM;
    /* renamed from: bN */
    public kwk f25637bN;
    /* renamed from: bO */
    public kwk f25638bO;
    /* renamed from: bP */
    public kwk f25639bP;
    /* renamed from: bQ */
    public kwk f25640bQ;
    /* renamed from: bR */
    public kwk f25641bR;
    /* renamed from: bS */
    public kwk f25642bS;
    /* renamed from: bT */
    public kwk f25643bT;
    /* renamed from: bU */
    public gtv f25644bU;
    /* renamed from: bV */
    public bre f25645bV;
    /* renamed from: bW */
    public kwk f25646bW;
    /* renamed from: bX */
    public bri f25647bX;
    /* renamed from: bY */
    public kwk f25648bY;
    /* renamed from: bZ */
    public guq f25649bZ;
    /* renamed from: ba */
    public ete f25650ba;
    /* renamed from: bb */
    public kwk f25651bb;
    /* renamed from: bc */
    public eqk f25652bc;
    /* renamed from: bd */
    public kwk f25653bd;
    /* renamed from: be */
    public kwk f25654be;
    /* renamed from: bf */
    public kwk f25655bf;
    /* renamed from: bg */
    public gud f25656bg;
    /* renamed from: bh */
    public kwk f25657bh;
    /* renamed from: bi */
    public ccf f25658bi;
    /* renamed from: bj */
    public cck f25659bj;
    /* renamed from: bk */
    public kwk f25660bk;
    /* renamed from: bl */
    public kwk f25661bl;
    /* renamed from: bm */
    public kwk f25662bm;
    /* renamed from: bn */
    public kwk f25663bn;
    /* renamed from: bo */
    public kwk f25664bo;
    /* renamed from: bp */
    public kwk f25665bp;
    /* renamed from: bq */
    public hkb f25666bq;
    /* renamed from: br */
    public kwk f25667br;
    /* renamed from: bs */
    public kwk f25668bs;
    /* renamed from: bt */
    public gdq f25669bt;
    /* renamed from: bu */
    public kwk f25670bu;
    /* renamed from: bv */
    public kwk f25671bv;
    /* renamed from: bw */
    public kwk f25672bw;
    /* renamed from: bx */
    public kwk f25673bx;
    /* renamed from: by */
    public erg f25674by;
    /* renamed from: bz */
    public kwk f25675bz;
    /* renamed from: c */
    public enp f25676c;
    /* renamed from: cA */
    private kwk f25677cA;
    /* renamed from: cB */
    private kwk f25678cB;
    /* renamed from: cC */
    private blt f25679cC;
    /* renamed from: cD */
    private blv f25680cD;
    /* renamed from: cE */
    private kwk f25681cE;
    /* renamed from: cF */
    private kwk f25682cF;
    /* renamed from: cG */
    private irr f25683cG;
    /* renamed from: cH */
    private bpa f25684cH;
    /* renamed from: cI */
    private bch f25685cI;
    /* renamed from: cJ */
    private doq f25686cJ;
    /* renamed from: cK */
    private kwk f25687cK;
    /* renamed from: cL */
    private gll f25688cL;
    /* renamed from: cM */
    private kwk f25689cM;
    /* renamed from: cN */
    private gbz f25690cN;
    /* renamed from: cO */
    private kwk f25691cO;
    /* renamed from: cP */
    private kwk f25692cP;
    /* renamed from: cQ */
    private azu f25693cQ;
    /* renamed from: cR */
    private azs f25694cR;
    /* renamed from: cS */
    private kwk f25695cS;
    /* renamed from: cT */
    private kwk f25696cT;
    /* renamed from: cU */
    private kwk f25697cU;
    /* renamed from: cV */
    private aym f25698cV;
    /* renamed from: cW */
    private kwk f25699cW;
    /* renamed from: cX */
    private kwk f25700cX;
    /* renamed from: cY */
    private bqs f25701cY;
    /* renamed from: cZ */
    private kwk f25702cZ;
    /* renamed from: ca */
    public kwk f25703ca;
    /* renamed from: cb */
    private brw f25704cb = brw.m7797a(this.f25729d);
    /* renamed from: cc */
    private bsp f25705cc;
    /* renamed from: cd */
    private kwk f25706cd;
    /* renamed from: ce */
    private kwk f25707ce;
    /* renamed from: cf */
    private kwk f25708cf;
    /* renamed from: cg */
    private kwk f25709cg;
    /* renamed from: ch */
    private bss f25710ch;
    /* renamed from: ci */
    private ccg f25711ci;
    /* renamed from: cj */
    private kwk f25712cj;
    /* renamed from: ck */
    private iuv f25713ck;
    /* renamed from: cl */
    private kwk f25714cl;
    /* renamed from: cm */
    private kwk f25715cm;
    /* renamed from: cn */
    private bum f25716cn;
    /* renamed from: co */
    private kwk f25717co;
    /* renamed from: cp */
    private dxr f25718cp;
    /* renamed from: cq */
    private hjr f25719cq;
    /* renamed from: cr */
    private kwk f25720cr;
    /* renamed from: cs */
    private kwk f25721cs;
    /* renamed from: ct */
    private kwk f25722ct;
    /* renamed from: cu */
    private gcn f25723cu;
    /* renamed from: cv */
    private kwk f25724cv;
    /* renamed from: cw */
    private cfj f25725cw;
    /* renamed from: cx */
    private kwk f25726cx;
    /* renamed from: cy */
    private kwk f25727cy;
    /* renamed from: cz */
    private kwk f25728cz;
    /* renamed from: d */
    public kwk f25729d = kwh.m14279a(iwb.f21331a);
    /* renamed from: dA */
    private kwk f25730dA;
    /* renamed from: dB */
    private kwk f25731dB;
    /* renamed from: dC */
    private kwk f25732dC;
    /* renamed from: dD */
    private cce f25733dD;
    /* renamed from: dE */
    private kwk f25734dE;
    /* renamed from: dF */
    private kwk f25735dF;
    /* renamed from: dG */
    private eta f25736dG;
    /* renamed from: dH */
    private kwk f25737dH;
    /* renamed from: dI */
    private iua f25738dI;
    /* renamed from: dJ */
    private bpp f25739dJ;
    /* renamed from: dK */
    private bqu f25740dK;
    /* renamed from: dL */
    private kwk f25741dL;
    /* renamed from: dM */
    private kwk f25742dM;
    /* renamed from: da */
    private kwk f25743da;
    /* renamed from: db */
    private kwk f25744db;
    /* renamed from: dc */
    private kwk f25745dc;
    /* renamed from: dd */
    private ccj f25746dd;
    /* renamed from: de */
    private kwk f25747de;
    /* renamed from: df */
    private epb f25748df;
    /* renamed from: dg */
    private enq f25749dg;
    /* renamed from: dh */
    private kwk f25750dh;
    /* renamed from: di */
    private kwk f25751di;
    /* renamed from: dj */
    private epz f25752dj;
    /* renamed from: dk */
    private eqo f25753dk;
    /* renamed from: dl */
    private equ f25754dl;
    /* renamed from: dm */
    private eqs f25755dm;
    /* renamed from: dn */
    private eqe f25756dn;
    /* renamed from: do */
    private ccn f25757do;
    /* renamed from: dp */
    private guc f25758dp;
    /* renamed from: dq */
    private bvl f25759dq;
    /* renamed from: dr */
    private kwk f25760dr;
    /* renamed from: ds */
    private bvj f25761ds;
    /* renamed from: dt */
    private bvq f25762dt;
    /* renamed from: du */
    private bvo f25763du;
    /* renamed from: dv */
    private kwk f25764dv;
    /* renamed from: dw */
    private buv f25765dw;
    /* renamed from: dx */
    private gct f25766dx;
    /* renamed from: dy */
    private gcs f25767dy;
    /* renamed from: dz */
    private gcr f25768dz;
    /* renamed from: e */
    public cbx f25769e;
    /* renamed from: f */
    public cby f25770f;
    /* renamed from: g */
    public iqy f25771g;
    /* renamed from: h */
    public blg f25772h;
    /* renamed from: i */
    public kwk f25773i;
    /* renamed from: j */
    public kwk f25774j;
    /* renamed from: k */
    public kwk f25775k;
    /* renamed from: l */
    public bcb f25776l;
    /* renamed from: m */
    public kwk f25777m;
    /* renamed from: n */
    public kwk f25778n;
    /* renamed from: o */
    public kwk f25779o;
    /* renamed from: p */
    public kwk f25780p;
    /* renamed from: q */
    public kwk f25781q;
    /* renamed from: r */
    public kwk f25782r;
    /* renamed from: s */
    public kwk f25783s;
    /* renamed from: t */
    public hjz f25784t;
    /* renamed from: u */
    public bmc f25785u;
    /* renamed from: v */
    public hjs f25786v;
    /* renamed from: w */
    public kwk f25787w;
    /* renamed from: x */
    public kwk f25788x;
    /* renamed from: y */
    public kwk f25789y;
    /* renamed from: z */
    public kwk f25790z;

    public cgn(cgp cgp) {
        this.f25769e = cbx.m8070a(cgp.f2134a);
        this.f25705cc = bsp.m7813a(this.f25769e);
        this.f25770f = cby.m8073a(cgp.f2134a);
        this.f25706cd = kwc.m14273b(cca.m8078a(this.f25770f));
        this.f25707ce = kwh.m14279a(blf.m7599a(cgp.f2135b));
        this.f25708cf = new cgs(this.f25707ce);
        this.f25771g = iqy.m12643a(this.f25708cf);
        this.f25772h = blg.m7601a(cgp.f2135b, this.f25771g);
        this.f25709cg = kwc.m14273b(bsm.m7811a(this.f25704cb, this.f25705cc, this.f25706cd, this.f25772h));
        this.f25710ch = bss.m7817a(this.f25709cg);
        this.f25773i = kwc.m14273b(bsr.m7815a(this.f25710ch));
        this.f25774j = kwc.m14273b(ccc.m8080a(this.f25770f));
        this.f25775k = kwc.m14273b(bcc.f11166a);
        this.f25776l = bcb.m7329a(this.f25775k);
        this.f25777m = kwh.m14279a(bci.m7339a(cgp.f2136c));
        this.f25778n = kwh.m14279a(new bca(this.f25776l, this.f25777m));
        this.f25711ci = ccg.m8087a(this.f25774j);
        this.f25712cj = kwh.m14279a(ivz.f21329a);
        this.f25779o = kwh.m14279a(iwa.f21330a);
        this.f25780p = kwc.m14273b(bma.m7629a(this.f25773i));
        this.f25713ck = iuv.m12791a(this.f25712cj, this.f25779o, this.f25780p, this.f25771g);
        this.f25714cl = kwc.m14273b(iuj.m12709a(this.f25711ci, this.f25713ck));
        this.f25715cm = kwc.m14273b(iuq.m12755a(this.f25711ci, this.f25714cl, this.f25771g));
        this.f25781q = kwc.m14273b(hjp.f20170a);
        this.f25782r = kwc.m14273b(fbo.m10356a(this.f25715cm, this.f25781q));
        this.f25783s = kwc.m14273b(bky.m7597a(cgp.f2137d, this.f25769e, this.f25781q, this.f25706cd));
        this.f25784t = hjz.m12101a(this.f25770f);
        this.f25716cn = bum.m7850a(this.f25784t);
        this.f25785u = bmc.m7631a(this.f25773i, this.f25781q, this.f25716cn, this.f25783s);
        this.f25717co = kwc.m14273b(dxu.m9684a(this.f25770f, this.f25785u));
        this.f25718cp = dxr.m9680a(this.f25770f);
        this.f25786v = hjs.m12098a(this.f25770f);
        this.f25719cq = hjr.m12096a(this.f25786v, this.f25770f);
        this.f25787w = kwc.m14273b(dyz.m9724a(this.f25770f, this.f25717co, this.f25718cp, bsv.f11752a, this.f25719cq));
        this.f25788x = kwh.m14279a(bcd.m7332a(cgp.f2136c));
        this.f25789y = kwc.m14273b(new bms(this.f25711ci, this.f25787w, this.f25788x, this.f25778n));
        this.f25790z = kwc.m14273b(new dot(this.f25783s, this.f25789y, this.f25781q, this.f25780p));
        this.f25545A = kwc.m14273b(cbv.m8068a(this.f25770f));
        this.f25720cr = kwc.m14273b(new eqz(this.f25783s, this.f25781q, this.f25545A));
        this.f25546B = kwc.m14273b(new ere(this.f25720cr, erf.f17688a));
        this.f25547C = kwc.m14273b(new bxi(this.f25783s, this.f25785u, this.f25781q, this.f25729d, this.f25773i));
        this.f25548D = kwc.m14273b(dou.f14285a);
        this.f25549E = kwc.m14273b(new byi(this.f25783s, this.f25546B, this.f25547C, this.f25548D, bsv.f11752a));
        this.f25721cs = kwc.m14273b(new cbe(this.f25771g, this.f25780p, this.f25770f));
        this.f25722ct = f25544a;
        this.f25723cu = new gcn(this.f25722ct, this.f25781q);
        this.f25550F = kwc.m14273b(new byj(this.f25782r, this.f25790z, this.f25549E, this.f25780p, this.f25721cs, this.f25773i, this.f25548D, this.f25723cu));
        this.f25724cv = kwc.m14273b(new byl(this.f25550F, this.f25790z, this.f25780p));
        this.f25725cw = new cfj(this.f25782r, this.f25780p);
        this.f25726cx = kwc.m14273b(new gwh(this.f25770f, this.f25778n));
        this.f25551G = kwc.m14273b(gwk.f19731a);
        this.f25552H = kwc.m14273b(new gwi(this.f25726cx, this.f25551G, this.f25772h));
        this.f25727cy = kwc.m14273b(new gwj(this.f25552H, this.f25772h));
        this.f25728cz = f25544a;
        this.f25623b = cgp.f2134a;
        this.f25553I = kwc.m14273b(new grm(this.f25787w));
        this.f25554J = kwc.m14273b(new gec(this.f25775k));
        this.f25555K = kwc.m14273b(new gem(this.f25772h, this.f25770f));
        this.f25677cA = f25544a;
        this.f25678cB = kwc.m14273b(new blq(this.f25677cA));
        this.f25679cC = new blt(this.f25770f, this.f25678cB, this.f25771g);
        this.f25680cD = new blv(bsv.f11752a);
        this.f25556L = kwc.m14273b(new blu(this.f25679cC, this.f25680cD, this.f25773i));
        this.f25557M = kwc.m14273b(new bxn(this.f25550F, this.f25775k));
        this.f25681cE = kwc.m14273b(new bal(this.f25775k, this.f25777m));
        this.f25676c = cgp.f2138e;
        this.f25558N = kwc.m14273b(dyy.m9722a(this.f25770f, this.f25706cd, this.f25787w));
        this.f25559O = kwc.m14273b(bpk.f11695a);
        this.f25560P = new bpb(this.f25559O);
        this.f25561Q = new cch(this.f25774j);
        this.f25562R = kwc.m14273b(gse.f19555a);
        this.f25563S = gow.m11491a(this.f25558N, this.f25772h);
        this.f25564T = kwc.m14273b(new dxx(this.f25563S));
        this.f25565U = new bak(this.f25681cE);
        this.f25566V = kwc.m14273b(new isf(this.f25775k));
        this.f25682cF = kwc.m14273b(irk.f21219a);
        this.f25567W = kwc.m14273b(irj.f21218a);
        this.f25683cG = new irr(this.f25682cF, this.f25567W, this.f25711ci, this.f25787w, this.f25780p, ixy.f21360a);
        this.f25684cH = new bpa(this.f25559O);
        this.f25568X = kwc.m14273b(new isp(this.f25683cG, this.f25682cF, this.f25684cH, bmw.f11547a, this.f25566V, this.f25780p, this.f25771g));
        this.f25685cI = new bch(this.f25775k);
        this.f25569Y = new bcg(this.f25685cI);
        this.f25570Z = kwc.m14273b(fxf.m11057a(this.f25563S));
        this.f25597aa = kwc.m14273b(new dyo(this.f25563S));
        this.f25686cJ = new doq(this.f25566V, this.f25790z, this.f25782r, this.f25568X, this.f25780p);
        this.f25598ab = new dov(this.f25686cJ);
        this.f25599ac = new cco(this.f25774j);
        this.f25600ad = kwc.m14273b(new dxs(this.f25563S));
        this.f25601ae = kwc.m14273b(new dxt(this.f25563S));
        this.f25687cK = kwc.m14273b(epx.f17619a);
        this.f25602af = kwc.m14273b(gth.f19577a);
        this.f25603ag = kwc.m14273b(gtw.f19604a);
        this.f25604ah = gtj.m11728a(this.f25602af, this.f25603ag);
        this.f25605ai = kwc.m14273b(new gtt(gsk.f19560a, this.f25687cK, this.f25604ah));
        this.f25606aj = new kwb();
        this.f25607ak = new gmr(this.f25770f, this.f25605ai);
        this.f25608al = kwc.m14273b(new hjv(this.f25781q, this.f25773i));
        this.f25609am = new gri(this.f25787w);
        this.f25610an = kwc.m14273b(new gnz(this.f25769e, this.f25603ag, this.f25602af, gsn.f19562a));
        this.f25611ao = new gls(gsn.f19562a, this.f25770f);
        this.f25688cL = gll.m11375a(this.f25606aj, this.f25607ak, this.f25778n, this.f25605ai, gsn.f19562a, this.f25608al, this.f25609am, this.f25610an, this.f25611ao);
        this.f25612ap = kwc.m14273b(new glx(this.f25688cL, this.f25787w, this.f25611ao));
        this.f25613aq = kwc.m14273b(gmw.f19356a);
        kwb kwb = (kwb) this.f25606aj;
        this.f25606aj = kwc.m14273b(new gnt(this.f25777m, this.f25612ap, this.f25613aq));
        kwb.mo14206a(this.f25606aj);
        this.f25614ar = kwc.m14273b(dzf.f17015a);
        this.f25615as = kwc.m14273b(new dyx(this.f25563S));
        this.f25689cM = kwd.m14275a(this);
        this.f25616at = new dow(this.f25689cM);
        this.f25617au = new ccm(this.f25774j);
        this.f25618av = kwc.m14273b(bmx.f11548a);
        this.f25690cN = new gbz(this.f25777m, this.f25770f, this.f25772h);
        this.f25619aw = kwc.m14273b(new gca(this.f25690cN));
        this.f25620ax = kwc.m14273b(new dxy(this.f25563S));
        this.f25621ay = new cbz(cgp.f2134a);
        this.f25622az = kwc.m14273b(new dzd(this.f25563S, this.f25621ay));
        this.f25571aA = new ccd(this.f25774j);
        this.f25691cO = kwc.m14273b(azi.f11075a);
        this.f25692cP = kwc.m14273b(new azq(this.f25563S, this.f25691cO, this.f25773i));
        this.f25693cQ = new azu(cgp.f2139f, this.f25691cO);
        this.f25694cR = new azs(this.f25693cQ, this.f25773i);
        this.f25695cS = kwc.m14273b(azc.f11069a);
        this.f25696cT = kwc.m14273b(new dyc(this.f25563S));
        this.f25697cU = kwc.m14273b(new azo(this.f25691cO, this.f25692cP, this.f25694cR, this.f25695cS, this.f25621ay, this.f25696cT, this.f25787w, this.f25773i, this.f25565U, this.f25711ci));
        this.f25698cV = new aym(this.f25773i, this.f25697cU);
        this.f25699cW = kwf.m14277a(0, 1).mo10564a(this.f25698cV).mo10563a();
        this.f25572aB = kwc.m14273b(new ayl(this.f25699cW, this.f25773i, this.f25565U));
        this.f25700cX = new cgo(this);
        this.f25573aC = kwc.m14273b(bfq.m7403a(this.f25700cX));
        this.f25574aD = kwc.m14273b(dyq.f16986a);
        this.f25575aE = kwc.m14273b(new dyg(this.f25563S));
        this.f25576aF = kwc.m14273b(dyn.m9708a(this.f25563S));
        this.f25577aG = kwc.m14273b(dyv.m9718a(this.f25563S));
        this.f25578aH = kwc.m14273b(dyu.m9716a(this.f25563S));
        this.f25579aI = kwc.m14273b(new dzb(this.f25563S, this.f25621ay));
        this.f25580aJ = kwc.m14273b(new dza(this.f25563S));
        this.f25581aK = kwc.m14273b(new dzc(this.f25563S));
        this.f25582aL = kwc.m14273b(new dyr(this.f25563S));
        this.f25583aM = kwc.m14273b(new dxv(this.f25563S, this.f25621ay));
        this.f25584aN = kwc.m14273b(new dxw(this.f25563S, this.f25621ay));
        this.f25585aO = kwc.m14273b(dyf.m9699a(this.f25563S));
        this.f25586aP = kwc.m14273b(goj.f19421a);
        this.f25701cY = new bqs(this.f25777m);
        this.f25702cZ = kwc.m14273b(new brc(bqt.f11704a, this.f25701cY));
        this.f25743da = new cgs(this.f25702cZ);
        this.f25587aQ = kwc.m14273b(brf.m7787a(this.f25781q));
        this.f25588aR = new brh(this.f25743da, this.f25773i, this.f25587aQ);
        this.f25589aS = kwc.m14273b(dze.f17014a);
        this.f25590aT = kwc.m14273b(fbs.f18113a);
        this.f25744db = f25544a;
        this.f25591aU = new ccx(this.f25744db, this.f25785u);
        this.f25745dc = f25544a;
        this.f25592aV = new gur(this.f25745dc, this.f25785u);
        this.f25593aW = kwc.m14273b(dye.f16974a);
        this.f25746dd = new ccj(this.f25774j);
        this.f25747de = kwc.m14273b(new dyp(this.f25563S));
        this.f25748df = new epb(this.f25770f, this.f25558N, this.f25746dd, this.f25747de, this.f25780p);
        this.f25749dg = new enq(cgp.f2138e);
        this.f25594aX = kwc.m14273b(new eoz(this.f25748df, this.f25749dg, this.f25777m));
        this.f25595aY = kwc.m14273b(esc.f17703a);
        this.f25750dh = kwc.m14273b(esb.f17702a);
        this.f25596aZ = kwc.m14273b(new esp(this.f25595aY, this.f25750dh, gsk.f19560a, gsn.f19562a, this.f25604ah, this.f25770f, eui.f17823a, this.f25777m, this.f25582aL));
        this.f25751di = new cgs(this.f25596aZ);
        this.f25650ba = new ete(this.f25751di, this.f25785u);
        this.f25651bb = kwc.m14273b(new dyh(this.f25563S));
        this.f25752dj = new epz(this.f25687cK);
        this.f25753dk = new eqo(this.f25769e, eqg.f17644a, this.f25752dj);
        this.f25754dl = new equ(this.f25687cK);
        this.f25755dm = new eqs(this.f25769e, eqh.f17645a, this.f25754dl);
        this.f25652bc = new eqk(this.f25687cK);
        this.f25756dn = new eqe(eqf.f17643a, this.f25769e, this.f25604ah, this.f25753dk, this.f25755dm, this.f25652bc, this.f25780p, this.f25569Y);
        this.f25653bd = kwc.m14273b(this.f25756dn);
        this.f25654be = kwc.m14273b(glr.f19291a);
        this.f25757do = ccn.m8105a(this.f25774j);
        this.f25758dp = guc.m11768a(this.f25757do, this.f25712cj);
        this.f25655bf = kwc.m14273b(gue.m11771a(this.f25776l, this.f25603ag, this.f25757do, this.f25758dp));
        this.f25656bg = new gud(this.f25603ag, this.f25775k, this.f25655bf);
        this.f25657bh = kwc.m14273b(bcf.f11169a);
        this.f25658bi = ccf.m8085a(this.f25774j);
        this.f25659bj = new cck(this.f25774j);
        this.f25660bk = kwc.m14273b(gog.f19420a);
        this.f25661bl = kwc.m14273b(new aui(this.f25593aW, this.f25660bk, this.f25565U, hkf.f20179a));
        this.f25662bm = kwc.m14273b(new dyd(this.f25563S, this.f25621ay));
        this.f25663bn = kwc.m14273b(new gen(this.f25546B, this.f25720cr, this.f25555K));
        this.f25759dq = new bvl(this.f25770f);
        this.f25760dr = kwh.m14279a(bce.m7334a(this.f25657bh, this.f25777m));
        this.f25761ds = new bvj(this.f25759dq, this.f25760dr);
        this.f25762dt = new bvq(this.f25769e, this.f25603ag, this.f25780p);
        this.f25763du = new bvo(this.f25761ds, this.f25762dt);
        this.f25664bo = kwc.m14273b(new bvr(this.f25785u, this.f25763du));
        this.f25764dv = kwc.m14273b(bur.f11809a);
        this.f25765dw = new buv(this.f25764dv, this.f25769e, this.f25605ai, this.f25664bo, this.f25606aj);
        this.f25665bp = kwc.m14273b(new buw(this.f25785u, this.f25765dw));
        this.f25666bq = new hkb(cgp.f2140g, this.f25770f);
        this.f25766dx = new gct(cgp.f2141h);
        this.f25767dy = new gcs(cgp.f2141h);
        this.f25768dz = new gcr(cgp.f2141h, this.f25777m);
        this.f25667br = kwh.m14279a(new goz(this.f25706cd, hkf.f20179a));
        this.f25668bs = f25544a;
        this.f25730dA = kwc.m14273b(new gdf(this.f25766dx, this.f25767dy, this.f25768dz, this.f25667br, this.f25666bq, this.f25773i, this.f25770f, this.f25668bs));
        this.f25731dB = kwc.m14273b(new gcq(cgp.f2141h, this.f25730dA));
        this.f25732dC = new cgs(this.f25731dB);
        this.f25669bt = new gdq(this.f25732dC, this.f25773i, this.f25781q);
        this.f25670bu = kwc.m14273b(new foj(cgp.f2142i, this.f25781q));
        this.f25671bv = kwc.m14273b(new dyk(this.f25563S));
        this.f25672bw = kwc.m14273b(new dyj(this.f25563S));
        this.f25673bx = kwc.m14273b(new dyi(this.f25563S));
        this.f25733dD = new cce(this.f25774j);
        this.f25674by = new erg(this.f25733dD);
        this.f25675bz = kwc.m14273b(new dym(this.f25563S));
        this.f25624bA = kwc.m14273b(new dys(this.f25589aS, this.f25570Z, this.f25579aI, this.f25781q));
        this.f25625bB = kwc.m14273b(new dyl(this.f25563S));
        this.f25734dE = f25544a;
        this.f25626bC = new gph(this.f25785u, this.f25734dE);
        this.f25735dF = kwc.m14273b(new esy(this.f25605ai, this.f25604ah, this.f25770f));
        this.f25736dG = new eta(this.f25735dF, this.f25785u);
        this.f25627bD = kwc.m14273b(new bcr(this.f25780p, this.f25773i));
        this.f25737dH = kwc.m14273b(new fnt(cgp.f2143j, this.f25783s, this.f25565U));
        this.f25738dI = iua.m12707a(this.f25712cj);
        this.f25628bE = ivi.m12795a(this.f25738dI, this.f25780p, this.f25771g);
        this.f25629bF = kwc.m14273b(new fms(this.f25737dH, this.f25628bE));
        this.f25630bG = kwc.m14273b(new dxq(this.f25563S));
        this.f25631bH = kwc.m14273b(new gfg(this.f25555K, this.f25621ay, this.f25780p));
        this.f25632bI = bmj.m7633a(this.f25770f, this.f25777m);
        this.f25739dJ = new bpp(this.f25770f, this.f25773i, this.f25632bI, this.f25772h);
        this.f25633bJ = new bpc(this.f25739dJ);
        this.f25634bK = kwc.m14273b(new fpt(fpu.f18602a, this.f25608al, this.f25780p));
        this.f25635bL = kwc.m14273b(new bwl(this.f25617au, this.f25712cj));
        this.f25636bM = kwc.m14273b(new bwn(this.f25635bL, this.f25617au));
        this.f25637bN = kwc.m14273b(cdg.f12213a);
        this.f25638bO = kwc.m14273b(brg.f11730a);
        this.f25639bP = kwc.m14273b(bro.f11741a);
        this.f25640bQ = kwc.m14273b(new fmv(this.f25628bE));
        this.f25641bR = kwc.m14273b(bwm.f11874a);
        this.f25642bS = kwc.m14273b(frt.f18731a);
        this.f25643bT = kwc.m14273b(frs.f18730a);
        this.f25644bU = new gtv(this.f25770f);
        this.f25645bV = new bre(this.f25580aJ, this.f25587aQ, this.f25773i);
        this.f25646bW = kwc.m14273b(new dyw(this.f25563S, this.f25668bs));
        this.f25740dK = new bqu(this.f25702cZ);
        this.f25741dL = new cgs(this.f25740dK);
        this.f25647bX = new bri(this.f25741dL, this.f25773i, this.f25587aQ);
        this.f25648bY = kwc.m14273b(new etk(this.f25650ba));
        this.f25742dM = f25544a;
        this.f25649bZ = new guq(this.f25742dM, this.f25785u);
        this.f25703ca = kwc.m14273b(new gdr(this.f25783s));
    }

    /* renamed from: a */
    public static cgp m17246a() {
        return new cgp();
    }

    /* renamed from: a */
    public final dpl mo6037a(fjf fjf, dof dof, fxh fxh, fyz fyz) {
        return new dpl(this, fjf, dof, fxh, fyz);
    }

    /* renamed from: a */
    public final ceo mo14590a(ceg ceg, cbh cbh, gqr gqr) {
        return new ceo(this, ceg, cbh, gqr);
    }

    /* renamed from: a */
    public final blb mo14589a(ccp ccp) {
        return new blb(this, ccp);
    }

    /* renamed from: a */
    public final dxi mo14591a(ceg ceg) {
        return new dxi(this, ceg);
    }

    /* renamed from: b */
    public final ivw mo15477b() {
        return bak.m7298a(this.f25681cE.mo10566a());
    }

    /* renamed from: c */
    public final bmb mo15478c() {
        return new bmb((bsn) this.f25773i.mo10566a(), (hjf) this.f25781q.mo10566a(), new bul(new hjy(cby.m8074b(this.f25623b))), (bkw) this.f25783s.mo10566a());
    }

    /* renamed from: d */
    private final NotificationManager m17248d() {
        return cck.m8096a(this.f25774j.mo10566a());
    }

    /* renamed from: a */
    public final void mo14592a(cef cef) {
        cef.f12248a = (ird) this.f25780p.mo10566a();
        cef.f12249b = mo15477b();
        cef.f12250c = enq.m9937a(this.f25676c);
    }

    /* renamed from: a */
    public final void mo14593a(CameraActivity cameraActivity) {
        cameraActivity.f12248a = (ird) this.f25780p.mo10566a();
        cameraActivity.f12249b = mo15477b();
        cameraActivity.f12250c = enq.m9937a(this.f25676c);
        cameraActivity.f23259d = (bsn) this.f25773i.mo10566a();
        cameraActivity.f23260e = (bls) this.f25556L.mo10566a();
        cameraActivity.f23261f = (blx) this.f25678cB.mo10566a();
    }

    /* renamed from: a */
    public final void mo2289a(CameraApp cameraApp) {
        cameraApp.f12768a = new blw((bsn) this.f25773i.mo10566a(), blg.m7602a(iqy.m12644a(kbg.m4804c((iqz) this.f25707ce.mo10566a()))));
        cameraApp.f12769b = m17248d();
        bsv.m7819b();
        Executor executor = (Executor) this.f25778n.mo10566a();
        kwk kwk = this.f25724cv;
        kwk kwk2 = this.f25725cw;
        kwk kwk3 = this.f25727cy;
        kwk kwk4 = this.f25728cz;
        bsn bsn = mo15478c().f1335a;
        cameraApp.f12770c = new cgz(executor, kwk, kwk2, kwk3, (kbg) ktm.m14219a((kbg) kwk4.mo10566a(), "Cannot return null from a non-@Nullable @Provides method"));
        cameraApp.f12771d = this.f25553I;
        this.f25773i.mo10566a();
        cameraApp.f12772e = (irs) this.f25787w.mo10566a();
    }

    /* renamed from: a */
    public final void mo14594a(ManagedSwitchPreference managedSwitchPreference) {
        managedSwitchPreference.f2557a = (gos) this.f25558N.mo10566a();
    }

    /* renamed from: a */
    public final void mo13332a(NoOpPrewarmService noOpPrewarmService) {
        noOpPrewarmService.f2574b = (irs) this.f25787w.mo10566a();
        noOpPrewarmService.f2575c = (ikq) this.f25554J.mo10566a();
    }

    /* renamed from: a */
    public final void mo13333a(ProcessingBoostService processingBoostService) {
        processingBoostService.f2578a = (bxj) this.f25557M.mo10566a();
        processingBoostService.f2579b = (Executor) this.f25778n.mo10566a();
    }

    /* renamed from: a */
    public final void mo13335a(ProcessingService processingService) {
        processingService.f12826j = m17248d();
        processingService.f12827k = (gev) this.f25555K.mo10566a();
        processingService.f12828l = (PowerManager) ktm.m14219a((PowerManager) ((ccb) this.f25774j.mo10566a()).mo2252a("power"), "Cannot return null from a non-@Nullable @Provides method");
        processingService.f12829m = (C0245gh) ktm.m14219a(C0245gh.m2599a(cby.m8074b(this.f25623b)), "Cannot return null from a non-@Nullable @Provides method");
        processingService.f12830n = (ird) this.f25780p.mo10566a();
        processingService.f12831o = (ikd) this.f25777m.mo10566a();
        processingService.f12832p = (ivx) this.f25712cj.mo10566a();
        processingService.f12833q = (bls) this.f25556L.mo10566a();
    }
}
