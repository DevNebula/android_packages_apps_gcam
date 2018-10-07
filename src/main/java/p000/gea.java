package p000;

import com.google.android.apps.camera.prewarm.NoOpPrewarmService;

/* compiled from: PG */
/* renamed from: gea */
public final class gea implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ NoOpPrewarmService f5347a;

    public gea(NoOpPrewarmService noOpPrewarmService) {
        this.f5347a = noOpPrewarmService;
    }

    public final void run() {
        NoOpPrewarmService noOpPrewarmService = this.f5347a;
        bli.m891b(NoOpPrewarmService.f2573a, "Prewarm timed out! This should not happen.");
        noOpPrewarmService.f2574b.mo8919i();
    }
}
