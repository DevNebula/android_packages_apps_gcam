package p000;

/* compiled from: PG */
/* renamed from: jfh */
public final class jfh extends jdv {
    private jfh(jdo jdo, jaq jaq) {
        super(jdo, jaq);
    }

    /* renamed from: a */
    public static jfh m18397a(jdo jdo, jdc jdc) {
        return new jfh(jdo, jdv.m18019a(jdo, new jfi(jdo, jdc)));
    }

    /* renamed from: b */
    public final jdc mo15718b() {
        return ((jfb) mo15565d()).mo15577d();
    }

    public final String toString() {
        String simpleName = getClass().getSimpleName();
        int hashCode = hashCode();
        String valueOf = String.valueOf(mo15718b());
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(simpleName).length() + 21) + String.valueOf(valueOf).length());
        stringBuilder.append(simpleName);
        stringBuilder.append("@");
        stringBuilder.append(hashCode);
        stringBuilder.append("[layout=");
        stringBuilder.append(valueOf);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
