package p000;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: PG */
/* renamed from: kmi */
public final class kmi extends AbstractList implements Serializable, RandomAccess {
    public static final long serialVersionUID = 0;
    /* renamed from: a */
    private final float[] f8702a;
    /* renamed from: b */
    private final int f8703b;
    /* renamed from: c */
    private final int f8704c;

    public kmi(float[] fArr) {
        this(fArr, 0, fArr.length);
    }

    private kmi(float[] fArr, int i, int i2) {
        this.f8702a = fArr;
        this.f8703b = i;
        this.f8704c = i2;
    }

    public final boolean contains(Object obj) {
        if (obj instanceof Float) {
            float[] fArr = this.f8702a;
            float floatValue = ((Float) obj).floatValue();
            int i = this.f8703b;
            int i2 = this.f8704c;
            while (i < i2) {
                if (fArr[i] == floatValue) {
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
        if (!(obj instanceof kmi)) {
            return super.equals(obj);
        }
        kmi kmi = (kmi) obj;
        int size = size();
        if (kmi.size() != size) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            if (this.f8702a[this.f8703b + i] != kmi.f8702a[kmi.f8703b + i]) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Object get(int i) {
        jri.m13390a(i, size());
        return Float.valueOf(this.f8702a[this.f8703b + i]);
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = this.f8703b; i2 < this.f8704c; i2++) {
            i = (i * 31) + Float.valueOf(this.f8702a[i2]).hashCode();
        }
        return i;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float[] fArr = this.f8702a;
        float floatValue = ((Float) obj).floatValue();
        int i = this.f8703b;
        int i2 = this.f8704c;
        while (i < i2) {
            if (fArr[i] == floatValue) {
                break;
            }
            i++;
        }
        i = -1;
        if (i >= 0) {
            return i - this.f8703b;
        }
        return -1;
    }

    public final boolean isEmpty() {
        return false;
    }

    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float[] fArr = this.f8702a;
        float floatValue = ((Float) obj).floatValue();
        int i = this.f8703b;
        int i2 = this.f8704c - 1;
        while (i2 >= i) {
            if (fArr[i2] == floatValue) {
                break;
            }
            i2--;
        }
        i2 = -1;
        if (i2 >= 0) {
            return i2 - this.f8703b;
        }
        return -1;
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        obj = (Float) obj;
        jri.m13390a(i, size());
        float[] fArr = this.f8702a;
        int i2 = this.f8703b + i;
        float f = fArr[i2];
        fArr[i2] = ((Float) jri.m13404b(obj)).floatValue();
        return Float.valueOf(f);
    }

    public final int size() {
        return this.f8704c - this.f8703b;
    }

    public final List subList(int i, int i2) {
        jri.m13394a(i, i2, size());
        if (i == i2) {
            return Collections.emptyList();
        }
        float[] fArr = this.f8702a;
        int i3 = this.f8703b;
        return new kmi(fArr, i3 + i, i3 + i2);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder(size() * 12);
        stringBuilder.append('[');
        stringBuilder.append(this.f8702a[this.f8703b]);
        int i = this.f8703b;
        while (true) {
            i++;
            if (i < this.f8704c) {
                stringBuilder.append(", ");
                stringBuilder.append(this.f8702a[i]);
            } else {
                stringBuilder.append(']');
                return stringBuilder.toString();
            }
        }
    }
}
