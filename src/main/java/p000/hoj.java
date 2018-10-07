package p000;

/* compiled from: PG */
/* renamed from: hoj */
final class hoj implements Runnable {
    /* renamed from: a */
    public final /* synthetic */ igo f6779a;
    /* renamed from: b */
    public final /* synthetic */ Runnable f6780b;
    /* renamed from: c */
    private final /* synthetic */ hod f6781c;

    hoj(hod hod, igo igo, Runnable runnable) {
        this.f6781c = hod;
        this.f6779a = igo;
        this.f6780b = runnable;
    }

    public final void run() {
        kpk kpk = this.f6781c.f24498c;
        if (kpk != null) {
            kow.m13878a(kpk, new hok(this), kpq.f8776a);
        } else {
            bli.m898e(hod.f24495a, "Could not set data item. API is null");
        }
    }
}
