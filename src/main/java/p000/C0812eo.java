package p000;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.view.View;

/* compiled from: PG */
/* renamed from: eo */
public final class C0812eo extends C0680fv {
    public C0812eo(int i) {
        if ((i & -4) != 0) {
            throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
        }
        this.f18814p = i;
    }

    /* renamed from: b */
    public final void mo6646b(C0228fl c0228fl) {
        super.mo6646b(c0228fl);
        c0228fl.f4836a.put("android:fade:transitionAlpha", Float.valueOf(C0231fo.f4868a.mo6907a(c0228fl.f4837b)));
    }

    /* renamed from: a */
    private final Animator m15926a(View view, float f, float f2) {
        if (f == f2) {
            return null;
        }
        C0231fo.m2404a(view, f);
        Animator ofFloat = ObjectAnimator.ofFloat(view, C0231fo.f4869b, new float[]{f2});
        ofFloat.addListener(new C0215eq(view));
        mo6630a(new C0813ep(view));
        return ofFloat;
    }

    /* renamed from: a */
    private static float m15925a(C0228fl c0228fl, float f) {
        if (c0228fl == null) {
            return f;
        }
        Float f2 = (Float) c0228fl.f4836a.get("android:fade:transitionAlpha");
        if (f2 != null) {
            return f2.floatValue();
        }
        return f;
    }

    /* renamed from: a */
    public final Animator mo13283a(View view, C0228fl c0228fl) {
        float f = 0.0f;
        float a = C0812eo.m15925a(c0228fl, 0.0f);
        if (a != 1.0f) {
            f = a;
        }
        return m15926a(view, f, 1.0f);
    }

    /* renamed from: b */
    public final Animator mo13284b(View view, C0228fl c0228fl) {
        C0231fo.m2407b();
        return m15926a(view, C0812eo.m15925a(c0228fl, 1.0f), 0.0f);
    }
}
