package p000;

import android.view.Surface;
import java.util.ArrayList;
import java.util.List;

/* renamed from: bhn */
final /* synthetic */ class bhn implements Runnable {
    /* renamed from: a */
    private final bhm f1177a;
    /* renamed from: b */
    private final Surface f1178b;
    /* renamed from: c */
    private final Surface f1179c;
    /* renamed from: d */
    private final kpw f1180d;

    bhn(bhm bhm, Surface surface, Surface surface2, kpw kpw) {
        this.f1177a = bhm;
        this.f1178b = surface;
        this.f1179c = surface2;
        this.f1180d = kpw;
    }

    public final void run() {
        bhm bhm = this.f1177a;
        Surface surface = this.f1178b;
        Surface surface2 = this.f1179c;
        knk knk = this.f1180d;
        bli.m888a(bhm.f11392a, "Execute CameraCaptureSession-creation task on camera handler thread.");
        List arrayList = new ArrayList();
        arrayList.add(surface);
        arrayList.add(surface2);
        try {
            bhm.f11393b.mo13723a(arrayList, new iwk(knk), null);
        } catch (isr e) {
            bli.m888a(bhm.f11392a, "CameraDeviceProxy has been closed. (ResourceUnavailableException)");
            knk.mo15641a(null);
        }
    }
}
