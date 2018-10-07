package p000;

import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.ViewTreeObserver;

/* compiled from: PG */
/* renamed from: pm */
final class C0416pm implements OnAttachStateChangeListener {
    /* renamed from: a */
    private final /* synthetic */ C0834pk f9534a;

    C0416pm(C0834pk c0834pk) {
        this.f9534a = c0834pk;
    }

    public final void onViewAttachedToWindow(View view) {
    }

    public final void onViewDetachedFromWindow(View view) {
        ViewTreeObserver viewTreeObserver = this.f9534a.f25416d;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f9534a.f25416d = view.getViewTreeObserver();
            }
            C0834pk c0834pk = this.f9534a;
            c0834pk.f25416d.removeGlobalOnLayoutListener(c0834pk.f25414b);
        }
        view.removeOnAttachStateChangeListener(this);
    }
}
