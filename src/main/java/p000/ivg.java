package p000;

/* compiled from: PG */
/* renamed from: ivg */
final class ivg extends iww {
    /* renamed from: a */
    private boolean f26545a = false;
    /* renamed from: b */
    private final /* synthetic */ ivf f26546b;

    ivg(ivf ivf, iwz iwz) {
        this.f26546b = ivf;
        super(iwz);
    }

    public final void close() {
        Object obj = 1;
        synchronized (this.f26546b.f26543a) {
            if (this.f26545a) {
                obj = null;
            } else {
                this.f26545a = true;
            }
        }
        if (obj != null) {
            super.close();
            synchronized (this.f26546b.f26543a) {
                ivf ivf = this.f26546b;
                ivf.f26544b--;
            }
        }
    }
}
