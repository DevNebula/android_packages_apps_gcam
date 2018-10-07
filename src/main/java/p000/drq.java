package p000;

/* compiled from: PG */
/* renamed from: drq */
public final class drq implements fwl {
    /* renamed from: a */
    private final ilp f16561a;
    /* renamed from: b */
    private final iqz f16562b;
    /* renamed from: c */
    private final ilp f16563c = ilq.m3872a(ilq.m3875a(this.f16561a, new dta()));
    /* renamed from: d */
    private final ilp f16564d = ilq.m3872a(ilq.m3875a(this.f16561a, new drr()));

    public drq(ira ira, ilp ilp) {
        this.f16561a = ilp;
        this.f16562b = ira.mo8854a("ImgCptrSwitch");
    }

    /* renamed from: a */
    public final ilp mo6936a() {
        return this.f16563c;
    }

    /* renamed from: b */
    public final ilp mo6938b() {
        return this.f16564d;
    }

    /* renamed from: a */
    public final void mo6937a(fwm fwm, fwa fwa) {
        fwl fwl = (fwl) this.f16561a.mo13673b();
        iqz iqz = this.f16562b;
        String valueOf = String.valueOf(fwl.toString());
        String str = "Running command: ";
        if (valueOf.length() == 0) {
            valueOf = new String(str);
        } else {
            valueOf = str.concat(valueOf);
        }
        iqz.mo8832b(valueOf);
        fwl.mo6937a(fwm, fwa);
    }

    public final String toString() {
        kbd b = jqk.m13350b((Object) this);
        b.mo9704a().f8551b = this.f16561a;
        return b.toString();
    }
}
