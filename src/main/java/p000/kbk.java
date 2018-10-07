package p000;

import java.io.Serializable;

/* compiled from: PG */
/* renamed from: kbk */
public final class kbk implements Serializable, kbj {
    public static final long serialVersionUID = 0;
    /* renamed from: a */
    private final Object f21843a;

    public kbk(Object obj) {
        this.f21843a = obj;
    }

    /* renamed from: a */
    public final boolean mo9713a(Object obj) {
        return this.f21843a.equals(obj);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof kbk)) {
            return false;
        }
        return this.f21843a.equals(((kbk) obj).f21843a);
    }

    public final int hashCode() {
        return this.f21843a.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f21843a);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 20);
        stringBuilder.append("Predicates.equalTo(");
        stringBuilder.append(valueOf);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
