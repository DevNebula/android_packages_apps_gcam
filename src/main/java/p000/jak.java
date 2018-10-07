package p000;

/* compiled from: PG */
/* renamed from: jak */
final class jak implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ jar f7978a;
    /* renamed from: b */
    private final /* synthetic */ jai f7979b;

    jak(jai jai, jar jar) {
        this.f7979b = jai;
        this.f7978a = jar;
    }

    public final void run() {
        try {
            jai jai = this.f7979b;
            jai.f7972c.mo9262a(this.f7978a, jai.f7973d, jai.f7974e, jai.f7970a);
        } catch (Throwable th) {
            Throwable th2 = th;
            if (th2 != this.f7978a) {
                th2 = jar.m4449a(th2);
                kqg.m5105a(th2, this.f7978a);
            }
            this.f7979b.mo9263a(th2);
        }
    }

    public final String toString() {
        return this.f7979b.f7972c.toString();
    }
}
