package p000;

/* compiled from: PG */
/* renamed from: kgm */
final class kgm extends ken {
    /* renamed from: a */
    private final transient Object[] f24938a;
    /* renamed from: b */
    private final transient int f24939b;
    /* renamed from: c */
    private final transient int f24940c;

    kgm(Object[] objArr, int i, int i2) {
        this.f24938a = objArr;
        this.f24939b = i;
        this.f24940c = i2;
    }

    public final Object get(int i) {
        jri.m13390a(i, this.f24940c);
        return this.f24938a[(i + i) + this.f24939b];
    }

    /* renamed from: b */
    final boolean mo9836b() {
        return true;
    }

    public final int size() {
        return this.f24940c;
    }
}
