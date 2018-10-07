package p000;

import android.opengl.Matrix;
import com.google.android.apps.camera.legacy.lightcycle.panorama.LightCycle;

/* compiled from: PG */
/* renamed from: ekk */
final class ekk extends Thread {
    /* renamed from: a */
    private final /* synthetic */ eki f4035a;

    ekk(eki eki) {
        this.f4035a = eki;
    }

    public final void run() {
        eki eki;
        LightCycle.m1348s();
        this.f4035a.f4012d.mo6289a();
        if (this.f4035a.f3967I.mo6271e() == 0) {
            this.f4035a.f4012d.mo6292b();
            if (this.f4035a.f4031w == C0252go.f5839al) {
                float[] fArr = new float[16];
                Matrix.setIdentityM(fArr, 0);
                this.f4035a.f4012d.mo6291a(fArr);
            }
            eki = this.f4035a;
            eks eks = eki.f4016h;
            eks.f4059g = false;
            eks.f4060h = false;
            eks.f4058f = 0;
            eki.f3967I.f3922I.f4037b = -1.0d;
            eki.f4024p = true;
            if (!eki.f4034z) {
                eki.f4013e.mo2669b(eki.f3959A);
            }
        }
        eki = this.f4035a;
        boolean z = eki.f4034z;
        if (z) {
            eki.f4013e.mo2668a(z, eki.f3967I.f3944o);
        }
    }
}
