package p000;

import android.app.ActionBar;
import android.app.Activity;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.Window;
import android.view.WindowManager;
import com.google.android.apps.camera.bottombar.BottomBarController;
import com.google.android.apps.camera.stats.CameraActivitySession;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* renamed from: cgg */
public final class cgg implements kwk {
    /* renamed from: A */
    private final kwk f12340A;
    /* renamed from: B */
    private final kwk f12341B;
    /* renamed from: C */
    private final kwk f12342C;
    /* renamed from: D */
    private final kwk f12343D;
    /* renamed from: E */
    private final kwk f12344E;
    /* renamed from: F */
    private final kwk f12345F;
    /* renamed from: G */
    private final kwk f12346G;
    /* renamed from: H */
    private final kwk f12347H;
    /* renamed from: I */
    private final kwk f12348I;
    /* renamed from: J */
    private final kwk f12349J;
    /* renamed from: K */
    private final kwk f12350K;
    /* renamed from: L */
    private final kwk f12351L;
    /* renamed from: M */
    private final kwk f12352M;
    /* renamed from: N */
    private final kwk f12353N;
    /* renamed from: O */
    private final kwk f12354O;
    /* renamed from: P */
    private final kwk f12355P;
    /* renamed from: Q */
    private final kwk f12356Q;
    /* renamed from: R */
    private final kwk f12357R;
    /* renamed from: S */
    private final kwk f12358S;
    /* renamed from: T */
    private final kwk f12359T;
    /* renamed from: U */
    private final kwk f12360U;
    /* renamed from: V */
    private final kwk f12361V;
    /* renamed from: W */
    private final kwk f12362W;
    /* renamed from: X */
    private final kwk f12363X;
    /* renamed from: Y */
    private final kwk f12364Y;
    /* renamed from: Z */
    private final kwk f12365Z;
    /* renamed from: a */
    private final kwk f12366a;
    /* renamed from: aA */
    private final kwk f12367aA;
    /* renamed from: aB */
    private final kwk f12368aB;
    /* renamed from: aC */
    private final kwk f12369aC;
    /* renamed from: aD */
    private final kwk f12370aD;
    /* renamed from: aE */
    private final kwk f12371aE;
    /* renamed from: aF */
    private final kwk f12372aF;
    /* renamed from: aG */
    private final kwk f12373aG;
    /* renamed from: aH */
    private final kwk f12374aH;
    /* renamed from: aI */
    private final kwk f12375aI;
    /* renamed from: aJ */
    private final kwk f12376aJ;
    /* renamed from: aa */
    private final kwk f12377aa;
    /* renamed from: ab */
    private final kwk f12378ab;
    /* renamed from: ac */
    private final kwk f12379ac;
    /* renamed from: ad */
    private final kwk f12380ad;
    /* renamed from: ae */
    private final kwk f12381ae;
    /* renamed from: af */
    private final kwk f12382af;
    /* renamed from: ag */
    private final kwk f12383ag;
    /* renamed from: ah */
    private final kwk f12384ah;
    /* renamed from: ai */
    private final kwk f12385ai;
    /* renamed from: aj */
    private final kwk f12386aj;
    /* renamed from: ak */
    private final kwk f12387ak;
    /* renamed from: al */
    private final kwk f12388al;
    /* renamed from: am */
    private final kwk f12389am;
    /* renamed from: an */
    private final kwk f12390an;
    /* renamed from: ao */
    private final kwk f12391ao;
    /* renamed from: ap */
    private final kwk f12392ap;
    /* renamed from: aq */
    private final kwk f12393aq;
    /* renamed from: ar */
    private final kwk f12394ar;
    /* renamed from: as */
    private final kwk f12395as;
    /* renamed from: at */
    private final kwk f12396at;
    /* renamed from: au */
    private final kwk f12397au;
    /* renamed from: av */
    private final kwk f12398av;
    /* renamed from: aw */
    private final kwk f12399aw;
    /* renamed from: ax */
    private final kwk f12400ax;
    /* renamed from: ay */
    private final kwk f12401ay;
    /* renamed from: az */
    private final kwk f12402az;
    /* renamed from: b */
    private final kwk f12403b;
    /* renamed from: c */
    private final kwk f12404c;
    /* renamed from: d */
    private final kwk f12405d;
    /* renamed from: e */
    private final kwk f12406e;
    /* renamed from: f */
    private final kwk f12407f;
    /* renamed from: g */
    private final kwk f12408g;
    /* renamed from: h */
    private final kwk f12409h;
    /* renamed from: i */
    private final kwk f12410i;
    /* renamed from: j */
    private final kwk f12411j;
    /* renamed from: k */
    private final kwk f12412k;
    /* renamed from: l */
    private final kwk f12413l;
    /* renamed from: m */
    private final kwk f12414m;
    /* renamed from: n */
    private final kwk f12415n;
    /* renamed from: o */
    private final kwk f12416o;
    /* renamed from: p */
    private final kwk f12417p;
    /* renamed from: q */
    private final kwk f12418q;
    /* renamed from: r */
    private final kwk f12419r;
    /* renamed from: s */
    private final kwk f12420s;
    /* renamed from: t */
    private final kwk f12421t;
    /* renamed from: u */
    private final kwk f12422u;
    /* renamed from: v */
    private final kwk f12423v;
    /* renamed from: w */
    private final kwk f12424w;
    /* renamed from: x */
    private final kwk f12425x;
    /* renamed from: y */
    private final kwk f12426y;
    /* renamed from: z */
    private final kwk f12427z;

    public cgg(kwk kwk, kwk kwk2, kwk kwk3, kwk kwk4, kwk kwk5, kwk kwk6, kwk kwk7, kwk kwk8, kwk kwk9, kwk kwk10, kwk kwk11, kwk kwk12, kwk kwk13, kwk kwk14, kwk kwk15, kwk kwk16, kwk kwk17, kwk kwk18, kwk kwk19, kwk kwk20, kwk kwk21, kwk kwk22, kwk kwk23, kwk kwk24, kwk kwk25, kwk kwk26, kwk kwk27, kwk kwk28, kwk kwk29, kwk kwk30, kwk kwk31, kwk kwk32, kwk kwk33, kwk kwk34, kwk kwk35, kwk kwk36, kwk kwk37, kwk kwk38, kwk kwk39, kwk kwk40, kwk kwk41, kwk kwk42, kwk kwk43, kwk kwk44, kwk kwk45, kwk kwk46, kwk kwk47, kwk kwk48, kwk kwk49, kwk kwk50, kwk kwk51, kwk kwk52, kwk kwk53, kwk kwk54, kwk kwk55, kwk kwk56, kwk kwk57, kwk kwk58, kwk kwk59, kwk kwk60, kwk kwk61, kwk kwk62, kwk kwk63, kwk kwk64, kwk kwk65, kwk kwk66, kwk kwk67, kwk kwk68, kwk kwk69, kwk kwk70, kwk kwk71, kwk kwk72, kwk kwk73, kwk kwk74, kwk kwk75, kwk kwk76, kwk kwk77, kwk kwk78, kwk kwk79, kwk kwk80, kwk kwk81, kwk kwk82, kwk kwk83, kwk kwk84, kwk kwk85, kwk kwk86, kwk kwk87, kwk kwk88) {
        this.f12366a = kwk;
        this.f12403b = kwk2;
        this.f12404c = kwk3;
        this.f12405d = kwk4;
        this.f12406e = kwk5;
        this.f12407f = kwk6;
        this.f12408g = kwk7;
        this.f12409h = kwk8;
        this.f12410i = kwk9;
        this.f12411j = kwk10;
        this.f12412k = kwk11;
        this.f12413l = kwk12;
        this.f12414m = kwk13;
        this.f12415n = kwk14;
        this.f12416o = kwk15;
        this.f12417p = kwk16;
        this.f12418q = kwk17;
        this.f12419r = kwk18;
        this.f12420s = kwk19;
        this.f12421t = kwk20;
        this.f12422u = kwk21;
        this.f12423v = kwk22;
        this.f12424w = kwk23;
        this.f12425x = kwk24;
        this.f12426y = kwk25;
        this.f12427z = kwk26;
        this.f12340A = kwk27;
        this.f12341B = kwk28;
        this.f12342C = kwk29;
        this.f12343D = kwk30;
        this.f12344E = kwk31;
        this.f12345F = kwk32;
        this.f12346G = kwk33;
        this.f12347H = kwk34;
        this.f12348I = kwk35;
        this.f12349J = kwk36;
        this.f12350K = kwk37;
        this.f12351L = kwk38;
        this.f12352M = kwk39;
        this.f12353N = kwk40;
        this.f12354O = kwk41;
        this.f12355P = kwk42;
        this.f12356Q = kwk43;
        this.f12357R = kwk44;
        this.f12358S = kwk45;
        this.f12359T = kwk46;
        this.f12360U = kwk47;
        this.f12361V = kwk48;
        this.f12362W = kwk49;
        this.f12363X = kwk50;
        this.f12364Y = kwk51;
        this.f12365Z = kwk52;
        this.f12377aa = kwk53;
        this.f12378ab = kwk54;
        this.f12379ac = kwk55;
        this.f12380ad = kwk56;
        this.f12381ae = kwk57;
        this.f12382af = kwk58;
        this.f12383ag = kwk59;
        this.f12384ah = kwk60;
        this.f12385ai = kwk61;
        this.f12386aj = kwk62;
        this.f12387ak = kwk63;
        this.f12388al = kwk64;
        this.f12389am = kwk65;
        this.f12390an = kwk66;
        this.f12391ao = kwk67;
        this.f12392ap = kwk68;
        this.f12393aq = kwk69;
        this.f12394ar = kwk70;
        this.f12395as = kwk71;
        this.f12396at = kwk72;
        this.f12397au = kwk73;
        this.f12398av = kwk74;
        this.f12399aw = kwk75;
        this.f12400ax = kwk76;
        this.f12401ay = kwk77;
        this.f12402az = kwk78;
        this.f12367aA = kwk79;
        this.f12368aB = kwk80;
        this.f12369aC = kwk81;
        this.f12370aD = kwk82;
        this.f12371aE = kwk83;
        this.f12372aF = kwk84;
        this.f12373aG = kwk85;
        this.f12374aH = kwk86;
        this.f12375aI = kwk87;
        this.f12376aJ = kwk88;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo10566a() {
        kwk kwk = this.f12366a;
        kwk kwk2 = this.f12403b;
        kwk kwk3 = this.f12404c;
        kwk kwk4 = this.f12405d;
        kwk kwk5 = this.f12406e;
        kwk kwk6 = this.f12407f;
        kwk kwk7 = this.f12408g;
        kwk kwk8 = this.f12409h;
        kwk kwk9 = this.f12410i;
        kwk kwk10 = this.f12411j;
        kwk kwk11 = this.f12412k;
        kwk kwk12 = this.f12413l;
        kwk kwk13 = this.f12414m;
        kwk kwk14 = this.f12415n;
        kwk kwk15 = this.f12416o;
        kwk kwk16 = this.f12417p;
        kwk kwk17 = this.f12418q;
        kwk kwk18 = this.f12419r;
        kwk kwk19 = this.f12420s;
        kwk kwk20 = this.f12421t;
        kwk kwk21 = this.f12422u;
        kwk kwk22 = this.f12423v;
        kwk kwk23 = this.f12424w;
        kwk kwk24 = this.f12425x;
        kwk kwk25 = this.f12426y;
        kwk kwk26 = this.f12427z;
        kwk kwk27 = this.f12340A;
        kwk kwk28 = this.f12341B;
        kwk kwk29 = this.f12342C;
        kwk kwk30 = this.f12343D;
        kwk kwk31 = this.f12344E;
        kwk kwk32 = this.f12345F;
        kwk kwk33 = this.f12346G;
        kwk kwk34 = this.f12347H;
        kwk kwk35 = this.f12348I;
        kwk kwk36 = this.f12349J;
        kwk kwk37 = this.f12350K;
        kwk kwk38 = this.f12351L;
        kwk kwk39 = this.f12352M;
        kwk kwk40 = this.f12353N;
        kwk kwk41 = this.f12354O;
        kwk kwk42 = this.f12355P;
        kwk kwk43 = this.f12356Q;
        kwk kwk44 = this.f12357R;
        kwk kwk45 = this.f12358S;
        kwk kwk46 = this.f12359T;
        kwk kwk47 = this.f12360U;
        kwk kwk48 = this.f12361V;
        kwk kwk49 = this.f12362W;
        kwk kwk50 = this.f12363X;
        kwk kwk51 = this.f12364Y;
        kwk kwk52 = this.f12365Z;
        kwk kwk53 = this.f12377aa;
        kwk kwk54 = this.f12378ab;
        kwk kwk55 = this.f12379ac;
        kwk kwk56 = this.f12380ad;
        kwk kwk57 = this.f12381ae;
        kwk kwk58 = this.f12382af;
        kwk kwk59 = this.f12383ag;
        kwk kwk60 = this.f12384ah;
        kwk kwk61 = this.f12385ai;
        kwk kwk62 = this.f12386aj;
        kwk kwk63 = this.f12387ak;
        kwk kwk64 = this.f12388al;
        kwk kwk65 = this.f12389am;
        kwk kwk66 = this.f12390an;
        kwk kwk67 = this.f12391ao;
        return new cfk((Context) kwk.mo10566a(), (Context) kwk2.mo10566a(), (Resources) kwk3.mo10566a(), (Window) kwk4.mo10566a(), (ContentResolver) kwk5.mo10566a(), (LayoutInflater) kwk6.mo10566a(), (Handler) kwk7.mo10566a(), (awr) kwk8.mo10566a(), (hkg) kwk9.mo10566a(), (enr) kwk10.mo10566a(), (Activity) kwk11.mo10566a(), (aws) kwk12.mo10566a(), (awi) kwk13.mo10566a(), (ikd) kwk14.mo10566a(), (WindowManager) kwk15.mo10566a(), (cvy) kwk16.mo10566a(), (fhc) kwk17.mo10566a(), (hat) kwk18.mo10566a(), ((Boolean) kwk19.mo10566a()).booleanValue(), (gci) kwk20.mo10566a(), (fbn) kwk21.mo10566a(), (chz) kwk22.mo10566a(), (cgu) kwk23.mo10566a(), (erh) kwk24.mo10566a(), (irh) kwk25.mo10566a(), (hjw) kwk26.mo10566a(), (gos) kwk27.mo10566a(), (gor) kwk28.mo10566a(), (gsp) kwk29.mo10566a(), (gyi) kwk30.mo10566a(), (gln) kwk31.mo10566a(), (glj) kwk32.mo10566a(), (bag) kwk33.mo10566a(), (hek) kwk34.mo10566a(), (het) kwk35.mo10566a(), (ActionBar) kwk36.mo10566a(), kwc.m14272a(kwk37), (dzg) kwk38.mo10566a(), (bpq) kwk39.mo10566a(), (ScheduledExecutorService) kwk40.mo10566a(), (gst) kwk41.mo10566a(), (Executor) kwk42.mo10566a(), (bfk) kwk43.mo10566a(), (gvr) kwk44.mo10566a(), (hjf) kwk45.mo10566a(), (awm) kwk46.mo10566a(), (gev) kwk47.mo10566a(), (cqb) kwk48.mo10566a(), (cqm) kwk49.mo10566a(), (cqx) kwk50.mo10566a(), kwk51, (cbu) kwk52.mo10566a(), (cbr) kwk53.mo10566a(), (ird) kwk54.mo10566a(), (CameraActivitySession) kwk55.mo10566a(), kwk56, kwk57, (edb) kwk58.mo10566a(), (edf) kwk59.mo10566a(), (edo) kwk60.mo10566a(), (ecd) kwk61.mo10566a(), (ehu) kwk62.mo10566a(), (gwo) kwk63.mo10566a(), (hhj) kwk64.mo10566a(), (cwd) kwk65.mo10566a(), (Intent) kwk66.mo10566a(), (BottomBarController) kwk67.mo10566a(), this.f12392ap, (bmb) this.f12393aq.mo10566a(), (ebq) this.f12394ar.mo10566a(), (kbg) this.f12395as.mo10566a(), (hny) this.f12396at.mo10566a(), (irs) this.f12397au.mo10566a(), (bkw) this.f12398av.mo10566a(), (kbg) this.f12399aw.mo10566a(), (gyz) this.f12400ax.mo10566a(), (gwp) this.f12401ay.mo10566a(), (ebm) this.f12402az.mo10566a(), (gal) this.f12367aA.mo10566a(), (gzy) this.f12368aB.mo10566a(), (ilp) this.f12369aC.mo10566a(), (ilp) this.f12370aD.mo10566a(), (ilp) this.f12371aE.mo10566a(), (cdq) this.f12372aF.mo10566a(), (kbg) this.f12373aG.mo10566a(), (gnh) this.f12374aH.mo10566a(), (gyl) this.f12375aI.mo10566a(), (kbg) this.f12376aJ.mo10566a());
    }
}
