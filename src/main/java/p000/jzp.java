package p000;

import java.util.Objects;

/* compiled from: PG */
/* renamed from: jzp */
public final class jzp {
    /* renamed from: a */
    public final int f8515a;
    /* renamed from: b */
    public final int f8516b;

    public jzp(int i, int i2) {
        this.f8515a = i;
        this.f8516b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jzp)) {
            return false;
        }
        jzp jzp = (jzp) obj;
        if (this.f8515a == jzp.f8515a && this.f8516b == jzp.f8516b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{Integer.valueOf(this.f8515a), Integer.valueOf(this.f8516b)});
    }

    /* renamed from: a */
    public static jzp m4772a(int i, int i2) {
        return new jzp(i, i2);
    }

    /* renamed from: a */
    public static jzp m4773a(jqs jqs) {
        return new jzp(jqs.mo9534b(), jqs.mo9533a());
    }

    public final String toString() {
        return String.format("Size(%d, %d)", new Object[]{Integer.valueOf(this.f8515a), Integer.valueOf(this.f8516b)});
    }
}
