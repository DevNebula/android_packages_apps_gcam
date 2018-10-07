package p000;

/* renamed from: htd */
public final class htd {
    /* renamed from: b */
    private static int f7000b = 31;
    /* renamed from: a */
    public int f7001a = 1;

    /* renamed from: a */
    public final htd mo8109a(Object obj) {
        this.f7001a = (obj != null ? obj.hashCode() : 0) + (this.f7001a * f7000b);
        return this;
    }

    /* renamed from: a */
    public final htd mo8110a(boolean z) {
        this.f7001a = (f7000b * this.f7001a) + z;
        return this;
    }
}
