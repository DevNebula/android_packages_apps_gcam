package p000;

import android.animation.Animator;

/* compiled from: PG */
/* renamed from: gjx */
class gjx extends gqj {
    /* renamed from: a */
    public final /* synthetic */ gju f24376a;
    /* renamed from: b */
    private Animator f24377b;

    gjx(gju gju) {
        this.f24376a = gju;
        super(null);
    }

    /* renamed from: a */
    public final void mo7343a() {
        gju gju = this.f24376a;
        gju.f24367f.setSelfieFlashState(true);
        gju.f24372k.mo8826a(Boolean.valueOf(true));
        gju.f24368g.mo7888b();
        gju.f24370i.mo7458a(1796);
        gkd gkd = this.f24376a.f24369h;
        hic a = hic.m3218a(1000, new C0704ks());
        a.mo7880a(gkd.f5530l, "color", gkd.f5524f, gkd.f5523e);
        a.mo7880a(gkd.f5532n, "backgroundColor", gkd.f5520b, gkd.f5519a);
        a.mo7880a(gkd.f5529k, "color", gkd.f5522d, gkd.f5521c);
        a.f6584a = 500;
        a.mo7880a(gkd.f5531m, "color", gkd.f5526h, gkd.f5525g);
        a.mo7880a(gkd.f5533o, "navigationBarColor", gkd.f5527i, gkd.f5528j);
        this.f24377b = a.f6585b.clone();
        this.f24377b.addListener(new gjy(this));
        this.f24377b.start();
    }

    /* renamed from: b */
    public final void mo7344b() {
        if (this.f24377b.isRunning()) {
            this.f24377b.removeAllListeners();
            this.f24377b.cancel();
        }
        gju gju = this.f24376a;
        gju.f24367f.setSelfieFlashState(false);
        gju.f24368g.mo7887a();
        gju.f24369h.mo7162a();
        gju.f24372k.mo8826a(Boolean.valueOf(false));
        gju.f24370i.mo7458a(1797);
    }

    /* renamed from: z_ */
    public void mo13458z_() {
    }

    /* renamed from: s_ */
    public void mo13451s_() {
    }

    /* renamed from: Q */
    public void mo13411Q() {
    }
}
