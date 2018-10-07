package p000;

/* compiled from: PG */
/* renamed from: kdp */
final class kdp extends kdn {
    public static final long serialVersionUID = 0;

    kdp(Comparable comparable) {
        super((Comparable) jri.m13404b((Object) comparable));
    }

    /* renamed from: a */
    final void mo9813a(StringBuilder stringBuilder) {
        stringBuilder.append('(');
        stringBuilder.append(this.f8609a);
    }

    /* renamed from: b */
    final void mo9814b(StringBuilder stringBuilder) {
        stringBuilder.append(this.f8609a);
        stringBuilder.append(']');
    }

    public final int hashCode() {
        return this.f8609a.hashCode() ^ -1;
    }

    /* renamed from: b */
    final boolean mo9815b(Comparable comparable) {
        return kge.m13752b(this.f8609a, comparable) < 0;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f8609a);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 2);
        stringBuilder.append("/");
        stringBuilder.append(valueOf);
        stringBuilder.append("\\");
        return stringBuilder.toString();
    }
}
