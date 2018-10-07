package p000;

/* renamed from: iby */
public final class iby extends ibm implements Cloneable {
    /* renamed from: a */
    private int f24593a;

    public iby() {
        this.f24593a = -1;
        this.f20855o = null;
        this.f7278p = -1;
    }

    /* renamed from: b */
    private final iby m16332b() {
        try {
            return (iby) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: a */
    protected final int mo8342a() {
        int a = super.mo8342a();
        int i = this.f24593a;
        return i != -1 ? a + ibl.m3679b(1, i) : a;
    }

    /* renamed from: a */
    public final void mo8343a(ibl ibl) {
        int i = this.f24593a;
        if (i != -1) {
            ibl.mo8323a(1, i);
        }
        super.mo8343a(ibl);
    }

    /* renamed from: c */
    public final /* synthetic */ ibm mo13616c() {
        return (iby) clone();
    }

    /* renamed from: d */
    public final /* synthetic */ ibr mo8345d() {
        return (iby) clone();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof iby)) {
            return false;
        }
        iby iby = (iby) obj;
        return this.f24593a == iby.f24593a ? (this.f20855o == null || this.f20855o.mo8333a()) ? iby.f20855o == null || iby.f20855o.mo8333a() : this.f20855o.equals(iby.f20855o) : false;
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = ((((getClass().getName().hashCode() + 527) * 31) + this.f24593a) * 31) * 31;
        if (!(this.f20855o == null || this.f20855o.mo8333a())) {
            i = this.f20855o.hashCode();
        }
        return i + hashCode;
    }
}
