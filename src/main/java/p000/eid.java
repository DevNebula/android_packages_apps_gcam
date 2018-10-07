package p000;

import android.view.Window;
import android.view.WindowManager.LayoutParams;
import com.google.android.apps.camera.bottombar.BottomBarController;

/* compiled from: PG */
/* renamed from: eid */
public class eid extends eic {
    /* renamed from: a */
    private how f26328a;
    /* renamed from: e */
    public BottomBarController f26329e;
    /* renamed from: f */
    public hcd f26330f;
    /* renamed from: g */
    public gwp f26331g;
    /* renamed from: h */
    public gal f26332h;

    /* renamed from: a */
    public void mo7343a() {
        this.f26328a.mo8003c();
        this.f26328a.mo8010i();
        this.f26329e.disablePhotoVideoSwitch();
    }

    /* renamed from: b */
    public void mo7344b() {
        this.f26328a.mo7996a();
        this.f26328a.mo8010i();
        this.f26329e.enablePhotoVideoSwitch();
    }

    /* renamed from: a */
    public void mo15524a(BottomBarController bottomBarController, hcd hcd, how how, Window window, gwp gwp, bcn bcn, gal gal) {
        this.f26329e = bottomBarController;
        this.f26330f = hcd;
        this.f26328a = how;
        this.f26331g = gwp;
        this.f26332h = gal;
        bcn.mo1899a();
        bottomBarController.switchToVideoIntent();
        hcd.mo7670a(hbf.VIDEO_IDLE);
        hcd.f6321a.setVisibility(0);
        LayoutParams attributes = window.getAttributes();
        attributes.rotationAnimation = 3;
        window.setAttributes(attributes);
    }
}
