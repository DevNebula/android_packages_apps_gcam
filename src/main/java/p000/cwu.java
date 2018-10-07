package p000;

/* compiled from: PG */
/* renamed from: cwu */
final class cwu implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ ilp f3032a;
    /* renamed from: b */
    private final /* synthetic */ cws f3033b;

    cwu(cws cws, ilp ilp) {
        this.f3033b = cws;
        this.f3032a = ilp;
    }

    public final void run() {
        if (!this.f3033b.f23708e) {
            jri.m13404b(this.f3032a);
            this.f3033b.f23707d.close();
            this.f3033b.mo14835b(this.f3032a);
        }
    }
}
