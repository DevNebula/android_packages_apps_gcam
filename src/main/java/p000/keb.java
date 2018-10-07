package p000;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;

/* compiled from: PG */
/* renamed from: keb */
final class keb implements Serializable {
    /* renamed from: a */
    public final Comparator f8612a;
    /* renamed from: b */
    public final boolean f8613b;
    /* renamed from: c */
    public final Object f8614c;
    /* renamed from: d */
    public final kcy f8615d;
    /* renamed from: e */
    public final boolean f8616e;
    /* renamed from: f */
    public final Object f8617f;
    /* renamed from: g */
    public final kcy f8618g;

    keb(Comparator comparator, boolean z, Object obj, kcy kcy, boolean z2, Object obj2, kcy kcy2) {
        int i = 1;
        this.f8612a = (Comparator) jri.m13404b((Object) comparator);
        this.f8613b = z;
        this.f8616e = z2;
        this.f8614c = obj;
        this.f8615d = (kcy) jri.m13404b((Object) kcy);
        this.f8617f = obj2;
        this.f8618g = (kcy) jri.m13404b((Object) kcy2);
        if (z) {
            comparator.compare(obj, obj);
        }
        if (z2) {
            comparator.compare(obj2, obj2);
        }
        if (z && z2) {
            boolean z3;
            int compare = comparator.compare(obj, obj2);
            if (compare <= 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            jri.m13401a(z3, "lowerEndpoint (%s) > upperEndpoint (%s)", obj, obj2);
            if (compare == 0) {
                int i2;
                if (kcy != kcy.OPEN) {
                    i2 = 1;
                } else {
                    i2 = 0;
                }
                if (kcy2 == kcy.OPEN) {
                    i = 0;
                }
                jri.m13395a(i2 | i);
            }
        }
    }

    /* renamed from: a */
    static keb m4852a(Comparator comparator) {
        return new keb(comparator, false, null, kcy.OPEN, false, null, kcy.OPEN);
    }

    /* renamed from: a */
    final boolean mo9826a(Object obj) {
        return (mo9828c(obj) || mo9827b(obj)) ? false : true;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof keb)) {
            return false;
        }
        keb keb = (keb) obj;
        if (this.f8612a.equals(keb.f8612a) && this.f8613b == keb.f8613b && this.f8616e == keb.f8616e && this.f8615d.equals(keb.f8615d) && this.f8618g.equals(keb.f8618g) && kbf.m16778b(this.f8614c, keb.f8614c) && kbf.m16778b(this.f8617f, keb.f8617f)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f8612a, this.f8614c, this.f8615d, this.f8617f, this.f8618g});
    }

    /* renamed from: a */
    final keb mo9825a(keb keb) {
        int compare;
        kcy kcy;
        Object obj;
        jri.m13404b((Object) keb);
        jri.m13395a(this.f8612a.equals(keb.f8612a));
        boolean z = this.f8613b;
        Object obj2 = this.f8614c;
        kcy kcy2 = this.f8615d;
        if (!z) {
            z = keb.f8613b;
            obj2 = keb.f8614c;
            kcy2 = keb.f8615d;
        } else if (keb.f8613b) {
            compare = this.f8612a.compare(obj2, keb.f8614c);
            if (compare < 0 || (compare == 0 && keb.f8615d == kcy.OPEN)) {
                obj2 = keb.f8614c;
                kcy2 = keb.f8615d;
            }
        }
        boolean z2 = this.f8616e;
        Object obj3 = this.f8617f;
        kcy kcy3 = this.f8618g;
        if (!z2) {
            z2 = keb.f8616e;
            obj3 = keb.f8617f;
            kcy3 = keb.f8618g;
        } else if (keb.f8616e) {
            compare = this.f8612a.compare(obj3, keb.f8617f);
            if (compare > 0 || (compare == 0 && keb.f8618g == kcy.OPEN)) {
                obj3 = keb.f8617f;
                kcy3 = keb.f8618g;
            }
        }
        if (!z) {
            kcy = kcy2;
            obj = obj2;
        } else if (z2) {
            compare = this.f8612a.compare(obj2, obj3);
            if (compare <= 0) {
                if (compare != 0) {
                    kcy = kcy2;
                    obj = obj2;
                } else if (kcy2 != kcy.OPEN) {
                    kcy = kcy2;
                    obj = obj2;
                } else if (kcy3 != kcy.OPEN) {
                    kcy = kcy2;
                    obj = obj2;
                }
            }
            kcy2 = kcy.OPEN;
            kcy3 = kcy.CLOSED;
            kcy = kcy2;
            obj = obj3;
        } else {
            kcy = kcy2;
            obj = obj2;
        }
        return new keb(this.f8612a, z, obj, kcy, z2, obj3, kcy3);
    }

    public final String toString() {
        char c;
        Object obj;
        char c2;
        String valueOf = String.valueOf(this.f8612a);
        if (this.f8615d == kcy.CLOSED) {
            c = '[';
        } else {
            c = '(';
        }
        if (this.f8613b) {
            obj = this.f8614c;
        } else {
            obj = "-∞";
        }
        String valueOf2 = String.valueOf(obj);
        if (this.f8616e) {
            obj = this.f8617f;
        } else {
            obj = "∞";
        }
        String valueOf3 = String.valueOf(obj);
        if (this.f8618g == kcy.CLOSED) {
            c2 = ']';
        } else {
            c2 = ')';
        }
        int length = String.valueOf(valueOf).length();
        StringBuilder stringBuilder = new StringBuilder(((length + 4) + String.valueOf(valueOf2).length()) + String.valueOf(valueOf3).length());
        stringBuilder.append(valueOf);
        stringBuilder.append(":");
        stringBuilder.append(c);
        stringBuilder.append(valueOf2);
        stringBuilder.append(',');
        stringBuilder.append(valueOf3);
        stringBuilder.append(c2);
        return stringBuilder.toString();
    }

    /* renamed from: b */
    final boolean mo9827b(Object obj) {
        int i = 1;
        if (!this.f8616e) {
            return false;
        }
        int i2;
        int compare = this.f8612a.compare(obj, this.f8617f);
        if (compare > 0) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        if (compare == 0) {
            compare = 1;
        } else {
            compare = 0;
        }
        if (this.f8618g != kcy.OPEN) {
            i = 0;
        }
        return i2 | (compare & i);
    }

    /* renamed from: c */
    final boolean mo9828c(Object obj) {
        int i = 1;
        if (!this.f8613b) {
            return false;
        }
        int i2;
        int compare = this.f8612a.compare(obj, this.f8614c);
        if (compare < 0) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        if (compare == 0) {
            compare = 1;
        } else {
            compare = 0;
        }
        if (this.f8615d != kcy.OPEN) {
            i = 0;
        }
        return i2 | (compare & i);
    }
}
