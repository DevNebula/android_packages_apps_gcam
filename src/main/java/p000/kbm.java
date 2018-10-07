package p000;

/* compiled from: PG */
/* renamed from: kbm */
final class kbm extends kbg {
    public static final long serialVersionUID = 0;
    /* renamed from: a */
    private final Object f21845a;

    kbm(Object obj) {
        this.f21845a = obj;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof kbm)) {
            return false;
        }
        return this.f21845a.equals(((kbm) obj).f21845a);
    }

    /* renamed from: a */
    public final Object mo9706a() {
        return this.f21845a;
    }

    public final int hashCode() {
        return this.f21845a.hashCode() + 1502476572;
    }

    /* renamed from: b */
    public final boolean mo9709b() {
        return true;
    }

    /* renamed from: a */
    public final Object mo9707a(Object obj) {
        jri.m13391a(obj, (Object) "use Optional.orNull() instead of Optional.or(null)");
        return this.f21845a;
    }

    /* renamed from: c */
    public final Object mo9710c() {
        return this.f21845a;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f21845a);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 13);
        stringBuilder.append("Optional.of(");
        stringBuilder.append(valueOf);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    /* renamed from: a */
    public final kbg mo9708a(kaw kaw) {
        return new kbm(jri.m13391a(kaw.mo9689a(this.f21845a), (Object) "the Function passed to Optional.transform() must not return null."));
    }
}
