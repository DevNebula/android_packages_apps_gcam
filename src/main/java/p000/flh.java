package p000;

/* compiled from: PG */
/* renamed from: flh */
final class flh extends bcj implements fjl {
    /* renamed from: a */
    private final fhz f26357a;
    /* renamed from: b */
    private final fyd f26358b;
    /* renamed from: c */
    private final ikb f26359c;

    flh(fhz fhz, ikb ikb, bbf bbf, fyd fyd) {
        super(bbf);
        this.f26357a = fhz;
        this.f26359c = ikb;
        this.f26358b = fyd;
    }

    public final void close() {
        super.close();
        this.f26359c.close();
    }

    /* renamed from: d */
    public final int mo14895d() {
        return this.f26358b.mo13308e();
    }

    /* renamed from: x_ */
    public final fhz mo6796x_() {
        return this.f26357a;
    }

    /* renamed from: a */
    public final kpk mo14893a(int i) {
        return this.f26358b.mo13305b(i);
    }

    /* renamed from: b */
    public final boolean mo14894b(int i) {
        return this.f26358b.mo13307c(i);
    }
}
