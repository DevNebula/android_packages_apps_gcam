package p000;

/* renamed from: ibu */
public final class ibu extends ibm implements Cloneable {
    /* renamed from: a */
    private String f24568a;
    /* renamed from: b */
    private String f24569b;

    public ibu() {
        this.f24568a = "";
        this.f24569b = "";
        this.f20855o = null;
        this.f7278p = -1;
    }

    /* renamed from: b */
    private final ibu m16311b() {
        try {
            return (ibu) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: a */
    protected final int mo8342a() {
        int a = super.mo8342a();
        String str = this.f24568a;
        if (!(str == null || str.equals(""))) {
            a += ibl.m3682b(2, this.f24568a);
        }
        str = this.f24569b;
        return (str == null || str.equals("")) ? a : a + ibl.m3682b(3, this.f24569b);
    }

    /* renamed from: a */
    public final void mo8343a(ibl ibl) {
        String str = this.f24568a;
        if (!(str == null || str.equals(""))) {
            ibl.mo8326a(2, this.f24568a);
        }
        str = this.f24569b;
        if (!(str == null || str.equals(""))) {
            ibl.mo8326a(3, this.f24569b);
        }
        super.mo8343a(ibl);
    }

    /* renamed from: c */
    public final /* synthetic */ ibm mo13616c() {
        return (ibu) clone();
    }

    /* renamed from: d */
    public final /* synthetic */ ibr mo8345d() {
        return (ibu) clone();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ibu)) {
            return false;
        }
        ibu ibu = (ibu) obj;
        String str = this.f24568a;
        if (str != null) {
            if (!str.equals(ibu.f24568a)) {
                return false;
            }
        } else if (ibu.f24568a != null) {
            return false;
        }
        str = this.f24569b;
        if (str != null) {
            if (!str.equals(ibu.f24569b)) {
                return false;
            }
        } else if (ibu.f24569b != null) {
            return false;
        }
        return (this.f20855o == null || this.f20855o.mo8333a()) ? ibu.f20855o == null || ibu.f20855o.mo8333a() : this.f20855o.equals(ibu.f20855o);
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = ((getClass().getName().hashCode() + 527) * 31) * 31;
        String str = this.f24568a;
        hashCode = ((str != null ? str.hashCode() : 0) + hashCode) * 31;
        str = this.f24569b;
        int hashCode2 = ((str != null ? str.hashCode() : 0) + hashCode) * 31;
        if (!(this.f20855o == null || this.f20855o.mo8333a())) {
            i = this.f20855o.hashCode();
        }
        return hashCode2 + i;
    }
}
