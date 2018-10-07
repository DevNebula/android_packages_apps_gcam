package p000;

/* compiled from: PG */
/* renamed from: bmm */
public final class bmm implements eoj, eol, gqd {
    /* renamed from: a */
    public final Object f11536a = new Object();
    /* renamed from: b */
    public iqo f11537b;
    /* renamed from: c */
    private final ivw f11538c;
    /* renamed from: d */
    private final ise f11539d;

    public bmm(ivw ivw, ise ise) {
        this.f11538c = ivw;
        this.f11539d = ise;
    }

    /* renamed from: a */
    private final void m7639a() {
        synchronized (this.f11536a) {
            if (this.f11537b != null) {
                return;
            }
            this.f11537b = this.f11539d.mo8939a();
            this.f11538c.mo9112d().mo8557a(new bmn(this));
        }
    }

    /* renamed from: i */
    public final void mo6372i() {
        m7639a();
    }

    public final void run() {
        m7639a();
    }
}
