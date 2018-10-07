package p000;

/* renamed from: ifx */
final class ifx implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ ifv f7357a;
    /* renamed from: b */
    private final /* synthetic */ ify f7358b;

    ifx(ify ify, ifv ifv) {
        this.f7358b = ify;
        this.f7357a = ifv;
    }

    public final void run() {
        synchronized (this.f7358b.f7360b) {
            ifu ifu = this.f7358b.f7361c;
            if (ifu != null) {
                ifu.mo8427a(this.f7357a);
            }
        }
    }
}
