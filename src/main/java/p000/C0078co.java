package p000;

import android.animation.Animator.AnimatorListener;
import android.animation.ValueAnimator;
import java.util.ArrayList;

/* compiled from: PG */
/* renamed from: co */
public final class C0078co {
    /* renamed from: a */
    public final ArrayList f2405a = new ArrayList();
    /* renamed from: b */
    public C0172cq f2406b = null;
    /* renamed from: c */
    public ValueAnimator f2407c = null;
    /* renamed from: d */
    private final AnimatorListener f2408d = new C0171cp(this);

    /* renamed from: a */
    public final void mo2413a(int[] iArr, ValueAnimator valueAnimator) {
        C0172cq c0172cq = new C0172cq(iArr, valueAnimator);
        valueAnimator.addListener(this.f2408d);
        this.f2405a.add(c0172cq);
    }
}
