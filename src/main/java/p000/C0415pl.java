package p000;

import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;

/* compiled from: PG */
/* renamed from: pl */
final class C0415pl implements OnGlobalLayoutListener {
    /* renamed from: a */
    private final /* synthetic */ C0834pk f9533a;

    C0415pl(C0834pk c0834pk) {
        this.f9533a = c0834pk;
    }

    public final void onGlobalLayout() {
        if (this.f9533a.mo10862e()) {
            C0834pk c0834pk = this.f9533a;
            if (!c0834pk.f25413a.f22325q) {
                View view = c0834pk.f25415c;
                if (view == null || !view.isShown()) {
                    this.f9533a.mo10860c();
                } else {
                    this.f9533a.f25413a.mo10863f();
                }
            }
        }
    }
}
