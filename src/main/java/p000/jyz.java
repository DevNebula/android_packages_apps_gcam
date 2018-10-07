package p000;

import java.lang.reflect.Array;
import java.util.ArrayList;

/* compiled from: PG */
/* renamed from: jyz */
public final class jyz {
    /* renamed from: a */
    public final jzd f8448a = new jzd(this.f8452e.length);
    /* renamed from: b */
    public final int f8449b;
    /* renamed from: c */
    public final int f8450c;
    /* renamed from: d */
    public final boolean f8451d;
    /* renamed from: e */
    public final float[][] f8452e;

    public jyz(int i, int i2, boolean z) {
        this.f8449b = i;
        this.f8450c = i2;
        this.f8451d = z;
        int i3 = (this.f8449b * this.f8450c) + 2;
        this.f8452e = (float[][]) Array.newInstance(Float.TYPE, new int[]{i3, i3});
    }

    /* renamed from: a */
    public static ArrayList m4763a(int i, int i2, boolean z) {
        ArrayList arrayList = new ArrayList();
        for (int i3 = i - 1; i3 <= i + 1; i3 += 2) {
            int b = jyz.m4764b(i3, i2, z);
            if (b >= 0) {
                arrayList.add(Integer.valueOf(b));
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    public static int m4764b(int i, int i2, boolean z) {
        if (z) {
            return i % i2;
        }
        return (i < 0 || i >= i2) ? -1 : i;
    }
}
