package p000;

import com.google.android.apps.camera.burstchip.BurstChip;

/* renamed from: cka */
final /* synthetic */ class cka implements Runnable {
    /* renamed from: a */
    private final cjq f2278a;

    cka(cjq cjq) {
        this.f2278a = cjq;
    }

    public final void run() {
        cjq cjq = this.f2278a;
        if (!cjq.f12642c.isDone()) {
            cjq.f12642c.mo15641a((BurstChip) cjq.f12641b.inflate());
        }
    }
}
