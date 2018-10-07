package p000;

import android.opengl.Matrix;
import java.nio.FloatBuffer;
import java.nio.ShortBuffer;
import java.util.Vector;

/* compiled from: PG */
/* renamed from: ejn */
public abstract class ejn {
    /* renamed from: a */
    public FloatBuffer f3886a = null;
    /* renamed from: b */
    public FloatBuffer f3887b = null;
    /* renamed from: c */
    public ShortBuffer f3888c = null;
    /* renamed from: d */
    public Vector f3889d = new Vector();
    /* renamed from: e */
    public ejq f3890e = null;
    /* renamed from: f */
    private float[] f3891f = new float[16];
    /* renamed from: g */
    private float[] f3892g = new float[16];

    public ejn() {
        Matrix.setIdentityM(this.f3891f, 0);
    }

    /* renamed from: b */
    public abstract void mo6255b(float[] fArr);

    /* renamed from: a */
    public void mo6254a(float[] fArr) {
        Matrix.multiplyMM(this.f3892g, 0, fArr, 0, this.f3891f, 0);
        mo6255b(this.f3892g);
    }

    /* renamed from: a */
    public void mo6252a() {
    }

    /* renamed from: a */
    public final void mo6253a(int i, float f, float f2) {
        int i2 = i * 3;
        int i3 = i2 + 1;
        this.f3886a.put(i2, f);
        this.f3886a.put(i3, -1.7f);
        this.f3886a.put(i3 + 1, f2);
    }
}
