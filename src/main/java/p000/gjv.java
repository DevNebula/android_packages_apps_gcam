package p000;

import android.animation.Animator;

/* compiled from: PG */
/* renamed from: gjv */
class gjv extends gqj {
    /* renamed from: a */
    public final /* synthetic */ gju f24374a;
    /* renamed from: b */
    private Animator f24375b;

    gjv(gju gju) {
        this.f24374a = gju;
        super(null);
    }

    /* renamed from: a */
    public final void mo7343a() {
        gkd gkd = this.f24374a.f24369h;
        hic a = hic.m3218a(333, new C0704ks());
        a.mo7880a(gkd.f5530l, "color", gkd.f5523e, gkd.f5524f);
        a.mo7880a(gkd.f5532n, "backgroundColor", gkd.f5519a, gkd.f5520b);
        a.mo7880a(gkd.f5529k, "color", gkd.f5521c, gkd.f5522d);
        a.mo7880a(gkd.f5531m, "color", gkd.f5525g, gkd.f5526h);
        a.mo7880a(gkd.f5533o, "navigationBarColor", gkd.f5528j, gkd.f5527i);
        this.f24375b = a.f6585b.clone();
        this.f24375b.addListener(new gjw(this));
        this.f24375b.start();
    }

    /* renamed from: b */
    public final void mo7344b() {
        if (this.f24375b.isRunning()) {
            this.f24375b.removeAllListeners();
            this.f24375b.cancel();
        }
    }

    /* renamed from: z_ */
    public void mo13458z_() {
    }

    /* renamed from: R */
    public void mo13412R() {
    }
}
