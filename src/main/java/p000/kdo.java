package p000;

/* compiled from: PG */
/* renamed from: kdo */
final class kdo extends kdn {
    /* renamed from: b */
    public static final kdo f21875b = new kdo();
    public static final long serialVersionUID = 0;

    private kdo() {
        super(null);
    }

    /* renamed from: a */
    public final int compareTo(kdn kdn) {
        return kdn == this ? 0 : 1;
    }

    /* renamed from: a */
    final void mo9813a(StringBuilder stringBuilder) {
        throw new AssertionError();
    }

    /* renamed from: b */
    final void mo9814b(StringBuilder stringBuilder) {
        stringBuilder.append("+∞)");
    }

    /* renamed from: a */
    final Comparable mo9812a() {
        throw new IllegalStateException("range unbounded on this side");
    }

    public final int hashCode() {
        return System.identityHashCode(this);
    }

    /* renamed from: b */
    final boolean mo9815b(Comparable comparable) {
        return false;
    }

    private final Object readResolve() {
        return f21875b;
    }

    public final String toString() {
        return "+∞";
    }
}
