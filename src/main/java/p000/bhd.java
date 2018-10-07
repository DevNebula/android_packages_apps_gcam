package p000;

/* compiled from: PG */
/* renamed from: bhd */
final class bhd implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ bhc f1175a;

    bhd(bhc bhc) {
        this.f1175a = bhc;
    }

    public final void run() {
        synchronized (this.f1175a.f11368e) {
            bhc bhc = this.f1175a;
            if (bhc.f11369f) {
                return;
            }
            bhc.f11367d.mo12383a(bhc.f11364a, bhc.f11366c, bhc.f11365b);
        }
    }
}
