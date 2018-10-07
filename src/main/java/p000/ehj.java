package p000;

import android.view.Window;
import android.view.WindowManager.LayoutParams;
import com.google.android.apps.camera.bottombar.BottomBarController;

/* compiled from: PG */
/* renamed from: ehj */
public class ehj extends gqj {
    /* renamed from: a */
    private final ilp f24166a;
    /* renamed from: b */
    private how f24167b;
    /* renamed from: d */
    public BottomBarController f24168d;
    /* renamed from: e */
    public hcd f24169e;
    /* renamed from: f */
    public gwp f24170f;
    /* renamed from: g */
    public gal f24171g;

    public ehj(ilp ilp) {
        super(null);
        this.f24166a = ilp;
    }

    /* renamed from: a */
    public void mo7343a() {
        this.f24167b.mo8003c();
        this.f24167b.mo8010i();
        this.f24168d.disablePhotoVideoSwitch();
    }

    /* renamed from: b */
    public void mo7344b() {
        this.f24167b.mo7996a();
        this.f24167b.mo8010i();
        this.f24168d.enablePhotoVideoSwitch();
    }

    /* renamed from: a */
    public void mo14877a(BottomBarController bottomBarController, hcd hcd, how how, Window window, gwp gwp, bcn bcn, gal gal) {
        this.f24168d = bottomBarController;
        this.f24169e = hcd;
        this.f24170f = gwp;
        this.f24168d.switchToPhotoIntent();
        hcd hcd2 = this.f24169e;
        hcd2.mo7670a(hbf.PHOTO_IDLE);
        hcd2.f6321a.setVisibility(0);
        this.f24167b = how;
        this.f24171g = gal;
        bcn.mo1899a();
        this.f24166a.mo8826a(hhx.IMAGE_INTENT);
        LayoutParams attributes = window.getAttributes();
        attributes.rotationAnimation = 3;
        window.setAttributes(attributes);
    }
}
