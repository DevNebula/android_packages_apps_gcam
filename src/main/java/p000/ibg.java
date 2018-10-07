package p000;

/* renamed from: ibg */
public final class ibg extends ibm {
    /* renamed from: c */
    private static volatile ibg[] f24543c;
    /* renamed from: a */
    public String f24544a;
    /* renamed from: b */
    public ibh f24545b;

    public ibg() {
        this.f24544a = "";
        this.f24545b = null;
        this.f20855o = null;
        this.f7278p = -1;
    }

    /* renamed from: b */
    public static ibg[] m16298b() {
        if (f24543c == null) {
            synchronized (ibq.f7277a) {
                if (f24543c == null) {
                    f24543c = new ibg[0];
                }
            }
        }
        return f24543c;
    }

    /* renamed from: a */
    protected final int mo8342a() {
        int a = super.mo8342a() + ibl.m3682b(1, this.f24544a);
        ibr ibr = this.f24545b;
        return ibr != null ? a + ibl.m3681b(2, ibr) : a;
    }

    /* renamed from: a */
    public final void mo8343a(ibl ibl) {
        ibl.mo8326a(1, this.f24544a);
        ibr ibr = this.f24545b;
        if (ibr != null) {
            ibl.mo8325a(2, ibr);
        }
        super.mo8343a(ibl);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ibg)) {
            return false;
        }
        ibg ibg = (ibg) obj;
        String str = this.f24544a;
        if (str != null) {
            if (!str.equals(ibg.f24544a)) {
                return false;
            }
        } else if (ibg.f24544a != null) {
            return false;
        }
        ibh ibh = this.f24545b;
        if (ibh != null) {
            if (!ibh.equals(ibg.f24545b)) {
                return false;
            }
        } else if (ibg.f24545b != null) {
            return false;
        }
        return (this.f20855o == null || this.f20855o.mo8333a()) ? ibg.f20855o == null || ibg.f20855o.mo8333a() : this.f20855o.equals(ibg.f20855o);
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = (getClass().getName().hashCode() + 527) * 31;
        String str = this.f24544a;
        hashCode = ((str != null ? str.hashCode() : 0) + hashCode) * 31;
        ibh ibh = this.f24545b;
        int hashCode2 = ((ibh != null ? ibh.hashCode() : 0) + hashCode) * 31;
        if (!(this.f20855o == null || this.f20855o.mo8333a())) {
            i = this.f20855o.hashCode();
        }
        return hashCode2 + i;
    }
}
