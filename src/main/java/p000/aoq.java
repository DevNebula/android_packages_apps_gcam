package p000;

/* compiled from: PG */
/* renamed from: aoq */
final class aoq {
    /* renamed from: a */
    public final aoo f843a;
    /* renamed from: b */
    private final Class f844b;
    /* renamed from: c */
    private final Class f845c;

    aoq(Class cls, Class cls2, aoo aoo) {
        this.f844b = cls;
        this.f845c = cls2;
        this.f843a = aoo;
    }

    /* renamed from: a */
    public final boolean mo1640a(Class cls, Class cls2) {
        return this.f844b.isAssignableFrom(cls) && cls2.isAssignableFrom(this.f845c);
    }
}
