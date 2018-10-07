package p000;

/* compiled from: PG */
/* renamed from: cxb */
final class cxb implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ cwz f3037a;

    cxb(cwz cwz) {
        this.f3037a = cwz;
    }

    public final void run() {
        kpk kpk = this.f3037a.f13384c;
        if (!(kpk == null || kpk.isDone())) {
            this.f3037a.f13384c.cancel(false);
            this.f3037a.f13384c = null;
        }
        this.f3037a.f13386e.mo5901a();
        this.f3037a.f13383b.close();
    }
}
