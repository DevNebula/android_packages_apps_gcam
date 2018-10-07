package p000;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Iterator;

/* compiled from: PG */
/* renamed from: kqx */
public abstract class kqx implements Serializable, Iterable {
    /* renamed from: a */
    public static final kqx f8795a = new krc(ksd.f8884b);
    /* renamed from: c */
    private static final kqz f8796c;
    /* renamed from: b */
    public int f8797b = 0;

    static {
        kqz krd;
        if (kqs.m5112a()) {
            krd = new krd();
        } else {
            krd = new ktm();
        }
        f8796c = krd;
    }

    /* renamed from: a */
    public abstract byte mo10221a(int i);

    /* renamed from: a */
    protected abstract int mo10222a(int i, int i2);

    /* renamed from: a */
    protected abstract String mo10223a(Charset charset);

    /* renamed from: a */
    abstract void mo10224a(kqw kqw);

    /* renamed from: a */
    protected abstract void mo10225a(byte[] bArr, int i);

    /* renamed from: a */
    public abstract boolean mo10226a();

    /* renamed from: b */
    public abstract int mo10227b();

    /* renamed from: c */
    public abstract kqx mo10228c(int i);

    public abstract boolean equals(Object obj);

    kqx() {
    }

    /* renamed from: a */
    static int m5114a(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((((i | i2) | i4) | (i3 - i2)) >= 0) {
            return i4;
        }
        StringBuilder stringBuilder;
        if (i < 0) {
            stringBuilder = new StringBuilder(32);
            stringBuilder.append("Beginning index: ");
            stringBuilder.append(i);
            stringBuilder.append(" < 0");
            throw new IndexOutOfBoundsException(stringBuilder.toString());
        } else if (i2 < i) {
            stringBuilder = new StringBuilder(66);
            stringBuilder.append("Beginning index larger than ending index: ");
            stringBuilder.append(i);
            stringBuilder.append(", ");
            stringBuilder.append(i2);
            throw new IndexOutOfBoundsException(stringBuilder.toString());
        } else {
            stringBuilder = new StringBuilder(37);
            stringBuilder.append("End index: ");
            stringBuilder.append(i2);
            stringBuilder.append(" >= ");
            stringBuilder.append(i3);
            throw new IndexOutOfBoundsException(stringBuilder.toString());
        }
    }

    /* renamed from: a */
    public static kqx m5117a(byte[] bArr, int i, int i2) {
        return new krc(f8796c.mo10235a(bArr, i, i2));
    }

    /* renamed from: a */
    public static kqx m5115a(String str) {
        return new krc(str.getBytes(ksd.f8883a));
    }

    public final int hashCode() {
        int i = this.f8797b;
        if (i == 0) {
            i = mo10227b();
            i = mo10222a(i, i);
            if (i == 0) {
                i = 1;
            }
            this.f8797b = i;
        }
        return i;
    }

    public /* synthetic */ Iterator iterator() {
        return new kra(this);
    }

    /* renamed from: b */
    static kue m5119b(int i) {
        return new kue(i);
    }

    /* renamed from: c */
    public final byte[] mo10229c() {
        int b = mo10227b();
        if (b == 0) {
            return ksd.f8884b;
        }
        byte[] bArr = new byte[b];
        mo10225a(bArr, b);
        return bArr;
    }

    public final String toString() {
        return String.format("<ByteString@%s size=%d>", new Object[]{Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(mo10227b())});
    }

    /* renamed from: d */
    public final String mo10230d() {
        return mo10227b() != 0 ? mo10223a(ksd.f8883a) : "";
    }

    /* renamed from: a */
    static kqx m5116a(byte[] bArr) {
        return new krc(bArr);
    }

    /* renamed from: b */
    static kqx m5118b(byte[] bArr, int i, int i2) {
        return new kqy(bArr, i, i2);
    }
}
