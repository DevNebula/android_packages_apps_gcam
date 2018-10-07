package p000;

/* compiled from: PG */
/* renamed from: kre */
public abstract class kre {
    /* renamed from: d */
    private static volatile boolean f8801d = false;
    /* renamed from: a */
    public int f8802a;
    /* renamed from: b */
    public int f8803b = 100;
    /* renamed from: c */
    public krg f8804c;

    /* renamed from: a */
    public abstract int mo10239a();

    /* renamed from: a */
    public abstract void mo10240a(int i);

    /* renamed from: b */
    public abstract boolean mo10241b();

    /* renamed from: c */
    public abstract void mo10242c(int i);

    /* renamed from: c */
    public abstract boolean mo10243c();

    /* renamed from: d */
    public abstract int mo10244d(int i);

    /* renamed from: d */
    public abstract kqx mo10245d();

    /* renamed from: e */
    public abstract double mo10246e();

    /* renamed from: e */
    public abstract boolean mo10247e(int i);

    /* renamed from: f */
    public abstract int mo10248f();

    /* renamed from: g */
    public abstract int mo10249g();

    /* renamed from: h */
    public abstract long mo10250h();

    /* renamed from: i */
    public abstract float mo10251i();

    /* renamed from: j */
    public abstract int mo10252j();

    /* renamed from: k */
    public abstract long mo10253k();

    /* renamed from: l */
    abstract long mo10254l();

    /* renamed from: m */
    public abstract int mo10255m();

    /* renamed from: n */
    public abstract long mo10256n();

    /* renamed from: o */
    public abstract int mo10257o();

    /* renamed from: p */
    public abstract long mo10258p();

    /* renamed from: q */
    public abstract String mo10259q();

    /* renamed from: r */
    public abstract String mo10260r();

    /* renamed from: s */
    public abstract int mo10261s();

    /* renamed from: t */
    public abstract int mo10262t();

    /* renamed from: u */
    public abstract long mo10263u();

    kre() {
    }

    /* renamed from: b */
    public static int m5134b(int i) {
        return (i >>> 1) ^ (-(i & 1));
    }

    /* renamed from: a */
    public static long m5132a(long j) {
        return (j >>> 1) ^ (-(1 & j));
    }

    /* renamed from: a */
    static kre m5133a(byte[] bArr, int i) {
        kre krf = new krf(bArr, 0, i, false);
        try {
            krf.mo10244d(i);
            return krf;
        } catch (Throwable e) {
            throw new IllegalArgumentException(e);
        }
    }
}
