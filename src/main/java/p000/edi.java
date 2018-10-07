package p000;

import android.view.WindowManager.LayoutParams;

/* compiled from: PG */
/* renamed from: edi */
class edi extends gqj {
    /* renamed from: a */
    private final /* synthetic */ edf f24146a;

    edi(edf edf) {
        this.f24146a = edf;
        super(null);
    }

    /* renamed from: a */
    public final void mo7343a() {
        bli.m888a(edf.f24130a, "enter PhotoSphere state");
        this.f24146a.f24135f.switchToPhotoSphere();
        hcd hcd = this.f24146a.f24136g;
        hcd.mo7670a(hbf.PHOTO_IDLE);
        hcd.f6321a.setVisibility(0);
        this.f24146a.f24133d.setVisibility(4);
        edf edf = this.f24146a;
        if (edf.f24141l) {
            edf.f24143n.mo8826a(hhx.PANORAMA);
        } else {
            edf.f24143n.mo8826a(hhx.PHOTO_SPHERE);
        }
        this.f24146a.f24132c.f2635d = false;
        bli.m896d(edf.f24130a, "Set rotation to crossfade");
        edf = this.f24146a;
        LayoutParams attributes = edf.f24134e.getAttributes();
        attributes.rotationAnimation = 1;
        edf.f24134e.setAttributes(attributes);
    }

    /* renamed from: b */
    public final void mo7344b() {
        bli.m888a(edf.f24130a, "exit PhotoSphere state");
        this.f24146a.f24132c.f2635d = true;
        bli.m896d(edf.f24130a, "Set rotation animation to seamless");
        edf edf = this.f24146a;
        int i = edf.f24137h;
        LayoutParams attributes = edf.f24134e.getAttributes();
        attributes.rotationAnimation = i;
        edf.f24134e.setAttributes(attributes);
    }

    /* renamed from: s */
    public void mo13450s() {
    }
}
