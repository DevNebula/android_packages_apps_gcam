package p000;

/* compiled from: PG */
/* renamed from: ivf */
public final class ivf extends iwx {
    /* renamed from: a */
    public final Object f26543a = new Object();
    /* renamed from: b */
    public int f26544b = 0;

    public ivf(ixb ixb) {
        super(ixb);
    }

    /* renamed from: a */
    public final iwz mo13746a() {
        synchronized (this.f26543a) {
            if (this.f26544b == mo13752f()) {
                return null;
            }
            iwz a = m17990a(super.mo13746a());
            return a;
        }
    }

    /* renamed from: b */
    public final iwz mo13748b() {
        synchronized (this.f26543a) {
            if (this.f26544b == mo13752f()) {
                return null;
            }
            iwz a = m17990a(super.mo13748b());
            return a;
        }
    }

    /* renamed from: a */
    private final iwz m17990a(iwz iwz) {
        if (iwz == null) {
            return null;
        }
        this.f26544b++;
        return new ivg(this, iwz);
    }
}
