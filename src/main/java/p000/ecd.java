package p000;

import com.google.android.GoogleCamera.R;
import com.google.android.apps.camera.bottombar.BottomBarController;
import com.google.android.apps.camera.p005ui.modeswitch.ViewfinderCover;

/* compiled from: PG */
/* renamed from: ecd */
public class ecd extends gqj {
    /* renamed from: a */
    public static final String f24105a = bli.m887a("FacingChart");
    /* renamed from: b */
    public final ebw f24106b;
    /* renamed from: c */
    public final ffc f24107c;
    /* renamed from: d */
    public final ffc f24108d;
    /* renamed from: e */
    public final gkb f24109e;
    /* renamed from: f */
    public final gjk f24110f;
    /* renamed from: g */
    public ViewfinderCover f24111g;
    /* renamed from: h */
    public gal f24112h;
    /* renamed from: i */
    public BottomBarController f24113i;
    /* renamed from: j */
    public how f24114j;
    /* renamed from: k */
    public ayb f24115k;

    public ecd(ebw ebw, fbn fbn, gkb gkb, gjk gjk) {
        super(null);
        this.f24106b = ebw;
        this.f24109e = gkb;
        this.f24110f = gjk;
        iur b = fbn.mo9091b(iut.BACK);
        if (b != null) {
            this.f24107c = fbn.mo13218b(b);
        } else {
            this.f24107c = null;
        }
        b = fbn.mo9091b(iut.FRONT);
        if (b != null) {
            this.f24108d = fbn.mo13218b(b);
        } else {
            this.f24108d = null;
        }
    }

    /* renamed from: a */
    public void mo14870a(kwk kwk, BottomBarController bottomBarController, how how, gal gal, ayb ayb) {
        this.f24111g = (ViewfinderCover) ((hes) kwk.mo10566a()).f6486j.mo7919a((int) R.id.viewfinder_cover);
        this.f24113i = bottomBarController;
        this.f24114j = how;
        this.f24112h = gal;
        this.f24115k = ayb;
    }

    /* renamed from: a */
    public final void mo14869a(iut iut) {
        if (iut == iut.BACK) {
            mo13447p();
        } else {
            mo13445n();
        }
    }
}
