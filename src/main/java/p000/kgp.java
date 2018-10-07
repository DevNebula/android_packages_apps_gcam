package p000;

import java.io.Serializable;
import java.util.Iterator;

/* compiled from: PG */
/* renamed from: kgp */
final class kgp extends kgd implements Serializable {
    public static final long serialVersionUID = 0;
    /* renamed from: a */
    private final kgd f21902a;

    kgp(kgd kgd) {
        this.f21902a = (kgd) jri.m13404b((Object) kgd);
    }

    public final int compare(Object obj, Object obj2) {
        return this.f21902a.compare(obj2, obj);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof kgp)) {
            return false;
        }
        return this.f21902a.equals(((kgp) obj).f21902a);
    }

    public final int hashCode() {
        return -this.f21902a.hashCode();
    }

    /* renamed from: a */
    public final Object mo9962a(Iterable iterable) {
        return this.f21902a.mo9966b(iterable);
    }

    /* renamed from: a */
    public final Object mo9963a(Object obj, Object obj2) {
        return this.f21902a.mo9967b(obj, obj2);
    }

    /* renamed from: a */
    public final Object mo9964a(Iterator it) {
        return this.f21902a.mo9968b(it);
    }

    /* renamed from: b */
    public final Object mo9966b(Iterable iterable) {
        return this.f21902a.mo9962a(iterable);
    }

    /* renamed from: b */
    public final Object mo9967b(Object obj, Object obj2) {
        return this.f21902a.mo9963a(obj, obj2);
    }

    /* renamed from: b */
    public final Object mo9968b(Iterator it) {
        return this.f21902a.mo9964a(it);
    }

    /* renamed from: a */
    public final kgd mo9965a() {
        return this.f21902a;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f21902a);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 10);
        stringBuilder.append(valueOf);
        stringBuilder.append(".reverse()");
        return stringBuilder.toString();
    }
}
