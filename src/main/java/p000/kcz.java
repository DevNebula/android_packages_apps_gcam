package p000;

import java.io.Serializable;
import java.util.Arrays;

/* compiled from: PG */
/* renamed from: kcz */
public final class kcz extends kgd implements Serializable {
    public static final long serialVersionUID = 0;
    /* renamed from: a */
    private final kaw f21866a;
    /* renamed from: b */
    private final kgd f21867b;

    public kcz(kaw kaw, kgd kgd) {
        this.f21866a = (kaw) jri.m13404b((Object) kaw);
        this.f21867b = (kgd) jri.m13404b((Object) kgd);
    }

    public final int compare(Object obj, Object obj2) {
        return this.f21867b.compare(this.f21866a.mo9689a(obj), this.f21866a.mo9689a(obj2));
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof kcz)) {
            return false;
        }
        kcz kcz = (kcz) obj;
        if (this.f21866a.equals(kcz.f21866a) && this.f21867b.equals(kcz.f21867b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f21866a, this.f21867b});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f21867b);
        String valueOf2 = String.valueOf(this.f21866a);
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(valueOf).length() + 13) + String.valueOf(valueOf2).length());
        stringBuilder.append(valueOf);
        stringBuilder.append(".onResultOf(");
        stringBuilder.append(valueOf2);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
