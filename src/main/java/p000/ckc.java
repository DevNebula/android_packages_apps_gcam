package p000;

import com.google.android.apps.camera.burstchip.BurstChip;

/* renamed from: ckc */
final /* synthetic */ class ckc implements Runnable {
    /* renamed from: a */
    private final ckd f2279a;
    /* renamed from: b */
    private final BurstChip f2280b;

    ckc(ckd ckd, BurstChip burstChip) {
        this.f2279a = ckd;
        this.f2280b = burstChip;
    }

    public final void run() {
        this.f2279a.mo2347a(this.f2280b);
    }
}
