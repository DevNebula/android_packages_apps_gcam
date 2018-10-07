package p000;

/* compiled from: PG */
/* renamed from: cwt */
final class cwt implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ ilp f3030a;
    /* renamed from: b */
    private final /* synthetic */ cws f3031b;

    cwt(cws cws, ilp ilp) {
        this.f3031b = cws;
        this.f3030a = ilp;
    }

    public final void run() {
        if (!this.f3031b.f23708e) {
            jri.m13404b(this.f3030a);
            this.f3031b.f23706c.close();
            this.f3031b.mo14834a(this.f3030a);
        }
    }
}
