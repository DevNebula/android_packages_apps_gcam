package p000;

import android.opengl.GLES20;
import android.opengl.Matrix;
import com.google.android.apps.camera.legacy.lightcycle.panorama.LightCycle;
import java.util.Vector;

/* compiled from: PG */
/* renamed from: eko */
public final class eko extends ejn {
    /* renamed from: f */
    public Vector f17500f = new Vector();
    /* renamed from: g */
    private float[] f17501g = new float[16];
    /* renamed from: h */
    private float[] f17502h = new float[16];
    /* renamed from: i */
    private float[] f17503i = new float[16];
    /* renamed from: j */
    private float[] f17504j = new float[16];
    /* renamed from: k */
    private ejj f17505k = new ejj();
    /* renamed from: l */
    private ekn f17506l;
    /* renamed from: m */
    private elk f17507m;
    /* renamed from: n */
    private double f17508n = -1.0d;

    public eko(ekn ekn) {
        this.f17506l = ekn;
        try {
            this.f17507m = new elk();
            ejp.m1849a("photo collection");
        } catch (Throwable e) {
            kqg.f8786a.mo10213b(e);
        }
        Matrix.setIdentityM(this.f17503i, 0);
        Matrix.rotateM(this.f17503i, 0, 180.0f, 1.0f, 0.0f, 0.0f);
    }

    /* renamed from: c */
    public final int mo13157c(float[] fArr) {
        ekp ekp = new ekp();
        ekp.f4040b = (float[]) fArr.clone();
        float[] fArr2 = ekp.f4040b;
        float[] fArr3 = ekp.f4039a;
        float[] fArr4 = this.f17502h;
        fArr4[0] = fArr2[0];
        fArr4[1] = fArr2[1];
        fArr4[2] = fArr2[2];
        fArr4[3] = 0.0f;
        fArr4[4] = fArr2[3];
        fArr4[5] = fArr2[4];
        fArr4[6] = fArr2[5];
        fArr4[7] = 0.0f;
        fArr4[8] = fArr2[6];
        fArr4[9] = fArr2[7];
        fArr4[10] = fArr2[8];
        fArr4[14] = 0.0f;
        fArr4[13] = 0.0f;
        fArr4[12] = 0.0f;
        fArr4[11] = 0.0f;
        fArr4[15] = 1.0f;
        Matrix.multiplyMM(this.f17501g, 0, this.f17503i, 0, fArr4, 0);
        Matrix.transposeM(fArr3, 0, this.f17501g, 0);
        ekp.f4043e = 0.1f;
        ekp.f4046h = new ejo(C0252go.f5840am);
        LightCycle.m1320a(ekp.f4046h.f3893a);
        ekp.f4047i = new ejo(C0252go.f5840am);
        this.f17500f.add(ekp);
        return ekp.f4047i.f3893a;
    }

    /* renamed from: b */
    public final void mo6255b(float[] fArr) {
        ejn ejn = this.f17506l;
        ejq ejq = ejn.f3890e;
        boolean z = ejn.f17498l;
        boolean z2 = ejn.f17499m;
        ejn.f3889d.get(0);
        ejn = this.f17506l;
        ejn.f17498l = false;
        ejn.f17499m = true;
        ejn.f3890e = this.f17507m;
        double d = this.f17508n;
        if (d >= 0.0d) {
            this.f17508n = d + ((1.0d - d) * 0.05d);
            if (this.f17508n >= 0.95d) {
                this.f17508n = -1.0d;
            }
        }
        synchronized (this.f17500f) {
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 < this.f17500f.size()) {
                    ekp ekp = (ekp) this.f17500f.get(i2);
                    if (ekp.f4044f) {
                        float f;
                        float f2 = ekp.f4043e;
                        int i3 = ekp.f4045g;
                        float[] fArr2 = ekp.f4039a;
                        double d2 = this.f17508n;
                        if (d2 >= 0.0d) {
                            ejj ejj = ekp.f4041c;
                            ejj ejj2 = ekp.f4042d;
                            ejj ejj3 = this.f17505k;
                            double d3 = (ejj.f3879d * ejj2.f3879d) + (((ejj.f3876a * ejj2.f3876a) + (ejj.f3877b * ejj2.f3877b)) + (ejj.f3878c * ejj2.f3878c));
                            if (d3 > 1.0d || d3 < -1.0d) {
                                ejj3.mo6243a(ejj2);
                            }
                            if (d3 < 0.0d) {
                                d3 = -d3;
                                d = -1.0d;
                            } else {
                                d = 1.0d;
                            }
                            d3 = Math.acos(d3);
                            if (d3 <= 1.0E-6d) {
                                ejj3.mo6243a(ejj2);
                            } else {
                                double sin = 1.0d / Math.sin(d3);
                                double sin2 = Math.sin((1.0d - d2) * d3) * sin;
                                d = (d * Math.sin(d3 * d2)) * sin;
                                ejj3.f3876a = (ejj.f3876a * sin2) + (ejj2.f3876a * d);
                                ejj3.f3877b = (ejj.f3877b * sin2) + (ejj2.f3877b * d);
                                ejj3.f3878c = (ejj.f3878c * sin2) + (ejj2.f3878c * d);
                                ejj3.f3879d = (d * ejj2.f3879d) + (ejj.f3879d * sin2);
                            }
                            ejj ejj4 = this.f17505k;
                            fArr2 = this.f17502h;
                            float f3 = (float) ejj4.f3876a;
                            f = (float) ejj4.f3877b;
                            float f4 = (float) ejj4.f3878c;
                            float f5 = (float) ejj4.f3879d;
                            float f6 = f3 + f3;
                            float f7 = f + f;
                            float f8 = f4 + f4;
                            float f9 = f6 * f5;
                            float f10 = f7 * f5;
                            f5 *= f8;
                            f6 *= f3;
                            float f11 = f7 * f3;
                            f3 *= f8;
                            f7 *= f;
                            f *= f8;
                            f4 *= f8;
                            fArr2[0] = 1.0f - (f7 + f4);
                            fArr2[1] = f11 + f5;
                            fArr2[2] = f3 - f10;
                            fArr2[3] = 0.0f;
                            fArr2[4] = f11 - f5;
                            fArr2[5] = 1.0f - (f4 + f6);
                            fArr2[6] = f + f9;
                            fArr2[7] = 0.0f;
                            fArr2[8] = f3 + f10;
                            fArr2[9] = f - f9;
                            fArr2[10] = 1.0f - (f6 + f7);
                            fArr2[11] = 0.0f;
                            fArr2[12] = 0.0f;
                            fArr2[13] = 0.0f;
                            fArr2[14] = 0.0f;
                            fArr2[15] = 1.0f;
                        }
                        Matrix.multiplyMM(this.f17504j, 0, fArr, 0, fArr2, 0);
                        GLES20.glUseProgram(this.f17507m.f3898d);
                        i = ekp.f4046h.f3893a;
                        int i4 = ekp.f4047i.f3893a;
                        if (i != -1) {
                            this.f17506l.mo13155a(i);
                            this.f17507m.mo13161a(f2);
                            this.f17506l.mo6254a(this.f17504j);
                        } else if (i == -1) {
                            this.f17506l.mo13155a(i4);
                            this.f17507m.mo13161a(1.0f);
                            this.f17506l.mo6254a(this.f17504j);
                        } else {
                            f = (float) this.f17508n;
                            this.f17506l.mo13155a(i);
                            this.f17507m.mo13161a(1.0f - f);
                            this.f17506l.mo6254a(this.f17504j);
                            GLES20.glUseProgram(this.f17507m.f3898d);
                            this.f17506l.mo13155a(i4);
                            this.f17507m.mo13161a(f);
                            this.f17506l.mo6254a(this.f17504j);
                        }
                        if (f2 < 1.0f) {
                            if (f2 > 0.99f) {
                                ekp.f4043e = 1.0f;
                            } else {
                                ekp.f4043e += (1.0f - f2) * 0.05f;
                            }
                        }
                        if (i3 < 500) {
                            ekp.f4045g++;
                        }
                    }
                    i = i2 + 1;
                }
            }
        }
        ejn = this.f17506l;
        ejn.f17498l = z;
        ejn.f17499m = z2;
        ejn.f3890e = ejq;
    }

    /* renamed from: a */
    public final void mo6252a() {
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= this.f17500f.size()) {
                break;
            }
            ejo ejo = ((ekp) this.f17500f.get(i2)).f4046h;
            if (ejo != null) {
                ejo.mo6257d();
            }
            ejo = ((ekp) this.f17500f.get(i2)).f4047i;
            if (ejo != null) {
                ejo.mo6257d();
            }
            i = i2 + 1;
        }
        this.f17500f.clear();
        ekn ekn = this.f17506l;
        if (ekn != null) {
            ekn.mo6252a();
        }
    }

    /* renamed from: a */
    public final void mo13156a(int i, boolean z) {
        if (i < this.f17500f.size()) {
            ((ekp) this.f17500f.get(i)).f4044f = z;
        }
    }
}
