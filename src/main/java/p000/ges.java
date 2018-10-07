package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.apps.camera.processing.ProcessingService;

/* compiled from: PG */
/* renamed from: ges */
public final class ges extends BroadcastReceiver {
    /* renamed from: a */
    private final /* synthetic */ ProcessingService f5354a;

    public ges(ProcessingService processingService) {
        this.f5354a = processingService;
    }

    public final void onReceive(Context context, Intent intent) {
        ProcessingService processingService;
        geu geu;
        if ("com.google.android.apps.camera.legacy.app.processing.PAUSE".equals(intent.getAction())) {
            processingService = this.f5354a;
            bli.m888a(ProcessingService.f12817a, "Pausing");
            synchronized (processingService.f12822f) {
                processingService.f12823g = false;
            }
            synchronized (processingService.f12819c) {
                processingService.f12821e = true;
                geu = processingService.f12820d;
                if (geu != null) {
                    geu.suspend();
                }
            }
        } else if ("com.google.android.apps.camera.legacy.app.processing.RESUME".equals(intent.getAction())) {
            processingService = this.f5354a;
            bli.m888a(ProcessingService.f12817a, "Resuming");
            synchronized (processingService.f12822f) {
                processingService.f12823g = true;
            }
            synchronized (processingService.f12819c) {
                processingService.f12821e = false;
                geu = processingService.f12820d;
                if (geu != null) {
                    geu.resume();
                }
            }
        }
    }
}
