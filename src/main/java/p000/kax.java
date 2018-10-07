package p000;

import java.io.Serializable;

/* compiled from: PG */
/* renamed from: kax */
public final class kax implements Serializable, kaw {
    public static final long serialVersionUID = 0;
    /* renamed from: a */
    private final kaw f21836a;
    /* renamed from: b */
    private final kaw f21837b;

    public kax(kaw kaw, kaw kaw2) {
        this.f21836a = (kaw) jri.m13404b((Object) kaw);
        this.f21837b = (kaw) jri.m13404b((Object) kaw2);
    }

    /* renamed from: a */
    public final Object mo9689a(Object obj) {
        return this.f21836a.mo9689a(this.f21837b.mo9689a(obj));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof kax)) {
            return false;
        }
        kax kax = (kax) obj;
        if (this.f21837b.equals(kax.f21837b) && this.f21836a.equals(kax.f21836a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f21837b.hashCode() ^ this.f21836a.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f21836a);
        String valueOf2 = String.valueOf(this.f21837b);
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(valueOf).length() + 2) + String.valueOf(valueOf2).length());
        stringBuilder.append(valueOf);
        stringBuilder.append("(");
        stringBuilder.append(valueOf2);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
