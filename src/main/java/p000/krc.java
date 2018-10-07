package p000;

import java.nio.charset.Charset;

/* compiled from: PG */
/* renamed from: krc */
class krc extends krb {
    public static final long serialVersionUID = 1;
    /* renamed from: c */
    public final byte[] f25360c;

    krc(byte[] bArr) {
        this.f25360c = bArr;
    }

    /* renamed from: a */
    public byte mo10221a(int i) {
        return this.f25360c[i];
    }

    /* renamed from: a */
    protected void mo10225a(byte[] bArr, int i) {
        System.arraycopy(this.f25360c, 0, bArr, 0, i);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof kqx)) {
            return false;
        }
        if (mo10227b() != ((kqx) obj).mo10227b()) {
            return false;
        }
        if (mo10227b() == 0) {
            return true;
        }
        if (!(obj instanceof krc)) {
            return obj.equals(this);
        }
        krc krc = (krc) obj;
        int i = this.f8797b;
        int i2 = krc.f8797b;
        if (i != 0 && i2 != 0 && i != i2) {
            return false;
        }
        i = mo10227b();
        if (i > krc.mo10227b()) {
            int b = mo10227b();
            StringBuilder stringBuilder = new StringBuilder(40);
            stringBuilder.append("Length too large: ");
            stringBuilder.append(i);
            stringBuilder.append(b);
            throw new IllegalArgumentException(stringBuilder.toString());
        } else if (i > krc.mo10227b()) {
            i2 = krc.mo10227b();
            StringBuilder stringBuilder2 = new StringBuilder(59);
            stringBuilder2.append("Ran off end of other: ");
            stringBuilder2.append(0);
            stringBuilder2.append(", ");
            stringBuilder2.append(i);
            stringBuilder2.append(", ");
            stringBuilder2.append(i2);
            throw new IllegalArgumentException(stringBuilder2.toString());
        } else if (!(krc instanceof krc)) {
            return krc.mo10228c(i).equals(mo10228c(i));
        } else {
            byte[] bArr = this.f25360c;
            byte[] bArr2 = krc.f25360c;
            int e = mo15164e() + i;
            i2 = mo15164e();
            i = krc.mo15164e();
            while (i2 < e) {
                if (bArr[i2] != bArr2[i]) {
                    return false;
                }
                i2++;
                i++;
            }
            return true;
        }
    }

    /* renamed from: e */
    protected int mo15164e() {
        return 0;
    }

    /* renamed from: a */
    public final boolean mo10226a() {
        int e = mo15164e();
        return kur.m5420b(this.f25360c, e, mo10227b() + e);
    }

    /* renamed from: a */
    protected final int mo10222a(int i, int i2) {
        return ksd.m5188a(i, this.f25360c, mo15164e(), i2);
    }

    /* renamed from: b */
    public int mo10227b() {
        return this.f25360c.length;
    }

    /* renamed from: c */
    public final kqx mo10228c(int i) {
        int a = kqx.m5114a(0, i, mo10227b());
        if (a == 0) {
            return kqx.f8795a;
        }
        return new kqy(this.f25360c, mo15164e(), a);
    }

    /* renamed from: a */
    protected final String mo10223a(Charset charset) {
        return new String(this.f25360c, mo15164e(), mo10227b(), charset);
    }

    /* renamed from: a */
    final void mo10224a(kqw kqw) {
        kqw.mo10220a(this.f25360c, mo15164e(), mo10227b());
    }
}
