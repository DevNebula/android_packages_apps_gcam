package p000;

/* compiled from: PG */
/* renamed from: ivs */
public final class ivs {
    /* renamed from: a */
    public final kpk f7864a;
    /* renamed from: b */
    private final kpk f7865b;

    public ivs(kpk kpk) {
        this(kpk, null);
    }

    public ivs(kpk kpk, kpk kpk2) {
        this.f7864a = kpk;
        this.f7865b = kpk2;
    }

    /* renamed from: a */
    public static kpk m4321a(int i, kpk kpk) {
        return kny.m18475a(kpk, new ivu(i), kpq.f8776a);
    }

    /* renamed from: a */
    public final kpk mo9108a() {
        jri.m13404b(this.f7865b);
        return this.f7865b;
    }

    /* renamed from: b */
    public final boolean mo9109b() {
        return this.f7865b != null;
    }

    /* renamed from: a */
    public static ivs m4320a(kpk kpk) {
        return new ivs(ivs.m4321a(-1, kpk));
    }
}
