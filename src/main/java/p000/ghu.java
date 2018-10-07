package p000;

import android.graphics.drawable.Animatable2.AnimationCallback;
import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* renamed from: ghu */
final class ghu extends AnimationCallback {
    /* renamed from: a */
    private final /* synthetic */ ght f5438a;

    ghu(ght ght) {
        this.f5438a = ght;
    }

    public final void onAnimationEnd(Drawable drawable) {
        super.onAnimationEnd(drawable);
        ght ght = this.f5438a;
        if (ght.f26403e) {
            ght.f26404f.start();
        }
    }
}
