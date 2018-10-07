package p000;

import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.ViewTreeObserver;

/* compiled from: PG */
/* renamed from: oi */
final class C0401oi implements OnAttachStateChangeListener {
    /* renamed from: a */
    private final /* synthetic */ C0829og f9504a;

    C0401oi(C0829og c0829og) {
        this.f9504a = c0829og;
    }

    public final void onViewAttachedToWindow(View view) {
    }

    public final void onViewDetachedFromWindow(View view) {
        ViewTreeObserver viewTreeObserver = this.f9504a.f25389e;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f9504a.f25389e = view.getViewTreeObserver();
            }
            C0829og c0829og = this.f9504a;
            c0829og.f25389e.removeGlobalOnLayoutListener(c0829og.f25387c);
        }
        view.removeOnAttachStateChangeListener(this);
    }
}
