package p000;

import java.io.Serializable;

/* compiled from: PG */
/* renamed from: kbl */
public final class kbl implements Serializable, kbj {
    public static final long serialVersionUID = 0;
    /* renamed from: a */
    private final kbj f21844a;

    public kbl(kbj kbj) {
        this.f21844a = (kbj) jri.m13404b((Object) kbj);
    }

    /* renamed from: a */
    public final boolean mo9713a(Object obj) {
        return this.f21844a.mo9713a(obj) ^ 1;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof kbl)) {
            return false;
        }
        return this.f21844a.equals(((kbl) obj).f21844a);
    }

    public final int hashCode() {
        return this.f21844a.hashCode() ^ -1;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f21844a);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 16);
        stringBuilder.append("Predicates.not(");
        stringBuilder.append(valueOf);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
