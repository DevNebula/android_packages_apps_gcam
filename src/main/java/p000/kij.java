package p000;

import java.io.Serializable;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* compiled from: PG */
/* renamed from: kij */
final class kij extends kif implements Serializable {
    /* renamed from: a */
    private final MessageDigest f21913a;
    /* renamed from: b */
    private final int f21914b;
    /* renamed from: c */
    private final boolean f21915c;
    /* renamed from: d */
    private final String f21916d;

    kij(String str, int i, String str2) {
        this.f21916d = (String) jri.m13404b((Object) str2);
        this.f21913a = kij.m13815a(str);
        int digestLength = this.f21913a.getDigestLength();
        boolean z = i < 4 ? false : i <= digestLength;
        jri.m13398a(z, "bytes (%s) must be >= 4 and < %s", i, digestLength);
        this.f21914b = i;
        this.f21915c = kij.m13816a(this.f21913a);
    }

    kij(String str, String str2) {
        this.f21913a = kij.m13815a(str);
        this.f21914b = this.f21913a.getDigestLength();
        this.f21916d = (String) jri.m13404b((Object) str2);
        this.f21915c = kij.m13816a(this.f21913a);
    }

    /* renamed from: a */
    private static MessageDigest m13815a(String str) {
        try {
            return MessageDigest.getInstance(str);
        } catch (NoSuchAlgorithmException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: a */
    public final kig mo10017a() {
        if (this.f21915c) {
            try {
                return new kik((MessageDigest) this.f21913a.clone(), this.f21914b);
            } catch (CloneNotSupportedException e) {
            }
        }
        return new kik(kij.m13815a(this.f21913a.getAlgorithm()), this.f21914b);
    }

    /* renamed from: a */
    private static boolean m13816a(MessageDigest messageDigest) {
        try {
            messageDigest.clone();
            return true;
        } catch (CloneNotSupportedException e) {
            return false;
        }
    }

    public final String toString() {
        return this.f21916d;
    }

    final Object writeReplace() {
        return new kil(this.f21913a.getAlgorithm(), this.f21914b, this.f21916d);
    }
}
