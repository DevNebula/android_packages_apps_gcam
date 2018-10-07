package p000;

import android.view.View;
import android.view.View.OnLayoutChangeListener;

/* renamed from: gbe */
final /* synthetic */ class gbe implements Runnable {
    /* renamed from: a */
    private final View f5249a;
    /* renamed from: b */
    private final OnLayoutChangeListener f5250b;

    gbe(View view, OnLayoutChangeListener onLayoutChangeListener) {
        this.f5249a = view;
        this.f5250b = onLayoutChangeListener;
    }

    public final void run() {
        this.f5249a.addOnLayoutChangeListener(this.f5250b);
    }
}
