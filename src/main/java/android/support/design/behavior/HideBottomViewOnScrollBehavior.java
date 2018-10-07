package android.support.design.behavior;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.support.design.widget.CoordinatorLayout;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewPropertyAnimator;
import p000.C0047as;
import p000.C0056bf;
import p000.C0189dj;

/* compiled from: PG */
public class HideBottomViewOnScrollBehavior extends C0189dj {
    /* renamed from: a */
    public ViewPropertyAnimator f10409a;
    /* renamed from: b */
    private int f10410b = 0;
    /* renamed from: c */
    private int f10411c = 2;

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    private final void m6734a(View view, int i, long j, TimeInterpolator timeInterpolator) {
        this.f10409a = view.animate().translationY((float) i).setInterpolator(timeInterpolator).setDuration(j).setListener(new C0056bf(this));
    }

    /* renamed from: a */
    public final boolean mo408a(CoordinatorLayout coordinatorLayout, View view, int i) {
        this.f10410b = view.getMeasuredHeight();
        return super.mo408a(coordinatorLayout, view, i);
    }

    /* renamed from: a */
    public final void mo5977a(View view, int i) {
        int i2 = this.f10411c;
        ViewPropertyAnimator viewPropertyAnimator;
        if (i2 != 1 && i > 0) {
            viewPropertyAnimator = this.f10409a;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
                view.clearAnimation();
            }
            this.f10411c = 1;
            m6734a(view, this.f10410b, 175, C0047as.f957b);
        } else if (i2 != 2 && i < 0) {
            viewPropertyAnimator = this.f10409a;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
                view.clearAnimation();
            }
            this.f10411c = 2;
            m6734a(view, 0, 225, C0047as.f958c);
        }
    }

    /* renamed from: a */
    public final boolean mo5979a(int i) {
        return i == 2;
    }
}
