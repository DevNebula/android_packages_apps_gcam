package p000;

import android.app.Activity;
import android.view.View;
import android.widget.PopupWindow;
import java.lang.ref.WeakReference;

/* renamed from: hdi */
final /* synthetic */ class hdi implements Runnable {
    /* renamed from: a */
    private final hde f6409a;
    /* renamed from: b */
    private final WeakReference f6410b;

    hdi(hde hde, WeakReference weakReference) {
        this.f6409a = hde;
        this.f6410b = weakReference;
    }

    public final void run() {
        hde hde = this.f6409a;
        WeakReference weakReference = this.f6410b;
        synchronized (hde.f6394n) {
            Activity activity = (Activity) weakReference.get();
            if (!(hde.f6393m || activity == null || activity.isFinishing())) {
                PopupWindow popupWindow = hde.f6385e;
                if (popupWindow != null) {
                    View view = hde.f6389i;
                    if (view != null) {
                        popupWindow.showAtLocation(view, 0, 0, 0);
                    }
                }
            }
        }
    }
}
