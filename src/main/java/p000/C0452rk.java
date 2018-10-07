package p000;

import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;

/* compiled from: PG */
/* renamed from: rk */
final class C0452rk implements OnGlobalLayoutListener {
    /* renamed from: a */
    private final /* synthetic */ C0838ri f9622a;

    C0452rk(C0838ri c0838ri) {
        this.f9622a = c0838ri;
    }

    public final void onGlobalLayout() {
        Object obj = null;
        C0838ri c0838ri = this.f9622a;
        View view = c0838ri.f25453d;
        if (C0315jm.m4648w(view) && view.getGlobalVisibleRect(c0838ri.f25452c)) {
            obj = 1;
        }
        if (obj == null) {
            this.f9622a.mo10860c();
            return;
        }
        this.f9622a.mo15285a();
        super.m17118a();
    }
}
