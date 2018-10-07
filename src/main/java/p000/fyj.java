package p000;

/* compiled from: PG */
/* renamed from: fyj */
final class fyj extends bck {
    /* renamed from: a */
    private final /* synthetic */ fyi f26390a;

    fyj(fyi fyi, bbi bbi) {
        this.f26390a = fyi;
        super(bbi);
    }

    public final void close() {
        super.close();
        synchronized (this.f26390a.f5056d.f18891a) {
            fyi fyi = this.f26390a;
            fyi.f5056d.f18893c.remove(fyi);
        }
    }
}
