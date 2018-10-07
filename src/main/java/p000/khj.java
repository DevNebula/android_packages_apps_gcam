package p000;

import java.util.Set;

/* compiled from: PG */
/* renamed from: khj */
class khj extends khd implements Set {
    public static final long serialVersionUID = 0;

    khj(Set set, Object obj) {
        super(set, obj);
    }

    /* renamed from: c */
    Set mo14063b() {
        return (Set) super.mo9985a();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        boolean equals;
        synchronized (this.f8653a) {
            equals = mo14063b().equals(obj);
        }
        return equals;
    }

    public int hashCode() {
        int hashCode;
        synchronized (this.f8653a) {
            hashCode = mo14063b().hashCode();
        }
        return hashCode;
    }
}
