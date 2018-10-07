package p000;

import java.util.Arrays;
import java.util.Iterator;

/* compiled from: PG */
/* renamed from: jhv */
public final class jhv implements Iterable {
    /* renamed from: a */
    public final int[] f8210a;

    private jhv(int[] iArr) {
        int i = 0;
        int length = iArr.length;
        if (length == 0) {
            this.f8210a = new int[0];
            return;
        }
        int i2;
        Arrays.sort(iArr);
        int i3 = iArr[0] + 1;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            i2 = iArr[i4];
            if (i3 == i2) {
                i3 = 0;
            } else {
                i3 = 1;
            }
            i5 += i3;
            i4++;
            i3 = i2;
        }
        this.f8210a = new int[i5];
        int[] iArr2 = this.f8210a;
        i3 = iArr[0] + 1;
        length = iArr.length;
        i2 = 0;
        while (i2 < length) {
            int i6;
            i4 = iArr[i2];
            if (i3 != i4) {
                i3 = i + 1;
                iArr2[i] = i4;
                i = i4;
            } else {
                i6 = i;
                i = i3;
                i3 = i6;
            }
            i2++;
            i6 = i3;
            i3 = i;
            i = i6;
        }
    }

    /* renamed from: a */
    public final boolean mo9438a(int i) {
        return Arrays.binarySearch(this.f8210a, i) >= 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jhv)) {
            return false;
        }
        return Arrays.equals(this.f8210a, ((jhv) obj).f8210a);
    }

    /* renamed from: a */
    public static jhv m4554a(int... iArr) {
        return new jhv(Arrays.copyOf(iArr, iArr.length));
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f8210a);
    }

    public final Iterator iterator() {
        return new jhw(this);
    }

    public final String toString() {
        int length = this.f8210a.length;
        StringBuilder stringBuilder = new StringBuilder(19);
        stringBuilder.append("IntSet[");
        stringBuilder.append(length);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
