package p000;

import android.os.Bundle;
import android.view.View;
import android.view.View.AccessibilityDelegate;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.apps.camera.legacy.app.filmstrip.widget.FilmstripView;

/* compiled from: PG */
/* renamed from: cun */
public final class cun extends AccessibilityDelegate {
    /* renamed from: a */
    private final /* synthetic */ csp f2963a;
    /* renamed from: b */
    private final /* synthetic */ FilmstripView f2964b;

    public cun(FilmstripView filmstripView, csp csp) {
        this.f2964b = filmstripView;
        this.f2963a = csp;
    }

    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(FilmstripView.class.getName());
        accessibilityNodeInfo.setScrollable(true);
        accessibilityNodeInfo.addAction(4096);
        accessibilityNodeInfo.addAction(8192);
    }

    public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        if (!this.f2964b.f2536k.mo12917h()) {
            switch (i) {
                case 64:
                    this.f2964b.f2538m[2].f2997b.performAccessibilityAction(i, bundle);
                    return true;
                case 4096:
                    this.f2964b.f2536k.mo12914c(3);
                    return true;
                case 8192:
                    if (this.f2964b.f2536k.mo12914c(1)) {
                        return true;
                    }
                    this.f2963a.mo5746g();
                    return true;
            }
        }
        return super.performAccessibilityAction(view, i, bundle);
    }
}
