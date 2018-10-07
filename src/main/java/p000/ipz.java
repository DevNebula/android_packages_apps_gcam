package p000;

import android.graphics.Rect;
import java.math.BigInteger;
import java.util.Arrays;

/* compiled from: PG */
/* renamed from: ipz */
public final class ipz {
    /* renamed from: a */
    public static final ipz f7669a = ipz.m4076a(4, 3);
    /* renamed from: b */
    public static final ipz f7670b = ipz.m4076a(16, 9);
    /* renamed from: c */
    public final int f7671c;
    /* renamed from: d */
    public final int f7672d;

    private ipz(int i, int i2) {
        this.f7671c = i;
        this.f7672d = i2;
    }

    /* renamed from: a */
    public final ipz mo8750a() {
        if (this.f7671c < this.f7672d) {
            return m4079d();
        }
        return this;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ipz)) {
            return false;
        }
        ipz ipz = (ipz) obj;
        if (this.f7672d == ipz.f7672d && this.f7671c == ipz.f7671c) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final Rect mo8748a(Rect rect) {
        ipz a = ipz.m4076a(rect.width(), rect.height());
        int width;
        int height;
        if (this.f7671c * a.f7672d > a.f7671c * this.f7672d) {
            width = (rect.width() * this.f7672d) / this.f7671c;
            height = ((rect.height() - width) / 2) + rect.top;
            return new Rect(rect.left, height, rect.left + rect.width(), width + height);
        }
        width = (rect.height() * this.f7671c) / this.f7672d;
        height = ((rect.width() - width) / 2) + rect.left;
        return new Rect(height, rect.top, width + height, rect.top + rect.height());
    }

    /* renamed from: a */
    public final Rect mo8749a(iqp iqp) {
        return mo8748a(new Rect(0, 0, iqp.f7695a, iqp.f7696b));
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f7671c), Integer.valueOf(this.f7672d)});
    }

    /* renamed from: a */
    public final boolean mo8751a(ipz ipz) {
        return ((double) Math.abs(mo8752b() - ipz.mo8753b(this).mo8752b())) < 0.025d;
    }

    /* renamed from: c */
    private final boolean m4078c() {
        return this.f7671c <= this.f7672d;
    }

    /* renamed from: a */
    public static ipz m4076a(int i, int i2) {
        int intValue = BigInteger.valueOf((long) i).gcd(BigInteger.valueOf((long) i2)).intValue();
        return new ipz(i / intValue, i2 / intValue);
    }

    /* renamed from: b */
    public static ipz m4077b(iqp iqp) {
        return ipz.m4076a(iqp.f7695a, iqp.f7696b);
    }

    /* renamed from: b */
    public final float mo8752b() {
        return ((float) this.f7671c) / ((float) this.f7672d);
    }

    public final String toString() {
        return String.format(null, "AspectRatio[%d:%d]", new Object[]{Integer.valueOf(this.f7671c), Integer.valueOf(this.f7672d)});
    }

    /* renamed from: d */
    private final ipz m4079d() {
        return ipz.m4076a(this.f7672d, this.f7671c);
    }

    /* renamed from: b */
    public final ipz mo8753b(ipz ipz) {
        if (!ipz.m4078c()) {
            return mo8750a();
        }
        if (m4078c()) {
            return this;
        }
        return m4079d();
    }
}
