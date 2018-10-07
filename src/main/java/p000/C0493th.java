package p000;

import android.view.View;

/* compiled from: PG */
/* renamed from: th */
final class C0493th implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ C0760tg f9785a;

    C0493th(C0760tg c0760tg) {
        this.f9785a = c0760tg;
    }

    public final void run() {
        View view = this.f9785a.f22320l;
        if (view != null && view.getWindowToken() != null) {
            this.f9785a.m17118a();
        }
    }
}
