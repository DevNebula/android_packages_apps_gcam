package p000;

/* renamed from: ewb */
public final /* synthetic */ class ewb implements Runnable {
    /* renamed from: a */
    private final evb f4523a;

    public ewb(evb evb) {
        this.f4523a = evb;
    }

    public final void run() {
        evb evb = this.f4523a;
        evb.f17857d.post(new evd(evb));
    }
}
