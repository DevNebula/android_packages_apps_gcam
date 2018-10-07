package p000;

import java.util.Arrays;
import java.util.Objects;

/* compiled from: PG */
/* renamed from: jce */
public final class jce {
    /* renamed from: a */
    private final int f8055a;
    /* renamed from: b */
    private final int[] f8056b;
    /* renamed from: c */
    private final int[] f8057c;
    /* renamed from: d */
    private final jcg f8058d;
    /* renamed from: e */
    private final boolean f8059e;

    public jce(jcg jcg, int i, int[] iArr) {
        this(jcg, i, iArr, (byte) 0);
    }

    private jce(jcg jcg, int i, int[] iArr, byte b) {
        boolean z = false;
        this.f8055a = i;
        this.f8056b = iArr;
        this.f8057c = new int[r3];
        this.f8058d = jcg;
        if (jcg.mo9320a() % 8 == 0 && i % 8 == 0) {
            for (int i2 : iArr) {
                if (i2 % 8 != 0) {
                    break;
                }
            }
            z = true;
        }
        this.f8059e = z;
        Arrays.fill(this.f8057c, 1);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jce)) {
            return false;
        }
        jce jce = (jce) obj;
        if (this.f8055a == jce.f8055a && this.f8059e == jce.f8059e && Arrays.equals(this.f8056b, jce.f8056b) && Arrays.equals(this.f8057c, jce.f8057c) && Objects.equals(this.f8058d, jce.f8058d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((((this.f8055a * 31) + Arrays.hashCode(this.f8056b)) * 31) + Arrays.hashCode(this.f8057c)) * 31) + this.f8058d.hashCode()) * 31) + this.f8059e;
    }

    public final String toString() {
        String d = this.f8058d.mo9323d();
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(d).length() + 9);
        stringBuilder.append("Channel[");
        stringBuilder.append(d);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
