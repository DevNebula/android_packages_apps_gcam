package p000;

/* compiled from: PG */
/* renamed from: ker */
final class ker extends ken {
    /* renamed from: a */
    private final transient int f24911a;
    /* renamed from: b */
    private final transient int f24912b;
    /* renamed from: c */
    private final /* synthetic */ ken f24913c;

    ker(ken ken, int i, int i2) {
        this.f24913c = ken;
        this.f24911a = i;
        this.f24912b = i2;
    }

    public final Object get(int i) {
        jri.m13390a(i, this.f24912b);
        return this.f24913c.get(this.f24911a + i);
    }

    /* renamed from: b */
    final boolean mo9836b() {
        return true;
    }

    public final int size() {
        return this.f24912b;
    }

    /* renamed from: a */
    public final ken subList(int i, int i2) {
        jri.m13394a(i, i2, this.f24912b);
        ken ken = this.f24913c;
        int i3 = this.f24911a;
        return ken.subList(i + i3, i3 + i2);
    }
}
