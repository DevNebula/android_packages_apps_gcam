package p000;

import android.view.View;

/* compiled from: PG */
/* renamed from: vt */
final class C0545vt {
    /* renamed from: a */
    private final C0547vv f9933a;
    /* renamed from: b */
    private C0546vu f9934b = new C0546vu();

    C0545vt(C0547vv c0547vv) {
        this.f9933a = c0547vv;
    }

    /* renamed from: a */
    final View mo11406a(int i, int i2, int i3, int i4) {
        int i5;
        int b = this.f9933a.mo11414b();
        int a = this.f9933a.mo11411a();
        if (i2 > i) {
            i5 = 1;
        } else {
            i5 = -1;
        }
        View view = null;
        while (i != i2) {
            C0546vu c0546vu;
            View a2 = this.f9933a.mo11413a(i);
            this.f9934b.mo11409a(b, a, this.f9933a.mo11415b(a2), this.f9933a.mo11412a(a2));
            if (i3 != 0) {
                c0546vu = this.f9934b;
                c0546vu.f9935a = 0;
                c0546vu.mo11408a(i3);
                if (this.f9934b.mo11410a()) {
                    return a2;
                }
            }
            if (i4 != 0) {
                c0546vu = this.f9934b;
                c0546vu.f9935a = 0;
                c0546vu.mo11408a(i4);
                if (!this.f9934b.mo11410a()) {
                    a2 = view;
                }
            } else {
                a2 = view;
            }
            i += i5;
            view = a2;
        }
        return view;
    }

    /* renamed from: a */
    final boolean mo11407a(View view) {
        this.f9934b.mo11409a(this.f9933a.mo11414b(), this.f9933a.mo11411a(), this.f9933a.mo11415b(view), this.f9933a.mo11412a(view));
        C0546vu c0546vu = this.f9934b;
        c0546vu.f9935a = 0;
        c0546vu.mo11408a(24579);
        return this.f9934b.mo11410a();
    }
}
