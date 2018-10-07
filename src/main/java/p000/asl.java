package p000;

/* compiled from: PG */
/* renamed from: asl */
public final class asl {
    /* renamed from: a */
    private final bpt f967a;
    /* renamed from: b */
    private final fbg f968b;
    /* renamed from: c */
    private final kwk f969c;
    /* renamed from: d */
    private atd f970d = null;

    public asl(bpt bpt, fbg fbg, kwk kwk) {
        this.f967a = bpt;
        this.f968b = fbg;
        this.f969c = kwk;
    }

    /* renamed from: a */
    public final atc mo1781a() {
        atd atd = this.f970d;
        if (atd != null) {
            atd.close();
            this.f970d = null;
        }
        this.f968b.mo6720b();
        this.f967a.f1445a.mo13437d();
        this.f967a.mo2082a(false);
        this.f970d = (atd) this.f969c.mo10566a();
        return this.f970d;
    }
}
