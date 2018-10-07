package p000;

import com.google.android.GoogleCamera.R;
import com.google.android.apps.camera.legacy.lightcycle.p004ui.PhotoSphereMessageOverlay;

/* compiled from: PG */
/* renamed from: ema */
public final class ema implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ PhotoSphereMessageOverlay f4189a;

    public ema(PhotoSphereMessageOverlay photoSphereMessageOverlay) {
        this.f4189a = photoSphereMessageOverlay;
    }

    public final void run() {
        PhotoSphereMessageOverlay photoSphereMessageOverlay = this.f4189a;
        if (photoSphereMessageOverlay.f2570e) {
            photoSphereMessageOverlay.f2570e = false;
            photoSphereMessageOverlay.findViewById(R.id.rotate_device_icon).setVisibility(4);
        }
    }
}
