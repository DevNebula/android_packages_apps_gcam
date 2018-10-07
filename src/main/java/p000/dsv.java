package p000;

/* compiled from: PG */
/* renamed from: dsv */
public final class dsv implements fbh, fwl {
    /* renamed from: a */
    private final fwl f16652a;
    /* renamed from: b */
    private final ilb f16653b = new ilb(fbi.IDLE);

    public dsv(fwl fwl) {
        this.f16652a = fwl;
    }

    /* renamed from: a */
    public final ilp mo6936a() {
        return this.f16652a.mo9689a();
    }

    /* renamed from: j_ */
    public final ilp mo6726j_() {
        return this.f16653b;
    }

    /* renamed from: b */
    public final ilp mo6938b() {
        return this.f16652a.mo9689a();
    }

    /* renamed from: a */
    public final void mo6937a(fwm fwm, fwa fwa) {
        try {
            m9495a(fbi.RUNNING);
            this.f16652a.mo6937a(fwm, fwa);
        } finally {
            m9495a(fbi.IDLE);
        }
    }

    /* renamed from: a */
    private final void m9495a(fbi fbi) {
        this.f16653b.mo8826a(fbi);
    }
}
