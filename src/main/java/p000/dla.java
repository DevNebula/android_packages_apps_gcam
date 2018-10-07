package p000;

import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.KeyEvent;
import com.google.android.apps.camera.bottombar.BottomBarController;
import com.google.android.apps.camera.bottombar.BottomBarListener;
import com.google.android.apps.camera.stats.Instrumentation;

/* compiled from: PG */
/* renamed from: dla */
public final class dla extends cvs implements ing {
    /* renamed from: A */
    private final BottomBarController f26111A;
    /* renamed from: B */
    private final hcd f26112B;
    /* renamed from: C */
    private final BottomBarListener f26113C;
    /* renamed from: D */
    private final ilp f26114D;
    /* renamed from: E */
    private ikb f26115E;
    /* renamed from: F */
    private final ecd f26116F;
    /* renamed from: G */
    private final gxz f26117G;
    /* renamed from: H */
    private final asu f26118H;
    /* renamed from: I */
    private final hat f26119I;
    /* renamed from: J */
    private final irs f26120J;
    /* renamed from: K */
    private final dkb f26121K;
    /* renamed from: L */
    private final djo f26122L;
    /* renamed from: M */
    private final imy f26123M;
    /* renamed from: N */
    private cfh f26124N;
    /* renamed from: O */
    private fbn f26125O;
    /* renamed from: P */
    private Intent f26126P;
    /* renamed from: Q */
    private final div f26127Q;
    /* renamed from: R */
    private final kwk f26128R;
    /* renamed from: S */
    private final hny f26129S;
    /* renamed from: T */
    private final hnz f26130T = new dlb(this);
    /* renamed from: U */
    private final dzh f26131U;
    /* renamed from: V */
    private final haq f26132V = new dle();
    /* renamed from: W */
    private final hnr f26133W = new dlh(this);
    /* renamed from: c */
    public boolean f26134c;
    /* renamed from: d */
    public buh f26135d;
    /* renamed from: e */
    public hin f26136e;
    /* renamed from: f */
    public final gtl f26137f;
    /* renamed from: g */
    public final hch f26138g;
    /* renamed from: h */
    public AlertDialog f26139h;
    /* renamed from: i */
    public final how f26140i;
    /* renamed from: j */
    private dli f26141j;
    /* renamed from: k */
    private cfh f26142k;
    /* renamed from: l */
    private final ikd f26143l;
    /* renamed from: m */
    private final hek f26144m;
    /* renamed from: n */
    private final heq f26145n;
    /* renamed from: o */
    private final gpn f26146o;
    /* renamed from: p */
    private final irh f26147p;
    /* renamed from: q */
    private final bfk f26148q;
    /* renamed from: r */
    private final cbu f26149r;
    /* renamed from: s */
    private final bpq f26150s;
    /* renamed from: t */
    private final ilp f26151t;
    /* renamed from: u */
    private final fer f26152u;
    /* renamed from: v */
    private final ehx f26153v;
    /* renamed from: w */
    private final eid f26154w;
    /* renamed from: x */
    private final hnh f26155x;
    /* renamed from: y */
    private final fbr f26156y;
    /* renamed from: z */
    private final ilp f26157z;

    static {
        bli.m887a("VideoIntentModule");
    }

    public dla(bfk bfk, bag bag, bah bah, cfh cfh, cbu cbu, fbn fbn, Intent intent, gyi gyi, ikd ikd, gpn gpn, hek hek, heq heq, irh irh, bpq bpq, gtl gtl, hny hny, ilp ilp, fer fer, ehx ehx, eid eid, hnh hnh, fbr fbr, ilp ilp2, BottomBarController bottomBarController, hcd hcd, ilp ilp3, bpt bpt, hnf hnf, ecd ecd, gxz gxz, asu asu, hat hat, dzh dzh, irs irs, dkb dkb, djo djo, imy imy, how how, hjf hjf, div div, ilp ilp4, kwk kwk) {
        super(bag, bah);
        this.f26148q = bfk;
        this.f26124N = cfh;
        this.f26149r = cbu;
        this.f26125O = fbn;
        this.f26126P = intent;
        this.f26143l = ikd;
        this.f26146o = gpn;
        this.f26144m = hek;
        this.f26145n = heq;
        this.f26147p = irh;
        this.f26150s = bpq;
        this.f26137f = gtl;
        this.f26129S = hny;
        this.f26153v = ehx;
        this.f26154w = eid;
        this.f26151t = ilp;
        this.f26152u = fer;
        this.f26155x = hnh;
        this.f26156y = fbr;
        this.f26157z = ilp2;
        this.f26111A = bottomBarController;
        this.f26112B = hcd;
        this.f26114D = ilp3;
        this.f26116F = ecd;
        this.f26117G = gxz;
        this.f26118H = asu;
        this.f26119I = hat;
        this.f26131U = dzh;
        this.f26120J = irs;
        this.f26121K = dkb;
        this.f26122L = djo;
        this.f26123M = imy;
        this.f26140i = how;
        this.f26127Q = div;
        this.f26128R = kwk;
        this.f26113C = new dlc(this);
        this.f26138g = new dld(this);
    }

    public final void close() {
    }

    /* renamed from: f_ */
    public final fha mo12931f_() {
        return null;
    }

    /* renamed from: b */
    public final String mo12925b() {
        return null;
    }

    /* renamed from: a */
    public final void mo12922a(gos gos) {
    }

    /* renamed from: a */
    public final void mo12921a(cfh cfh, ezy ezy) {
        this.f26141j = new dli(cfh, this.f26124N.mo12481l().f17176h, this.f26124N.mo12481l(), this.f26117G);
        this.f26142k = cfh;
        HandlerThread handlerThread = new HandlerThread("VideoIntentModule.CameraHandler");
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        ilb ilb = new ilb(null);
        Intent intent = this.f26126P;
        dli dli = this.f26141j;
        ikd ikd = new ikd();
        Context k = this.f26124N.mo12480k();
        fbn fbn = this.f26125O;
        hjw u = this.f26124N.mo12490u();
        gci x = this.f26124N.mo12493x();
        this.f26124N.mo12460B();
        this.f26135d = new bui(new doa(intent, dli, ikd, k, fbn, u, x, this.f26146o, this.f26131U, this.f26124N, this.f26149r, this.f26150s, this.f26142k.mo12494y(), this.f26142k.mo12486q(), this.f26121K, this.f26144m, this.f26145n, this.f26147p, this.f26148q, this.f26122L, this, this.f26151t, this.f26152u, this.f26153v, this.f26154w, this.f26156y, this.f26157z, this.f26114D, this.f26116F, this.f26118H, this.f26119I, this.f26120J, handlerThread, ilb, this.f26123M, this.f26127Q, this.f26128R));
        buh buh = this.f26135d;
        buh.mo2155a(new dlv(buh));
        ((grt) Instrumentation.instance().modeSwitch().getCurrentSession()).mo13464b();
        ((doa) this.f26135d.mo2153a()).f14249p.mo13673b();
    }

    /* renamed from: c */
    public final boolean mo12928c() {
        return false;
    }

    /* renamed from: e */
    public final boolean mo12929e() {
        return true;
    }

    /* renamed from: a */
    public final void mo12920a(aah aah) {
    }

    /* renamed from: a */
    public final boolean mo12923a(int i, KeyEvent keyEvent) {
        return false;
    }

    /* renamed from: b */
    public final boolean mo12927b(int i, KeyEvent keyEvent) {
        return false;
    }

    /* renamed from: b */
    public final void mo12926b(boolean z) {
    }

    /* renamed from: a */
    public final void mo8641a(boolean z) {
        this.f26143l.execute(new dlf(this));
    }

    /* renamed from: m_ */
    public final void mo12937m_() {
        this.f26135d.mo2154a(new daz());
        this.f26140i.mo8000a(kau.f21835a);
    }

    /* renamed from: j */
    public final void mo12934j() {
        this.f26140i.mo8000a(kbg.m4803b(inc.FPS_30));
    }

    /* renamed from: k */
    public final void mo12935k() {
        this.f26115E = new ikb();
        this.f26115E.mo8557a(this.f26112B.mo7668a(this.f26138g));
        dli.m1702c();
        this.f26111A.addListener(this.f26113C);
        this.f26135d.mo2154a(new dbc());
        ((doa) this.f26135d.mo2153a()).f14232K.mo12472a(this.f26132V, true);
        this.f26129S.mo13554a(this.f26130T);
        this.f26155x.mo13548a(this.f26133W);
    }

    /* renamed from: l */
    public final void mo12936l() {
        dli.m1701b();
        this.f26111A.removeListener(this.f26113C);
        this.f26135d.mo2154a(new dbd());
        this.f26115E.close();
        this.f26129S.mo13555b(this.f26130T);
        this.f26155x.f20208a = null;
    }
}
