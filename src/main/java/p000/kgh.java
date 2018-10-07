package p000;

/* compiled from: PG */
/* renamed from: kgh */
final class kgh extends ken {
    /* renamed from: a */
    public static final ken f24928a = new kgh(new Object[0], 0);
    /* renamed from: b */
    private final transient Object[] f24929b;
    /* renamed from: c */
    private final transient int f24930c;

    kgh(Object[] objArr, int i) {
        this.f24929b = objArr;
        this.f24930c = i;
    }

    /* renamed from: a */
    final int mo9832a(Object[] objArr, int i) {
        System.arraycopy(this.f24929b, 0, objArr, i, this.f24930c);
        return this.f24930c + i;
    }

    public final Object get(int i) {
        jri.m13390a(i, this.f24930c);
        return this.f24929b[i];
    }

    /* renamed from: b */
    final boolean mo9836b() {
        return false;
    }

    public final int size() {
        return this.f24930c;
    }
}
