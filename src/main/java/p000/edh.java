package p000;

import android.view.WindowManager.LayoutParams;

/* compiled from: PG */
/* renamed from: edh */
class edh extends gqj {
    /* renamed from: a */
    private final /* synthetic */ edf f24145a;

    edh(edf edf) {
        this.f24145a = edf;
        super(null);
    }

    /* renamed from: a */
    public final void mo7343a() {
        bli.m888a(edf.f24130a, "enter Panorama state");
        edf edf = this.f24145a;
        if (edf.f24140k) {
            edf.f24143n.mo8826a(hhx.IMAX);
            this.f24145a.f24136g.mo7669a();
            this.f24145a.f24135f.switchToImax();
        }
    }

    /* renamed from: b */
    public final void mo7344b() {
        bli.m888a(edf.f24130a, "exit Panorama state");
        this.f24145a.f24132c.f2635d = true;
        bli.m896d(edf.f24130a, "Set rotation animation to seamless");
        edf edf = this.f24145a;
        int i = edf.f24137h;
        LayoutParams attributes = edf.f24134e.getAttributes();
        attributes.rotationAnimation = i;
        edf.f24134e.setAttributes(attributes);
    }

    /* renamed from: s */
    public void mo13450s() {
    }
}
