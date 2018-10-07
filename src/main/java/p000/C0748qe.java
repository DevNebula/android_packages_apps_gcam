package p000;

/* compiled from: PG */
/* renamed from: qe */
final class C0748qe implements C0411pf {
    /* renamed from: a */
    private final /* synthetic */ C0836py f22245a;

    C0748qe(C0836py c0836py) {
        this.f22245a = c0836py;
    }

    /* renamed from: a */
    public final void mo10854a(C0734op c0734op, boolean z) {
        if (c0734op instanceof C0835pn) {
            c0734op.mo14320d().mo14298a(false);
        }
        C0411pf c0411pf = this.f22245a.f22159d;
        if (c0411pf != null) {
            c0411pf.mo10854a(c0734op, z);
        }
    }

    /* renamed from: a */
    public final boolean mo10855a(C0734op c0734op) {
        if (c0734op == null) {
            return false;
        }
        ((C0835pn) c0734op).getItem().getItemId();
        C0411pf c0411pf = this.f22245a.f22159d;
        return c0411pf != null ? c0411pf.mo10855a(c0734op) : false;
    }
}
