package p000;

import android.util.SparseIntArray;

/* compiled from: PG */
/* renamed from: sx */
public abstract class C0485sx {
    /* renamed from: a */
    public final SparseIntArray f9744a = new SparseIntArray();

    /* renamed from: a */
    public abstract int mo11115a(int i);

    /* renamed from: b */
    public final int mo11117b(int i, int i2) {
        int a = mo11115a(i);
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            int a2 = mo11115a(i5);
            i4 += a2;
            if (i4 == i2) {
                i3++;
                i4 = 0;
            } else if (i4 > i2) {
                i3++;
                i4 = a2;
            }
        }
        if (i4 + a > i2) {
            return i3 + 1;
        }
        return i3;
    }

    /* renamed from: a */
    public int mo11116a(int i, int i2) {
        int a = mo11115a(i);
        if (a == i2) {
            return 0;
        }
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            int a2 = mo11115a(i3);
            i4 += a2;
            if (i4 == i2) {
                a2 = 0;
            } else if (i4 <= i2) {
                a2 = i4;
            }
            i3++;
            i4 = a2;
        }
        if (i4 + a <= i2) {
            return i4;
        }
        return 0;
    }
}
