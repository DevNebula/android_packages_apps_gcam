package p000;

/* compiled from: PG */
/* renamed from: jht */
public final class jht implements jhs {
    /* renamed from: a */
    private boolean f26568a = false;
    /* renamed from: b */
    private final /* synthetic */ jhs f26569b;
    /* renamed from: c */
    private final /* synthetic */ Iterable f26570c;

    public jht(jhs jhs, Iterable iterable) {
        this.f26569b = jhs;
        this.f26570c = iterable;
    }

    public final void close() {
        jli.m13202c(mo13767a());
    }

    /* renamed from: a */
    public final synchronized jas mo13767a() {
        jas a;
        if (this.f26568a) {
            a = this.f26569b.mo13767a();
        } else {
            a = jas.m12965a(this.f26569b.mo13767a().mo9280a(kpq.f8776a, new jlf(this.f26570c)));
        }
        return a;
    }

    /* renamed from: b */
    public final synchronized Object mo15043b() {
        Object b;
        b = this.f26569b.mo15043b();
        this.f26568a = true;
        return b;
    }

    /* renamed from: c */
    public final Object mo15044c() {
        return this.f26569b.mo15044c();
    }
}
