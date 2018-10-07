package p000;

/* renamed from: ibo */
public final class ibo implements Cloneable {
    /* renamed from: a */
    public ibp[] f7271a;
    /* renamed from: b */
    public int f7272b;
    /* renamed from: c */
    private int[] f7273c;

    static {
        ibp ibp = new ibp();
    }

    ibo() {
        this(10);
    }

    private ibo(int i) {
        int i2 = i << 2;
        int i3 = 4;
        while (true) {
            int i4 = i3;
            if (i4 >= 32) {
                i3 = i2;
                break;
            }
            i3 = (1 << i4) - 12;
            if (i2 <= i3) {
                break;
            }
            i3 = i4 + 1;
        }
        i3 /= 4;
        this.f7273c = new int[i3];
        this.f7271a = new ibp[i3];
        this.f7272b = 0;
    }

    public final int hashCode() {
        int i = 17;
        for (int i2 = 0; i2 < this.f7272b; i2++) {
            i = (((i * 31) + this.f7273c[i2]) * 31) + this.f7271a[i2].hashCode();
        }
        return i;
    }

    public final /* synthetic */ Object clone() {
        int i = this.f7272b;
        ibo ibo = new ibo(i);
        System.arraycopy(this.f7273c, 0, ibo.f7273c, 0, i);
        for (int i2 = 0; i2 < i; i2++) {
            ibp ibp = this.f7271a[i2];
            if (ibp != null) {
                ibo.f7271a[i2] = (ibp) ibp.clone();
            }
        }
        ibo.f7272b = i;
        return ibo;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ibo)) {
            return false;
        }
        ibo ibo = (ibo) obj;
        int i = this.f7272b;
        if (i != ibo.f7272b) {
            return false;
        }
        int i2;
        boolean z;
        int[] iArr = this.f7273c;
        int[] iArr2 = ibo.f7273c;
        for (i2 = 0; i2 < i; i2++) {
            if (iArr[i2] != iArr2[i2]) {
                z = false;
                break;
            }
        }
        z = true;
        if (z) {
            ibp[] ibpArr = this.f7271a;
            ibp[] ibpArr2 = ibo.f7271a;
            int i3 = this.f7272b;
            for (i2 = 0; i2 < i3; i2++) {
                if (!ibpArr[i2].equals(ibpArr2[i2])) {
                    z = false;
                    break;
                }
            }
            z = true;
            if (z) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final boolean mo8333a() {
        return this.f7272b == 0;
    }
}
