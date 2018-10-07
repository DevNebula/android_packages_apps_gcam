package p000;

import java.util.Arrays;

/* compiled from: PG */
/* renamed from: kvm */
final class kvm {
    /* renamed from: a */
    public final int f9024a;
    /* renamed from: b */
    public final byte[] f9025b;

    kvm(int i, byte[] bArr) {
        this.f9024a = i;
        this.f9025b = bArr;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof kvm)) {
            return false;
        }
        kvm kvm = (kvm) obj;
        if (this.f9024a == kvm.f9024a && Arrays.equals(this.f9025b, kvm.f9025b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f9024a + 527) * 31) + Arrays.hashCode(this.f9025b);
    }
}
