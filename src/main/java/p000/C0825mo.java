package p000;

import android.view.View;
import android.widget.PopupWindow;

/* compiled from: PG */
/* renamed from: mo */
final class C0825mo extends C0701kh {
    /* renamed from: a */
    private final /* synthetic */ C0716mn f25376a;

    C0825mo(C0716mn c0716mn) {
        this.f25376a = c0716mn;
    }

    /* renamed from: b */
    public final void mo9957b() {
        this.f25376a.f22085a.f22064g.setVisibility(8);
        C0713mg c0713mg = this.f25376a.f22085a;
        PopupWindow popupWindow = c0713mg.f22065h;
        if (popupWindow != null) {
            popupWindow.dismiss();
        } else if (c0713mg.f22064g.getParent() instanceof View) {
            C0315jm.m4602B((View) this.f25376a.f22085a.f22064g.getParent());
        }
        this.f25376a.f22085a.f22064g.removeAllViews();
        this.f25376a.f22085a.f22067j.mo9760a(null);
        this.f25376a.f22085a.f22067j = null;
    }
}
