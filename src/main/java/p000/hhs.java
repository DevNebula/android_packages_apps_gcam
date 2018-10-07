package p000;

import android.content.Context;
import android.os.Handler;
import com.google.android.GoogleCamera.R;
import com.google.android.apps.camera.bottombar.BottomBarController;
import com.google.android.apps.camera.p005ui.wirers.PreviewOverlay;

/* compiled from: PG */
/* renamed from: hhs */
public final class hhs implements hhj {
    /* renamed from: a */
    public static final String f20133a = bli.m887a("VgmUiWirer");
    /* renamed from: b */
    private final kwk f20134b;
    /* renamed from: c */
    private final Context f20135c;
    /* renamed from: d */
    private final hnh f20136d;
    /* renamed from: e */
    private final hnf f20137e;
    /* renamed from: f */
    private final bpt f20138f;
    /* renamed from: g */
    private final how f20139g;
    /* renamed from: h */
    private final gyz f20140h;
    /* renamed from: i */
    private final ilp f20141i;
    /* renamed from: j */
    private final BottomBarController f20142j;

    public hhs(kwk kwk, Context context, hnh hnh, hnf hnf, bpt bpt, how how, gyz gyz, ilp ilp, BottomBarController bottomBarController) {
        this.f20134b = kwk;
        this.f20135c = context;
        this.f20136d = hnh;
        this.f20137e = hnf;
        this.f20138f = bpt;
        this.f20139g = how;
        this.f20140h = gyz;
        this.f20141i = ilp;
        this.f20142j = bottomBarController;
    }

    /* renamed from: a */
    public final void mo7877a() {
        PreviewOverlay previewOverlay = (PreviewOverlay) ((hes) this.f20134b.mo10566a()).f6486j.mo7919a((int) R.id.preview_overlay);
        hnq hnq = new hnq(this.f20139g);
        hnp hnp = this.f20137e;
        Context context = this.f20135c;
        previewOverlay.f2634c = new hhy(new hnu(new hnx(context, new Handler(context.getMainLooper())), new hnm(this.f20140h.f6196d), new hnt(this.f20138f, this.f20140h.f6196d), hnp, new hht(this.f20136d), hnq, new hnk(this.f20139g, this.f20142j), new hnl(this.f20140h.f6196d), this.f20141i, previewOverlay.getRootView(), this.f20135c));
    }
}
