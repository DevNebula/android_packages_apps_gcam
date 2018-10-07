package p000;

/* compiled from: PG */
/* renamed from: jfj */
public final class jfj implements Comparable {
    /* renamed from: b */
    public static final jfj f8124b = new jfj(3, 0);
    /* renamed from: c */
    public static final jfj f8125c = new jfj(3, 1);
    /* renamed from: a */
    public final int f8126a;
    /* renamed from: d */
    private final int f8127d;

    static {
        jfj jfj = new jfj(2, 0);
        jfj = new jfj(3, 2);
    }

    public jfj(int i, int i2) {
        this.f8126a = i;
        this.f8127d = i2;
    }

    /* renamed from: a */
    public final int compareTo(jfj jfj) {
        int i = this.f8126a;
        int i2 = jfj.f8126a;
        if (i >= i2) {
            return i > i2 ? 1 : this.f8127d - jfj.f8127d;
        } else {
            return -1;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jfj)) {
            return false;
        }
        jfj jfj = (jfj) obj;
        if (this.f8126a == jfj.f8126a && this.f8127d == jfj.f8127d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f8126a * 31) + this.f8127d;
    }

    /* renamed from: b */
    public final boolean mo9376b(jfj jfj) {
        return compareTo(jfj) >= 0;
    }

    public final String toString() {
        int i = this.f8126a;
        int i2 = this.f8127d;
        StringBuilder stringBuilder = new StringBuilder(23);
        stringBuilder.append(i);
        stringBuilder.append(".");
        stringBuilder.append(i2);
        return stringBuilder.toString();
    }
}
