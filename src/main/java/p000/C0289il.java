package p000;

/* compiled from: PG */
/* renamed from: il */
public final class C0289il {
    /* renamed from: a */
    public static final int[] f7438a = new int[0];
    /* renamed from: b */
    public static final Object[] f7439b = new Object[0];

    /* renamed from: a */
    public static int m3867a(int[] iArr, int i, int i2) {
        int i3 = i - 1;
        int i4 = 0;
        while (i4 <= i3) {
            int i5 = (i4 + i3) >>> 1;
            int i6 = iArr[i5];
            if (i6 < i2) {
                i4 = i5 + 1;
            } else if (i6 <= i2) {
                return i5;
            } else {
                i3 = i5 - 1;
            }
        }
        return i4 ^ -1;
    }

    /* renamed from: a */
    public static int m3868a(long[] jArr, int i, long j) {
        int i2 = i - 1;
        int i3 = 0;
        while (i3 <= i2) {
            int i4 = (i3 + i2) >>> 1;
            long j2 = jArr[i4];
            if (j2 < j) {
                i3 = i4 + 1;
            } else if (j2 <= j) {
                return i4;
            } else {
                i2 = i4 - 1;
            }
        }
        return i3 ^ -1;
    }

    /* renamed from: a */
    public static boolean m3869a(Object obj, Object obj2) {
        boolean z = true;
        if (obj != obj2) {
            if (obj == null) {
                z = false;
            } else if (!obj.equals(obj2)) {
                return false;
            }
        }
        return z;
    }

    /* renamed from: c */
    private static int m3871c(int i) {
        int i2 = 4;
        while (true) {
            int i3 = i2;
            if (i3 >= 32) {
                return i;
            }
            i2 = (1 << i3) - 12;
            if (i <= i2) {
                return i2;
            }
            i2 = i3 + 1;
        }
    }

    /* renamed from: a */
    public static int m3866a(int i) {
        return C0289il.m3871c(i << 2) / 4;
    }

    /* renamed from: b */
    public static int m3870b(int i) {
        return C0289il.m3871c(i << 3) / 8;
    }
}
