package p000;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.widget.FrameLayout;
import com.google.android.apps.camera.optionsbar.OptionsBarView;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* renamed from: gal */
public class gal {
    /* renamed from: a */
    public static final String f5186a = gal.class.getSimpleName();
    /* renamed from: A */
    private final ilp f5187A;
    /* renamed from: B */
    private final ilp f5188B;
    /* renamed from: C */
    private final fzm f5189C;
    /* renamed from: D */
    private final fzm f5190D;
    /* renamed from: E */
    private final fzm f5191E;
    /* renamed from: F */
    private final fzm f5192F;
    /* renamed from: G */
    private final fzm f5193G;
    /* renamed from: H */
    private final fzm f5194H;
    /* renamed from: I */
    private final fzm f5195I;
    /* renamed from: J */
    private final fzm f5196J;
    /* renamed from: K */
    private final fzm f5197K;
    /* renamed from: L */
    private final fzm f5198L;
    /* renamed from: M */
    private final fzm f5199M;
    /* renamed from: N */
    private final fzm f5200N;
    /* renamed from: O */
    private final fzm f5201O;
    /* renamed from: P */
    private final fzm f5202P;
    /* renamed from: Q */
    private final fzm f5203Q;
    /* renamed from: R */
    private final fzm f5204R;
    /* renamed from: S */
    private final ilp f5205S;
    /* renamed from: T */
    private final boolean f5206T;
    /* renamed from: U */
    private final boolean f5207U;
    /* renamed from: V */
    private final boolean f5208V;
    /* renamed from: W */
    private final boolean f5209W;
    /* renamed from: X */
    private boolean f5210X;
    /* renamed from: Y */
    private final kcx f5211Y = kee.m13694a(fzp.TIMER_ZERO_SECONDS, Integer.valueOf(0), fzp.TIMER_THREE_SECONDS, Integer.valueOf(3), fzp.TIMER_TEN_SECONDS, Integer.valueOf(10));
    /* renamed from: Z */
    private final kcx f5212Z = kee.m13694a(fzp.HDR_OFF, fxj.OFF, fzp.HDR_AUTO, fxj.AUTO, fzp.HDR_ON, fxj.ON);
    /* renamed from: aa */
    private final kcx f5213aa;
    /* renamed from: ab */
    private final kcx f5214ab;
    /* renamed from: ac */
    private final kcx f5215ac;
    /* renamed from: ad */
    private final kcx f5216ad;
    /* renamed from: ae */
    private final kcx f5217ae;
    /* renamed from: af */
    private final kcx f5218af;
    /* renamed from: ag */
    private final kcx f5219ag;
    /* renamed from: ah */
    private final kcx f5220ah;
    /* renamed from: ai */
    private final kcx f5221ai;
    /* renamed from: b */
    public final OptionsBarView f5222b;
    /* renamed from: c */
    public final ilp f5223c;
    /* renamed from: d */
    public final ikd f5224d;
    /* renamed from: e */
    public final ilp f5225e;
    /* renamed from: f */
    public final ilp f5226f;
    /* renamed from: g */
    public final ilp f5227g;
    /* renamed from: h */
    public final ilp f5228h;
    /* renamed from: i */
    public final fzm f5229i;
    /* renamed from: j */
    public boolean f5230j;
    /* renamed from: k */
    public boolean f5231k;
    /* renamed from: l */
    public boolean f5232l;
    /* renamed from: m */
    public boolean f5233m;
    /* renamed from: n */
    private final iji f5234n;
    /* renamed from: o */
    private final Map f5235o;
    /* renamed from: p */
    private final ilp f5236p;
    /* renamed from: q */
    private final ilp f5237q;
    /* renamed from: r */
    private final boolean f5238r;
    /* renamed from: s */
    private final ilp f5239s;
    /* renamed from: t */
    private final ilp f5240t;
    /* renamed from: u */
    private final ilp f5241u;
    /* renamed from: v */
    private final ilp f5242v;
    /* renamed from: w */
    private final ilp f5243w;
    /* renamed from: x */
    private final ilp f5244x;
    /* renamed from: y */
    private final ilp f5245y;
    /* renamed from: z */
    private final ilp f5246z;

    public gal(OptionsBarView optionsBarView, ilp ilp, ikd ikd, iji iji, fzy fzy, bkw bkw, ilp ilp2, ilp ilp3, ilp ilp4, ilp ilp5, ilp ilp6, boolean z, ilp ilp7, ilp ilp8, ilp ilp9, ilp ilp10, ilp ilp11, ilp ilp12, ilp ilp13, boolean z2, ilp ilp14, boolean z3, ilp ilp15, boolean z4, ilp ilp16, ilp ilp17, boolean z5, ilp ilp18) {
        fzp fzp = fzp.SELECTED;
        Boolean valueOf = Boolean.valueOf(true);
        fzp fzp2 = fzp.UNSELECTED;
        Boolean valueOf2 = Boolean.valueOf(false);
        this.f5213aa = kee.m13693a(fzp, valueOf, fzp2, valueOf2);
        Object obj = fzp.WHITE_BALANCE_AUTO;
        Object obj2 = feq.AUTO;
        Object obj3 = fzp.WHITE_BALANCE_CLOUDY;
        Object obj4 = feq.CLOUDY;
        Object obj5 = fzp.WHITE_BALANCE_SUNNY;
        Object obj6 = feq.SUNNY;
        Object obj7 = fzp.WHITE_BALANCE_FLUORESCENT;
        Object obj8 = feq.FLUORESCENT;
        Object obj9 = fzp.WHITE_BALANCE_INCANDESCENT;
        Object obj10 = feq.INCANDESCENT;
        khb.m4952b(obj, obj2);
        khb.m4952b(obj3, obj4);
        khb.m4952b(obj5, obj6);
        khb.m4952b(obj7, obj8);
        khb.m4952b(obj9, obj10);
        this.f5214ab = new kgg(new Object[]{obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10}, 5);
        this.f5215ac = kee.m13694a(fzp.PHOTO_FLASH_AUTO, "auto", fzp.PHOTO_FLASH_OFF, "off", fzp.PHOTO_FLASH_ON, "on");
        this.f5216ad = kee.m13694a(fzp.FPS_AUTO, gom.FPS_AUTO, fzp.FPS_30, gom.FPS_30, fzp.FPS_60, gom.FPS_60);
        this.f5217ae = kee.m13693a(fzp.EXT_MICROPHONE_ON, valueOf, fzp.EXT_MICROPHONE_OFF, valueOf2);
        this.f5218af = kee.m13693a(fzp.VESPER_ON, valueOf, fzp.VESPER_OFF, valueOf2);
        this.f5219ag = kee.m13694a(fzp.MICROVIDEO_ON, Integer.valueOf(gon.MICRO_ON.f5971d), fzp.MICROVIDEO_AUTO, Integer.valueOf(gon.MICRO_AUTO.f5971d), fzp.MICROVIDEO_OFF, Integer.valueOf(gon.MICRO_OFF.f5971d));
        this.f5220ah = kee.m13693a(fzp.VIDEO_FLASH_OFF, "off", fzp.VIDEO_FLASH_ON, "torch");
        this.f5221ai = kee.m13693a(fzp.IMAX_AUDIO_ON, valueOf, fzp.IMAX_AUDIO_OFF, valueOf2);
        this.f5222b = optionsBarView;
        this.f5223c = ilp;
        this.f5224d = ikd;
        this.f5234n = iji;
        this.f5235o = new HashMap();
        this.f5236p = ilp2;
        this.f5225e = ilp3;
        this.f5226f = ilp5;
        this.f5237q = ilp6;
        this.f5238r = false;
        this.f5239s = ilp7;
        this.f5240t = ilp8;
        this.f5241u = ilp9;
        this.f5242v = ilp10;
        this.f5243w = ilp11;
        this.f5244x = ilp12;
        this.f5245y = ilp13;
        this.f5246z = ilp14;
        this.f5187A = ilp15;
        this.f5227g = ilp16;
        this.f5228h = ilp17;
        this.f5188B = ilp18;
        this.f5189C = fzy.f5149a;
        this.f5229i = fzy.f5150b;
        this.f5190D = fzy.f5151c;
        this.f5191E = fzy.f5152d;
        this.f5192F = fzy.f5153e;
        this.f5193G = fzy.f5154f;
        this.f5194H = fzy.f5155g;
        this.f5195I = fzy.f5156h;
        this.f5196J = fzy.f5157i;
        this.f5197K = fzy.f5158j;
        this.f5198L = fzy.f5159k;
        this.f5199M = fzy.f5164p;
        this.f5200N = fzy.f5160l;
        this.f5201O = fzy.f5161m;
        this.f5202P = fzy.f5162n;
        this.f5203Q = fzy.f5163o;
        this.f5204R = fzy.f5165q;
        this.f5205S = ilp4;
        this.f5206T = bkw.mo1998a(bkw.f1283a, "camera:white_balance_enabled", true);
        this.f5207U = z2;
        this.f5208V = z3;
        this.f5209W = z4;
        this.f5210X = false;
        this.f5234n.mo8557a(this.f5223c.mo13672a(new gam(this), this.f5224d));
        this.f5234n.mo8557a(this.f5244x.mo13672a(new gan(this), this.f5224d));
        this.f5234n.mo8557a(this.f5205S.mo13672a(new gat(this), this.f5224d));
        this.f5234n.mo8557a(this.f5237q.mo13672a(new gau(this), this.f5224d));
        m2507a(this.f5236p, this.f5211Y, this.f5189C);
        m2507a(this.f5225e, this.f5212Z, this.f5229i);
        m2507a(this.f5226f, this.f5213aa, this.f5190D);
        m2507a(this.f5239s, this.f5214ab, this.f5191E);
        m2507a(this.f5240t, this.f5215ac, this.f5192F);
        m2507a(this.f5241u, this.f5220ah, this.f5193G);
        m2507a(this.f5242v, this.f5216ad, this.f5194H);
        m2507a(this.f5242v, this.f5216ad, this.f5195I);
        m2507a(this.f5243w, this.f5217ae, this.f5196J);
        m2507a(this.f5245y, this.f5219ag, this.f5197K);
        m2507a(this.f5246z, this.f5218af, this.f5198L);
        m2507a(this.f5188B, this.f5221ai, this.f5204R);
        this.f5234n.mo8557a(this.f5187A.mo13672a(new gav(this), this.f5224d));
        this.f5234n.mo8557a(this.f5240t.mo13672a(new gaw(this), this.f5224d));
        this.f5234n.mo8557a(this.f5225e.mo13672a(new gax(this), this.f5224d));
        this.f5234n.mo8557a(this.f5226f.mo13672a(new gay(this), this.f5224d));
        this.f5234n.mo8557a(this.f5226f.mo13672a(new gaz(this), this.f5224d));
        this.f5234n.mo8557a(this.f5223c.mo13672a(new gba(this), this.f5224d));
    }

    /* renamed from: a */
    public final void mo7001a(fzo fzo, fzt fzt) {
        this.f5235o.put(fzo, fzt);
    }

    /* renamed from: a */
    private final void m2508a(kcx kcx, ilp ilp, fzm fzm, boolean z) {
        if (z) {
            fzp a = gal.m2505a(kcx, ilp, fzp.UNKNOWN);
            if (a == fzp.UNKNOWN) {
                String str = f5186a;
                String valueOf = String.valueOf(ilp.mo13673b());
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 52);
                stringBuilder.append("Property value ");
                stringBuilder.append(valueOf);
                stringBuilder.append(" is not associated with a MenuOption.");
                bli.m898e(str, stringBuilder.toString());
                return;
            }
            this.f5222b.mo14602a(fzm, a, (fzt) this.f5235o.get(fzm.f5085a));
        }
    }

    /* renamed from: a */
    public final void mo7000a() {
        OptionsBarView optionsBarView = this.f5222b;
        if (!optionsBarView.f23294h) {
            ObjectAnimator objectAnimator = (ObjectAnimator) AnimatorInflater.loadAnimator(optionsBarView.getContext(), 17498112);
            objectAnimator.setDuration(200);
            objectAnimator.setTarget(optionsBarView);
            objectAnimator.addListener(new gbm(optionsBarView));
            ObjectAnimator objectAnimator2 = (ObjectAnimator) AnimatorInflater.loadAnimator(optionsBarView.getContext(), 17498112);
            objectAnimator2.setDuration(200);
            objectAnimator2.addListener(optionsBarView.mo14599a(true));
            FrameLayout frameLayout = optionsBarView.f23293g;
            if (frameLayout != null) {
                objectAnimator2.setTarget(frameLayout);
                for (int i = 0; i < ((FrameLayout) jqk.m13354c(optionsBarView.f23293g)).getChildCount(); i++) {
                    ((FrameLayout) jqk.m13354c(optionsBarView.f23293g)).getChildAt(i).setEnabled(true);
                }
            }
            optionsBarView.f23289c.cancel();
            optionsBarView.f23289c = new AnimatorSet();
            optionsBarView.f23289c.playTogether(new Animator[]{objectAnimator, objectAnimator2});
            optionsBarView.f23289c.start();
            optionsBarView.f23294h = true;
        }
        this.f5222b.mo14609c();
    }

    /* renamed from: b */
    public final void mo7004b() {
        OptionsBarView optionsBarView = this.f5222b;
        if (optionsBarView.f23294h) {
            ObjectAnimator objectAnimator = (ObjectAnimator) AnimatorInflater.loadAnimator(optionsBarView.getContext(), 17498113);
            objectAnimator.setDuration(200);
            objectAnimator.setTarget(optionsBarView);
            objectAnimator.addListener(new gbn(optionsBarView));
            ObjectAnimator objectAnimator2 = (ObjectAnimator) AnimatorInflater.loadAnimator(optionsBarView.getContext(), 17498113);
            objectAnimator2.setDuration(200);
            objectAnimator2.addListener(optionsBarView.mo14599a(false));
            FrameLayout frameLayout = optionsBarView.f23293g;
            if (frameLayout != null) {
                objectAnimator2.setTarget(frameLayout);
                for (int i = 0; i < ((FrameLayout) jqk.m13354c(optionsBarView.f23293g)).getChildCount(); i++) {
                    ((FrameLayout) jqk.m13354c(optionsBarView.f23293g)).getChildAt(i).setEnabled(false);
                }
            }
            optionsBarView.f23289c.cancel();
            optionsBarView.f23289c = new AnimatorSet();
            optionsBarView.f23289c.playTogether(new Animator[]{objectAnimator, objectAnimator2});
            optionsBarView.f23289c.start();
            optionsBarView.f23294h = false;
        }
        this.f5222b.mo14607b();
    }

    /* renamed from: a */
    static fzp m2505a(kcx kcx, ilp ilp, fzp fzp) {
        fzp fzp2 = (fzp) kcx.mo9757a().get(ilp.mo13673b());
        if (fzp2 != null) {
            return fzp2;
        }
        String str = f5186a;
        String valueOf = String.valueOf(ilp);
        String valueOf2 = String.valueOf(ilp.mo13673b());
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(valueOf).length() + 106) + String.valueOf(valueOf2).length());
        stringBuilder.append("Tried to get MenuOption for property ");
        stringBuilder.append(valueOf);
        stringBuilder.append(" with value");
        stringBuilder.append(valueOf2);
        stringBuilder.append(" but value wasn't found in map. Returning default instead.");
        bli.m898e(str, stringBuilder.toString());
        return fzp;
    }

    /* renamed from: a */
    private final void m2507a(ilp ilp, kcx kcx, fzm fzm) {
        this.f5234n.mo8557a(ilp.mo13672a(new gao(this, kcx, ilp, fzm), this.f5224d));
        OptionsBarView optionsBarView = this.f5222b;
        optionsBarView.f23287a.put(fzm, new gap(kcx, ilp));
    }

    /* renamed from: b */
    static final /* synthetic */ void m2509b(kcx kcx, ilp ilp, fzp fzp) {
        Object obj = kcx.get(fzp);
        if (obj != null) {
            ilp.mo8826a(obj);
        }
    }

    /* renamed from: a */
    private final void m2506a(fzm fzm) {
        this.f5222b.mo14601a(fzm, fzp.SELECTED);
    }

    /* renamed from: c */
    final void mo7005c() {
        if (Boolean.TRUE.equals(this.f5226f.mo13673b())) {
            this.f5222b.mo14603a(fzo.HDR);
            this.f5225e.mo8826a(fxj.AUTO);
            return;
        }
        this.f5222b.mo14608b(fzo.HDR);
    }

    /* renamed from: d */
    final void mo7006d() {
        if ((((String) this.f5240t.mo13673b()).equals("on") && ((Integer) this.f5187A.mo13673b()).intValue() == 0) || fxj.ON.equals(this.f5225e.mo13673b()) || Boolean.TRUE.equals(this.f5226f.mo13673b())) {
            this.f5222b.mo14603a(fzo.MICROVIDEO);
        } else {
            this.f5222b.mo14608b(fzo.MICROVIDEO);
        }
    }

    /* renamed from: a */
    public final void mo7002a(hhx hhx) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean isEnabled = this.f5222b.isEnabled();
        this.f5222b.mo14607b();
        boolean z11 = hhx != hhx.PHOTO ? hhx != hhx.IMAGE_INTENT ? hhx == hhx.PORTRAIT : true : true;
        if (hhx != hhx.PHOTO) {
            z = false;
        } else if (!this.f5231k) {
            z = false;
        } else if (!this.f5209W) {
            z = true;
        } else if (((Boolean) this.f5205S.mo13673b()).booleanValue()) {
            z = true;
        } else {
            z = false;
        }
        if (!this.f5238r) {
            if (((Boolean) this.f5226f.mo13673b()).booleanValue()) {
                this.f5226f.mo8826a(Boolean.valueOf(false));
            }
            if (((Boolean) this.f5237q.mo13673b()).booleanValue()) {
                this.f5237q.mo8826a(Boolean.valueOf(false));
                z2 = false;
            } else {
                z2 = false;
            }
        } else if (hhx != hhx.PHOTO) {
            z2 = false;
        } else if (((Boolean) this.f5237q.mo13673b()).booleanValue()) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!this.f5206T) {
            z3 = false;
        } else if (hhx == hhx.LENS_BLUR) {
            z3 = false;
        } else if (hhx == hhx.PANORAMA) {
            z3 = false;
        } else if (hhx == hhx.PHOTO_SPHERE) {
            z3 = false;
        } else if (hhx != hhx.IMAX) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (!this.f5230j) {
            z4 = false;
        } else if (hhx == hhx.PHOTO) {
            z4 = true;
        } else if (hhx == hhx.IMAGE_INTENT) {
            z4 = true;
        } else if (hhx == hhx.PORTRAIT) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (!this.f5230j) {
            z5 = false;
        } else if (hhx == hhx.VIDEO) {
            z5 = true;
        } else if (hhx == hhx.VIDEO_INTENT) {
            z5 = true;
        } else if (hhx == hhx.SLOW_MOTION) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (hhx != hhx.VIDEO) {
            z6 = false;
        } else if (this.f5233m) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (hhx != hhx.VIDEO) {
            z7 = false;
        } else if (((Boolean) this.f5244x.mo13673b()).booleanValue()) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (!this.f5207U) {
            z8 = false;
        } else if (hhx == hhx.PHOTO) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (hhx == hhx.IMAX) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (!this.f5208V) {
            z10 = false;
        } else if (hhx == hhx.PHOTO && this.f5232l) {
            z10 = true;
        } else if (hhx == hhx.PORTRAIT) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f5222b.mo14600a();
        OptionsBarView optionsBarView = this.f5222b;
        synchronized (optionsBarView.f23290d) {
            fzh fzh = optionsBarView.f23290d;
            fzh.f5069b.clear();
            fzh.removeAllViews();
            fzh.mo6956a();
            fzh.mo6960b();
        }
        m2508a(this.f5218af, this.f5246z, this.f5198L, z10);
        if (this.f5210X) {
            m2508a(this.f5216ad, this.f5242v, this.f5195I, z6);
        } else {
            if (((gom) this.f5242v.mo13673b()).equals(gom.FPS_AUTO)) {
                this.f5242v.mo8826a(gom.FPS_30);
            }
            m2508a(this.f5216ad, this.f5242v, this.f5194H, z6);
        }
        m2508a(this.f5217ae, this.f5243w, this.f5196J, z7);
        m2508a(this.f5211Y, this.f5236p, this.f5189C, z11);
        m2508a(this.f5212Z, this.f5225e, this.f5229i, z);
        m2508a(this.f5213aa, this.f5226f, this.f5190D, z2);
        m2508a(this.f5219ag, this.f5245y, this.f5197K, z8);
        m2508a(this.f5214ab, this.f5239s, this.f5191E, z3);
        m2508a(this.f5215ac, this.f5240t, this.f5192F, z4);
        m2508a(this.f5220ah, this.f5241u, this.f5193G, z5);
        if (z9) {
            m2508a(this.f5221ai, this.f5188B, this.f5204R, z9);
        }
        if (hhx == hhx.PHOTO_SPHERE) {
            this.f5222b.mo14602a(this.f5199M, fzp.UNSELECTED, null);
            this.f5222b.mo14602a(this.f5202P, fzp.UNSELECTED, null);
            this.f5222b.mo14602a(this.f5203Q, fzp.UNSELECTED, null);
            mo7003a(this.f5228h);
            this.f5222b.mo14606a(new gar(this));
        }
        if (hhx == hhx.PANORAMA) {
            this.f5222b.mo14602a(this.f5200N, fzp.UNSELECTED, null);
            this.f5222b.mo14602a(this.f5201O, fzp.UNSELECTED, null);
            mo7003a(this.f5227g);
            this.f5222b.mo14606a(new gaq(this));
        }
        if (isEnabled) {
            this.f5222b.mo14609c();
        }
        if (z) {
            mo7005c();
        }
    }

    /* renamed from: a */
    final void mo7003a(ilp ilp) {
        int i = 0;
        fzm[] fzmArr = new fzm[]{this.f5199M, this.f5200N, this.f5201O, this.f5202P, this.f5203Q};
        while (i < 5) {
            this.f5222b.mo14601a(fzmArr[i], fzp.UNSELECTED);
            i++;
        }
        if (((String) ilp.mo13673b()).equals("pano_photosphere")) {
            m2506a(this.f5199M);
        } else if (((String) ilp.mo13673b()).equals("pano_horizontal")) {
            m2506a(this.f5200N);
        } else if (((String) ilp.mo13673b()).equals("pano_vertical")) {
            m2506a(this.f5201O);
        } else if (((String) ilp.mo13673b()).equals("pano_wide")) {
            m2506a(this.f5202P);
        } else if (((String) ilp.mo13673b()).equals("pano_fisheye")) {
            m2506a(this.f5203Q);
        } else {
            String str = f5186a;
            String str2 = (String) ilp.mo13673b();
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(str2).length() + 84);
            stringBuilder.append("Attempted to update panorama option to invalid value.");
            stringBuilder.append(str2);
            stringBuilder.append(" is not a valid panorama value.");
            bli.m891b(str, stringBuilder.toString());
        }
    }
}
