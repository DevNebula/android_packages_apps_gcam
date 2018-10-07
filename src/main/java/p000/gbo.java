package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.apps.camera.optionsbar.OptionsBarView;

/* compiled from: PG */
/* renamed from: gbo */
public final class gbo extends AnimatorListenerAdapter {
    /* renamed from: a */
    private final /* synthetic */ OptionsBarView f5265a;

    public gbo(OptionsBarView optionsBarView) {
        this.f5265a = optionsBarView;
    }

    public final void onAnimationEnd(Animator animator) {
        int a = this.f5265a.f23299n;
        this.f5265a.f23299n = C0252go.f5805aD;
        if (a == C0252go.f5807aF) {
            this.f5265a.mo14600a();
        }
    }
}
