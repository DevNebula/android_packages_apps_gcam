package p000;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: PG */
/* renamed from: kmh */
public final class kmh extends AbstractList implements Serializable, RandomAccess {
    public static final long serialVersionUID = 0;
    /* renamed from: a */
    private final boolean[] f8699a;
    /* renamed from: b */
    private final int f8700b;
    /* renamed from: c */
    private final int f8701c;

    public kmh(boolean[] zArr) {
        this(zArr, 0, zArr.length);
    }

    private kmh(boolean[] zArr, int i, int i2) {
        this.f8699a = zArr;
        this.f8700b = i;
        this.f8701c = i2;
    }

    public final boolean contains(Object obj) {
        if (obj instanceof Boolean) {
            boolean[] zArr = this.f8699a;
            boolean booleanValue = ((Boolean) obj).booleanValue();
            int i = this.f8700b;
            int i2 = this.f8701c;
            while (i < i2) {
                if (zArr[i] == booleanValue) {
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
        if (!(obj instanceof kmh)) {
            return super.equals(obj);
        }
        kmh kmh = (kmh) obj;
        int size = size();
        if (kmh.size() != size) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            if (this.f8699a[this.f8700b + i] != kmh.f8699a[kmh.f8700b + i]) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Object get(int i) {
        jri.m13390a(i, size());
        return Boolean.valueOf(this.f8699a[this.f8700b + i]);
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = this.f8700b; i2 < this.f8701c; i2++) {
            int i3 = i * 31;
            if (this.f8699a[i2]) {
                i = 1231;
            } else {
                i = 1237;
            }
            i += i3;
        }
        return i;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean[] zArr = this.f8699a;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        int i = this.f8700b;
        int i2 = this.f8701c;
        while (i < i2) {
            if (zArr[i] == booleanValue) {
                break;
            }
            i++;
        }
        i = -1;
        if (i >= 0) {
            return i - this.f8700b;
        }
        return -1;
    }

    public final boolean isEmpty() {
        return false;
    }

    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean[] zArr = this.f8699a;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        int i = this.f8700b;
        int i2 = this.f8701c - 1;
        while (i2 >= i) {
            if (zArr[i2] == booleanValue) {
                break;
            }
            i2--;
        }
        i2 = -1;
        if (i2 >= 0) {
            return i2 - this.f8700b;
        }
        return -1;
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        obj = (Boolean) obj;
        jri.m13390a(i, size());
        boolean[] zArr = this.f8699a;
        int i2 = this.f8700b + i;
        boolean z = zArr[i2];
        zArr[i2] = ((Boolean) jri.m13404b(obj)).booleanValue();
        return Boolean.valueOf(z);
    }

    public final int size() {
        return this.f8701c - this.f8700b;
    }

    public final List subList(int i, int i2) {
        jri.m13394a(i, i2, size());
        if (i == i2) {
            return Collections.emptyList();
        }
        boolean[] zArr = this.f8699a;
        int i3 = this.f8700b;
        return new kmh(zArr, i3 + i, i3 + i2);
    }

    public final String toString() {
        String str;
        StringBuilder stringBuilder = new StringBuilder(size() * 7);
        if (this.f8699a[this.f8700b]) {
            str = "[true";
        } else {
            str = "[false";
        }
        stringBuilder.append(str);
        int i = this.f8700b;
        while (true) {
            i++;
            if (i < this.f8701c) {
                String str2;
                if (this.f8699a[i]) {
                    str2 = ", true";
                } else {
                    str2 = ", false";
                }
                stringBuilder.append(str2);
            } else {
                stringBuilder.append(']');
                return stringBuilder.toString();
            }
        }
    }
}
