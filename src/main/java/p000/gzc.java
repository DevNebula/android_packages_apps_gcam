package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.apps.camera.p005ui.modeswitch.ViewfinderCover;

/* compiled from: PG */
/* renamed from: gzc */
public final class gzc extends AnimatorListenerAdapter {
    /* renamed from: a */
    private final /* synthetic */ ViewfinderCover f6218a;

    public gzc(ViewfinderCover viewfinderCover) {
        this.f6218a = viewfinderCover;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f6218a.setVisibility(8);
    }
}
