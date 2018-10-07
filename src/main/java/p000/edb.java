package p000;

import android.view.Window;
import com.google.android.apps.camera.bottombar.BottomBarController;

/* compiled from: PG */
/* renamed from: edb */
public class edb extends gqj {
    /* renamed from: a */
    public static final String f24118a = bli.m887a("CameraUiStatechart");
    /* renamed from: b */
    public Window f24119b;
    /* renamed from: c */
    public hny f24120c;
    /* renamed from: d */
    public BottomBarController f24121d;
    /* renamed from: e */
    public int f24122e;
    /* renamed from: f */
    public ctx f24123f;
    /* renamed from: g */
    public hcd f24124g;
    /* renamed from: h */
    public bxj f24125h;
    /* renamed from: i */
    private bcn f24126i;

    public edb() {
        super(null);
    }

    /* renamed from: a */
    public void mo7343a() {
        super.mo7343a();
        this.f24126i.mo1899a();
    }

    /* renamed from: a */
    public void mo14871a(Window window, bcn bcn, hny hny, BottomBarController bottomBarController, ctx ctx, hcd hcd, bxj bxj) {
        this.f24119b = window;
        this.f24126i = bcn;
        this.f24120c = hny;
        this.f24121d = bottomBarController;
        this.f24122e = window.getAttributes().rotationAnimation;
        this.f24123f = ctx;
        this.f24124g = hcd;
        this.f24125h = bxj;
    }
}
