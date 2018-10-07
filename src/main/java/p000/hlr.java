package p000;

/* compiled from: PG */
/* renamed from: hlr */
final class hlr implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ hlq f6707a;

    hlr(hlq hlq) {
        this.f6707a = hlq;
    }

    public final void run() {
        hlq hlq = this.f6707a;
        if (hlq.f6706d) {
            jqk.m13354c(hlq.f6704b);
            jqk.m13354c(this.f6707a.f6703a);
            hlq = this.f6707a;
            hlq.f6703a.mo7947b(hlq.f6704b.getCurrentPosition());
            this.f6707a.f6704b.postDelayed(this, 10);
        }
    }
}
