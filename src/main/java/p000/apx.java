package p000;

/* compiled from: PG */
/* renamed from: apx */
final class apx {
    /* renamed from: a */
    public final Class f874a;
    /* renamed from: b */
    public final adq f875b;
    /* renamed from: c */
    private final Class f876c;

    public apx(Class cls, Class cls2, adq adq) {
        this.f876c = cls;
        this.f874a = cls2;
        this.f875b = adq;
    }

    /* renamed from: a */
    public final boolean mo1673a(Class cls, Class cls2) {
        if (this.f876c.isAssignableFrom(cls) && cls2.isAssignableFrom(this.f874a)) {
            return true;
        }
        return false;
    }
}
