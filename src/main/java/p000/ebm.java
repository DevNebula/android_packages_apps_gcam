package p000;

import android.widget.FrameLayout;
import com.google.android.apps.camera.bottombar.BottomBarController;

/* compiled from: PG */
/* renamed from: ebm */
public final class ebm {
    /* renamed from: a */
    private final kwk f3714a;
    /* renamed from: b */
    private final BottomBarController f3715b;
    /* renamed from: c */
    private FrameLayout f3716c;

    public ebm(kwk kwk, BottomBarController bottomBarController) {
        this.f3714a = kwk;
        this.f3715b = bottomBarController;
    }

    /* renamed from: a */
    public final void mo6194a(int i) {
        if (this.f3716c == null) {
            this.f3716c = ((hes) this.f3714a.mo10566a()).f6477a;
        }
        this.f3716c.setImportantForAccessibility(i);
        this.f3715b.setImportantForAccessibility(i);
    }
}
