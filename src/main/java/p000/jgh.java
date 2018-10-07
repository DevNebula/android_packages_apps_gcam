package p000;

/* compiled from: PG */
/* renamed from: jgh */
abstract class jgh {
    /* renamed from: a */
    private final Object f8173a = new Object();
    /* renamed from: b */
    private kaw f8174b = kay.f21838a;

    jgh() {
    }

    /* renamed from: b */
    protected abstract Object mo9405b();

    /* renamed from: a */
    public final jgh mo9404a(kaw kaw) {
        synchronized (this.f8173a) {
            this.f8174b = new kax(kaw, this.f8174b);
        }
        return this;
    }

    /* renamed from: c */
    public Object mo9406c() {
        try {
            Object a;
            synchronized (this.f8173a) {
                a = this.f8174b.mo9689a(mo9405b());
            }
            return a;
        } catch (Throwable th) {
            IllegalStateException illegalStateException = new IllegalStateException("Could not build instance.", th);
        }
    }
}
