package p000;

import android.hardware.camera2.CameraManager.AvailabilityCallback;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* renamed from: bmr */
final class bmr extends AvailabilityCallback {
    /* renamed from: a */
    private final /* synthetic */ AtomicBoolean f1353a;

    bmr(AtomicBoolean atomicBoolean) {
        this.f1353a = atomicBoolean;
    }

    public final void onCameraAvailable(String str) {
        this.f1353a.set(true);
    }
}
