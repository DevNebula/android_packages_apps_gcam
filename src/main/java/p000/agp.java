package p000;

import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* compiled from: PG */
/* renamed from: agp */
final class agp implements adl {
    /* renamed from: b */
    private static final arn f10273b = new arn(50);
    /* renamed from: c */
    private final agu f10274c;
    /* renamed from: d */
    private final adl f10275d;
    /* renamed from: e */
    private final adl f10276e;
    /* renamed from: f */
    private final int f10277f;
    /* renamed from: g */
    private final int f10278g;
    /* renamed from: h */
    private final Class f10279h;
    /* renamed from: i */
    private final adp f10280i;
    /* renamed from: j */
    private final ads f10281j;

    agp(agu agu, adl adl, adl adl2, int i, int i2, ads ads, Class cls, adp adp) {
        this.f10274c = agu;
        this.f10275d = adl;
        this.f10276e = adl2;
        this.f10277f = i;
        this.f10278g = i2;
        this.f10281j = ads;
        this.f10279h = cls;
        this.f10280i = adp;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof agp)) {
            return false;
        }
        agp agp = (agp) obj;
        if (this.f10278g == agp.f10278g && this.f10277f == agp.f10277f && arq.m683b(this.f10281j, agp.f10281j) && this.f10279h.equals(agp.f10279h) && this.f10275d.equals(agp.f10275d) && this.f10276e.equals(agp.f10276e) && this.f10280i.equals(agp.f10280i)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((((this.f10275d.hashCode() * 31) + this.f10276e.hashCode()) * 31) + this.f10277f) * 31) + this.f10278g;
        ads ads = this.f10281j;
        if (ads != null) {
            hashCode = (hashCode * 31) + ads.hashCode();
        }
        return (((hashCode * 31) + this.f10279h.hashCode()) * 31) + this.f10280i.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f10275d);
        String valueOf2 = String.valueOf(this.f10276e);
        int i = this.f10277f;
        int i2 = this.f10278g;
        String valueOf3 = String.valueOf(this.f10279h);
        String valueOf4 = String.valueOf(this.f10281j);
        String valueOf5 = String.valueOf(this.f10280i);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        int length3 = String.valueOf(valueOf3).length();
        StringBuilder stringBuilder = new StringBuilder(((((length + 131) + length2) + length3) + String.valueOf(valueOf4).length()) + String.valueOf(valueOf5).length());
        stringBuilder.append("ResourceCacheKey{sourceKey=");
        stringBuilder.append(valueOf);
        stringBuilder.append(", signature=");
        stringBuilder.append(valueOf2);
        stringBuilder.append(", width=");
        stringBuilder.append(i);
        stringBuilder.append(", height=");
        stringBuilder.append(i2);
        stringBuilder.append(", decodedResourceClass=");
        stringBuilder.append(valueOf3);
        stringBuilder.append(", transformation='");
        stringBuilder.append(valueOf4);
        stringBuilder.append('\'');
        stringBuilder.append(", options=");
        stringBuilder.append(valueOf5);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }

    /* renamed from: a */
    public final void mo172a(MessageDigest messageDigest) {
        Object obj = (byte[]) this.f10274c.mo273a(byte[].class);
        ByteBuffer.wrap(obj).putInt(this.f10277f).putInt(this.f10278g).array();
        this.f10276e.mo172a(messageDigest);
        this.f10275d.mo172a(messageDigest);
        messageDigest.update(obj);
        ads ads = this.f10281j;
        if (ads != null) {
            ads.mo172a(messageDigest);
        }
        this.f10280i.mo172a(messageDigest);
        byte[] bArr = (byte[]) f10273b.mo1750b(this.f10279h);
        if (bArr == null) {
            bArr = this.f10279h.getName().getBytes(f334a);
            f10273b.mo1751b(this.f10279h, bArr);
        }
        messageDigest.update(bArr);
        this.f10274c.mo276a(obj);
    }
}
