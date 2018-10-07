package p000;

/* compiled from: PG */
/* renamed from: ny */
final class C0828ny extends C0701kh {
    /* renamed from: a */
    private boolean f25379a = false;
    /* renamed from: b */
    private int f25380b = 0;
    /* renamed from: c */
    private final /* synthetic */ C0395nx f25381c;

    C0828ny(C0395nx c0395nx) {
        this.f25381c = c0395nx;
    }

    /* renamed from: b */
    public final void mo9957b() {
        int i = this.f25380b + 1;
        this.f25380b = i;
        if (i == this.f25381c.f9492a.size()) {
            C0331kg c0331kg = this.f25381c.f9493b;
            if (c0331kg != null) {
                c0331kg.mo9957b();
            }
            this.f25380b = 0;
            this.f25379a = false;
            this.f25381c.f9494c = false;
        }
    }

    /* renamed from: c */
    public final void mo9958c() {
        if (!this.f25379a) {
            this.f25379a = true;
            C0331kg c0331kg = this.f25381c.f9493b;
            if (c0331kg != null) {
                c0331kg.mo9958c();
            }
        }
    }
}
