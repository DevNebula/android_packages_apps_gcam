package p000;

import com.google.android.apps.camera.legacy.app.refocus.ViewerActivity;
import com.google.android.apps.refocus.viewer.RGBZFocusControls;

/* compiled from: PG */
/* renamed from: dxf */
public final class dxf implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ ViewerActivity f3541a;

    public dxf(ViewerActivity viewerActivity) {
        this.f3541a = viewerActivity;
    }

    public final void run() {
        ViewerActivity viewerActivity = this.f3541a;
        RGBZFocusControls rGBZFocusControls = viewerActivity.f23266e;
        hsp a = viewerActivity.f23267f;
        rGBZFocusControls.f12905f = a;
        rGBZFocusControls.post(new hsl(rGBZFocusControls, a));
    }
}
