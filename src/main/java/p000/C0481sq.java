package p000;

import android.view.ViewParent;

/* compiled from: PG */
/* renamed from: sq */
final class C0481sq implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ C0480sp f9736a;

    C0481sq(C0480sp c0480sp) {
        this.f9736a = c0480sp;
    }

    public final void run() {
        ViewParent parent = this.f9736a.f9727a.getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
    }
}
