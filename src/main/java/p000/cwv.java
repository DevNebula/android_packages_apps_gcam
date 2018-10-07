package p000;

/* compiled from: PG */
/* renamed from: cwv */
final class cwv implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ cws f3034a;

    cwv(cws cws) {
        this.f3034a = cws;
    }

    public final void run() {
        cws cws = this.f3034a;
        if (!cws.f23708e) {
            cws.f23708e = true;
            cws.f23706c.close();
            this.f3034a.f23707d.close();
            this.f3034a.f23704a.mo8826a(Boolean.valueOf(false));
        }
    }
}
