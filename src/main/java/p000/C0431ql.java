package p000;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;

/* compiled from: PG */
/* renamed from: ql */
final class C0431ql {
    /* renamed from: a */
    public C0539vi f9558a;
    /* renamed from: b */
    private final View f9559b;
    /* renamed from: c */
    private final C0436qq f9560c;
    /* renamed from: d */
    private int f9561d = -1;
    /* renamed from: e */
    private C0539vi f9562e;
    /* renamed from: f */
    private C0539vi f9563f;

    C0431ql(View view) {
        this.f9559b = view;
        this.f9560c = C0436qq.m5787a();
    }

    /* renamed from: a */
    final void mo10907a() {
        boolean z = false;
        Drawable background = this.f9559b.getBackground();
        if (background != null) {
            if (this.f9562e != null) {
                if (this.f9563f == null) {
                    this.f9563f = new C0539vi();
                }
                C0539vi c0539vi = this.f9563f;
                c0539vi.f9922a = null;
                c0539vi.f9925d = false;
                c0539vi.f9923b = null;
                c0539vi.f9924c = false;
                ColorStateList b = C0315jm.m4622b(this.f9559b);
                if (b != null) {
                    c0539vi.f9925d = true;
                    c0539vi.f9922a = b;
                }
                Mode c = C0315jm.m4626c(this.f9559b);
                if (c != null) {
                    c0539vi.f9924c = true;
                    c0539vi.f9923b = c;
                }
                if (c0539vi.f9925d || c0539vi.f9924c) {
                    C0436qq.m5789a(background, c0539vi, this.f9559b.getDrawableState());
                    z = true;
                }
                if (z) {
                    return;
                }
            }
            C0539vi c0539vi2 = this.f9558a;
            if (c0539vi2 != null) {
                C0436qq.m5789a(background, c0539vi2, this.f9559b.getDrawableState());
                return;
            }
            c0539vi2 = this.f9562e;
            if (c0539vi2 != null) {
                C0436qq.m5789a(background, c0539vi2, this.f9559b.getDrawableState());
            }
        }
    }

    /* renamed from: a */
    final void mo10909a(AttributeSet attributeSet, int i) {
        C0540vk a = C0540vk.m6109a(this.f9559b.getContext(), attributeSet, C0382ni.f9378cE, i, 0);
        try {
            if (a.mo11398f(0)) {
                this.f9561d = a.mo11399g(0, -1);
                ColorStateList a2 = this.f9560c.mo10931a(this.f9559b.getContext(), this.f9561d);
                if (a2 != null) {
                    m5774a(a2);
                }
            }
            if (a.mo11398f(1)) {
                C0315jm.m4611a(this.f9559b, a.mo11387a(1));
            }
            if (a.mo11398f(2)) {
                C0315jm.m4612a(this.f9559b, C0474sg.m5866a(a.mo11393d(2, -1), null));
            }
            a.f9927b.recycle();
        } catch (Throwable th) {
            a.f9927b.recycle();
        }
    }

    /* renamed from: b */
    final void mo10910b() {
        this.f9561d = -1;
        m5774a(null);
        mo10907a();
    }

    /* renamed from: a */
    final void mo10908a(int i) {
        ColorStateList a;
        this.f9561d = i;
        C0436qq c0436qq = this.f9560c;
        if (c0436qq != null) {
            a = c0436qq.mo10931a(this.f9559b.getContext(), i);
        } else {
            a = null;
        }
        m5774a(a);
        mo10907a();
    }

    /* renamed from: a */
    private final void m5774a(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f9562e == null) {
                this.f9562e = new C0539vi();
            }
            C0539vi c0539vi = this.f9562e;
            c0539vi.f9922a = colorStateList;
            c0539vi.f9925d = true;
        } else {
            this.f9562e = null;
        }
        mo10907a();
    }
}
