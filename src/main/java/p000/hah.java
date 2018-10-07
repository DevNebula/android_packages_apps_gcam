package p000;

import android.content.Context;
import com.google.android.apps.camera.bottombar.BottomBarController;

/* compiled from: PG */
/* renamed from: hah */
public final class hah implements kwk {
    /* renamed from: a */
    private final kwk f19858a;
    /* renamed from: b */
    private final kwk f19859b;
    /* renamed from: c */
    private final kwk f19860c;
    /* renamed from: d */
    private final kwk f19861d;
    /* renamed from: e */
    private final kwk f19862e;

    public hah(kwk kwk, kwk kwk2, kwk kwk3, kwk kwk4, kwk kwk5) {
        this.f19858a = kwk;
        this.f19859b = kwk2;
        this.f19860c = kwk3;
        this.f19861d = kwk4;
        this.f19862e = kwk5;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo10566a() {
        kwk kwk = this.f19858a;
        kwk kwk2 = this.f19859b;
        kwk kwk3 = this.f19860c;
        kwk kwk4 = this.f19861d;
        Context context = (Context) kwk.mo10566a();
        BottomBarController bottomBarController = (BottomBarController) kwk2.mo10566a();
        ena ena = (ena) kwk3.mo10566a();
        ikd ikd = (ikd) kwk4.mo10566a();
        eol gwp = new gwp(context, bottomBarController, (irs) this.f19862e.mo10566a());
        eio.m1804a(ikd, ena, gwp);
        return (gwp) ktm.m14219a(gwp, "Cannot return null from a non-@Nullable @Provides method");
    }
}
