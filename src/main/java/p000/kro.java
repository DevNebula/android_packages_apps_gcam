package p000;

/* compiled from: PG */
/* renamed from: kro */
public final class kro {
    /* renamed from: a */
    private final Object f8813a;
    /* renamed from: b */
    private final int f8814b;

    public kro(Object obj, int i) {
        this.f8813a = obj;
        this.f8814b = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof kro)) {
            return false;
        }
        kro kro = (kro) obj;
        if (this.f8813a == kro.f8813a && this.f8814b == kro.f8814b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.f8813a) * 65535) + this.f8814b;
    }
}
