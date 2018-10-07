package p000;

/* compiled from: PG */
/* renamed from: dsw */
public final class dsw implements fwl {
    /* renamed from: a */
    private fwl f16654a;
    /* renamed from: b */
    private boolean f16655b;
    /* renamed from: c */
    private int f16656c;

    static {
        bli.m887a("UsgStatsImgCapCmd");
    }

    public dsw(fwl fwl, int i, boolean z) {
        this.f16654a = (fwl) jri.m13404b((Object) fwl);
        this.f16656c = i;
        this.f16655b = z;
    }

    /* renamed from: a */
    public final ilp mo6936a() {
        return this.f16654a.mo9689a();
    }

    /* renamed from: b */
    public final ilp mo6938b() {
        return this.f16654a.mo9689a();
    }

    /* renamed from: a */
    public final void mo6937a(fwm fwm, fwa fwa) {
        fwa.f4982b.mo7077h().mo7375a(this.f16655b);
        fwa.f4982b.mo13361a(this.f16656c);
        this.f16654a.mo6937a(fwm, fwa);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f16654a.toString());
        String str = "UsageStats for ";
        return valueOf.length() == 0 ? new String(str) : str.concat(valueOf);
    }
}
