package p000;

/* compiled from: PG */
/* renamed from: fxu */
final class fxu extends bck {
    /* renamed from: a */
    private final /* synthetic */ fxt f26387a;

    fxu(fxt fxt, bbi bbi) {
        this.f26387a = fxt;
        super(bbi);
    }

    public final void close() {
        super.close();
        synchronized (this.f26387a.f5039e.f18881b) {
            fxt fxt = this.f26387a;
            fxt.f5039e.f18882c.remove(fxt);
            fxr fxr = this.f26387a.f5039e;
            fxr.f18883d.f24640b = Integer.valueOf(fxr.mo13302b());
        }
        this.f26387a.f5039e.mo13303e();
        this.f26387a.f5039e.f18883d.f24639a.m2973a();
    }
}
