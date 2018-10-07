package p000;

/* compiled from: PG */
/* renamed from: ijm */
final class ijm implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ ijl f7402a;

    ijm(ijl ijl) {
        this.f7402a = ijl;
    }

    public final void run() {
        Object obj = null;
        synchronized (this.f7402a.f21005d) {
            ijl ijl = this.f7402a;
            if (!ijl.f21007f) {
                if (ijl.f21003b == 0) {
                    ijl.f21007f = true;
                    int obj2 = 1;
                }
            }
        }
        if (obj2 != null) {
            this.f7402a.f21002a.close();
        }
    }
}
