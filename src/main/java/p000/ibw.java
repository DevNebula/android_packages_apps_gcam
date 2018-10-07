package p000;

import java.util.Arrays;

/* renamed from: ibw */
public final class ibw extends ibm implements Cloneable {
    /* renamed from: a */
    public long f24573a;
    /* renamed from: b */
    public long f24574b;
    /* renamed from: c */
    public byte[] f24575c;
    /* renamed from: d */
    public long f24576d;
    /* renamed from: e */
    public byte[] f24577e;
    /* renamed from: f */
    private String f24578f;
    /* renamed from: g */
    private ibx[] f24579g;
    /* renamed from: h */
    private byte[] f24580h;
    /* renamed from: i */
    private ibu f24581i;
    /* renamed from: j */
    private String f24582j;
    /* renamed from: k */
    private String f24583k;
    /* renamed from: l */
    private ibt f24584l;
    /* renamed from: m */
    private String f24585m;
    /* renamed from: n */
    private ibv f24586n;
    /* renamed from: q */
    private String f24587q;
    /* renamed from: r */
    private int[] f24588r;
    /* renamed from: s */
    private iby f24589s;

    public ibw() {
        this.f24573a = 0;
        this.f24574b = 0;
        this.f24578f = "";
        this.f24579g = ibx.m16326b();
        this.f24580h = ibs.f7284f;
        this.f24581i = null;
        this.f24575c = ibs.f7284f;
        this.f24582j = "";
        this.f24583k = "";
        this.f24584l = null;
        this.f24585m = "";
        this.f24576d = 180000;
        this.f24586n = null;
        this.f24577e = ibs.f7284f;
        this.f24587q = "";
        this.f24588r = ibs.f7279a;
        this.f24589s = null;
        this.f20855o = null;
        this.f7278p = -1;
    }

    /* renamed from: b */
    private final ibw m16321b() {
        try {
            ibw ibw = (ibw) super.clone();
            ibx[] ibxArr = this.f24579g;
            if (ibxArr != null) {
                int length = ibxArr.length;
                if (length > 0) {
                    ibw.f24579g = new ibx[length];
                    length = 0;
                    while (true) {
                        int i = length;
                        ibxArr = this.f24579g;
                        if (i >= ibxArr.length) {
                            break;
                        }
                        ibx ibx = ibxArr[i];
                        if (ibx != null) {
                            ibw.f24579g[i] = (ibx) ibx.clone();
                        }
                        length = i + 1;
                    }
                }
            }
            ibu ibu = this.f24581i;
            if (ibu != null) {
                ibw.f24581i = (ibu) ibu.clone();
            }
            ibt ibt = this.f24584l;
            if (ibt != null) {
                ibw.f24584l = (ibt) ibt.clone();
            }
            ibv ibv = this.f24586n;
            if (ibv != null) {
                ibw.f24586n = (ibv) ibv.clone();
            }
            Object obj = this.f24588r;
            if (obj != null && obj.length > 0) {
                ibw.f24588r = (int[]) obj.clone();
            }
            iby iby = this.f24589s;
            if (iby != null) {
                ibw.f24589s = (iby) iby.clone();
            }
            return ibw;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: c */
    public final /* synthetic */ ibm mo13616c() {
        return (ibw) clone();
    }

    /* renamed from: d */
    public final /* synthetic */ ibr mo8345d() {
        return (ibw) clone();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ibw)) {
            return false;
        }
        ibw ibw = (ibw) obj;
        if (this.f24573a != ibw.f24573a || this.f24574b != ibw.f24574b) {
            return false;
        }
        String str = this.f24578f;
        if (str != null) {
            if (!str.equals(ibw.f24578f)) {
                return false;
            }
        } else if (ibw.f24578f != null) {
            return false;
        }
        if (!ibq.m3711a(this.f24579g, ibw.f24579g) || !Arrays.equals(this.f24580h, ibw.f24580h)) {
            return false;
        }
        ibu ibu = this.f24581i;
        if (ibu != null) {
            if (!ibu.equals(ibw.f24581i)) {
                return false;
            }
        } else if (ibw.f24581i != null) {
            return false;
        }
        if (!Arrays.equals(this.f24575c, ibw.f24575c)) {
            return false;
        }
        str = this.f24582j;
        if (str != null) {
            if (!str.equals(ibw.f24582j)) {
                return false;
            }
        } else if (ibw.f24582j != null) {
            return false;
        }
        str = this.f24583k;
        if (str != null) {
            if (!str.equals(ibw.f24583k)) {
                return false;
            }
        } else if (ibw.f24583k != null) {
            return false;
        }
        ibt ibt = this.f24584l;
        if (ibt != null) {
            if (!ibt.equals(ibw.f24584l)) {
                return false;
            }
        } else if (ibw.f24584l != null) {
            return false;
        }
        str = this.f24585m;
        if (str != null) {
            if (!str.equals(ibw.f24585m)) {
                return false;
            }
        } else if (ibw.f24585m != null) {
            return false;
        }
        if (this.f24576d != ibw.f24576d) {
            return false;
        }
        ibv ibv = this.f24586n;
        if (ibv != null) {
            if (!ibv.equals(ibw.f24586n)) {
                return false;
            }
        } else if (ibw.f24586n != null) {
            return false;
        }
        if (!Arrays.equals(this.f24577e, ibw.f24577e)) {
            return false;
        }
        str = this.f24587q;
        if (str != null) {
            if (!str.equals(ibw.f24587q)) {
                return false;
            }
        } else if (ibw.f24587q != null) {
            return false;
        }
        if (!ibq.m3709a(this.f24588r, ibw.f24588r)) {
            return false;
        }
        iby iby = this.f24589s;
        if (iby != null) {
            if (!iby.equals(ibw.f24589s)) {
                return false;
            }
        } else if (ibw.f24589s != null) {
            return false;
        }
        return (this.f20855o == null || this.f20855o.mo8333a()) ? ibw.f20855o == null || ibw.f20855o.mo8333a() : this.f20855o.equals(ibw.f20855o);
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = getClass().getName().hashCode();
        long j = this.f24573a;
        long j2 = this.f24574b;
        int i2 = ((((((hashCode + 527) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) ((j2 >>> 32) ^ j2))) * 31) * 31;
        String str = this.f24578f;
        i2 = ((((((((((str != null ? str.hashCode() : 0) + i2) * 31) * 31) * 31) + 1237) * 31) + ibq.m3705a(this.f24579g)) * 31) + Arrays.hashCode(this.f24580h)) * 31;
        ibu ibu = this.f24581i;
        i2 = ((((ibu != null ? ibu.hashCode() : 0) + i2) * 31) + Arrays.hashCode(this.f24575c)) * 31;
        str = this.f24582j;
        i2 = ((str != null ? str.hashCode() : 0) + i2) * 31;
        str = this.f24583k;
        i2 = ((str != null ? str.hashCode() : 0) + i2) * 31;
        ibt ibt = this.f24584l;
        i2 = ((ibt != null ? ibt.hashCode() : 0) + i2) * 31;
        str = this.f24585m;
        hashCode = str != null ? str.hashCode() : 0;
        j2 = this.f24576d;
        i2 = (((hashCode + i2) * 31) + ((int) ((j2 >>> 32) ^ j2))) * 31;
        ibv ibv = this.f24586n;
        i2 = ((((ibv != null ? ibv.hashCode() : 0) + i2) * 31) + Arrays.hashCode(this.f24577e)) * 31;
        str = this.f24587q;
        i2 = ((((((str != null ? str.hashCode() : 0) + i2) * 31) * 31) + ibq.m3703a(this.f24588r)) * 31) * 31;
        iby iby = this.f24589s;
        hashCode = ((iby != null ? iby.hashCode() : 0) + i2) * 31;
        if (!(this.f20855o == null || this.f20855o.mo8333a())) {
            i = this.f20855o.hashCode();
        }
        return hashCode + i;
    }

    /* renamed from: a */
    protected final int mo8342a() {
        int i;
        int i2 = 0;
        int a = super.mo8342a();
        long j = this.f24573a;
        if (j != 0) {
            a += ibl.m3680b(1, j);
        }
        String str = this.f24578f;
        if (!(str == null || str.equals(""))) {
            a += ibl.m3682b(2, this.f24578f);
        }
        ibx[] ibxArr = this.f24579g;
        if (ibxArr != null && ibxArr.length > 0) {
            i = a;
            a = 0;
            while (true) {
                ibx[] ibxArr2 = this.f24579g;
                if (a >= ibxArr2.length) {
                    break;
                }
                ibr ibr = ibxArr2[a];
                if (ibr != null) {
                    i += ibl.m3681b(3, ibr);
                }
                a++;
            }
            a = i;
        }
        if (!Arrays.equals(this.f24580h, ibs.f7284f)) {
            a += ibl.m3683b(4, this.f24580h);
        }
        if (!Arrays.equals(this.f24575c, ibs.f7284f)) {
            a += ibl.m3683b(6, this.f24575c);
        }
        ibr ibr2 = this.f24584l;
        if (ibr2 != null) {
            a += ibl.m3681b(7, ibr2);
        }
        str = this.f24582j;
        if (!(str == null || str.equals(""))) {
            a += ibl.m3682b(8, this.f24582j);
        }
        ibr2 = this.f24581i;
        if (ibr2 != null) {
            a += ibl.m3681b(9, ibr2);
        }
        str = this.f24583k;
        if (!(str == null || str.equals(""))) {
            a += ibl.m3682b(13, this.f24583k);
        }
        str = this.f24585m;
        if (!(str == null || str.equals(""))) {
            a += ibl.m3682b(14, this.f24585m);
        }
        j = this.f24576d;
        if (j != 180000) {
            a += ibl.m3685c(ibl.m3676a(j)) + ibl.m3684c(120);
        }
        ibr2 = this.f24586n;
        if (ibr2 != null) {
            a += ibl.m3681b(16, ibr2);
        }
        j = this.f24574b;
        if (j != 0) {
            a += ibl.m3680b(17, j);
        }
        i = !Arrays.equals(this.f24577e, ibs.f7284f) ? ibl.m3683b(18, this.f24577e) + a : a;
        int[] iArr = this.f24588r;
        if (iArr == null) {
            a = i;
        } else if (iArr.length > 0) {
            int length;
            a = 0;
            while (true) {
                int[] iArr2 = this.f24588r;
                length = iArr2.length;
                if (i2 >= length) {
                    break;
                }
                a += ibl.m3672a(iArr2[i2]);
                i2++;
            }
            a = (a + i) + (length + length);
        } else {
            a = i;
        }
        ibr ibr3 = this.f24589s;
        if (ibr3 != null) {
            a += ibl.m3681b(23, ibr3);
        }
        String str2 = this.f24587q;
        return (str2 == null || str2.equals("")) ? a : a + ibl.m3682b(24, this.f24587q);
    }

    /* renamed from: a */
    public final void mo8343a(ibl ibl) {
        int i = 0;
        long j = this.f24573a;
        if (j != 0) {
            ibl.mo8324a(1, j);
        }
        String str = this.f24578f;
        if (!(str == null || str.equals(""))) {
            ibl.mo8326a(2, this.f24578f);
        }
        ibx[] ibxArr = this.f24579g;
        if (ibxArr != null && ibxArr.length > 0) {
            int i2 = 0;
            while (true) {
                ibx[] ibxArr2 = this.f24579g;
                if (i2 >= ibxArr2.length) {
                    break;
                }
                ibr ibr = ibxArr2[i2];
                if (ibr != null) {
                    ibl.mo8325a(3, ibr);
                }
                i2++;
            }
        }
        if (!Arrays.equals(this.f24580h, ibs.f7284f)) {
            ibl.mo8327a(4, this.f24580h);
        }
        if (!Arrays.equals(this.f24575c, ibs.f7284f)) {
            ibl.mo8327a(6, this.f24575c);
        }
        ibr ibr2 = this.f24584l;
        if (ibr2 != null) {
            ibl.mo8325a(7, ibr2);
        }
        str = this.f24582j;
        if (!(str == null || str.equals(""))) {
            ibl.mo8326a(8, this.f24582j);
        }
        ibr2 = this.f24581i;
        if (ibr2 != null) {
            ibl.mo8325a(9, ibr2);
        }
        str = this.f24583k;
        if (!(str == null || str.equals(""))) {
            ibl.mo8326a(13, this.f24583k);
        }
        str = this.f24585m;
        if (!(str == null || str.equals(""))) {
            ibl.mo8326a(14, this.f24585m);
        }
        j = this.f24576d;
        if (j != 180000) {
            ibl.mo8330c(15, 0);
            ibl.mo8329b(ibl.m3676a(j));
        }
        ibr2 = this.f24586n;
        if (ibr2 != null) {
            ibl.mo8325a(16, ibr2);
        }
        j = this.f24574b;
        if (j != 0) {
            ibl.mo8324a(17, j);
        }
        if (!Arrays.equals(this.f24577e, ibs.f7284f)) {
            ibl.mo8327a(18, this.f24577e);
        }
        int[] iArr = this.f24588r;
        if (iArr != null && iArr.length > 0) {
            while (true) {
                iArr = this.f24588r;
                if (i >= iArr.length) {
                    break;
                }
                ibl.mo8323a(20, iArr[i]);
                i++;
            }
        }
        ibr ibr3 = this.f24589s;
        if (ibr3 != null) {
            ibl.mo8325a(23, ibr3);
        }
        String str2 = this.f24587q;
        if (!(str2 == null || str2.equals(""))) {
            ibl.mo8326a(24, this.f24587q);
        }
        super.mo8343a(ibl);
    }
}
