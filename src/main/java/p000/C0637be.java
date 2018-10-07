package p000;

import android.content.Context;
import android.support.design.widget.CoordinatorLayout;
import android.util.AttributeSet;
import android.view.View;

/* compiled from: PG */
/* renamed from: be */
public class C0637be extends C0189dj {
    /* renamed from: d */
    public C0071cb f11193d;
    /* renamed from: e */
    public int f11194e = 0;

    public C0637be(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: c */
    public final int mo12361c() {
        C0071cb c0071cb = this.f11193d;
        if (c0071cb == null) {
            return 0;
        }
        return c0071cb.f1859d;
    }

    /* renamed from: b */
    protected void mo12360b(CoordinatorLayout coordinatorLayout, View view, int i) {
        coordinatorLayout.mo11687a(view, i);
    }

    /* renamed from: a */
    public boolean mo408a(CoordinatorLayout coordinatorLayout, View view, int i) {
        mo12360b(coordinatorLayout, view, i);
        if (this.f11193d == null) {
            this.f11193d = new C0071cb(view);
        }
        C0071cb c0071cb = this.f11193d;
        c0071cb.f1857b = c0071cb.f1856a.getTop();
        c0071cb.f1858c = c0071cb.f1856a.getLeft();
        c0071cb.mo2247a();
        int i2 = this.f11194e;
        if (i2 != 0) {
            this.f11193d.mo2248a(i2);
            this.f11194e = 0;
        }
        return true;
    }
}
