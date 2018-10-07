package p000;

import java.util.Arrays;

/* compiled from: PG */
/* renamed from: kuh */
public final class kuh {
    /* renamed from: a */
    public static final kuh f8940a = new kuh(0, new int[0], new Object[0], false);
    /* renamed from: b */
    public int f8941b;
    /* renamed from: c */
    public int[] f8942c;
    /* renamed from: d */
    public Object[] f8943d;
    /* renamed from: e */
    public int f8944e;
    /* renamed from: f */
    public boolean f8945f;

    private kuh() {
        this(0, new int[8], new Object[8], true);
    }

    private kuh(int i, int[] iArr, Object[] objArr, boolean z) {
        this.f8944e = -1;
        this.f8941b = i;
        this.f8942c = iArr;
        this.f8943d = objArr;
        this.f8945f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof kuh)) {
            return false;
        }
        kuh kuh = (kuh) obj;
        int i = this.f8941b;
        if (i == kuh.f8941b) {
            int i2;
            boolean z;
            int[] iArr = this.f8942c;
            int[] iArr2 = kuh.f8942c;
            for (i2 = 0; i2 < i; i2++) {
                if (iArr[i2] != iArr2[i2]) {
                    z = false;
                    break;
                }
            }
            z = true;
            if (z) {
                Object[] objArr = this.f8943d;
                Object[] objArr2 = kuh.f8943d;
                int i3 = this.f8941b;
                for (i2 = 0; i2 < i3; i2++) {
                    if (!objArr[i2].equals(objArr2[i2])) {
                        z = false;
                        break;
                    }
                }
                z = true;
                if (z) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    public final int mo10412a() {
        int i = 0;
        int i2 = this.f8944e;
        if (i2 == -1) {
            int i3 = 0;
            while (true) {
                i2 = i;
                if (i3 < this.f8941b) {
                    i = this.f8942c[i3];
                    int i4 = i >>> 3;
                    switch (i & 7) {
                        case 0:
                            i = krh.m14086c(i4, ((Long) this.f8943d[i3]).longValue());
                            break;
                        case 1:
                            ((Long) this.f8943d[i3]).longValue();
                            i = krh.m14092e(i4);
                            break;
                        case 2:
                            i = krh.m14062a(i4, (kqx) this.f8943d[i3]);
                            break;
                        case 3:
                            i = krh.m14102k(i4);
                            i = ((kuh) this.f8943d[i3]).mo10412a() + (i + i);
                            break;
                        case 5:
                            ((Integer) this.f8943d[i3]).intValue();
                            i = krh.m14089d(i4);
                            break;
                        default:
                            throw new IllegalStateException(ksh.m5205c());
                    }
                    i2 += i;
                    i = i3 + 1;
                } else {
                    this.f8944e = i2;
                }
            }
        }
        return i2;
    }

    public final int hashCode() {
        int i;
        int i2 = 17;
        int i3 = 0;
        int i4 = this.f8941b;
        int i5 = (i4 + 527) * 31;
        int[] iArr = this.f8942c;
        int i6 = 17;
        for (i = 0; i < i4; i++) {
            i6 = (i6 * 31) + iArr[i];
        }
        i = (i5 + i6) * 31;
        Object[] objArr = this.f8943d;
        while (i3 < this.f8941b) {
            i2 = (i2 * 31) + objArr[i3].hashCode();
            i3++;
        }
        return i + i2;
    }

    /* renamed from: a */
    static kuh m5365a(kuh kuh, kuh kuh2) {
        int i = kuh.f8941b + kuh2.f8941b;
        Object copyOf = Arrays.copyOf(kuh.f8942c, i);
        System.arraycopy(kuh2.f8942c, 0, copyOf, kuh.f8941b, kuh2.f8941b);
        Object copyOf2 = Arrays.copyOf(kuh.f8943d, i);
        System.arraycopy(kuh2.f8943d, 0, copyOf2, kuh.f8941b, kuh2.f8941b);
        return new kuh(i, copyOf, copyOf2, true);
    }

    /* renamed from: b */
    static kuh m5367b() {
        return new kuh();
    }

    /* renamed from: a */
    final void mo10413a(int i, Object obj) {
        if (this.f8945f) {
            int i2 = this.f8941b;
            int[] iArr = this.f8942c;
            if (i2 == iArr.length) {
                int i3;
                if (i2 >= 4) {
                    i3 = i2 >> 1;
                } else {
                    i3 = 8;
                }
                i3 += i2;
                this.f8942c = Arrays.copyOf(iArr, i3);
                this.f8943d = Arrays.copyOf(this.f8943d, i3);
            }
            int[] iArr2 = this.f8942c;
            i2 = this.f8941b;
            iArr2[i2] = i;
            this.f8943d[i2] = obj;
            this.f8941b = i2 + 1;
            return;
        }
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    private static void m5366a(int i, Object obj, kvb kvb) {
        int i2 = i >>> 3;
        switch (i & 7) {
            case 0:
                kvb.mo10463b(i2, ((Long) obj).longValue());
                return;
            case 1:
                kvb.mo10455a(i2, ((Long) obj).longValue());
                return;
            case 2:
                kvb.mo10459a(i2, (kqx) obj);
                return;
            case 3:
                if (C0252go.f5911cd == C0252go.f5911cd) {
                    kvb.mo10461b(i2);
                    ((kuh) obj).mo10414a(kvb);
                    kvb.mo10451a(i2);
                    return;
                }
                kvb.mo10451a(i2);
                ((kuh) obj).mo10414a(kvb);
                kvb.mo10461b(i2);
                return;
            case 5:
                kvb.mo10462b(i2, ((Integer) obj).intValue());
                return;
            default:
                throw new RuntimeException(ksh.m5205c());
        }
    }

    /* renamed from: a */
    public final void mo10414a(kvb kvb) {
        if (this.f8941b != 0) {
            int i;
            if (C0252go.f5911cd == C0252go.f5911cd) {
                for (i = 0; i < this.f8941b; i++) {
                    kuh.m5366a(this.f8942c[i], this.f8943d[i], kvb);
                }
                return;
            }
            for (i = this.f8941b - 1; i >= 0; i--) {
                kuh.m5366a(this.f8942c[i], this.f8943d[i], kvb);
            }
        }
    }
}
