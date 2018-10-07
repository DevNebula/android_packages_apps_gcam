package p000;

import android.view.ViewTreeObserver.OnPreDrawListener;

/* compiled from: PG */
/* renamed from: bx */
public final class C0069bx implements OnPreDrawListener {
    /* renamed from: a */
    private final /* synthetic */ C0066bu f1707a;

    public C0069bx(C0066bu c0066bu) {
        this.f1707a = c0066bu;
    }

    public final boolean onPreDraw() {
        C0066bu c0066bu = this.f1707a;
        float rotation = c0066bu.f1620x.getRotation();
        if (c0066bu.f1611i != rotation) {
            c0066bu.f1611i = rotation;
            C0665cu c0665cu = c0066bu.f1610h;
            if (c0665cu != null) {
                float f = -c0066bu.f1611i;
                if (c0665cu.f13267c != f) {
                    c0665cu.f13267c = f;
                    c0665cu.invalidateSelf();
                }
            }
            C0075ci c0075ci = c0066bu.f1614l;
            if (c0075ci != null) {
                float f2 = -c0066bu.f1611i;
                if (f2 != c0075ci.f2204i) {
                    c0075ci.f2204i = f2;
                    c0075ci.invalidateSelf();
                }
            }
        }
        return true;
    }
}
