package p000;

/* compiled from: PG */
/* renamed from: kgl */
final class kgl extends keu {
    /* renamed from: a */
    private final transient kes f24936a;
    /* renamed from: b */
    private final transient ken f24937b;

    kgl(kes kes, ken ken) {
        this.f24936a = kes;
        this.f24937b = ken;
    }

    /* renamed from: a */
    public final ken mo9833a() {
        return this.f24937b;
    }

    public final boolean contains(Object obj) {
        return this.f24936a.get(obj) != null;
    }

    /* renamed from: a */
    final int mo9832a(Object[] objArr, int i) {
        return this.f24937b.mo9832a(objArr, i);
    }

    /* renamed from: b */
    final boolean mo9836b() {
        return true;
    }

    /* renamed from: c */
    public final khy iterator() {
        return this.f24937b.listIterator(0);
    }

    public final int size() {
        return this.f24936a.size();
    }
}
