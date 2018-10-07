package p000;

import java.security.MessageDigest;
import java.util.Arrays;

/* compiled from: PG */
/* renamed from: kik */
final class kik extends kic {
    /* renamed from: a */
    private final MessageDigest f24954a;
    /* renamed from: b */
    private final int f24955b;
    /* renamed from: c */
    private boolean f24956c;

    kik(MessageDigest messageDigest, int i) {
        this.f24954a = messageDigest;
        this.f24955b = i;
    }

    /* renamed from: b */
    private final void m16895b() {
        jri.m13406b(this.f24956c ^ 1, (Object) "Cannot re-use a Hasher after calling hash() on it");
    }

    /* renamed from: a */
    public final kid mo10018a() {
        m16895b();
        this.f24956c = true;
        if (this.f24955b == this.f24954a.getDigestLength()) {
            return kid.m5005a(this.f24954a.digest());
        }
        return kid.m5005a(Arrays.copyOf(this.f24954a.digest(), this.f24955b));
    }

    /* renamed from: b */
    protected final void mo14110b(byte b) {
        m16895b();
        this.f24954a.update(b);
    }

    /* renamed from: a */
    protected final void mo14109a(byte[] bArr) {
        m16895b();
        this.f24954a.update(bArr, 0, 2);
    }
}
