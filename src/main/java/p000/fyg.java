package p000;

/* compiled from: PG */
/* renamed from: fyg */
final class fyg extends bck {
    /* renamed from: a */
    private final /* synthetic */ fyi f26388a;
    /* renamed from: b */
    private final /* synthetic */ fyd f26389b;

    fyg(fyd fyd, bbi bbi, fyi fyi) {
        this.f26389b = fyd;
        this.f26388a = fyi;
        super(bbi);
    }

    public final void close() {
        super.close();
        synchronized (this.f26389b.f18891a) {
            this.f26389b.f18893c.remove(this.f26388a);
        }
        this.f26389b.mo13310g();
    }
}
