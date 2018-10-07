package p000;

import android.content.res.Resources;
import android.view.View;
import android.view.Window;
import com.google.android.GoogleCamera.R;
import com.google.android.apps.camera.bottombar.BottomBarController;
import com.google.android.apps.camera.bottombar.C0091R;

/* compiled from: PG */
/* renamed from: gkd */
public final class gkd {
    /* renamed from: a */
    public final int f5519a;
    /* renamed from: b */
    public final int f5520b;
    /* renamed from: c */
    public final int f5521c;
    /* renamed from: d */
    public final int f5522d;
    /* renamed from: e */
    public final int f5523e;
    /* renamed from: f */
    public final int f5524f;
    /* renamed from: g */
    public final int f5525g;
    /* renamed from: h */
    public final int f5526h;
    /* renamed from: i */
    public final int f5527i;
    /* renamed from: j */
    public final int f5528j;
    /* renamed from: k */
    public final hif f5529k;
    /* renamed from: l */
    public final hif f5530l;
    /* renamed from: m */
    public final hif f5531m;
    /* renamed from: n */
    public final View f5532n;
    /* renamed from: o */
    public final Window f5533o;

    public gkd(gal gal, BottomBarController bottomBarController, hes hes, Window window) {
        this.f5533o = window;
        this.f5532n = (View) hes.f6486j.mo7919a((int) R.id.activity_root_view);
        Resources resources = this.f5532n.getResources();
        this.f5519a = resources.getColor(R.color.main_layout_selfie_flash_color, null);
        this.f5520b = resources.getColor(R.color.main_layout_background_color, null);
        this.f5521c = resources.getColor(R.color.bottom_bar_selfie_flash_color, null);
        this.f5522d = resources.getColor(R.color.optionsbar_background_closed, null);
        this.f5523e = resources.getColor(C0091R.color.bottom_bar_selfie_flash_color, null);
        this.f5524f = resources.getColor(C0091R.color.bottom_bar_background_color, null);
        this.f5525g = resources.getColor(C0091R.color.front_back_switch_button_color_dark, null);
        this.f5526h = resources.getColor(C0091R.color.front_back_switch_button_color, null);
        this.f5527i = window.getNavigationBarColor();
        this.f5528j = resources.getColor(R.color.navigation_bar_selfie_flash_color, null);
        this.f5530l = bottomBarController.getBackgroundColorProperty();
        this.f5531m = bottomBarController.getCameraSwitchColorProperty();
        this.f5529k = new gbq(gal.f5222b);
    }

    /* renamed from: a */
    public final void mo7162a() {
        this.f5530l.setColor(this.f5524f);
        this.f5532n.setBackgroundColor(this.f5520b);
        this.f5529k.setColor(this.f5522d);
        this.f5531m.setColor(this.f5526h);
        this.f5533o.setNavigationBarColor(this.f5527i);
    }
}
