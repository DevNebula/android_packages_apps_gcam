package p000;

/* renamed from: iei */
public final class iei {
    /* renamed from: a */
    private final Object f7340a;
    /* renamed from: b */
    private final String f7341b;

    public iei(Object obj, String str) {
        this.f7340a = obj;
        this.f7341b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iei)) {
            return false;
        }
        iei iei = (iei) obj;
        return this.f7340a == iei.f7340a && this.f7341b.equals(iei.f7341b);
    }

    public final int hashCode() {
        return (System.identityHashCode(this.f7340a) * 31) + this.f7341b.hashCode();
    }
}
