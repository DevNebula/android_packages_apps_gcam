package p000;

/* renamed from: eve */
final /* synthetic */ class eve implements Runnable {
    /* renamed from: a */
    private final evb f4496a;

    eve(evb evb) {
        this.f4496a = evb;
    }

    public final void run() {
        evb evb = this.f4496a;
        evb.f17860g = true;
        if (evb.f17861h) {
            evb.f17857d.post(new evi(evb));
        } else {
            evb.f17855b.mo15641a(izg.f7956a);
        }
    }
}
