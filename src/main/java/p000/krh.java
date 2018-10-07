package p000;

import java.util.logging.Logger;

/* compiled from: PG */
/* renamed from: krh */
public abstract class krh extends kqw {
    /* renamed from: a */
    public static final Logger f21971a = Logger.getLogger(krh.class.getName());
    /* renamed from: b */
    public static final boolean f21972b = kul.f8952b;
    /* renamed from: c */
    public kvb f21973c = this;

    /* renamed from: a */
    public abstract void mo14153a(byte b);

    /* renamed from: a */
    public abstract void mo14158a(int i, boolean z);

    /* renamed from: a */
    abstract void mo14159a(byte[] bArr, int i);

    /* renamed from: a */
    public abstract void mo10220a(byte[] bArr, int i, int i2);

    /* renamed from: b */
    public abstract void mo14160b(int i, String str);

    /* renamed from: b */
    public abstract void mo14161b(int i, kte kte);

    /* renamed from: b */
    public abstract void mo14162b(String str);

    /* renamed from: b */
    public abstract void mo14163b(kqx kqx);

    /* renamed from: c */
    public abstract void mo14164c(int i, kqx kqx);

    /* renamed from: c */
    abstract void mo14165c(int i, kte kte, ktr ktr);

    /* renamed from: c */
    public abstract void mo14166c(kte kte);

    /* renamed from: d */
    public abstract void mo14167d(int i, long j);

    /* renamed from: d */
    public abstract void mo14168d(int i, kqx kqx);

    /* renamed from: d */
    public abstract void mo14169d(long j);

    /* renamed from: e */
    public abstract void mo14170e(int i, int i2);

    /* renamed from: f */
    public abstract void mo14173f(int i, int i2);

    /* renamed from: f */
    public abstract void mo14174f(int i, long j);

    /* renamed from: f */
    public abstract void mo14175f(long j);

    /* renamed from: h */
    public abstract void mo14177h(int i, int i2);

    /* renamed from: i */
    public abstract int mo14178i();

    /* renamed from: i */
    public abstract void mo14179i(int i, int i2);

    /* renamed from: m */
    public abstract void mo14180m(int i);

    /* renamed from: n */
    public abstract void mo14181n(int i);

    /* renamed from: p */
    public abstract void mo14183p(int i);

    krh() {
    }

    /* renamed from: a */
    public final void mo14152a() {
        if (mo14178i() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    /* renamed from: a */
    public static int m14058a(int i) {
        return krh.m14103l(i << 3) + 1;
    }

    /* renamed from: b */
    public static int m14073b() {
        return 1;
    }

    /* renamed from: a */
    public static int m14072a(byte[] bArr) {
        int length = bArr.length;
        return length + krh.m14103l(length);
    }

    /* renamed from: a */
    public static int m14062a(int i, kqx kqx) {
        int l = krh.m14103l(i << 3);
        int b = kqx.mo10227b();
        return l + (b + krh.m14103l(b));
    }

    /* renamed from: a */
    public static int m14068a(kqx kqx) {
        int b = kqx.mo10227b();
        return b + krh.m14103l(b);
    }

    /* renamed from: b */
    public static int m14074b(int i) {
        return krh.m14103l(i << 3) + 8;
    }

    /* renamed from: c */
    public static int m14083c() {
        return 8;
    }

    /* renamed from: a */
    public static int m14059a(int i, int i2) {
        return krh.m14103l(i << 3) + krh.m14096g(i2);
    }

    /* renamed from: c */
    public static int m14084c(int i) {
        return krh.m14096g(i);
    }

    /* renamed from: d */
    public static int m14089d(int i) {
        return krh.m14103l(i << 3) + 4;
    }

    /* renamed from: d */
    public static int m14088d() {
        return 4;
    }

    /* renamed from: e */
    public static int m14092e(int i) {
        return krh.m14103l(i << 3) + 8;
    }

    /* renamed from: e */
    public static int m14091e() {
        return 8;
    }

    /* renamed from: f */
    public static int m14094f(int i) {
        return krh.m14103l(i << 3) + 4;
    }

    /* renamed from: f */
    public static int m14093f() {
        return 4;
    }

    @Deprecated
    /* renamed from: a */
    static int m14065a(int i, kte kte, ktr ktr) {
        int l = krh.m14103l(i << 3);
        int i2 = l + l;
        kqo kqo = (kqo) kte;
        l = kqo.mo15154a();
        if (l == -1) {
            l = ktr.mo10360a(kqo);
            kqo.mo15155a(l);
        }
        return l + i2;
    }

    @Deprecated
    /* renamed from: a */
    public static int m14070a(kte kte) {
        return kte.mo14187e();
    }

    /* renamed from: b */
    public static int m14075b(int i, int i2) {
        return krh.m14103l(i << 3) + krh.m14096g(i2);
    }

    /* renamed from: g */
    public static int m14096g(int i) {
        return i >= 0 ? krh.m14103l(i) : 10;
    }

    /* renamed from: a */
    public static int m14060a(int i, long j) {
        return krh.m14103l(i << 3) + krh.m14087c(j);
    }

    /* renamed from: a */
    public static int m14066a(long j) {
        return krh.m14087c(j);
    }

    /* renamed from: a */
    public static int m14063a(int i, ksn ksn) {
        int l = krh.m14103l(8);
        return ((l + l) + krh.m14090d(2, i)) + krh.m14078b(3, ksn);
    }

    /* renamed from: b */
    public static int m14078b(int i, ksn ksn) {
        int b;
        int l = krh.m14103l(i << 3);
        if (ksn.f8901c != null) {
            b = ksn.f8901c.mo10227b();
        } else if (ksn.f8900b != null) {
            b = ksn.f8900b.mo14187e();
        } else {
            b = 0;
        }
        return (b + krh.m14103l(b)) + l;
    }

    /* renamed from: a */
    public static int m14069a(ksn ksn) {
        int b;
        if (ksn.f8901c != null) {
            b = ksn.f8901c.mo10227b();
        } else if (ksn.f8900b != null) {
            b = ksn.f8900b.mo14187e();
        } else {
            b = 0;
        }
        return b + krh.m14103l(b);
    }

    /* renamed from: a */
    public static int m14064a(int i, kte kte) {
        int l = krh.m14103l(8);
        return ((l + l) + krh.m14090d(2, i)) + (krh.m14103l(24) + krh.m14081b(kte));
    }

    /* renamed from: b */
    static int m14079b(int i, kte kte, ktr ktr) {
        return krh.m14103l(i << 3) + krh.m14071a(kte, ktr);
    }

    /* renamed from: b */
    public static int m14081b(kte kte) {
        int e = kte.mo14187e();
        return e + krh.m14103l(e);
    }

    /* renamed from: a */
    static int m14071a(kte kte, ktr ktr) {
        kqo kqo = (kqo) kte;
        int a = kqo.mo15154a();
        if (a == -1) {
            a = ktr.mo10360a(kqo);
            kqo.mo15155a(a);
        }
        return a + krh.m14103l(a);
    }

    /* renamed from: b */
    public static int m14077b(int i, kqx kqx) {
        int l = krh.m14103l(8);
        return ((l + l) + krh.m14090d(2, i)) + krh.m14062a(3, kqx);
    }

    /* renamed from: h */
    public static int m14099h(int i) {
        return krh.m14103l(i << 3) + 4;
    }

    /* renamed from: g */
    public static int m14095g() {
        return 4;
    }

    /* renamed from: i */
    public static int m14100i(int i) {
        return krh.m14103l(i << 3) + 8;
    }

    /* renamed from: h */
    public static int m14098h() {
        return 8;
    }

    /* renamed from: c */
    public static int m14085c(int i, int i2) {
        return krh.m14103l(i << 3) + krh.m14103l(krh.m14104q(i2));
    }

    /* renamed from: j */
    public static int m14101j(int i) {
        return krh.m14103l(krh.m14104q(i));
    }

    /* renamed from: b */
    public static int m14076b(int i, long j) {
        return krh.m14103l(i << 3) + krh.m14087c(krh.m14097g(j));
    }

    /* renamed from: b */
    public static int m14080b(long j) {
        return krh.m14087c(krh.m14097g(j));
    }

    /* renamed from: a */
    public static int m14061a(int i, String str) {
        return krh.m14103l(i << 3) + krh.m14067a(str);
    }

    /* renamed from: a */
    public static int m14067a(String str) {
        int a;
        try {
            a = kur.m5417a((CharSequence) str);
        } catch (kuu e) {
            a = str.getBytes(ksd.f8883a).length;
        }
        return a + krh.m14103l(a);
    }

    /* renamed from: k */
    public static int m14102k(int i) {
        return krh.m14103l(i << 3);
    }

    /* renamed from: d */
    public static int m14090d(int i, int i2) {
        return krh.m14103l(i << 3) + krh.m14103l(i2);
    }

    /* renamed from: l */
    public static int m14103l(int i) {
        if ((i & -128) == 0) {
            return 1;
        }
        if ((i & -16384) == 0) {
            return 2;
        }
        if ((-2097152 & i) == 0) {
            return 3;
        }
        if ((-268435456 & i) == 0) {
            return 4;
        }
        return 5;
    }

    /* renamed from: c */
    public static int m14086c(int i, long j) {
        return krh.m14103l(i << 3) + krh.m14087c(j);
    }

    /* renamed from: c */
    public static int m14087c(long j) {
        if ((-128 & j) == 0) {
            return 1;
        }
        if (j < 0) {
            return 10;
        }
        long j2;
        int i;
        int i2;
        long j3;
        if ((-34359738368L & j) != 0) {
            j2 = j >>> 28;
            i = 6;
        } else {
            i = 2;
            j2 = j;
        }
        long j4;
        if ((-2097152 & j2) != 0) {
            j4 = j2 >>> 14;
            i2 = i + 2;
            j3 = j4;
        } else {
            j4 = j2;
            i2 = i;
            j3 = j4;
        }
        if ((j3 & -16384) != 0) {
            return i2 + 1;
        }
        return i2;
    }

    /* renamed from: q */
    private static int m14104q(int i) {
        return (i + i) ^ (i >> 31);
    }

    /* renamed from: g */
    private static long m14097g(long j) {
        return (j + j) ^ (j >> 63);
    }

    /* renamed from: b */
    public static krh m14082b(byte[] bArr) {
        return new kri(bArr, bArr.length);
    }

    /* renamed from: a */
    public final void mo14156a(int i, double d) {
        mo14167d(i, Double.doubleToRawLongBits(d));
    }

    /* renamed from: a */
    public final void mo14154a(double d) {
        mo14169d(Double.doubleToRawLongBits(d));
    }

    /* renamed from: a */
    public final void mo14157a(int i, float f) {
        mo14170e(i, Float.floatToRawIntBits(f));
    }

    /* renamed from: a */
    public final void mo14155a(float f) {
        mo14180m(Float.floatToRawIntBits(f));
    }

    /* renamed from: g */
    public final void mo14176g(int i, int i2) {
        mo14179i(i, krh.m14104q(i2));
    }

    /* renamed from: o */
    public final void mo14182o(int i) {
        mo14183p(krh.m14104q(i));
    }

    /* renamed from: e */
    public final void mo14171e(int i, long j) {
        mo14174f(i, krh.m14097g(j));
    }

    /* renamed from: e */
    public final void mo14172e(long j) {
        mo14175f(krh.m14097g(j));
    }
}
