package p000;

import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.view.View;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* renamed from: kd */
public final class C0328kd {
    /* renamed from: a */
    public WeakReference f8577a;

    C0328kd(View view) {
        this.f8577a = new WeakReference(view);
    }

    /* renamed from: a */
    public final C0328kd mo9758a(float f) {
        View view = (View) this.f8577a.get();
        if (view != null) {
            view.animate().alpha(f);
        }
        return this;
    }

    /* renamed from: a */
    public final void mo9762a() {
        View view = (View) this.f8577a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    /* renamed from: a */
    public final C0328kd mo9759a(long j) {
        View view = (View) this.f8577a.get();
        if (view != null) {
            view.animate().setDuration(j);
        }
        return this;
    }

    /* renamed from: a */
    public final C0328kd mo9760a(C0331kg c0331kg) {
        View view = (View) this.f8577a.get();
        if (view != null) {
            if (c0331kg != null) {
                view.animate().setListener(new C0329ke(c0331kg, view));
            } else {
                view.animate().setListener(null);
            }
        }
        return this;
    }

    /* renamed from: a */
    public final C0328kd mo9761a(C0332ki c0332ki) {
        View view = (View) this.f8577a.get();
        if (view != null) {
            AnimatorUpdateListener c0330kf;
            if (c0332ki != null) {
                c0330kf = new C0330kf(c0332ki);
            } else {
                c0330kf = null;
            }
            view.animate().setUpdateListener(c0330kf);
        }
        return this;
    }

    /* renamed from: b */
    public final C0328kd mo9763b(float f) {
        View view = (View) this.f8577a.get();
        if (view != null) {
            view.animate().translationY(f);
        }
        return this;
    }
}
