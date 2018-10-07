package p000;

/* compiled from: PG */
/* renamed from: epj */
public final class epj {
    /* renamed from: a */
    public boolean f4255a = false;
    /* renamed from: b */
    private final Runnable f4256b;
    /* renamed from: c */
    private eph f4257c = eph.f4238c;

    public epj(Runnable runnable) {
        this.f4256b = runnable;
    }

    /* renamed from: a */
    public final synchronized boolean mo6442a(eph eph) {
        boolean z = false;
        synchronized (this) {
            boolean z2 = !eph.f4245b.contains(this.f4257c.f4244a) ? eph.f4245b.contains(epi.ANY) : true;
            if (z2) {
                if (this.f4257c == eph.f4238c || this.f4257c == eph.f4243h) {
                    if (eph == eph.f4239d) {
                        this.f4255a = true;
                        this.f4256b.run();
                    } else if (eph == eph.f4240e) {
                        this.f4255a = false;
                        this.f4256b.run();
                    }
                }
                this.f4257c = eph;
                z = true;
            }
        }
        return z;
    }
}
