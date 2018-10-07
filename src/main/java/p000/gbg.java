package p000;

import android.view.View;
import android.view.View.OnLayoutChangeListener;

/* renamed from: gbg */
final /* synthetic */ class gbg implements Runnable {
    /* renamed from: a */
    private final gbd f5253a;
    /* renamed from: b */
    private final View f5254b;
    /* renamed from: c */
    private final OnLayoutChangeListener f5255c;

    gbg(gbd gbd, View view, OnLayoutChangeListener onLayoutChangeListener) {
        this.f5253a = gbd;
        this.f5254b = view;
        this.f5255c = onLayoutChangeListener;
    }

    public final void run() {
        gbd gbd = this.f5253a;
        View view = this.f5254b;
        OnLayoutChangeListener onLayoutChangeListener = this.f5255c;
        if (gbd.f18982b != null) {
            gbd.f18982b.run();
            gbd.f18982b = null;
        }
        view.removeOnLayoutChangeListener(onLayoutChangeListener);
    }
}
