package p000;

import android.animation.Animator;

/* compiled from: PG */
/* renamed from: hjd */
public final class hjd implements hiv {
    /* renamed from: b */
    private final Animator f20164b;
    /* renamed from: c */
    private final kpk f20165c;

    public hjd(Animator animator, kpk kpk) {
        this.f20164b = animator;
        this.f20165c = kpk;
    }

    /* renamed from: a */
    public final void mo7896a(hiw hiw) {
        kow.m13878a(this.f20165c, new hje(hiw), kpq.f8776a);
    }

    /* renamed from: a */
    public final void mo7895a() {
        this.f20164b.cancel();
    }

    /* renamed from: b */
    public final kpk mo7897b() {
        return this.f20165c;
    }
}
