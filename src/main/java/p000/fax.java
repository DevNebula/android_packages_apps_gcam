package p000;

/* compiled from: PG */
/* renamed from: fax */
final class fax implements Runnable {
    /* renamed from: a */
    public final /* synthetic */ far f4646a;

    fax(far far) {
        this.f4646a = far;
    }

    public final void run() {
        fbe fbe;
        synchronized (far.f18096a) {
            fbe = this.f4646a.f18101e;
        }
        if (fbe != null) {
            this.f4646a.f18098b.execute(new fay(this));
        }
    }
}
