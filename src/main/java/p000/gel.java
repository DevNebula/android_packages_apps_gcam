package p000;

import android.content.Context;
import android.content.Intent;
import com.google.android.apps.camera.processing.ProcessingService;

/* renamed from: gel */
public final /* synthetic */ class gel implements Runnable {
    /* renamed from: a */
    private final Context f5350a;

    public gel(Context context) {
        this.f5350a = context;
    }

    public final void run() {
        Context context = this.f5350a;
        context.startService(new Intent(context, ProcessingService.class));
    }
}
