package p000;

import android.annotation.TargetApi;
import android.view.View;
import android.view.View.OnApplyWindowInsetsListener;
import android.view.WindowInsets;

/* compiled from: PG */
/* renamed from: la */
final class C0346la implements OnApplyWindowInsetsListener {
    C0346la() {
    }

    @TargetApi(21)
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        boolean z;
        boolean z2 = false;
        C0345kz c0345kz = (C0345kz) view;
        if (windowInsets.getSystemWindowInsetTop() > 0) {
            z = true;
        } else {
            z = false;
        }
        c0345kz.f9126i = windowInsets;
        c0345kz.f9127j = z;
        if (!z && c0345kz.getBackground() == null) {
            z2 = true;
        }
        c0345kz.setWillNotDraw(z2);
        c0345kz.requestLayout();
        return windowInsets.consumeSystemWindowInsets();
    }
}
