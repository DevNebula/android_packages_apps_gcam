package p000;

import java.io.Serializable;
import java.util.Arrays;

/* compiled from: PG */
/* renamed from: kbq */
public final class kbq implements Serializable, kbn {
    public static final long serialVersionUID = 0;
    /* renamed from: a */
    private final Object f21852a;

    public kbq(Object obj) {
        this.f21852a = obj;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof kbq)) {
            return false;
        }
        return kbf.m16778b(this.f21852a, ((kbq) obj).f21852a);
    }

    /* renamed from: b */
    public final Object mo9715b() {
        return this.f21852a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f21852a});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f21852a);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 22);
        stringBuilder.append("Suppliers.ofInstance(");
        stringBuilder.append(valueOf);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
