package p000;

import android.view.View;
import android.view.View.OnLayoutChangeListener;

/* renamed from: gbf */
final /* synthetic */ class gbf implements Runnable {
    /* renamed from: a */
    private final View f5251a;
    /* renamed from: b */
    private final OnLayoutChangeListener f5252b;

    gbf(View view, OnLayoutChangeListener onLayoutChangeListener) {
        this.f5251a = view;
        this.f5252b = onLayoutChangeListener;
    }

    public final void run() {
        this.f5251a.removeOnLayoutChangeListener(this.f5252b);
    }
}
