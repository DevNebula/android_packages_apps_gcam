package p000;

import android.content.Context;
import com.google.android.apps.camera.legacy.lightcycle.panorama.LightCycle;
import com.google.android.apps.lightcycle.panorama.NewTarget;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: PG */
/* renamed from: ekt */
public final class ekt {
    /* renamed from: a */
    public static final float f4062a = 0.38397244f;
    /* renamed from: b */
    public static final float f4063b = 0.20943952f;
    /* renamed from: c */
    public final Context f4064c;
    /* renamed from: d */
    public final Map f4065d = Collections.synchronizedMap(new TreeMap());
    /* renamed from: e */
    public ejt f4066e;
    /* renamed from: f */
    public ejt f4067f;
    /* renamed from: g */
    public elj f4068g;
    /* renamed from: h */
    public eli f4069h;
    /* renamed from: i */
    public final float[] f4070i = new float[]{0.0f, 0.0f, -1.0f, 1.0f};
    /* renamed from: j */
    public final float[] f4071j = new float[4];
    /* renamed from: k */
    public final float[] f4072k = new float[16];
    /* renamed from: l */
    public float[] f4073l = null;
    /* renamed from: m */
    public float f4074m;
    /* renamed from: n */
    public float f4075n;
    /* renamed from: o */
    public float f4076o = 0.0f;
    /* renamed from: p */
    public boolean f4077p = false;
    /* renamed from: q */
    public eld f4078q = null;
    /* renamed from: r */
    public final eku f4079r = new eku();
    /* renamed from: s */
    public boolean f4080s = true;
    /* renamed from: t */
    public boolean f4081t = true;
    /* renamed from: u */
    public float f4082u = 0.1f;
    /* renamed from: v */
    public long f4083v = 0;
    /* renamed from: w */
    public final float[] f4084w = new float[16];
    /* renamed from: x */
    public eks f4085x;

    public ekt(Context context) {
        this.f4064c = context;
    }

    /* renamed from: a */
    public final void mo6289a() {
        NewTarget[] i = LightCycle.m1338i();
        Object obj = new float[16];
        this.f4065d.clear();
        if (i != null) {
            for (NewTarget newTarget : i) {
                ekt.m1889a(newTarget.orientation, obj);
                this.f4065d.put(Integer.valueOf(newTarget.key), (float[]) obj.clone());
            }
        }
    }

    /* renamed from: a */
    public final void mo6291a(float[] fArr) {
        mo6292b();
        NewTarget[] b = LightCycle.m1329b(fArr);
        if (b != null) {
            int length = b.length;
            for (int i = 0; i < length; i++) {
                Object obj = new float[16];
                ekt.m1889a(b[i].orientation, obj);
                this.f4065d.put(Integer.valueOf(b[i].key), obj);
            }
        }
        this.f4080s = true;
        this.f4081t = true;
        this.f4082u = 0.1f;
        this.f4083v = 0;
    }

    /* renamed from: b */
    public static void m1890b(float[] fArr) {
        fArr[0] = fArr[0] / fArr[3];
        fArr[1] = fArr[1] / fArr[3];
        fArr[2] = fArr[2] / fArr[3];
        fArr[3] = 1.0f;
    }

    /* renamed from: b */
    public final void mo6292b() {
        this.f4065d.clear();
        LightCycle.m1342m();
    }

    /* renamed from: a */
    public final void mo6290a(int i) {
        boolean z = true;
        if (!(i == 3 || i == 4)) {
            z = false;
        }
        this.f4077p = z;
    }

    /* renamed from: a */
    private static void m1889a(float[] fArr, float[] fArr2) {
        fArr2[0] = fArr[0];
        fArr2[1] = fArr[1];
        fArr2[2] = fArr[2];
        fArr2[3] = 0.0f;
        fArr2[4] = fArr[3];
        fArr2[5] = fArr[4];
        fArr2[6] = fArr[5];
        fArr2[7] = 0.0f;
        fArr2[8] = fArr[6];
        fArr2[9] = fArr[7];
        fArr2[10] = fArr[8];
        fArr2[11] = 0.0f;
        fArr2[12] = 0.0f;
        fArr2[13] = 0.0f;
        fArr2[14] = 0.0f;
        fArr2[15] = 1.0f;
    }
}
