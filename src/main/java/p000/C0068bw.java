package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* renamed from: bw */
public final class C0068bw extends AnimatorListenerAdapter {
    /* renamed from: a */
    private final /* synthetic */ boolean f1664a = false;
    /* renamed from: b */
    private final /* synthetic */ C0071cb f1665b;
    /* renamed from: c */
    private final /* synthetic */ C0066bu f1666c;

    public C0068bw(C0066bu c0066bu, C0071cb c0071cb) {
        this.f1666c = c0066bu;
        this.f1665b = c0071cb;
    }

    public final void onAnimationEnd(Animator animator) {
        C0066bu c0066bu = this.f1666c;
        c0066bu.f1604b = 0;
        c0066bu.f1605c = null;
        if (this.f1665b != null) {
            C0186df.m1659c();
        }
    }

    public final void onAnimationStart(Animator animator) {
        this.f1666c.f1620x.mo5718a(0, false);
        C0066bu c0066bu = this.f1666c;
        c0066bu.f1604b = 2;
        c0066bu.f1605c = animator;
    }
}
