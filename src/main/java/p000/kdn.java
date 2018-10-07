package p000;

import java.io.Serializable;

/* compiled from: PG */
/* renamed from: kdn */
public abstract class kdn implements Serializable, Comparable {
    public static final long serialVersionUID = 0;
    /* renamed from: a */
    public final Comparable f8609a;

    kdn(Comparable comparable) {
        this.f8609a = comparable;
    }

    /* renamed from: a */
    abstract void mo9813a(StringBuilder stringBuilder);

    /* renamed from: b */
    abstract void mo9814b(StringBuilder stringBuilder);

    /* renamed from: b */
    abstract boolean mo9815b(Comparable comparable);

    public abstract int hashCode();

    /* renamed from: a */
    static kdn m4845a(Comparable comparable) {
        return new kdr(comparable);
    }

    /* renamed from: a */
    public int compareTo(kdn kdn) {
        if (kdn == kdq.f21876b) {
            return 1;
        }
        if (kdn == kdo.f21875b) {
            return -1;
        }
        int b = kge.m13752b(this.f8609a, kdn.f8609a);
        if (b != 0) {
            return b;
        }
        boolean z = this instanceof kdp;
        if (z == (kdn instanceof kdp)) {
            return 0;
        }
        if (z) {
            return 1;
        }
        return -1;
    }

    /* renamed from: a */
    public Comparable mo9812a() {
        return this.f8609a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof kdn)) {
            return false;
        }
        try {
            if (compareTo((kdn) obj) == 0) {
                return true;
            }
            return false;
        } catch (ClassCastException e) {
            return false;
        }
    }
}
