package p000;

import android.view.View;

/* compiled from: PG */
/* renamed from: qa */
final class C0425qa implements Runnable {
    /* renamed from: a */
    private C0747qd f9548a;
    /* renamed from: b */
    private final /* synthetic */ C0836py f9549b;

    public C0425qa(C0836py c0836py, C0747qd c0747qd) {
        this.f9549b = c0836py;
        this.f9548a = c0747qd;
    }

    public final void run() {
        C0836py c0836py = this.f9549b;
        if (c0836py.f22158c != null) {
            C0406oq c0406oq = c0836py.f22158c.f22177b;
            if (c0406oq != null) {
                c0406oq.mo10835m();
            }
        }
        View view = (View) this.f9549b.f22160e;
        if (!(view == null || view.getWindowToken() == null || !this.f9548a.mo10844e())) {
            this.f9549b.f25440k = this.f9548a;
        }
        this.f9549b.f25442m = null;
    }
}
