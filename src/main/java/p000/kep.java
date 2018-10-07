package p000;

/* compiled from: PG */
/* renamed from: kep */
final class kep extends ken {
    /* renamed from: a */
    private final transient ken f24910a;

    kep(ken ken) {
        this.f24910a = ken;
    }

    public final boolean contains(Object obj) {
        return this.f24910a.contains(obj);
    }

    public final Object get(int i) {
        jri.m13390a(i, size());
        return this.f24910a.get(m16840b(i));
    }

    public final int indexOf(Object obj) {
        int lastIndexOf = this.f24910a.lastIndexOf(obj);
        return lastIndexOf >= 0 ? m16840b(lastIndexOf) : -1;
    }

    /* renamed from: b */
    final boolean mo9836b() {
        return this.f24910a.mo9836b();
    }

    public final int lastIndexOf(Object obj) {
        int indexOf = this.f24910a.indexOf(obj);
        return indexOf >= 0 ? m16840b(indexOf) : -1;
    }

    /* renamed from: f */
    public final ken mo13993f() {
        return this.f24910a;
    }

    /* renamed from: b */
    private final int m16840b(int i) {
        return (size() - 1) - i;
    }

    public final int size() {
        return this.f24910a.size();
    }

    /* renamed from: a */
    public final ken subList(int i, int i2) {
        jri.m13394a(i, i2, size());
        return this.f24910a.subList(size() - i2, size() - i).mo13993f();
    }
}
