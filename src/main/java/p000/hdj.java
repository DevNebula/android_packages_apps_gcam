package p000;

import android.app.Activity;
import android.transition.Fade;
import android.transition.Transition;
import android.widget.PopupWindow;
import java.lang.ref.WeakReference;

/* renamed from: hdj */
final /* synthetic */ class hdj implements Runnable {
    /* renamed from: a */
    private final hde f6411a;
    /* renamed from: b */
    private final WeakReference f6412b;
    /* renamed from: c */
    private final Transition f6413c;

    hdj(hde hde, WeakReference weakReference, Transition transition) {
        this.f6411a = hde;
        this.f6412b = weakReference;
        this.f6413c = transition;
    }

    public final void run() {
        hde hde = this.f6411a;
        WeakReference weakReference = this.f6412b;
        Transition transition = this.f6413c;
        synchronized (hde.f6394n) {
            PopupWindow popupWindow = hde.f6385e;
            Activity activity = (Activity) weakReference.get();
            if (!(hde.f6393m || activity == null || activity.isFinishing() || popupWindow == null)) {
                Transition fade = new Fade();
                transition.setDuration(300);
                transition.setInterpolator(new C0704ks());
                popupWindow.setExitTransition(fade);
            }
        }
    }
}
