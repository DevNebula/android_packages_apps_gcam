package p000;

import com.google.googlex.gcam.DngColorCalibration.Illuminant;

/* compiled from: PG */
/* renamed from: kid */
public abstract class kid {
    /* renamed from: a */
    private static final char[] f8676a = "0123456789abcdef".toCharArray();

    /* renamed from: a */
    abstract boolean mo10008a(kid kid);

    /* renamed from: a */
    public abstract byte[] mo10009a();

    /* renamed from: b */
    public abstract int mo10010b();

    /* renamed from: c */
    public abstract long mo10011c();

    /* renamed from: d */
    public abstract int mo10012d();

    kid() {
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof kid)) {
            return false;
        }
        kid kid = (kid) obj;
        if (mo10012d() == kid.mo10012d() && mo10008a(kid)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    static kid m5005a(byte[] bArr) {
        return new kie(bArr);
    }

    /* renamed from: e */
    byte[] mo10013e() {
        return mo10009a();
    }

    public final int hashCode() {
        if (mo10012d() >= 32) {
            return mo10010b();
        }
        byte[] e = mo10013e();
        int i = e[0] & Illuminant.kOther;
        for (int i2 = 1; i2 < e.length; i2++) {
            i |= (e[i2] & Illuminant.kOther) << (i2 << 3);
        }
        return i;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder(r3 + r3);
        for (byte b : mo10013e()) {
            stringBuilder.append(f8676a[(b >> 4) & 15]);
            stringBuilder.append(f8676a[b & 15]);
        }
        return stringBuilder.toString();
    }
}
