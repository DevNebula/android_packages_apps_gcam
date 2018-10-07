package p000;

import android.graphics.SurfaceTexture;

/* renamed from: iyh */
final /* synthetic */ class iyh implements Runnable {
    /* renamed from: a */
    private final iye f7915a;

    iyh(iye iye) {
        this.f7915a = iye;
    }

    public final void run() {
        iye iye = this.f7915a;
        try {
            ird ird = iye.f21375h;
            int b = iye.mo13763b();
            StringBuilder stringBuilder = new StringBuilder(27);
            stringBuilder.append("VFEP.process(o=");
            stringBuilder.append(b);
            stringBuilder.append(")");
            ird.mo8856a(stringBuilder.toString());
            SurfaceTexture surfaceTexture = iye.f21373f;
            jek jek = iye.f21372e;
            jdk jdk = (jdk) iye.f21381n.mo9706a();
            synchronized (iye.f21380m) {
                if (iye.f21385r) {
                } else {
                    float f;
                    float f2;
                    surfaceTexture.updateTexImage();
                    iqm iqm = iye.f21383p;
                    float[] fArr = new float[16];
                    iye.f21373f.getTransformMatrix(fArr);
                    switch (iqm.ordinal()) {
                        case 0:
                            f = 1.0f;
                            f2 = 0.0f;
                            break;
                        case 1:
                            f = 0.0f;
                            f2 = 1.0f;
                            break;
                        case 2:
                            f = -1.0f;
                            f2 = 0.0f;
                            break;
                        case 3:
                            f = 0.0f;
                            f2 = -1.0f;
                            break;
                        default:
                            f = 0.0f;
                            f2 = 0.0f;
                            break;
                    }
                    float[] fArr2 = new float[]{f, f2, 0.0f, 0.0f, -f2, f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, ((-0.5f * f) + (0.5f * f2)) + 0.5f, ((f2 * -0.5f) - (f * 0.5f)) + 0.5f, 0.0f, 1.0f};
                    float[] fArr3 = new float[16];
                    for (b = 0; b < 4; b++) {
                        for (int i = 0; i < 4; i++) {
                            float f3 = 0.0f;
                            for (int i2 = 0; i2 < 4; i2++) {
                                f3 += fArr2[(b << 2) + i2] * fArr[(i2 << 2) + i];
                            }
                            fArr3[(b << 2) + i] = f3;
                        }
                    }
                    surfaceTexture.getTimestamp();
                    ken ken = iye.f21384q;
                    if (ken.isEmpty()) {
                        iye.mo13762a(jek, fArr3, jdk);
                        iye.mo13761a(jdk);
                        jdk.mo15713b();
                        iye.f21374g.mo9175a(iye.f21383p);
                    } else {
                        iye.mo13762a(jek, iye.f21361a, iye.f21377j);
                        jdk.mo15713b();
                        jdv jdv = iye.f21376i;
                        jdk jdk2 = iye.f21379l;
                        if (0 < ken.size()) {
                            ken.get(0);
                            throw new RuntimeException("Should never be activated!");
                        }
                        boolean z;
                        jdz a = jdz.m4482a(iye.f21370c).mo9353a(iye.f21371d);
                        String str = "uImgTex";
                        if (jdv.f26560a == a.f8098d.f26560a) {
                            z = true;
                        } else {
                            z = false;
                        }
                        jri.m13395a(z);
                        a.f8101g.put(str, jdv);
                        jdz a2 = a.mo9342a("uTransform", fArr3).mo9341a("aPosition", 0).mo9341a("aTexCoord", 1);
                        a2.f8102h = false;
                        a2.mo9343a(jdk);
                        iye.mo13761a(jdk);
                        jdk.mo15713b();
                        iye.f21374g.mo9175a(iye.f21383p);
                    }
                }
            }
            iye.f21375h.mo8857b();
        } catch (Throwable th) {
            iye.f21375h.mo8857b();
        }
    }
}
