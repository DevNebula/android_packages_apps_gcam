package p000;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: PG */
/* renamed from: kmj */
public final class kmj extends AbstractList implements Serializable, RandomAccess {
    public static final long serialVersionUID = 0;
    /* renamed from: a */
    public final int[] f8705a;
    /* renamed from: b */
    public final int f8706b;
    /* renamed from: c */
    public final int f8707c;

    private kmj(int[] iArr, int i, int i2) {
        this.f8705a = iArr;
        this.f8706b = i;
        this.f8707c = i2;
    }

    public final boolean contains(Object obj) {
        if (obj instanceof Integer) {
            int[] iArr = this.f8705a;
            int intValue = ((Integer) obj).intValue();
            int i = this.f8706b;
            int i2 = this.f8707c;
            while (i < i2) {
                if (iArr[i] == intValue) {
                    break;
                }
                i++;
            }
            i = -1;
            if (i != -1) {
                return true;
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof kmj)) {
            return super.equals(obj);
        }
        kmj kmj = (kmj) obj;
        int size = size();
        if (kmj.size() != size) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            if (this.f8705a[this.f8706b + i] != kmj.f8705a[kmj.f8706b + i]) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Object get(int i) {
        jri.m13390a(i, size());
        return Integer.valueOf(this.f8705a[this.f8706b + i]);
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = this.f8706b; i2 < this.f8707c; i2++) {
            i = (i * 31) + this.f8705a[i2];
        }
        return i;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int[] iArr = this.f8705a;
        int intValue = ((Integer) obj).intValue();
        int i = this.f8706b;
        int i2 = this.f8707c;
        while (i < i2) {
            if (iArr[i] == intValue) {
                break;
            }
            i++;
        }
        i = -1;
        if (i >= 0) {
            return i - this.f8706b;
        }
        return -1;
    }

    public final boolean isEmpty() {
        return false;
    }

    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int[] iArr = this.f8705a;
        int intValue = ((Integer) obj).intValue();
        int i = this.f8706b;
        int i2 = this.f8707c - 1;
        while (i2 >= i) {
            if (iArr[i2] == intValue) {
                break;
            }
            i2--;
        }
        i2 = -1;
        if (i2 >= 0) {
            return i2 - this.f8706b;
        }
        return -1;
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        obj = (Integer) obj;
        jri.m13390a(i, size());
        int[] iArr = this.f8705a;
        int i2 = this.f8706b + i;
        int i3 = iArr[i2];
        iArr[i2] = ((Integer) jri.m13404b(obj)).intValue();
        return Integer.valueOf(i3);
    }

    public final int size() {
        return this.f8707c - this.f8706b;
    }

    public final List subList(int i, int i2) {
        jri.m13394a(i, i2, size());
        if (i == i2) {
            return Collections.emptyList();
        }
        int[] iArr = this.f8705a;
        int i3 = this.f8706b;
        return new kmj(iArr, i3 + i, i3 + i2);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder(size() * 5);
        stringBuilder.append('[');
        stringBuilder.append(this.f8705a[this.f8706b]);
        int i = this.f8706b;
        while (true) {
            i++;
            if (i < this.f8707c) {
                stringBuilder.append(", ");
                stringBuilder.append(this.f8705a[i]);
            } else {
                stringBuilder.append(']');
                return stringBuilder.toString();
            }
        }
    }
}
