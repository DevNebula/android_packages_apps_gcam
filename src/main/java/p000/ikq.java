package p000;

/* compiled from: PG */
/* renamed from: ikq */
public final class ikq implements iqo {
    /* renamed from: a */
    public final Object f21030a = new Object();
    /* renamed from: b */
    public Runnable f21031b;
    /* renamed from: c */
    private final ikp f21032c;
    /* renamed from: d */
    private final Runnable f21033d = new ikr(this);

    public ikq(ikp ikp) {
        this.f21032c = ikp;
    }

    /* renamed from: a */
    public final void mo13670a() {
        synchronized (this.f21030a) {
            this.f21031b = null;
            this.f21032c.mo13668a();
        }
    }

    public final void close() {
        synchronized (this.f21030a) {
            if (this.f21031b != null) {
                this.f21031b = null;
            }
        }
        this.f21032c.close();
    }

    /* renamed from: a */
    public final void mo13671a(Runnable runnable) {
        synchronized (this.f21030a) {
            this.f21031b = runnable;
            this.f21032c.execute(this.f21033d);
        }
    }
}
