package p000;

import java.util.Arrays;

/* renamed from: ibi */
public final class ibi extends ibm {
    /* renamed from: a */
    public byte[] f24549a;
    /* renamed from: b */
    public String f24550b;
    /* renamed from: c */
    public double f24551c;
    /* renamed from: d */
    public float f24552d;
    /* renamed from: e */
    public long f24553e;
    /* renamed from: f */
    public int f24554f;
    /* renamed from: g */
    public int f24555g;
    /* renamed from: h */
    public boolean f24556h;
    /* renamed from: i */
    public ibg[] f24557i;
    /* renamed from: j */
    public ibh[] f24558j;
    /* renamed from: k */
    public String[] f24559k;
    /* renamed from: l */
    public long[] f24560l;
    /* renamed from: m */
    public float[] f24561m;
    /* renamed from: n */
    public long f24562n;

    public ibi() {
        this.f24549a = ibs.f7284f;
        this.f24550b = "";
        this.f24551c = 0.0d;
        this.f24552d = 0.0f;
        this.f24553e = 0;
        this.f24554f = 0;
        this.f24555g = 0;
        this.f24556h = false;
        this.f24557i = ibg.m16298b();
        this.f24558j = ibh.m16301b();
        this.f24559k = ibs.f7282d;
        this.f24560l = ibs.f7280b;
        this.f24561m = ibs.f7281c;
        this.f24562n = 0;
        this.f20855o = null;
        this.f7278p = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ibi)) {
            return false;
        }
        ibi ibi = (ibi) obj;
        if (!Arrays.equals(this.f24549a, ibi.f24549a)) {
            return false;
        }
        String str = this.f24550b;
        if (str != null) {
            if (!str.equals(ibi.f24550b)) {
                return false;
            }
        } else if (ibi.f24550b != null) {
            return false;
        }
        return (Double.doubleToLongBits(this.f24551c) == Double.doubleToLongBits(ibi.f24551c) && Float.floatToIntBits(this.f24552d) == Float.floatToIntBits(ibi.f24552d) && this.f24553e == ibi.f24553e && this.f24554f == ibi.f24554f && this.f24555g == ibi.f24555g && this.f24556h == ibi.f24556h && ibq.m3711a(this.f24557i, ibi.f24557i) && ibq.m3711a(this.f24558j, ibi.f24558j) && ibq.m3711a(this.f24559k, ibi.f24559k) && ibq.m3710a(this.f24560l, ibi.f24560l) && ibq.m3708a(this.f24561m, ibi.f24561m) && this.f24562n == ibi.f24562n) ? (this.f20855o == null || this.f20855o.mo8333a()) ? ibi.f20855o == null || ibi.f20855o.mo8333a() : this.f20855o.equals(ibi.f20855o) : false;
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = (((getClass().getName().hashCode() + 527) * 31) + Arrays.hashCode(this.f24549a)) * 31;
        String str = this.f24550b;
        int hashCode2 = str != null ? str.hashCode() : 0;
        long doubleToLongBits = Double.doubleToLongBits(this.f24551c);
        int floatToIntBits = Float.floatToIntBits(this.f24552d);
        long j = this.f24553e;
        hashCode = (((((((((((hashCode2 + hashCode) * 31) + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)))) * 31) + floatToIntBits) * 31) + ((int) ((j >>> 32) ^ j))) * 31) + this.f24554f) * 31) + this.f24555g) * 31;
        hashCode2 = !this.f24556h ? 1237 : 1231;
        floatToIntBits = ibq.m3705a(this.f24557i);
        int a = ibq.m3705a(this.f24558j);
        int a2 = ibq.m3705a(this.f24559k);
        int a3 = ibq.m3704a(this.f24560l);
        int a4 = ibq.m3702a(this.f24561m);
        long j2 = this.f24562n;
        hashCode2 = (((((((((((((hashCode2 + hashCode) * 31) + floatToIntBits) * 31) + a) * 31) + a2) * 31) + a3) * 31) + a4) * 31) + ((int) ((j2 >>> 32) ^ j2))) * 31;
        if (!(this.f20855o == null || this.f20855o.mo8333a())) {
            i = this.f20855o.hashCode();
        }
        return hashCode2 + i;
    }

    /* renamed from: a */
    protected final int mo8342a() {
        ibr ibr;
        int i;
        int i2 = 0;
        int a = super.mo8342a();
        if (!Arrays.equals(this.f24549a, ibs.f7284f)) {
            a += ibl.m3683b(1, this.f24549a);
        }
        String str = this.f24550b;
        if (!(str == null || str.equals(""))) {
            a += ibl.m3682b(2, this.f24550b);
        }
        if (Double.doubleToLongBits(this.f24551c) != Double.doubleToLongBits(0.0d)) {
            a += ibl.m3684c(24) + 8;
        }
        if (Float.floatToIntBits(this.f24552d) != Float.floatToIntBits(0.0f)) {
            a += ibl.m3684c(32) + 4;
        }
        long j = this.f24553e;
        if (j != 0) {
            a += ibl.m3680b(5, j);
        }
        int i3 = this.f24554f;
        if (i3 != 0) {
            a += ibl.m3679b(6, i3);
        }
        i3 = this.f24555g;
        if (i3 != 0) {
            a += ibl.m3684c(ibl.m3686d(i3)) + ibl.m3684c(56);
        }
        if (this.f24556h) {
            a += ibl.m3684c(64) + 1;
        }
        ibg[] ibgArr = this.f24557i;
        if (ibgArr != null && ibgArr.length > 0) {
            i3 = a;
            a = 0;
            while (true) {
                ibg[] ibgArr2 = this.f24557i;
                if (a >= ibgArr2.length) {
                    break;
                }
                ibr = ibgArr2[a];
                if (ibr != null) {
                    i3 += ibl.m3681b(9, ibr);
                }
                a++;
            }
            a = i3;
        }
        ibh[] ibhArr = this.f24558j;
        if (ibhArr == null) {
            i = a;
        } else if (ibhArr.length > 0) {
            i3 = 0;
            while (true) {
                ibh[] ibhArr2 = this.f24558j;
                if (i3 >= ibhArr2.length) {
                    break;
                }
                ibr = ibhArr2[i3];
                if (ibr != null) {
                    a += ibl.m3681b(10, ibr);
                }
                i3++;
            }
            i = a;
        } else {
            i = a;
        }
        String[] strArr = this.f24559k;
        if (strArr == null) {
            i3 = i;
        } else if (strArr.length > 0) {
            a = 0;
            i3 = 0;
            int i4 = 0;
            while (true) {
                String[] strArr2 = this.f24559k;
                if (a >= strArr2.length) {
                    break;
                }
                String str2 = strArr2[a];
                if (str2 != null) {
                    i4++;
                    i3 += ibl.m3674a(str2);
                }
                a++;
            }
            i3 = (i + i3) + i4;
        } else {
            i3 = i;
        }
        long[] jArr = this.f24560l;
        if (jArr != null && jArr.length > 0) {
            a = 0;
            while (true) {
                long[] jArr2 = this.f24560l;
                i = jArr2.length;
                if (i2 >= i) {
                    break;
                }
                a += ibl.m3685c(jArr2[i2]);
                i2++;
            }
            i3 = (a + i3) + i;
        }
        long j2 = this.f24562n;
        if (j2 != 0) {
            i3 += ibl.m3680b(13, j2);
        }
        float[] fArr = this.f24561m;
        if (fArr == null) {
            return i3;
        }
        a = fArr.length;
        return a > 0 ? ((a << 2) + i3) + a : i3;
    }

    /* renamed from: a */
    public final void mo8343a(ibl ibl) {
        long doubleToLongBits;
        ibr ibr;
        int i = 0;
        if (!Arrays.equals(this.f24549a, ibs.f7284f)) {
            ibl.mo8327a(1, this.f24549a);
        }
        String str = this.f24550b;
        if (!(str == null || str.equals(""))) {
            ibl.mo8326a(2, this.f24550b);
        }
        if (Double.doubleToLongBits(this.f24551c) != Double.doubleToLongBits(0.0d)) {
            double d = this.f24551c;
            ibl.mo8330c(3, 1);
            doubleToLongBits = Double.doubleToLongBits(d);
            if (ibl.f7269a.remaining() < 8) {
                throw new amx(ibl.f7269a.position(), ibl.f7269a.limit());
            }
            ibl.f7269a.putLong(doubleToLongBits);
        }
        if (Float.floatToIntBits(this.f24552d) != Float.floatToIntBits(0.0f)) {
            ibl.mo8322a(4, this.f24552d);
        }
        doubleToLongBits = this.f24553e;
        if (doubleToLongBits != 0) {
            ibl.mo8324a(5, doubleToLongBits);
        }
        int i2 = this.f24554f;
        if (i2 != 0) {
            ibl.mo8323a(6, i2);
        }
        i2 = this.f24555g;
        if (i2 != 0) {
            ibl.mo8330c(7, 0);
            ibl.mo8328b(ibl.m3686d(i2));
        }
        boolean z = this.f24556h;
        if (z) {
            ibl.mo8330c(8, 0);
            if (ibl.f7269a.hasRemaining()) {
                ibl.f7269a.put(z);
            } else {
                throw new amx(ibl.f7269a.position(), ibl.f7269a.limit());
            }
        }
        ibg[] ibgArr = this.f24557i;
        if (ibgArr != null && ibgArr.length > 0) {
            i2 = 0;
            while (true) {
                ibg[] ibgArr2 = this.f24557i;
                if (i2 >= ibgArr2.length) {
                    break;
                }
                ibr = ibgArr2[i2];
                if (ibr != null) {
                    ibl.mo8325a(9, ibr);
                }
                i2++;
            }
        }
        ibh[] ibhArr = this.f24558j;
        if (ibhArr != null && ibhArr.length > 0) {
            i2 = 0;
            while (true) {
                ibh[] ibhArr2 = this.f24558j;
                if (i2 >= ibhArr2.length) {
                    break;
                }
                ibr = ibhArr2[i2];
                if (ibr != null) {
                    ibl.mo8325a(10, ibr);
                }
                i2++;
            }
        }
        String[] strArr = this.f24559k;
        if (strArr != null && strArr.length > 0) {
            i2 = 0;
            while (true) {
                String[] strArr2 = this.f24559k;
                if (i2 >= strArr2.length) {
                    break;
                }
                String str2 = strArr2[i2];
                if (str2 != null) {
                    ibl.mo8326a(11, str2);
                }
                i2++;
            }
        }
        long[] jArr = this.f24560l;
        if (jArr != null && jArr.length > 0) {
            i2 = 0;
            while (true) {
                long[] jArr2 = this.f24560l;
                if (i2 >= jArr2.length) {
                    break;
                }
                ibl.mo8324a(12, jArr2[i2]);
                i2++;
            }
        }
        doubleToLongBits = this.f24562n;
        if (doubleToLongBits != 0) {
            ibl.mo8324a(13, doubleToLongBits);
        }
        float[] fArr = this.f24561m;
        if (fArr != null && fArr.length > 0) {
            while (true) {
                fArr = this.f24561m;
                if (i >= fArr.length) {
                    break;
                }
                ibl.mo8322a(14, fArr[i]);
                i++;
            }
        }
        super.mo8343a(ibl);
    }
}
