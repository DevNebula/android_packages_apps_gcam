package p000;

import java.io.Serializable;

/* compiled from: PG */
/* renamed from: kge */
public final class kge extends kgf implements Serializable, kbj {
    /* renamed from: c */
    private static final kge f21894c = new kge(kdq.f21876b, kdo.f21875b);
    public static final long serialVersionUID = 0;
    /* renamed from: a */
    public final kdn f21895a;
    /* renamed from: b */
    public final kdn f21896b;

    private kge(kdn kdn, kdn kdn2) {
        this.f21895a = (kdn) jri.m13404b((Object) kdn);
        this.f21896b = (kdn) jri.m13404b((Object) kdn2);
        if (kdn.compareTo(kdn2) > 0 || kdn == kdo.f21875b || kdn2 == kdq.f21876b) {
            String valueOf = String.valueOf(kge.m13753b(kdn, kdn2));
            String str = "Invalid range: ";
            if (valueOf.length() == 0) {
                valueOf = new String(str);
            } else {
                valueOf = str.concat(valueOf);
            }
            throw new IllegalArgumentException(valueOf);
        }
    }

    /* renamed from: a */
    public static kge m13749a(Comparable comparable) {
        return kge.m13751a(kdn.m4845a(comparable), kdo.f21875b);
    }

    /* renamed from: a */
    public static kge m13750a(Comparable comparable, Comparable comparable2) {
        return kge.m13751a(kdn.m4845a(comparable), new kdp(comparable2));
    }

    /* renamed from: b */
    static int m13752b(Comparable comparable, Comparable comparable2) {
        return comparable.compareTo(comparable2);
    }

    /* renamed from: b */
    public final boolean mo9713a(Comparable comparable) {
        jri.m13404b((Object) comparable);
        return this.f21895a.mo9815b(comparable) && !this.f21896b.mo9815b(comparable);
    }

    /* renamed from: a */
    private static kge m13751a(kdn kdn, kdn kdn2) {
        return new kge(kdn, kdn2);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof kge)) {
            return false;
        }
        kge kge = (kge) obj;
        if (this.f21895a.equals(kge.f21895a) && this.f21896b.equals(kge.f21896b)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final boolean mo14038a() {
        return this.f21896b != kdo.f21875b;
    }

    public final int hashCode() {
        return (this.f21895a.hashCode() * 31) + this.f21896b.hashCode();
    }

    final Object readResolve() {
        if (equals(f21894c)) {
            return f21894c;
        }
        return this;
    }

    public final String toString() {
        return kge.m13753b(this.f21895a, this.f21896b);
    }

    /* renamed from: b */
    private static String m13753b(kdn kdn, kdn kdn2) {
        StringBuilder stringBuilder = new StringBuilder(16);
        kdn.mo9813a(stringBuilder);
        stringBuilder.append("..");
        kdn2.mo9814b(stringBuilder);
        return stringBuilder.toString();
    }
}
