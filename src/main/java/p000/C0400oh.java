package p000;

import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;

/* compiled from: PG */
/* renamed from: oh */
final class C0400oh implements OnGlobalLayoutListener {
    /* renamed from: a */
    private final /* synthetic */ C0829og f9503a;

    C0400oh(C0829og c0829og) {
        this.f9503a = c0829og;
    }

    public final void onGlobalLayout() {
        if (this.f9503a.mo10862e() && this.f9503a.f25386b.size() > 0 && !((C0403ol) this.f9503a.f25386b.get(0)).f9509a.f22325q) {
            View view = this.f9503a.f25388d;
            if (view == null || !view.isShown()) {
                this.f9503a.mo10860c();
                return;
            }
            for (C0403ol c0403ol : this.f9503a.f25386b) {
                c0403ol.f9509a.mo10863f();
            }
        }
    }
}
