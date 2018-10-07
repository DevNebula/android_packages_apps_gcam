package p000;

/* renamed from: dja */
final /* synthetic */ class dja implements Runnable {
    /* renamed from: a */
    private final dix f3296a;
    /* renamed from: b */
    private final int f3297b;
    /* renamed from: c */
    private final kpw f3298c;

    dja(dix dix, int i, kpw kpw) {
        this.f3296a = dix;
        this.f3297b = i;
        this.f3298c = kpw;
    }

    public final void run() {
        dix dix = this.f3296a;
        int i = this.f3297b;
        knk knk = this.f3298c;
        for (int i2 = 0; i2 < i; i2++) {
            dix.f14101p.add(dix.mo13035c());
        }
        knk.mo15641a(Boolean.valueOf(true));
    }
}
