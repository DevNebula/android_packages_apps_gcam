package p000;

/* compiled from: PG */
/* renamed from: kod */
final class kod implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ int f8752a;
    /* renamed from: b */
    private final /* synthetic */ kpk f8753b;
    /* renamed from: c */
    private final /* synthetic */ koc f8754c;

    kod(koc koc, int i, kpk kpk) {
        this.f8754c = koc;
        this.f8752a = i;
        this.f8753b = kpk;
    }

    public final void run() {
        try {
            this.f8754c.mo14126a(this.f8752a, this.f8753b);
        } finally {
            this.f8754c.mo14125a();
        }
    }
}
