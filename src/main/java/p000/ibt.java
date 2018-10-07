package p000;

/* renamed from: ibt */
public final class ibt extends ibm implements Cloneable {
    /* renamed from: a */
    private String[] f24563a;
    /* renamed from: b */
    private String[] f24564b;
    /* renamed from: c */
    private int[] f24565c;
    /* renamed from: d */
    private long[] f24566d;
    /* renamed from: e */
    private long[] f24567e;

    public ibt() {
        this.f24563a = ibs.f7282d;
        this.f24564b = ibs.f7282d;
        this.f24565c = ibs.f7279a;
        this.f24566d = ibs.f7280b;
        this.f24567e = ibs.f7280b;
        this.f20855o = null;
        this.f7278p = -1;
    }

    /* renamed from: b */
    private final ibt m16306b() {
        try {
            ibt ibt = (ibt) super.clone();
            Object obj = this.f24563a;
            if (obj != null && obj.length > 0) {
                ibt.f24563a = (String[]) obj.clone();
            }
            obj = this.f24564b;
            if (obj != null && obj.length > 0) {
                ibt.f24564b = (String[]) obj.clone();
            }
            obj = this.f24565c;
            if (obj != null && obj.length > 0) {
                ibt.f24565c = (int[]) obj.clone();
            }
            obj = this.f24566d;
            if (obj != null && obj.length > 0) {
                ibt.f24566d = (long[]) obj.clone();
            }
            obj = this.f24567e;
            if (obj != null && obj.length > 0) {
                ibt.f24567e = (long[]) obj.clone();
            }
            return ibt;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: a */
    public final void mo8343a(ibl ibl) {
        int i;
        String[] strArr;
        String str;
        int i2 = 0;
        String[] strArr2 = this.f24563a;
        if (strArr2 != null && strArr2.length > 0) {
            i = 0;
            while (true) {
                strArr = this.f24563a;
                if (i >= strArr.length) {
                    break;
                }
                str = strArr[i];
                if (str != null) {
                    ibl.mo8326a(1, str);
                }
                i++;
            }
        }
        strArr2 = this.f24564b;
        if (strArr2 != null && strArr2.length > 0) {
            i = 0;
            while (true) {
                strArr = this.f24564b;
                if (i >= strArr.length) {
                    break;
                }
                str = strArr[i];
                if (str != null) {
                    ibl.mo8326a(2, str);
                }
                i++;
            }
        }
        int[] iArr = this.f24565c;
        if (iArr != null && iArr.length > 0) {
            i = 0;
            while (true) {
                int[] iArr2 = this.f24565c;
                if (i >= iArr2.length) {
                    break;
                }
                ibl.mo8323a(3, iArr2[i]);
                i++;
            }
        }
        long[] jArr = this.f24566d;
        if (jArr != null && jArr.length > 0) {
            i = 0;
            while (true) {
                long[] jArr2 = this.f24566d;
                if (i >= jArr2.length) {
                    break;
                }
                ibl.mo8324a(4, jArr2[i]);
                i++;
            }
        }
        jArr = this.f24567e;
        if (jArr != null && jArr.length > 0) {
            while (true) {
                jArr = this.f24567e;
                if (i2 >= jArr.length) {
                    break;
                }
                ibl.mo8324a(5, jArr[i2]);
                i2++;
            }
        }
        super.mo8343a(ibl);
    }

    /* renamed from: c */
    public final /* synthetic */ ibm mo13616c() {
        return (ibt) clone();
    }

    /* renamed from: d */
    public final /* synthetic */ ibr mo8345d() {
        return (ibt) clone();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ibt)) {
            return false;
        }
        ibt ibt = (ibt) obj;
        return (ibq.m3711a(this.f24563a, ibt.f24563a) && ibq.m3711a(this.f24564b, ibt.f24564b) && ibq.m3709a(this.f24565c, ibt.f24565c) && ibq.m3710a(this.f24566d, ibt.f24566d) && ibq.m3710a(this.f24567e, ibt.f24567e)) ? (this.f20855o == null || this.f20855o.mo8333a()) ? ibt.f20855o == null || ibt.f20855o.mo8333a() : this.f20855o.equals(ibt.f20855o) : false;
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = (((((((((((getClass().getName().hashCode() + 527) * 31) + ibq.m3705a(this.f24563a)) * 31) + ibq.m3705a(this.f24564b)) * 31) + ibq.m3703a(this.f24565c)) * 31) + ibq.m3704a(this.f24566d)) * 31) + ibq.m3704a(this.f24567e)) * 31;
        if (!(this.f20855o == null || this.f20855o.mo8333a())) {
            i = this.f20855o.hashCode();
        }
        return i + hashCode;
    }

    /* renamed from: a */
    protected final int mo8342a() {
        int i;
        int i2;
        int i3;
        String[] strArr;
        String str;
        int length;
        int i4 = 0;
        int a = super.mo8342a();
        String[] strArr2 = this.f24563a;
        if (strArr2 != null && strArr2.length > 0) {
            i = 0;
            i2 = 0;
            i3 = 0;
            while (true) {
                strArr = this.f24563a;
                if (i >= strArr.length) {
                    break;
                }
                str = strArr[i];
                if (str != null) {
                    i3++;
                    i2 += ibl.m3674a(str);
                }
                i++;
            }
            a = (a + i2) + i3;
        }
        strArr2 = this.f24564b;
        if (strArr2 != null && strArr2.length > 0) {
            i = 0;
            i2 = 0;
            i3 = 0;
            while (true) {
                strArr = this.f24564b;
                if (i >= strArr.length) {
                    break;
                }
                str = strArr[i];
                if (str != null) {
                    i3++;
                    i2 += ibl.m3674a(str);
                }
                i++;
            }
            a = (a + i2) + i3;
        }
        int[] iArr = this.f24565c;
        if (iArr != null && iArr.length > 0) {
            i = 0;
            i2 = 0;
            while (true) {
                int[] iArr2 = this.f24565c;
                length = iArr2.length;
                if (i >= length) {
                    break;
                }
                i2 += ibl.m3672a(iArr2[i]);
                i++;
            }
            a = (a + i2) + length;
        }
        long[] jArr = this.f24566d;
        if (jArr != null && jArr.length > 0) {
            i = 0;
            i2 = 0;
            while (true) {
                long[] jArr2 = this.f24566d;
                length = jArr2.length;
                if (i >= length) {
                    break;
                }
                i2 += ibl.m3685c(jArr2[i]);
                i++;
            }
            a = (a + i2) + length;
        }
        jArr = this.f24567e;
        if (jArr == null || jArr.length <= 0) {
            return a;
        }
        i = 0;
        while (true) {
            long[] jArr3 = this.f24567e;
            i3 = jArr3.length;
            if (i4 >= i3) {
                return (i + a) + i3;
            }
            i += ibl.m3685c(jArr3[i4]);
            i4++;
        }
    }
}
