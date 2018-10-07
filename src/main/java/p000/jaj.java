package p000;

/* compiled from: PG */
/* renamed from: jaj */
final class jaj implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ Object f7976a;
    /* renamed from: b */
    private final /* synthetic */ jai f7977b;

    jaj(jai jai, Object obj) {
        this.f7977b = jai;
        this.f7976a = obj;
    }

    public final void run() {
        try {
            jai jai = this.f7977b;
            jai.f7971b.mo9262a(this.f7976a, jai.f7973d, jai.f7974e, jai.f7970a);
        } catch (Throwable th) {
            this.f7977b.mo9263a(th);
        }
    }
}
