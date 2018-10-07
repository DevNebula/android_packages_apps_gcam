package p000;

/* compiled from: PG */
/* renamed from: fle */
final class fle extends bcj implements bbh, fyl {
    /* renamed from: a */
    private final bbt f26355a;
    /* renamed from: b */
    private final ilp f26356b;

    private fle(bbt bbt, ilp ilp) {
        super(bbt);
        this.f26355a = bbt;
        this.f26356b = ilp;
    }

    /* renamed from: d */
    public static fle m17682d() {
        bbt bbt = new bbt(new flf());
        return new fle(bbt, ilq.m3889b(bbt.f22559a));
    }

    /* renamed from: e */
    public final boolean mo6944e() {
        fjj fjj = (fjj) this.f26355a.mo12346c();
        if (fjj == null) {
            return false;
        }
        fjj.mo1896a();
        return true;
    }

    /* renamed from: f */
    public final ilp mo6945f() {
        return this.f26356b;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo12344a() {
        return (fjj) this.f26355a.mo12344a();
    }

    /* renamed from: c */
    public final /* synthetic */ Object mo12346c() {
        return (fjj) this.f26355a.mo12346c();
    }

    /* renamed from: a */
    public final /* synthetic */ void mo8826a(Object obj) {
        this.f26355a.mo8826a((fjj) obj);
    }
}
