package p000;

/* renamed from: ibf */
public final class ibf extends ibm {
    /* renamed from: a */
    public ibg[] f24542a;

    public ibf() {
        this.f24542a = ibg.m16298b();
        this.f20855o = null;
        this.f7278p = -1;
    }

    /* renamed from: a */
    protected final int mo8342a() {
        int a = super.mo8342a();
        ibg[] ibgArr = this.f24542a;
        if (ibgArr != null && ibgArr.length > 0) {
            int i = 0;
            while (true) {
                ibg[] ibgArr2 = this.f24542a;
                if (i >= ibgArr2.length) {
                    break;
                }
                ibr ibr = ibgArr2[i];
                if (ibr != null) {
                    a += ibl.m3681b(1, ibr);
                }
                i++;
            }
        }
        return a;
    }

    /* renamed from: a */
    public final void mo8343a(ibl ibl) {
        ibg[] ibgArr = this.f24542a;
        if (ibgArr != null && ibgArr.length > 0) {
            int i = 0;
            while (true) {
                ibg[] ibgArr2 = this.f24542a;
                if (i >= ibgArr2.length) {
                    break;
                }
                ibr ibr = ibgArr2[i];
                if (ibr != null) {
                    ibl.mo8325a(1, ibr);
                }
                i++;
            }
        }
        super.mo8343a(ibl);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ibf)) {
            return false;
        }
        ibf ibf = (ibf) obj;
        return ibq.m3711a(this.f24542a, ibf.f24542a) ? (this.f20855o == null || this.f20855o.mo8333a()) ? ibf.f20855o == null || ibf.f20855o.mo8333a() : this.f20855o.equals(ibf.f20855o) : false;
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = (((getClass().getName().hashCode() + 527) * 31) + ibq.m3705a(this.f24542a)) * 31;
        if (!(this.f20855o == null || this.f20855o.mo8333a())) {
            i = this.f20855o.hashCode();
        }
        return i + hashCode;
    }
}
