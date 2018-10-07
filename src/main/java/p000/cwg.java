package p000;

/* compiled from: PG */
/* renamed from: cwg */
public final class cwg implements cvz {
    /* renamed from: a */
    private static final String f13325a = bli.m887a("SimpleModuleAgent");
    /* renamed from: b */
    private final cwa f13326b;
    /* renamed from: c */
    private final kwk f13327c;

    public cwg(cwa cwa, kwk kwk) {
        this.f13326b = cwa;
        this.f13327c = kwk;
    }

    /* renamed from: a */
    public final kpk mo5869a() {
        String str = f13325a;
        String valueOf = String.valueOf(this.f13326b.f3018b);
        String str2 = "Creating module: ";
        if (valueOf.length() == 0) {
            valueOf = new String(str2);
        } else {
            valueOf = str2.concat(valueOf);
        }
        bli.m894c(str, valueOf);
        return (kpk) this.f13327c.mo10566a();
    }

    /* renamed from: b */
    public final cwa mo5870b() {
        return this.f13326b;
    }
}
