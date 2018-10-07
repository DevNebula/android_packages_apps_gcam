package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* renamed from: bv */
public final class C0067bv extends AnimatorListenerAdapter {
    /* renamed from: a */
    private boolean f1631a;
    /* renamed from: b */
    private final /* synthetic */ boolean f1632b = false;
    /* renamed from: c */
    private final /* synthetic */ C0071cb f1633c;
    /* renamed from: d */
    private final /* synthetic */ C0066bu f1634d;

    public C0067bv(C0066bu c0066bu, C0071cb c0071cb) {
        this.f1634d = c0066bu;
        this.f1633c = c0071cb;
    }

    public final void onAnimationCancel(Animator animator) {
        this.f1631a = true;
    }

    public final void onAnimationEnd(Animator animator) {
        C0066bu c0066bu = this.f1634d;
        c0066bu.f1604b = 0;
        c0066bu.f1605c = null;
        if (!this.f1631a) {
            c0066bu.f1620x.mo5718a(4, false);
            if (this.f1633c != null) {
                C0186df.m1657b();
            }
        }
    }

    public final void onAnimationStart(Animator animator) {
        this.f1634d.f1620x.mo5718a(0, false);
        C0066bu c0066bu = this.f1634d;
        c0066bu.f1604b = 1;
        c0066bu.f1605c = animator;
        this.f1631a = false;
    }
}
