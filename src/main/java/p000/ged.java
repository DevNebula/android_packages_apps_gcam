package p000;

import android.os.Handler;
import android.os.Message;
import com.google.android.apps.camera.prewarm.ProcessingBoostService;

/* compiled from: PG */
/* renamed from: ged */
public final class ged extends Handler {
    /* renamed from: a */
    public final /* synthetic */ ProcessingBoostService f5348a;

    public ged(ProcessingBoostService processingBoostService) {
        this.f5348a = processingBoostService;
    }

    public final void handleMessage(Message message) {
        switch (message.what) {
            case 1:
                this.f5348a.f2579b.execute(new gee(this));
                break;
        }
        super.handleMessage(message);
    }
}
