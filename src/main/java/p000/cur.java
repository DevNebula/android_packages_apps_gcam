package p000;

import android.animation.Animator.AnimatorListener;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.os.Handler;
import android.widget.Scroller;

/* compiled from: PG */
/* renamed from: cur */
public final class cur {
    /* renamed from: a */
    public final Handler f2966a;
    /* renamed from: b */
    public final cuv f2967b;
    /* renamed from: c */
    public final Scroller f2968c;
    /* renamed from: d */
    public final ValueAnimator f2969d;
    /* renamed from: e */
    public final Runnable f2970e = new cus(this);
    /* renamed from: f */
    private final AnimatorUpdateListener f2971f = new cut(this);
    /* renamed from: g */
    private final AnimatorListener f2972g = new cuu(this);

    public cur(Context context, Handler handler, cuv cuv, TimeInterpolator timeInterpolator) {
        this.f2966a = handler;
        this.f2967b = cuv;
        this.f2968c = new Scroller(context);
        this.f2969d = new ValueAnimator();
        this.f2969d.addUpdateListener(this.f2971f);
        this.f2969d.addListener(this.f2972g);
        this.f2969d.setInterpolator(timeInterpolator);
    }
}
