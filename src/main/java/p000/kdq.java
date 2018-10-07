package p000;

/* compiled from: PG */
/* renamed from: kdq */
public final class kdq extends kdn {
    /* renamed from: b */
    public static final kdq f21876b = new kdq();
    public static final long serialVersionUID = 0;

    private kdq() {
        super(null);
    }

    /* renamed from: a */
    public final int compareTo(kdn kdn) {
        return kdn == this ? 0 : -1;
    }

    /* renamed from: a */
    final void mo9813a(StringBuilder stringBuilder) {
        stringBuilder.append("(-∞");
    }

    /* renamed from: b */
    final void mo9814b(StringBuilder stringBuilder) {
        throw new AssertionError();
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
        return true;
    }

    private final Object readResolve() {
        return f21876b;
    }

    public final String toString() {
        return "-∞";
    }
}
