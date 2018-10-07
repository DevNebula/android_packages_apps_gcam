package p000;

import android.view.View;

/* compiled from: PG */
/* renamed from: ml */
final class C0824ml extends C0701kh {
    /* renamed from: a */
    private final /* synthetic */ C0713mg f25375a;

    C0824ml(C0713mg c0713mg) {
        this.f25375a = c0713mg;
    }

    /* renamed from: b */
    public final void mo9957b() {
        this.f25375a.f22064g.setAlpha(1.0f);
        this.f25375a.f22067j.mo9760a(null);
        this.f25375a.f22067j = null;
    }

    /* renamed from: c */
    public final void mo9958c() {
        this.f25375a.f22064g.setVisibility(0);
        this.f25375a.f22064g.sendAccessibilityEvent(32);
        if (this.f25375a.f22064g.getParent() instanceof View) {
            C0315jm.m4602B((View) this.f25375a.f22064g.getParent());
        }
    }
}
