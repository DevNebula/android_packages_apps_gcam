package p000;

import com.google.android.apps.camera.bottombar.BottomBarController;
import com.google.android.apps.camera.uiutils.ReplaceableView;

/* compiled from: PG */
/* renamed from: gjc */
public final class gjc implements gkb {
    /* renamed from: a */
    private static final String f19220a = bli.m887a("SelfieController");
    /* renamed from: b */
    private final ikd f19221b;
    /* renamed from: c */
    private final ilp f19222c;
    /* renamed from: d */
    private gjr f19223d;
    /* renamed from: e */
    private gju f19224e;
    /* renamed from: f */
    private ilp f19225f;
    /* renamed from: g */
    private ilp f19226g;
    /* renamed from: h */
    private boolean f19227h;
    /* renamed from: i */
    private his f19228i;

    public gjc(gju gju, ikd ikd, ilp ilp) {
        this.f19224e = gju;
        this.f19221b = ikd;
        this.f19222c = ilp;
    }

    /* renamed from: a */
    public final kpk mo7158a() {
        bli.m894c(f19220a, "turning selfie flash off");
        ((his) jqk.m13354c(this.f19228i)).mo7887a();
        gjr gjr = (gjr) jqk.m13354c(this.f19223d);
        gjr.setVisibility(8);
        return gjr.mo7148a();
    }

    /* renamed from: b */
    public final kpk mo7161b() {
        bli.m894c(f19220a, "turning selfie flash on");
        ((his) jqk.m13354c(this.f19228i)).mo7888b();
        gjr gjr = (gjr) jqk.m13354c(this.f19223d);
        gjr.setVisibility(0);
        return gjr.mo7148a();
    }

    /* renamed from: a */
    public final void mo7159a(ffc ffc) {
        boolean z;
        if (ffc.mo9064c() == iut.FRONT) {
            z = true;
        } else {
            z = false;
        }
        this.f19227h = z;
        mo13359c();
    }

    /* renamed from: c */
    final void mo13359c() {
        Object obj = null;
        if (this.f19227h) {
            Object obj2;
            Object obj3;
            hhx hhx = (hhx) this.f19222c.mo13673b();
            int obj22;
            if (hhx == hhx.VIDEO) {
                obj22 = 1;
            } else if (hhx != hhx.VIDEO_INTENT) {
                obj22 = null;
            } else {
                obj22 = 1;
            }
            int obj32;
            if (hhx == hhx.PHOTO) {
                obj32 = 1;
            } else if (hhx == hhx.IMAGE_INTENT) {
                obj32 = 1;
            } else if (hhx != hhx.PORTRAIT) {
                obj32 = null;
            } else {
                obj32 = 1;
            }
            if (obj22 != null && ((String) this.f19225f.mo13673b()).equals("torch")) {
                int obj4 = 1;
            } else if (obj32 != null && ((String) this.f19226g.mo13673b()).equals("on")) {
                obj4 = 1;
            }
        }
        if (obj4 != null) {
            this.f19224e.mo13412R();
        } else {
            this.f19224e.mo13411Q();
        }
    }

    /* renamed from: a */
    public final void mo7160a(iji iji, ReplaceableView replaceableView, BottomBarController bottomBarController, gkd gkd, his his, gui gui, ilp ilp, ilp ilp2, ilp ilp3, kbg kbg) {
        this.f19225f = ilp2;
        this.f19226g = ilp3;
        this.f19228i = his;
        this.f19223d = new gjr(replaceableView.getContext(), new gjt());
        this.f19223d.setBackgroundColor(-5937);
        replaceableView.mo2753a(this.f19223d);
        this.f19224e.mo14908a(bottomBarController, gkd, his, gui, ilp, kbg);
        this.f19224e.mo7343a();
        iji.mo8557a(this.f19225f.mo13672a(new gjd(this), this.f19221b));
        iji.mo8557a(ilp3.mo13672a(new gje(this), this.f19221b));
        iji.mo8557a(this.f19222c.mo13672a(new gjf(this), this.f19221b));
    }
}
