package p000;

import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.opengl.Matrix;
import android.os.HandlerThread;
import java.util.Arrays;

/* compiled from: PG */
/* renamed from: eld */
public final class eld {
    /* renamed from: a */
    public static final String f4129a = bli.m887a("SensorReader");
    /* renamed from: b */
    public boolean f4130b = true;
    /* renamed from: c */
    public bah f4131c;
    /* renamed from: d */
    public SensorManager f4132d = null;
    /* renamed from: e */
    public ejk f4133e = new ejk();
    /* renamed from: f */
    public ejk f4134f = new ejk();
    /* renamed from: g */
    public boolean f4135g = false;
    /* renamed from: h */
    public float f4136h = 0.15f;
    /* renamed from: i */
    public float[] f4137i = new float[3];
    /* renamed from: j */
    public long f4138j = 0;
    /* renamed from: k */
    public float[] f4139k = new float[3];
    /* renamed from: l */
    public float[] f4140l = new float[]{0.0f, 0.0f, 0.0f};
    /* renamed from: m */
    public int f4141m = 0;
    /* renamed from: n */
    public elc f4142n = new elc();
    /* renamed from: o */
    public float f4143o = 90.0f;
    /* renamed from: p */
    public emc f4144p = null;
    /* renamed from: q */
    public float f4145q = 0.0f;
    /* renamed from: r */
    public boolean f4146r = false;
    /* renamed from: s */
    public HandlerThread f4147s;
    /* renamed from: t */
    public final SensorEventListener f4148t = new elf(this);
    /* renamed from: u */
    private float[] f4149u = new float[16];
    /* renamed from: v */
    private double[] f4150v = new double[16];

    public eld(bah bah) {
        this.f4131c = bah;
    }

    /* renamed from: a */
    public static float[] m1903a(float[] fArr) {
        return new float[]{fArr[0], fArr[1], fArr[2], fArr[4], fArr[5], fArr[6], fArr[8], fArr[9], fArr[10]};
    }

    /* renamed from: a */
    public final float[] mo6300a() {
        float[] fArr;
        synchronized (this) {
            fArr = (float[]) this.f4139k.clone();
            float[] fArr2 = this.f4139k;
            fArr2[0] = 0.0f;
            fArr2[1] = 0.0f;
            fArr2[2] = 0.0f;
            this.f4141m = 0;
        }
        return fArr;
    }

    /* renamed from: b */
    public final float[] mo6301b() {
        int i;
        elc elc = this.f4142n;
        if (elc.f4105c != 0) {
            for (i = 0; i < 3; i++) {
                for (int i2 = 0; i2 < 3; i2++) {
                    elc.f4103a[(i2 << 2) + i] = elc.f4104b.mo6234a(i, i2);
                }
            }
            double[] dArr = elc.f4103a;
            dArr[11] = 0.0d;
            dArr[7] = 0.0d;
            dArr[3] = 0.0d;
            dArr[14] = 0.0d;
            dArr[13] = 0.0d;
            dArr[12] = 0.0d;
            dArr[15] = 1.0d;
            this.f4150v = dArr;
        }
        float[] fArr = new float[16];
        for (i = 0; i < 16; i++) {
            fArr[i] = (float) this.f4150v[i];
        }
        Matrix.rotateM(fArr, 0, 90.0f, 1.0f, 0.0f, 0.0f);
        float[] fArr2 = new float[16];
        Matrix.setIdentityM(fArr2, 0);
        Matrix.rotateM(fArr2, 0, this.f4143o, 0.0f, 0.0f, 1.0f);
        Matrix.multiplyMM(this.f4149u, 0, fArr2, 0, fArr, 0);
        return this.f4149u;
    }

    /* renamed from: c */
    public final void mo6302c() {
        Arrays.fill(this.f4140l, 0.0f);
    }

    /* renamed from: a */
    public final void mo6299a(double d) {
        double d2;
        if (d < 0.0d) {
            d2 = d + 360.0d;
        } else {
            d2 = d;
        }
        if (d2 > 360.0d) {
            d2 -= 0.012451171875d;
        }
        this.f4142n.mo6295a(d2);
    }

    /* renamed from: d */
    public final void mo6303d() {
        this.f4146r = false;
        HandlerThread handlerThread = this.f4147s;
        if (handlerThread != null) {
            handlerThread.quit();
        }
        this.f4147s = null;
        SensorManager sensorManager = this.f4132d;
        if (sensorManager != null) {
            sensorManager.unregisterListener(this.f4148t);
        }
    }
}
