package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* renamed from: hbx */
public final class hbx extends AnimatorListenerAdapter {
    /* renamed from: a */
    private final /* synthetic */ hbh f6314a;

    public hbx(hbh hbh) {
        this.f6314a = hbh;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f6314a.f6274b.resetTo(hbf.PHOTO_IDLE);
    }
}
