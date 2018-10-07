package p000;

import android.view.Window;
import com.google.android.GoogleCamera.R;
import com.google.android.apps.camera.bottombar.BottomBarController;
import com.google.android.apps.camera.p005ui.gridlines.GridLinesUi;
import com.google.android.apps.camera.p005ui.wirers.PreviewOverlay;

/* compiled from: PG */
/* renamed from: edf */
public class edf extends gqj {
    /* renamed from: a */
    public static final String f24130a = bli.m887a("CaptureStatechart");
    /* renamed from: b */
    public final eih f24131b;
    /* renamed from: c */
    public PreviewOverlay f24132c;
    /* renamed from: d */
    public GridLinesUi f24133d;
    /* renamed from: e */
    public Window f24134e;
    /* renamed from: f */
    public BottomBarController f24135f;
    /* renamed from: g */
    public hcd f24136g;
    /* renamed from: h */
    public int f24137h;
    /* renamed from: i */
    public how f24138i;
    /* renamed from: j */
    public gwp f24139j;
    /* renamed from: k */
    public final boolean f24140k;
    /* renamed from: l */
    public boolean f24141l;
    /* renamed from: m */
    public bxj f24142m;
    /* renamed from: n */
    private final ilp f24143n;

    public edf(eih eih, ilp ilp, boolean z) {
        super(null);
        this.f24131b = eih;
        this.f24143n = ilp;
        this.f24140k = z;
    }

    /* renamed from: a */
    public void mo14872a(kwk kwk, Window window, BottomBarController bottomBarController, hcd hcd, how how, gwp gwp, fbr fbr, bxj bxj) {
        hkg hkg = ((hes) kwk.mo10566a()).f6486j;
        this.f24132c = (PreviewOverlay) hkg.mo7919a((int) R.id.preview_overlay);
        this.f24133d = (GridLinesUi) hkg.mo7919a((int) R.id.grid_lines);
        this.f24134e = window;
        this.f24135f = bottomBarController;
        this.f24136g = hcd;
        this.f24137h = window.getAttributes().rotationAnimation;
        this.f24138i = how;
        this.f24139j = gwp;
        this.f24142m = bxj;
    }
}
