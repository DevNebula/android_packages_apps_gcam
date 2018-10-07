package p000;

import android.widget.ImageButton;
import com.google.android.GoogleCamera.R;
import com.google.android.apps.camera.bottombar.BottomBarController;
import com.google.android.apps.camera.p005ui.gridlines.GridLinesUi;
import com.google.android.apps.camera.p005ui.toyboxmenu.ToyboxMenuButton;
import com.google.android.apps.camera.p005ui.wirers.PreviewOverlay;

/* compiled from: PG */
/* renamed from: edo */
public class edo extends edn {
    /* renamed from: a */
    public static final String f26238a = bli.m887a("DualCamChart");
    /* renamed from: b */
    public hdm f26239b;
    /* renamed from: c */
    public ToyboxMenuButton f26240c;
    /* renamed from: d */
    public ImageButton f26241d;
    /* renamed from: e */
    public PreviewOverlay f26242e;
    /* renamed from: f */
    public GridLinesUi f26243f;
    /* renamed from: g */
    public fbr f26244g;
    /* renamed from: h */
    public BottomBarController f26245h;
    /* renamed from: i */
    public hcd f26246i;
    /* renamed from: j */
    public gju f26247j;
    /* renamed from: k */
    public how f26248k;
    /* renamed from: l */
    public kbg f26249l;
    /* renamed from: m */
    public bsn f26250m;
    /* renamed from: n */
    public gwp f26251n;
    /* renamed from: o */
    private final ilp f26252o;

    public edo(ilp ilp) {
        this.f26252o = ilp;
    }

    /* renamed from: a */
    public void mo15523a(kwk kwk, hdm hdm, fbr fbr, BottomBarController bottomBarController, hcd hcd, gju gju, how how, kbg kbg, bsn bsn, gwp gwp) {
        hkg hkg = ((hes) kwk.mo10566a()).f6486j;
        this.f26239b = hdm;
        this.f26242e = (PreviewOverlay) hkg.mo7919a((int) R.id.preview_overlay);
        this.f26243f = (GridLinesUi) hkg.mo7919a((int) R.id.grid_lines);
        this.f26244g = fbr;
        this.f26245h = bottomBarController;
        this.f26246i = hcd;
        this.f26247j = gju;
        this.f26248k = how;
        this.f26241d = (ImageButton) hkg.mo7919a((int) R.id.closeButton);
        this.f26240c = (ToyboxMenuButton) hkg.mo7919a((int) R.id.toybox_menu_button);
        this.f26249l = kbg;
        this.f26250m = bsn;
        this.f26251n = gwp;
    }
}
