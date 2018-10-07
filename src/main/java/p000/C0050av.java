package p000;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.Log;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* renamed from: av */
public final class C0050av {
    /* renamed from: a */
    private final C0301iz f998a = new C0301iz();

    /* renamed from: a */
    public static C0050av m727a(Context context, TypedArray typedArray, int i) {
        if (typedArray.hasValue(i)) {
            int resourceId = typedArray.getResourceId(i, 0);
            if (resourceId != 0) {
                return C0050av.m726a(context, resourceId);
            }
        }
        return null;
    }

    /* renamed from: a */
    public static C0050av m726a(Context context, int i) {
        try {
            Animator loadAnimator = AnimatorInflater.loadAnimator(context, i);
            if (loadAnimator instanceof AnimatorSet) {
                return C0050av.m728a(((AnimatorSet) loadAnimator).getChildAnimations());
            }
            if (loadAnimator == null) {
                return null;
            }
            List arrayList = new ArrayList();
            arrayList.add(loadAnimator);
            return C0050av.m728a(arrayList);
        } catch (Throwable e) {
            Throwable th = e;
            String valueOf = String.valueOf(Integer.toHexString(i));
            String str = "Can't load animation resource ID #0x";
            if (valueOf.length() == 0) {
                valueOf = new String(str);
            } else {
                valueOf = str.concat(valueOf);
            }
            Log.w("MotionSpec", valueOf, th);
            return null;
        }
    }

    /* renamed from: a */
    private static C0050av m728a(List list) {
        C0050av c0050av = new C0050av();
        int size = list.size();
        int i = 0;
        while (i < size) {
            Animator animator = (Animator) list.get(i);
            if (animator instanceof ObjectAnimator) {
                ObjectAnimator objectAnimator = (ObjectAnimator) animator;
                String propertyName = objectAnimator.getPropertyName();
                long startDelay = objectAnimator.getStartDelay();
                long duration = objectAnimator.getDuration();
                TimeInterpolator interpolator = objectAnimator.getInterpolator();
                if ((interpolator instanceof AccelerateDecelerateInterpolator) || interpolator == null) {
                    interpolator = C0047as.f956a;
                } else if (interpolator instanceof AccelerateInterpolator) {
                    interpolator = C0047as.f957b;
                } else if (interpolator instanceof DecelerateInterpolator) {
                    interpolator = C0047as.f958c;
                }
                C0051aw c0051aw = new C0051aw(startDelay, duration, interpolator);
                c0051aw.f1000a = objectAnimator.getRepeatCount();
                c0051aw.f1001b = objectAnimator.getRepeatMode();
                c0050av.f998a.put(propertyName, c0051aw);
                i++;
            } else {
                String valueOf = String.valueOf(animator);
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 36);
                stringBuilder.append("Animator must be an ObjectAnimator: ");
                stringBuilder.append(valueOf);
                throw new IllegalArgumentException(stringBuilder.toString());
            }
        }
        return c0050av;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f998a.equals(((C0050av) obj).f998a);
    }

    /* renamed from: a */
    public final C0051aw mo1805a(String str) {
        if (this.f998a.get(str) != null) {
            return (C0051aw) this.f998a.get(str);
        }
        throw new IllegalArgumentException();
    }

    public final int hashCode() {
        return this.f998a.hashCode();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(10);
        stringBuilder.append(getClass().getName());
        stringBuilder.append('{');
        stringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
        stringBuilder.append(" timings: ");
        stringBuilder.append(this.f998a);
        stringBuilder.append("}\n");
        return stringBuilder.toString();
    }
}
