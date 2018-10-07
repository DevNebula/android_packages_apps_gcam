package p000;

import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;

/* renamed from: hdc */
final /* synthetic */ class hdc implements iqo {
    /* renamed from: a */
    private final hda f19930a;
    /* renamed from: b */
    private final ViewTreeObserver f19931b;

    hdc(hda hda, ViewTreeObserver viewTreeObserver) {
        this.f19930a = hda;
        this.f19931b = viewTreeObserver;
    }

    public final void close() {
        OnGlobalLayoutListener onGlobalLayoutListener = this.f19930a;
        ViewTreeObserver viewTreeObserver = this.f19931b;
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
        }
    }
}
