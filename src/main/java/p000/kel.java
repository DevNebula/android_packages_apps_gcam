package p000;

import java.util.Collection;
import java.util.EnumSet;
import java.util.Iterator;

/* compiled from: PG */
/* renamed from: kel */
final class kel extends keu {
    /* renamed from: a */
    private final transient EnumSet f24908a;
    /* renamed from: b */
    private transient int f24909b;

    kel(EnumSet enumSet) {
        this.f24908a = enumSet;
    }

    /* renamed from: a */
    static keu m16829a(EnumSet enumSet) {
        switch (enumSet.size()) {
            case 0:
                return kgn.f24941a;
            case 1:
                Iterator it = enumSet.iterator();
                Object next = it.next();
                if (!it.hasNext()) {
                    return keu.m13727a(next);
                }
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("expected one element but was: <");
                stringBuilder.append(next);
                for (int i = 0; i < 4 && it.hasNext(); i++) {
                    stringBuilder.append(", ");
                    stringBuilder.append(it.next());
                }
                if (it.hasNext()) {
                    stringBuilder.append(", ...");
                }
                stringBuilder.append('>');
                throw new IllegalArgumentException(stringBuilder.toString());
            default:
                return new kel(enumSet);
        }
    }

    public final boolean contains(Object obj) {
        return this.f24908a.contains(obj);
    }

    public final boolean containsAll(Collection collection) {
        if (collection instanceof kel) {
            collection = ((kel) collection).f24908a;
        }
        return this.f24908a.containsAll(collection);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof kel) {
            obj = ((kel) obj).f24908a;
        }
        return this.f24908a.equals(obj);
    }

    public final int hashCode() {
        int i = this.f24909b;
        if (i != 0) {
            return i;
        }
        i = this.f24908a.hashCode();
        this.f24909b = i;
        return i;
    }

    public final boolean isEmpty() {
        return this.f24908a.isEmpty();
    }

    /* renamed from: d */
    final boolean mo14002d() {
        return true;
    }

    /* renamed from: b */
    final boolean mo9836b() {
        return false;
    }

    /* renamed from: c */
    public final khy iterator() {
        return khb.m4961d(this.f24908a.iterator());
    }

    public final int size() {
        return this.f24908a.size();
    }

    public final String toString() {
        return this.f24908a.toString();
    }

    final Object writeReplace() {
        return new kem(this.f24908a);
    }
}
