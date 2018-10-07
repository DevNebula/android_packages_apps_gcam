package p000;

/* renamed from: ibh */
public final class ibh extends ibm {
    /* renamed from: c */
    private static volatile ibh[] f24546c;
    /* renamed from: a */
    public int f24547a;
    /* renamed from: b */
    public ibi f24548b;

    public ibh() {
        this.f24547a = 1;
        this.f24548b = null;
        this.f20855o = null;
        this.f7278p = -1;
    }

    /* renamed from: b */
    public static ibh[] m16301b() {
        if (f24546c == null) {
            synchronized (ibq.f7277a) {
                if (f24546c == null) {
                    f24546c = new ibh[0];
                }
            }
        }
        return f24546c;
    }

    /* renamed from: a */
    protected final int mo8342a() {
        int a = super.mo8342a() + ibl.m3679b(1, this.f24547a);
        ibr ibr = this.f24548b;
        return ibr != null ? a + ibl.m3681b(2, ibr) : a;
    }

    /* renamed from: a */
    public final void mo8343a(ibl ibl) {
        ibl.mo8323a(1, this.f24547a);
        ibr ibr = this.f24548b;
        if (ibr != null) {
            ibl.mo8325a(2, ibr);
        }
        super.mo8343a(ibl);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ibh)) {
            return false;
        }
        ibh ibh = (ibh) obj;
        if (this.f24547a != ibh.f24547a) {
            return false;
        }
        ibi ibi = this.f24548b;
        if (ibi != null) {
            if (!ibi.equals(ibh.f24548b)) {
                return false;
            }
        } else if (ibh.f24548b != null) {
            return false;
        }
        return (this.f20855o == null || this.f20855o.mo8333a()) ? ibh.f20855o == null || ibh.f20855o.mo8333a() : this.f20855o.equals(ibh.f20855o);
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = (((getClass().getName().hashCode() + 527) * 31) + this.f24547a) * 31;
        ibi ibi = this.f24548b;
        int hashCode2 = ((ibi != null ? ibi.hashCode() : 0) + hashCode) * 31;
        if (!(this.f20855o == null || this.f20855o.mo8333a())) {
            i = this.f20855o.hashCode();
        }
        return hashCode2 + i;
    }
}
