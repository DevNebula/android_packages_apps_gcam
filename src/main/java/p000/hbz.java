package p000;

import android.animation.Animator;

/* compiled from: PG */
/* renamed from: hbz */
public final class hbz {
    /* renamed from: a */
    public final Animator f6316a;
    /* renamed from: b */
    public final /* synthetic */ hbh f6317b;

    hbz(hbh hbh, Animator animator) {
        this.f6317b = hbh;
        this.f6316a = animator;
    }

    /* renamed from: a */
    public final hbz mo7655a() {
        this.f6316a.setStartDelay(150);
        return this;
    }

    /* renamed from: b */
    public final hbz mo7657b() {
        this.f6316a.addListener(new hcb(this));
        return this;
    }

    /* renamed from: c */
    public final hbz mo7658c() {
        this.f6316a.addListener(new hcc(this));
        return this;
    }

    /* renamed from: a */
    public final hbz mo7656a(int i) {
        this.f6316a.setDuration((long) i);
        return this;
    }

    /* renamed from: d */
    public final hbz mo7659d() {
        this.f6316a.setInterpolator(hbh.f6272a);
        return this;
    }

    /* renamed from: e */
    public final hbz mo7660e() {
        this.f6316a.addListener(new hca(this));
        return this;
    }
}
