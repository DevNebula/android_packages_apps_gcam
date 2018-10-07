package p000;

/* renamed from: ibx */
public final class ibx extends ibm implements Cloneable {
    /* renamed from: a */
    private static volatile ibx[] f24590a;
    /* renamed from: b */
    private String f24591b;
    /* renamed from: c */
    private String f24592c;

    public ibx() {
        this.f24591b = "";
        this.f24592c = "";
        this.f20855o = null;
        this.f7278p = -1;
    }

    /* renamed from: b */
    public static ibx[] m16326b() {
        if (f24590a == null) {
            synchronized (ibq.f7277a) {
                if (f24590a == null) {
                    f24590a = new ibx[0];
                }
            }
        }
        return f24590a;
    }

    /* renamed from: f */
    private final ibx m16327f() {
        try {
            return (ibx) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: a */
    protected final int mo8342a() {
        int a = super.mo8342a();
        String str = this.f24591b;
        if (!(str == null || str.equals(""))) {
            a += ibl.m3682b(1, this.f24591b);
        }
        str = this.f24592c;
        return (str == null || str.equals("")) ? a : a + ibl.m3682b(2, this.f24592c);
    }

    /* renamed from: a */
    public final void mo8343a(ibl ibl) {
        String str = this.f24591b;
        if (!(str == null || str.equals(""))) {
            ibl.mo8326a(1, this.f24591b);
        }
        str = this.f24592c;
        if (!(str == null || str.equals(""))) {
            ibl.mo8326a(2, this.f24592c);
        }
        super.mo8343a(ibl);
    }

    /* renamed from: c */
    public final /* synthetic */ ibm mo13616c() {
        return (ibx) clone();
    }

    /* renamed from: d */
    public final /* synthetic */ ibr mo8345d() {
        return (ibx) clone();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ibx)) {
            return false;
        }
        ibx ibx = (ibx) obj;
        String str = this.f24591b;
        if (str != null) {
            if (!str.equals(ibx.f24591b)) {
                return false;
            }
        } else if (ibx.f24591b != null) {
            return false;
        }
        str = this.f24592c;
        if (str != null) {
            if (!str.equals(ibx.f24592c)) {
                return false;
            }
        } else if (ibx.f24592c != null) {
            return false;
        }
        return (this.f20855o == null || this.f20855o.mo8333a()) ? ibx.f20855o == null || ibx.f20855o.mo8333a() : this.f20855o.equals(ibx.f20855o);
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = (getClass().getName().hashCode() + 527) * 31;
        String str = this.f24591b;
        hashCode = ((str != null ? str.hashCode() : 0) + hashCode) * 31;
        str = this.f24592c;
        int hashCode2 = ((str != null ? str.hashCode() : 0) + hashCode) * 31;
        if (!(this.f20855o == null || this.f20855o.mo8333a())) {
            i = this.f20855o.hashCode();
        }
        return hashCode2 + i;
    }
}
