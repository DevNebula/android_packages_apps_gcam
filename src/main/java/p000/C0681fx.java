package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: PG */
/* renamed from: fx */
final class C0681fx extends AnimatorListenerAdapter implements C0224fc {
    /* renamed from: a */
    private final View f18861a;
    /* renamed from: b */
    private final int f18862b;
    /* renamed from: c */
    private final ViewGroup f18863c;
    /* renamed from: d */
    private final boolean f18864d;
    /* renamed from: e */
    private boolean f18865e;
    /* renamed from: f */
    private boolean f18866f = false;

    C0681fx(View view, int i) {
        this.f18861a = view;
        this.f18862b = i;
        this.f18863c = (ViewGroup) view.getParent();
        this.f18864d = true;
        m11047a(true);
    }

    /* renamed from: d */
    private final void m11048d() {
        if (!this.f18866f) {
            C0231fo.m2405a(this.f18861a, this.f18862b);
            ViewGroup viewGroup = this.f18863c;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        m11047a(false);
    }

    public final void onAnimationCancel(Animator animator) {
        this.f18866f = true;
    }

    public final void onAnimationEnd(Animator animator) {
        m11048d();
    }

    public final void onAnimationPause(Animator animator) {
        if (!this.f18866f) {
            C0231fo.m2405a(this.f18861a, this.f18862b);
        }
    }

    public final void onAnimationRepeat(Animator animator) {
    }

    public final void onAnimationResume(Animator animator) {
        if (!this.f18866f) {
            C0231fo.m2405a(this.f18861a, 0);
        }
    }

    public final void onAnimationStart(Animator animator) {
    }

    /* renamed from: a */
    public final void mo6738a(C0219ex c0219ex) {
        m11048d();
        c0219ex.mo6644b((C0224fc) this);
    }

    /* renamed from: a */
    public final void mo6737a() {
        m11047a(false);
    }

    /* renamed from: b */
    public final void mo6739b() {
        m11047a(true);
    }

    /* renamed from: c */
    public final void mo6740c() {
    }

    /* renamed from: a */
    private final void m11047a(boolean z) {
        if (this.f18864d && this.f18865e != z) {
            ViewGroup viewGroup = this.f18863c;
            if (viewGroup != null) {
                this.f18865e = z;
                C0186df.m1650a(viewGroup, z);
            }
        }
    }
}
