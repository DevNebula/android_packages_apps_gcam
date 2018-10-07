package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.FrameLayout;
import com.google.android.apps.camera.optionsbar.OptionsBarView;

/* compiled from: PG */
/* renamed from: gbp */
public final class gbp extends AnimatorListenerAdapter {
    /* renamed from: a */
    private final /* synthetic */ boolean f5266a;
    /* renamed from: b */
    private final /* synthetic */ OptionsBarView f5267b;

    public gbp(OptionsBarView optionsBarView, boolean z) {
        this.f5267b = optionsBarView;
        this.f5266a = z;
    }

    public final void onAnimationEnd(Animator animator) {
        if (!this.f5266a) {
            FrameLayout frameLayout = this.f5267b.f23293g;
            if (frameLayout != null) {
                frameLayout.setVisibility(4);
            }
        }
    }

    public final void onAnimationStart(Animator animator) {
        if (this.f5266a) {
            FrameLayout frameLayout = this.f5267b.f23293g;
            if (frameLayout != null) {
                frameLayout.setVisibility(0);
            }
        }
    }
}
