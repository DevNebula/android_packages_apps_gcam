package p000;

/* compiled from: PG */
/* renamed from: af */
final class C0806af extends C0002ag implements C0758t {
    /* renamed from: d */
    private final C0587y f22476d;
    /* renamed from: e */
    private final /* synthetic */ C0000ac f22477e;

    C0806af(C0000ac c0000ac, C0587y c0587y, C0003ai c0003ai) {
        this.f22477e = c0000ac;
        super(c0000ac, c0003ai);
        this.f22476d = c0587y;
    }

    /* renamed from: b */
    final void mo242b() {
        this.f22476d.getLifecycle().mo11199b(this);
    }

    /* renamed from: a */
    final boolean mo241a(C0587y c0587y) {
        return this.f22476d == c0587y;
    }

    /* renamed from: a */
    public final void mo14418a(C0587y c0587y, C0531v c0531v) {
        if (this.f22476d.getLifecycle().mo11197a() == C0552w.DESTROYED) {
            this.f22477e.removeObserver(this.f426a);
        } else {
            mo239a(mo240a());
        }
    }

    /* renamed from: a */
    final boolean mo240a() {
        return this.f22476d.getLifecycle().mo11197a().mo11434a(C0552w.STARTED);
    }
}
