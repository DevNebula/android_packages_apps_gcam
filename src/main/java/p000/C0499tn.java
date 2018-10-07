package p000;

import android.view.View;

/* compiled from: PG */
/* renamed from: tn */
final class C0499tn implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ C0760tg f9791a;

    C0499tn(C0760tg c0760tg) {
        this.f9791a = c0760tg;
    }

    public final void run() {
        View view = this.f9791a.f22313e;
        if (view != null && C0315jm.m4648w(view) && this.f9791a.f22313e.getCount() > this.f9791a.f22313e.getChildCount()) {
            int childCount = this.f9791a.f22313e.getChildCount();
            C0760tg c0760tg = this.f9791a;
            if (childCount <= c0760tg.f22319k) {
                c0760tg.f22326r.setInputMethodMode(2);
                this.f9791a.m17118a();
            }
        }
    }
}
