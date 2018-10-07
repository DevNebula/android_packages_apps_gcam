package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* renamed from: hcb */
final class hcb extends AnimatorListenerAdapter {
    /* renamed from: a */
    private final /* synthetic */ hbz f6319a;

    hcb(hbz hbz) {
        this.f6319a = hbz;
    }

    public final void onAnimationEnd(Animator animator) {
        hbh hbh = this.f6319a.f6317b;
        hbh.f6274b.currentSpec.mo7699a(hbh.f6276d.mo7679a());
    }

    public final void onAnimationStart(Animator animator) {
        this.f6319a.f6317b.f6274b.currentSpec.mo7699a(true);
    }
}
