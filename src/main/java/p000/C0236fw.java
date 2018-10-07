package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* compiled from: PG */
/* renamed from: fw */
final class C0236fw extends AnimatorListenerAdapter {
    /* renamed from: a */
    private final /* synthetic */ C0230fn f4979a;
    /* renamed from: b */
    private final /* synthetic */ View f4980b;

    C0236fw(C0230fn c0230fn, View view) {
        this.f4979a = c0230fn;
        this.f4980b = view;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f4979a.mo6860a(this.f4980b);
    }
}
