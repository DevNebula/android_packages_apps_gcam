package p000;

/* compiled from: PG */
/* renamed from: cid */
final class cid implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ chz f2209a;

    cid(chz chz) {
        this.f2209a = chz;
    }

    public final void run() {
        if (this.f2209a.f12547a.get() != null) {
            ((clh) this.f2209a.f12547a.get()).close();
            this.f2209a.f12547a.set(null);
        }
    }
}
