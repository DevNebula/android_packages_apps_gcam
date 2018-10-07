package p000;

/* compiled from: PG */
/* renamed from: jys */
final class jys implements jtv {
    /* renamed from: a */
    private final jtv f21817a;
    /* renamed from: b */
    private final String f21818b;
    /* renamed from: c */
    private final jyy f21819c;

    public jys(jtv jtv, String str, jyy jyy) {
        String valueOf;
        String str2;
        Object str3;
        this.f21817a = jtv;
        if (str != null) {
            valueOf = String.valueOf(str);
            str2 = "_";
            str3 = valueOf.length() == 0 ? new String(str2) : str2.concat(valueOf);
        } else {
            str3 = "";
        }
        str2 = String.valueOf(jtv.getClass().getSimpleName());
        valueOf = String.valueOf(str3);
        if (valueOf.length() == 0) {
            valueOf = new String(str2);
        } else {
            valueOf = str2.concat(valueOf);
        }
        this.f21818b = valueOf;
        this.f21819c = jyy;
    }

    /* renamed from: a */
    public final jzf mo9554a(long j) {
        jzf a = this.f21817a.mo9554a(j);
        this.f21819c.mo13890a(this.f21818b, j, a.mo9629a());
        return a;
    }

    /* renamed from: b */
    public final void mo9556b(long j) {
        this.f21817a.mo9556b(j);
    }

    /* renamed from: c */
    public final void mo9557c(long j) {
        this.f21817a.mo9557c(j);
    }

    /* renamed from: a */
    public final void mo9555a() {
        this.f21817a.mo9555a();
    }

    public final String toString() {
        return this.f21817a.toString();
    }
}
