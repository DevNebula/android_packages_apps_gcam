package p000;

import android.view.View;

/* compiled from: PG */
/* renamed from: nf */
final class C0826nf extends C0701kh {
    /* renamed from: a */
    private final /* synthetic */ C0724ne f25377a;

    C0826nf(C0724ne c0724ne) {
        this.f25377a = c0724ne;
    }

    /* renamed from: b */
    public final void mo9957b() {
        View view;
        C0724ne c0724ne = this.f25377a;
        if (c0724ne.f22108j) {
            view = c0724ne.f22104f;
            if (view != null) {
                view.setTranslationY(0.0f);
                this.f25377a.f22101c.setTranslationY(0.0f);
            }
        }
        this.f25377a.f22101c.setVisibility(8);
        this.f25377a.f22101c.mo1088a(false);
        c0724ne = this.f25377a;
        c0724ne.f22111m = null;
        C0388no c0388no = c0724ne.f22107i;
        if (c0388no != null) {
            c0388no.mo10751a(c0724ne.f22106h);
            c0724ne.f22106h = null;
            c0724ne.f22107i = null;
        }
        view = this.f25377a.f22100b;
        if (view != null) {
            C0315jm.m4602B(view);
        }
    }
}
