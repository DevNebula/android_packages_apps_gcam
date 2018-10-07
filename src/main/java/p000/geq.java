package p000;

import com.google.android.apps.camera.processing.ProcessingService;

/* compiled from: PG */
/* renamed from: geq */
public final class geq implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ ProcessingService f5353a;

    public geq(ProcessingService processingService) {
        this.f5353a = processingService;
    }

    public final void run() {
        synchronized (this.f5353a.f12822f) {
            ProcessingService processingService = this.f5353a;
            processingService.f12823g = true;
            if (processingService.f12824h) {
                bli.m888a(ProcessingService.f12817a, "Posting notification after timeout");
                this.f5353a.mo12582a();
            }
        }
    }
}
