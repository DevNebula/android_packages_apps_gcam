package p000;

import java.security.MessageDigest;

/* compiled from: PG */
/* renamed from: arf */
public final class arf implements adl {
    /* renamed from: b */
    private final Object f10682b;

    public arf(Object obj) {
        this.f10682b = aqe.m610a(obj, "Argument must not be null");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof arf)) {
            return false;
        }
        return this.f10682b.equals(((arf) obj).f10682b);
    }

    public final int hashCode() {
        return this.f10682b.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f10682b);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 18);
        stringBuilder.append("ObjectKey{object=");
        stringBuilder.append(valueOf);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }

    /* renamed from: a */
    public final void mo172a(MessageDigest messageDigest) {
        messageDigest.update(this.f10682b.toString().getBytes(f334a));
    }
}
