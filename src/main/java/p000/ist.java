package p000;

import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: PG */
/* renamed from: ist */
public final class ist {
    /* renamed from: a */
    public final ith[] f7760a = new ith[5];
    /* renamed from: b */
    public byte[] f7761b;
    /* renamed from: c */
    public ArrayList f7762c = new ArrayList();
    /* renamed from: d */
    public final ByteOrder f7763d;

    public ist(ByteOrder byteOrder) {
        this.f7763d = byteOrder;
    }

    /* renamed from: a */
    public final void mo8958a(ith ith) {
        this.f7760a[ith.f7823a] = ith;
    }

    /* renamed from: a */
    public final ite mo8956a(ite ite) {
        if (ite == null) {
            return null;
        }
        int i = ite.f7816e;
        if (ite == null || !ite.m4234b(i)) {
            return null;
        }
        ith ith = this.f7760a[i];
        if (ith == null) {
            ith = new ith(i);
            this.f7760a[i] = ith;
        }
        return ith.mo9000a(ite);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ist)) {
            return false;
        }
        ist ist = (ist) obj;
        if (ist.f7763d != this.f7763d || ist.f7762c.size() != this.f7762c.size() || !Arrays.equals(ist.f7761b, this.f7761b)) {
            return false;
        }
        for (int i = 0; i < this.f7762c.size(); i++) {
            if (!Arrays.equals((byte[]) ist.f7762c.get(i), (byte[]) this.f7762c.get(i))) {
                return false;
            }
        }
        for (int i2 = 0; i2 < 5; i2++) {
            ith a = ist.mo8957a(i2);
            ith a2 = mo8957a(i2);
            if (a != null && !a.equals(a2)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public final ith mo8957a(int i) {
        return ite.m4234b(i) ? this.f7760a[i] : null;
    }

    /* renamed from: b */
    protected final byte[] mo8962b(int i) {
        return (byte[]) this.f7762c.get(i);
    }

    /* renamed from: a */
    protected final boolean mo8960a() {
        return this.f7761b != null;
    }

    /* renamed from: b */
    protected final boolean mo8961b() {
        return this.f7762c.size() != 0;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(this.f7760a)), Integer.valueOf(Arrays.hashCode(this.f7761b)), this.f7762c, this.f7763d});
    }

    /* renamed from: a */
    public final void mo8959a(short s, int i) {
        ith ith = this.f7760a[i];
        if (ith != null) {
            ith.mo9004b(s);
        }
    }
}
