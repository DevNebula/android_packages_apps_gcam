package p000;

/* compiled from: PG */
/* renamed from: kau */
public final class kau extends kbg {
    /* renamed from: a */
    public static final kau f21835a = new kau();
    public static final long serialVersionUID = 0;

    private kau() {
    }

    public final boolean equals(Object obj) {
        return obj == this;
    }

    /* renamed from: a */
    public final Object mo9706a() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    public final int hashCode() {
        return 2040732332;
    }

    /* renamed from: b */
    public final boolean mo9709b() {
        return false;
    }

    /* renamed from: a */
    public final Object mo9707a(Object obj) {
        return jri.m13391a(obj, (Object) "use Optional.orNull() instead of Optional.or(null)");
    }

    /* renamed from: c */
    public final Object mo9710c() {
        return null;
    }

    private final Object readResolve() {
        return f21835a;
    }

    public final String toString() {
        return "Optional.absent()";
    }

    /* renamed from: a */
    public final kbg mo9708a(kaw kaw) {
        jri.m13404b((Object) kaw);
        return f21835a;
    }
}
