package p000;

/* compiled from: PG */
/* renamed from: fyo */
final class fyo implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ fyk f5057a;

    fyo(fyk fyk) {
        this.f5057a = fyk;
    }

    public final void run() {
        synchronized (this.f5057a.f18901a) {
            fyk fyk = this.f5057a;
            fyk.f18904d--;
        }
    }
}
