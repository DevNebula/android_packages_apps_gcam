package p000;

/* compiled from: PG */
/* renamed from: aal */
final class aal implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ int f21a;
    /* renamed from: b */
    private final /* synthetic */ abo f22b;
    /* renamed from: c */
    private final /* synthetic */ aah f23c;

    aal(aah aah, int i, abo abo) {
        this.f23c = aah;
        this.f21a = i;
        this.f22b = abo;
    }

    public final void run() {
        abq d = this.f23c.mo23d();
        if (!d.mo81c()) {
            d.mo80b(this.f21a);
            this.f23c.mo20b().obtainMessage(204, this.f22b).sendToTarget();
        }
    }
}
