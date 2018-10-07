package p000;

/* compiled from: PG */
/* renamed from: pq */
public final class C0742pq implements C0331kg {
    /* renamed from: a */
    private boolean f22238a = false;
    /* renamed from: b */
    private int f22239b;
    /* renamed from: c */
    private final /* synthetic */ C0417pp f22240c;

    protected C0742pq(C0417pp c0417pp) {
        this.f22240c = c0417pp;
    }

    /* renamed from: a */
    public final void mo9956a() {
        this.f22238a = true;
    }

    /* renamed from: b */
    public final void mo9957b() {
        if (!this.f22238a) {
            C0417pp c0417pp = this.f22240c;
            c0417pp.f9539e = null;
            super.setVisibility(this.f22239b);
        }
    }

    /* renamed from: c */
    public final void mo9958c() {
        super.setVisibility(0);
        this.f22238a = false;
    }

    /* renamed from: a */
    public final C0742pq mo14408a(C0328kd c0328kd, int i) {
        this.f22240c.f9539e = c0328kd;
        this.f22239b = i;
        return this;
    }
}
