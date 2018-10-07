package p000;

import com.google.android.apps.camera.legacy.lightcycle.panorama.LightCycle;

/* compiled from: PG */
/* renamed from: ekm */
public final class ekm {
    /* renamed from: a */
    public float f4036a = 0.0f;
    /* renamed from: b */
    public double f4037b = -1.0d;
    /* renamed from: c */
    public boolean f4038c = false;

    /* renamed from: a */
    final void mo6287a() {
        boolean z;
        float f = 0.16000001f;
        double d = this.f4037b;
        if (d > 0.0d) {
            if (d > 0.025d) {
                f = 0.0025000002f;
            } else if (d < 0.01d) {
                f = !this.f4038c ? 1.0f : 0.010000001f;
            }
        }
        if (this.f4036a > f) {
            z = true;
        } else {
            z = false;
        }
        LightCycle.m1323a(z);
    }
}
