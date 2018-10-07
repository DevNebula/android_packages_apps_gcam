package p000;

import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.util.Log;
import android.util.SizeF;

/* renamed from: bqw */
public final /* synthetic */ class bqw implements Runnable {
    /* renamed from: a */
    private final brm f1488a;
    /* renamed from: b */
    private final ffc f1489b;

    public bqw(brm brm, ffc ffc) {
        this.f1488a = brm;
        this.f1489b = ffc;
    }

    public final void run() {
        brm brm = this.f1488a;
        Rect rect = (Rect) this.f1489b.mo9056a(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        if (rect == null) {
            Log.w("faceMetadataDistributor", "Cannot set active size with null active array");
            return;
        }
        float f = (float) (rect.right - rect.left);
        float f2 = (float) (rect.bottom - rect.top);
        synchronized (brm) {
            brm.f11739a = kbg.m4804c(new SizeF(f, f2));
        }
    }
}
