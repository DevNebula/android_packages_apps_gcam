package p000;

import android.hardware.Camera;
import android.hardware.Camera.Parameters;

/* compiled from: PG */
/* renamed from: zh */
final class C0610zh {
    /* renamed from: a */
    private Parameters f10085a;
    /* renamed from: b */
    private Camera f10086b;

    public C0610zh(Camera camera) {
        this.f10086b = camera;
    }

    /* renamed from: a */
    public final synchronized Parameters mo11579a() {
        if (this.f10085a == null) {
            this.f10085a = this.f10086b.getParameters();
            if (this.f10085a == null) {
                abx.m87b(C0796yo.f22440a, "Camera object returned null parameters!");
                throw new IllegalStateException("camera.getParameters returned null");
            }
        }
        return this.f10085a;
    }

    /* renamed from: b */
    public final synchronized void mo11580b() {
        this.f10085a = null;
    }
}
