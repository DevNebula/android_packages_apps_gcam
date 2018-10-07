package p000;

import java.util.Arrays;
import java.util.Locale;

/* compiled from: PG */
/* renamed from: izu */
public class izu {
    /* renamed from: a */
    public final int[] f7958a;

    protected izu(int[] iArr) {
        boolean z;
        int i = 0;
        jri.m13404b((Object) iArr);
        int length = iArr.length;
        if (length > 0) {
            z = true;
        } else {
            z = false;
        }
        jri.m13395a(z);
        while (i < length) {
            int i2 = iArr[i];
            if (i2 >= 0) {
                i++;
            } else {
                StringBuilder stringBuilder = new StringBuilder(33);
                stringBuilder.append("One dimension is < 0: ");
                stringBuilder.append(i2);
                throw new IllegalArgumentException(stringBuilder.toString());
            }
        }
        this.f7958a = (int[]) iArr.clone();
    }

    /* renamed from: a */
    public final izv mo9244a() {
        int[] iArr = this.f7958a;
        int length = iArr.length;
        if (length == 2) {
            return izu.m4426a(iArr[0], mo9245b());
        }
        StringBuilder stringBuilder = new StringBuilder(46);
        stringBuilder.append("Attempting to convert ");
        stringBuilder.append(length);
        stringBuilder.append("D size to 2D!");
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof izu)) {
            return false;
        }
        return Arrays.equals(this.f7958a, ((izu) obj).f7958a);
    }

    /* renamed from: a */
    public static izv m4426a(int i, int i2) {
        return new izv(i, i2);
    }

    public int hashCode() {
        return Arrays.hashCode(this.f7958a);
    }

    /* renamed from: b */
    public final int mo9245b() {
        int[] iArr = this.f7958a;
        return iArr.length > 1 ? iArr[1] : 1;
    }

    public String toString() {
        int i = 0;
        Locale locale = Locale.ENGLISH;
        Object[] objArr = new Object[2];
        objArr[0] = Arrays.toString(this.f7958a);
        int[] iArr = this.f7958a;
        if (iArr.length != 0) {
            i = iArr[0];
            int i2 = 1;
            while (true) {
                int[] iArr2 = this.f7958a;
                if (i2 >= iArr2.length) {
                    break;
                }
                i *= iArr2[i2];
                i2++;
            }
        }
        objArr[1] = Integer.valueOf(i);
        return String.format(locale, "Dimensions = %s, Volume = %d)", objArr);
    }
}
