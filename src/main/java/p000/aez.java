package p000;

import java.security.MessageDigest;

/* compiled from: PG */
/* renamed from: aez */
final class aez implements adl {
    /* renamed from: b */
    private final adl f10176b;
    /* renamed from: c */
    private final adl f10177c;

    aez(adl adl, adl adl2) {
        this.f10176b = adl;
        this.f10177c = adl2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof aez)) {
            return false;
        }
        aez aez = (aez) obj;
        if (this.f10176b.equals(aez.f10176b) && this.f10177c.equals(aez.f10177c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f10176b.hashCode() * 31) + this.f10177c.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f10176b);
        String valueOf2 = String.valueOf(this.f10177c);
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(valueOf).length() + 36) + String.valueOf(valueOf2).length());
        stringBuilder.append("DataCacheKey{sourceKey=");
        stringBuilder.append(valueOf);
        stringBuilder.append(", signature=");
        stringBuilder.append(valueOf2);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }

    /* renamed from: a */
    public final void mo172a(MessageDigest messageDigest) {
        this.f10176b.mo172a(messageDigest);
        this.f10177c.mo172a(messageDigest);
    }
}
