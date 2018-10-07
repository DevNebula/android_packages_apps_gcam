package p000;

/* compiled from: PG */
/* renamed from: fhb */
public final class fhb implements fha {
    /* renamed from: a */
    private final boolean f18271a;
    /* renamed from: b */
    private final boolean f18272b;
    /* renamed from: c */
    private final boolean f18273c;

    public fhb(aaz aaz, fhc fhc) {
        boolean z;
        boolean z2 = true;
        this.f18271a = aaz.mo49a(abd.HDR);
        if (fhc.f4781a != C0252go.f5849av) {
            z = true;
        } else {
            z = false;
        }
        this.f18272b = z;
        if (!(aaz.mo47a(abb.AUTO) || aaz.mo47a(abb.ON))) {
            z2 = false;
        }
        this.f18273c = z2;
    }

    /* renamed from: a */
    public final boolean mo6786a() {
        return this.f18273c;
    }

    /* renamed from: b */
    public final boolean mo6787b() {
        return this.f18272b;
    }

    /* renamed from: c */
    public final boolean mo6788c() {
        return this.f18271a;
    }
}
