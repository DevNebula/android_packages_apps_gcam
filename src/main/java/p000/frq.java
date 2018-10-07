package p000;

/* compiled from: PG */
/* renamed from: frq */
final class frq extends iww {
    /* renamed from: a */
    private final /* synthetic */ frp f26380a;

    frq(frp frp, iwz iwz) {
        this.f26380a = frp;
        super(iwz);
    }

    public final void close() {
        super.close();
        synchronized (this.f26380a.f4904e.f18703a) {
            frp frp = this.f26380a;
            frp.f4904e.f18712j.remove(frp);
            frp = this.f26380a;
            frp.f4904e.f18713k.remove(frp);
            frp = this.f26380a;
            frp.f4904e.f18714l.remove(frp);
            this.f26380a.f4904e.f18709g.m2973a();
            this.f26380a.f4904e.mo13279d();
        }
    }
}
