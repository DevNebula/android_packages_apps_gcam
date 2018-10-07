package p000;

/* compiled from: PG */
/* renamed from: kvh */
public final class kvh implements Cloneable {
    /* renamed from: a */
    public static final kvi f9014a = new kvi();
    /* renamed from: b */
    public boolean f9015b;
    /* renamed from: c */
    public kvi[] f9016c;
    /* renamed from: d */
    private int[] f9017d;
    /* renamed from: e */
    private int f9018e;

    kvh() {
        this(10);
    }

    private kvh(int i) {
        this.f9015b = false;
        int d = kvh.m5502d(i);
        this.f9017d = new int[d];
        this.f9016c = new kvi[d];
        this.f9018e = 0;
    }

    /* renamed from: a */
    final int mo10504a(int i) {
        int i2 = this.f9018e - 1;
        int i3 = 0;
        while (i3 <= i2) {
            int i4 = (i3 + i2) >>> 1;
            int i5 = this.f9017d[i4];
            if (i5 < i) {
                i3 = i4 + 1;
            } else if (i5 <= i) {
                return i4;
            } else {
                i2 = i4 - 1;
            }
        }
        return i3 ^ -1;
    }

    /* renamed from: a */
    public final kvh clone() {
        int i = 0;
        int b = mo10507b();
        kvh kvh = new kvh(b);
        System.arraycopy(this.f9017d, 0, kvh.f9017d, 0, b);
        while (i < b) {
            kvi kvi = this.f9016c[i];
            if (kvi != null) {
                kvh.f9016c[i] = kvi.clone();
            }
            i++;
        }
        kvh.f9018e = b;
        return kvh;
    }

    /* renamed from: b */
    final kvi mo10508b(int i) {
        if (this.f9015b) {
            m5501c();
        }
        return this.f9016c[i];
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof kvh)) {
            return false;
        }
        kvh kvh = (kvh) obj;
        if (mo10507b() != kvh.mo10507b()) {
            return false;
        }
        int i;
        boolean z;
        int[] iArr = this.f9017d;
        int[] iArr2 = kvh.f9017d;
        int i2 = this.f9018e;
        for (i = 0; i < i2; i++) {
            if (iArr[i] != iArr2[i]) {
                z = false;
                break;
            }
        }
        z = true;
        if (z) {
            kvi[] kviArr = this.f9016c;
            kvi[] kviArr2 = kvh.f9016c;
            i2 = this.f9018e;
            for (i = 0; i < i2; i++) {
                if (!kviArr[i].equals(kviArr2[i])) {
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

    /* renamed from: c */
    private final void m5501c() {
        int i = this.f9018e;
        int[] iArr = this.f9017d;
        kvi[] kviArr = this.f9016c;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            kvi kvi = kviArr[i3];
            if (kvi != f9014a) {
                if (i3 != i2) {
                    iArr[i2] = iArr[i3];
                    kviArr[i2] = kvi;
                    kviArr[i3] = null;
                }
                i2++;
            }
        }
        this.f9015b = false;
        this.f9018e = i2;
    }

    /* renamed from: c */
    final kvi mo10509c(int i) {
        int a = mo10504a(i);
        if (a < 0 || this.f9016c[a] == f9014a) {
            return null;
        }
        return this.f9016c[a];
    }

    public final int hashCode() {
        int i = 17;
        int i2 = 0;
        if (this.f9015b) {
            m5501c();
        }
        while (i2 < this.f9018e) {
            i = (((i * 31) + this.f9017d[i2]) * 31) + this.f9016c[i2].hashCode();
            i2++;
        }
        return i;
    }

    /* renamed from: d */
    private static int m5502d(int i) {
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
        return i3 / 4;
    }

    /* renamed from: a */
    final void mo10506a(int i, kvi kvi) {
        int a = mo10504a(i);
        if (a >= 0) {
            this.f9016c[a] = kvi;
            return;
        }
        a ^= -1;
        if (a >= this.f9018e || this.f9016c[a] != f9014a) {
            Object obj;
            Object obj2;
            if (this.f9015b && this.f9018e >= this.f9017d.length) {
                m5501c();
                a = mo10504a(i) ^ -1;
            }
            int i2 = this.f9018e;
            if (i2 >= this.f9017d.length) {
                i2 = kvh.m5502d(i2 + 1);
                obj = new int[i2];
                obj2 = new kvi[i2];
                Object obj3 = this.f9017d;
                System.arraycopy(obj3, 0, obj, 0, obj3.length);
                obj3 = this.f9016c;
                System.arraycopy(obj3, 0, obj2, 0, obj3.length);
                this.f9017d = obj;
                this.f9016c = obj2;
            }
            i2 = this.f9018e - a;
            if (i2 != 0) {
                obj = this.f9017d;
                int i3 = a + 1;
                System.arraycopy(obj, a, obj, i3, i2);
                obj2 = this.f9016c;
                System.arraycopy(obj2, a, obj2, i3, this.f9018e - a);
            }
            this.f9017d[a] = i;
            this.f9016c[a] = kvi;
            this.f9018e++;
            return;
        }
        this.f9017d[a] = i;
        this.f9016c[a] = kvi;
    }

    /* renamed from: b */
    final int mo10507b() {
        if (this.f9015b) {
            m5501c();
        }
        return this.f9018e;
    }
}
