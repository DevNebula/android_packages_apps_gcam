package p000;

/* compiled from: PG */
/* renamed from: hrz */
public final class hrz {
    /* renamed from: a */
    public static final String f6900a = bli.m887a("BlurStack");
    /* renamed from: b */
    public float[] f6901b;
    /* renamed from: c */
    public hsc[] f6902c;
    /* renamed from: d */
    public int f6903d;

    /* renamed from: a */
    public final int mo8078a(int i, int i2) {
        return this.f6902c[i].f6926b + i2;
    }

    /* renamed from: a */
    public final float mo8077a(int i) {
        return this.f6901b[i - 1];
    }

    /* renamed from: a */
    public static float m3378a() {
        return 25.0f;
    }

    /* renamed from: b */
    public final int mo8079b(int i) {
        hsc hsc = this.f6902c[i];
        return (hsc.f6925a - hsc.f6926b) + 1;
    }

    /* renamed from: c */
    public static int m3379c(int i) {
        return 64 - (i / 4);
    }

    /* renamed from: d */
    public static int m3380d(int i) {
        return (64 - i) << 2;
    }

    public final String toString() {
        String valueOf = String.valueOf("disparity range: 64, 1\n");
        hsc hsc = this.f6902c[this.f6903d];
        int i = hsc.f6925a;
        int i2 = hsc.f6926b;
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 42);
        stringBuilder.append(valueOf);
        stringBuilder.append("focus disparity: ");
        stringBuilder.append(i);
        stringBuilder.append(", ");
        stringBuilder.append(i2);
        stringBuilder.append("\n");
        valueOf = String.valueOf(stringBuilder.toString());
        i2 = this.f6902c.length;
        StringBuilder stringBuilder2 = new StringBuilder(String.valueOf(valueOf).length() + 27);
        stringBuilder2.append(valueOf);
        stringBuilder2.append("num of layers: ");
        stringBuilder2.append(i2);
        stringBuilder2.append("\n");
        valueOf = String.valueOf(stringBuilder2.toString());
        i2 = this.f6903d;
        stringBuilder2 = new StringBuilder(String.valueOf(valueOf).length() + 25);
        stringBuilder2.append(valueOf);
        stringBuilder2.append("focus layer: ");
        stringBuilder2.append(i2);
        stringBuilder2.append("\n");
        String stringBuilder3 = stringBuilder2.toString();
        int i3 = 0;
        while (true) {
            hsc[] hscArr = this.f6902c;
            if (i3 >= hscArr.length) {
                return stringBuilder3;
            }
            hsc hsc2 = hscArr[i3];
            i = hsc2.f6925a;
            int i4 = hsc2.f6926b;
            stringBuilder3 = String.valueOf(stringBuilder3);
            StringBuilder stringBuilder4 = new StringBuilder(String.valueOf(stringBuilder3).length() + 50);
            stringBuilder4.append(stringBuilder3);
            stringBuilder4.append("\nlayer ");
            stringBuilder4.append(i3);
            stringBuilder4.append(" num of disparities ");
            stringBuilder4.append((i - i4) + 1);
            stringBuilder4.append("\n");
            stringBuilder3 = stringBuilder4.toString();
            while (i >= i4) {
                stringBuilder3 = String.valueOf(stringBuilder3);
                float a = mo8077a(i);
                StringBuilder stringBuilder5 = new StringBuilder(String.valueOf(stringBuilder3).length() + 68);
                stringBuilder5.append(stringBuilder3);
                stringBuilder5.append("layer ");
                stringBuilder5.append(i3);
                stringBuilder5.append(" disparity ");
                stringBuilder5.append(i);
                stringBuilder5.append(" disk radius ");
                stringBuilder5.append(a);
                stringBuilder5.append("\n");
                i--;
                stringBuilder3 = stringBuilder5.toString();
            }
            i3++;
        }
    }
}
