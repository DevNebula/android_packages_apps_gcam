package p000;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;

/* compiled from: PG */
/* renamed from: aw */
public final class C0051aw {
    /* renamed from: a */
    public int f1000a = 0;
    /* renamed from: b */
    public int f1001b = 1;
    /* renamed from: c */
    private long f1002c = 0;
    /* renamed from: d */
    private long f1003d = 300;
    /* renamed from: e */
    private TimeInterpolator f1004e = null;

    public C0051aw(long j, long j2, TimeInterpolator timeInterpolator) {
        this.f1002c = j;
        this.f1003d = j2;
        this.f1004e = timeInterpolator;
    }

    /* renamed from: a */
    public final void mo1810a(Animator animator) {
        animator.setStartDelay(this.f1002c);
        animator.setDuration(this.f1003d);
        animator.setInterpolator(m730a());
        if (animator instanceof ValueAnimator) {
            ValueAnimator valueAnimator = (ValueAnimator) animator;
            valueAnimator.setRepeatCount(this.f1000a);
            valueAnimator.setRepeatMode(this.f1001b);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C0051aw c0051aw = (C0051aw) obj;
        if (this.f1002c == c0051aw.f1002c && this.f1003d == c0051aw.f1003d && this.f1000a == c0051aw.f1000a && this.f1001b == c0051aw.f1001b) {
            return m730a().getClass().equals(c0051aw.m730a().getClass());
        }
        return false;
    }

    /* renamed from: a */
    private final TimeInterpolator m730a() {
        TimeInterpolator timeInterpolator = this.f1004e;
        return timeInterpolator == null ? C0047as.f956a : timeInterpolator;
    }

    public final int hashCode() {
        long j = this.f1002c;
        long j2 = this.f1003d;
        return (((((((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + m730a().getClass().hashCode()) * 31) + this.f1000a) * 31) + this.f1001b;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(10);
        stringBuilder.append(getClass().getName());
        stringBuilder.append('{');
        stringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
        stringBuilder.append(" delay: ");
        stringBuilder.append(this.f1002c);
        stringBuilder.append(" duration: ");
        stringBuilder.append(this.f1003d);
        stringBuilder.append(" interpolator: ");
        stringBuilder.append(m730a().getClass());
        stringBuilder.append(" repeatCount: ");
        stringBuilder.append(this.f1000a);
        stringBuilder.append(" repeatMode: ");
        stringBuilder.append(this.f1001b);
        stringBuilder.append("}\n");
        return stringBuilder.toString();
    }
}
