package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import com.google.android.apps.camera.optionsbar.OptionsBarView;

/* compiled from: PG */
/* renamed from: gbl */
public final class gbl extends AnimatorListenerAdapter {
    /* renamed from: a */
    private final /* synthetic */ View f5261a;
    /* renamed from: b */
    private final /* synthetic */ OptionsBarView f5262b;

    public gbl(OptionsBarView optionsBarView, View view) {
        this.f5262b = optionsBarView;
        this.f5261a = view;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f5262b.f23299n = C0252go.f5805aD;
        this.f5262b.removeView((View) jqk.m13354c(this.f5261a));
        this.f5262b.f23292f = null;
    }
}
