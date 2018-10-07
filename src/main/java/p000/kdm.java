package p000;

import java.io.Serializable;
import java.util.Comparator;

/* compiled from: PG */
/* renamed from: kdm */
final class kdm extends kgd implements Serializable {
    public static final long serialVersionUID = 0;
    /* renamed from: a */
    private final Comparator f21874a;

    kdm(Comparator comparator) {
        this.f21874a = (Comparator) jri.m13404b((Object) comparator);
    }

    public final int compare(Object obj, Object obj2) {
        return this.f21874a.compare(obj, obj2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof kdm)) {
            return false;
        }
        return this.f21874a.equals(((kdm) obj).f21874a);
    }

    public final int hashCode() {
        return this.f21874a.hashCode();
    }

    public final String toString() {
        return this.f21874a.toString();
    }
}
