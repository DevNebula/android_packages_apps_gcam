package p000;

import android.support.p003v8.renderscript.ScriptIntrinsicBLAS;
import com.google.googlex.gcam.DngColorCalibration.Illuminant;
import java.util.Arrays;

/* compiled from: PG */
/* renamed from: krf */
final class krf extends kre {
    /* renamed from: d */
    private final byte[] f21960d;
    /* renamed from: e */
    private int f21961e;
    /* renamed from: f */
    private int f21962f;
    /* renamed from: g */
    private int f21963g;
    /* renamed from: h */
    private int f21964h;
    /* renamed from: i */
    private int f21965i;
    /* renamed from: j */
    private int f21966j = LfuScheduler.MAX_PRIORITY;

    krf(byte[] bArr, int i, int i2, boolean z) {
        this.f21960d = bArr;
        this.f21961e = i2 + 0;
        this.f21963g = 0;
        this.f21964h = this.f21963g;
    }

    /* renamed from: a */
    public final void mo10240a(int i) {
        if (this.f21965i != i) {
            throw ksh.m5203a();
        }
    }

    /* renamed from: a */
    public final int mo10239a() {
        return this.f21963g - this.f21964h;
    }

    /* renamed from: b */
    public final boolean mo10241b() {
        return this.f21963g == this.f21961e;
    }

    /* renamed from: c */
    public final void mo10242c(int i) {
        this.f21966j = i;
        m13974A();
    }

    /* renamed from: d */
    public final int mo10244d(int i) {
        if (i < 0) {
            throw ksh.m5207e();
        }
        int a = mo10239a() + i;
        int i2 = this.f21966j;
        if (a > i2) {
            throw ksh.m5209g();
        }
        this.f21966j = a;
        m13974A();
        return i2;
    }

    /* renamed from: c */
    public final boolean mo10243c() {
        return m13980z() != 0;
    }

    /* renamed from: d */
    public final kqx mo10245d() {
        int i;
        int i2;
        int y = m13979y();
        if (y > 0) {
            i = this.f21961e;
            i2 = this.f21963g;
            if (y <= i - i2) {
                kqx a = kqx.m5117a(this.f21960d, i2, y);
                this.f21963g = y + this.f21963g;
                return a;
            }
        }
        if (y == 0) {
            return kqx.f8795a;
        }
        byte[] copyOfRange;
        if (y > 0) {
            i = this.f21961e;
            i2 = this.f21963g;
            if (y <= i - i2) {
                this.f21963g = i2 + y;
                copyOfRange = Arrays.copyOfRange(this.f21960d, i2, this.f21963g);
                return kqx.m5116a(copyOfRange);
            }
        }
        if (y > 0) {
            throw ksh.m5209g();
        } else if (y == 0) {
            copyOfRange = ksd.f8884b;
            return kqx.m5116a(copyOfRange);
        } else {
            throw ksh.m5207e();
        }
    }

    /* renamed from: e */
    public final double mo10246e() {
        return Double.longBitsToDouble(m13978x());
    }

    /* renamed from: f */
    public final int mo10248f() {
        return m13979y();
    }

    /* renamed from: g */
    public final int mo10249g() {
        return m13977w();
    }

    /* renamed from: h */
    public final long mo10250h() {
        return m13978x();
    }

    /* renamed from: i */
    public final float mo10251i() {
        return Float.intBitsToFloat(m13977w());
    }

    /* renamed from: j */
    public final int mo10252j() {
        return m13979y();
    }

    /* renamed from: k */
    public final long mo10253k() {
        return m13980z();
    }

    /* renamed from: v */
    private final byte m13976v() {
        int i = this.f21963g;
        if (i == this.f21961e) {
            throw ksh.m5209g();
        }
        byte[] bArr = this.f21960d;
        this.f21963g = i + 1;
        return bArr[i];
    }

    /* renamed from: w */
    private final int m13977w() {
        int i = this.f21963g;
        if (this.f21961e - i < 4) {
            throw ksh.m5209g();
        }
        byte[] bArr = this.f21960d;
        this.f21963g = i + 4;
        return ((bArr[i + 3] & Illuminant.kOther) << 24) | (((bArr[i] & Illuminant.kOther) | ((bArr[i + 1] & Illuminant.kOther) << 8)) | ((bArr[i + 2] & Illuminant.kOther) << 16));
    }

    /* renamed from: x */
    private final long m13978x() {
        int i = this.f21963g;
        if (this.f21961e - i < 8) {
            throw ksh.m5209g();
        }
        byte[] bArr = this.f21960d;
        this.f21963g = i + 8;
        return ((((long) bArr[i + 7]) & 255) << 56) | (((((((((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8)) | ((((long) bArr[i + 2]) & 255) << 16)) | ((((long) bArr[i + 3]) & 255) << 24)) | ((((long) bArr[i + 4]) & 255) << 32)) | ((((long) bArr[i + 5]) & 255) << 40)) | ((((long) bArr[i + 6]) & 255) << 48));
    }

    /* JADX WARNING: Missing block: B:24:0x005a, code:
            if (r3[r2] >= (byte) 0) goto L_0x005c;
     */
    /* renamed from: y */
    private final int m13979y() {
        /*
        r5 = this;
        r0 = r5.f21963g;
        r1 = r5.f21961e;
        if (r1 == r0) goto L_0x0071;
    L_0x0006:
        r3 = r5.f21960d;
        r2 = r0 + 1;
        r0 = r3[r0];
        if (r0 < 0) goto L_0x0011;
    L_0x000e:
        r5.f21963g = r2;
    L_0x0010:
        return r0;
    L_0x0011:
        r1 = r1 - r2;
        r4 = 9;
        if (r1 < r4) goto L_0x0071;
    L_0x0016:
        r1 = r2 + 1;
        r2 = r3[r2];
        r2 = r2 << 7;
        r0 = r0 ^ r2;
        if (r0 < 0) goto L_0x006e;
    L_0x001f:
        r2 = r1 + 1;
        r1 = r3[r1];
        r1 = r1 << 14;
        r0 = r0 ^ r1;
        if (r0 >= 0) goto L_0x006a;
    L_0x0028:
        r1 = r2 + 1;
        r2 = r3[r2];
        r2 = r2 << 21;
        r0 = r0 ^ r2;
        if (r0 < 0) goto L_0x0065;
    L_0x0031:
        r2 = r1 + 1;
        r1 = r3[r1];
        r4 = r1 << 28;
        r0 = r0 ^ r4;
        r4 = 266354560; // 0xfe03f80 float:2.2112565E-29 double:1.315966377E-315;
        r0 = r0 ^ r4;
        if (r1 >= 0) goto L_0x0063;
    L_0x003e:
        r1 = r2 + 1;
        r2 = r3[r2];
        if (r2 >= 0) goto L_0x005c;
    L_0x0044:
        r2 = r1 + 1;
        r1 = r3[r1];
        if (r1 >= 0) goto L_0x0061;
    L_0x004a:
        r1 = r2 + 1;
        r2 = r3[r2];
        if (r2 >= 0) goto L_0x005c;
    L_0x0050:
        r2 = r1 + 1;
        r1 = r3[r1];
        if (r1 >= 0) goto L_0x005f;
    L_0x0056:
        r1 = r2 + 1;
        r2 = r3[r2];
        if (r2 < 0) goto L_0x0071;
    L_0x005c:
        r5.f21963g = r1;
        goto L_0x0010;
    L_0x005f:
        r1 = r2;
        goto L_0x005c;
    L_0x0061:
        r1 = r2;
        goto L_0x005c;
    L_0x0063:
        r1 = r2;
        goto L_0x005c;
    L_0x0065:
        r2 = -2080896; // 0xffffffffffe03f80 float:NaN double:NaN;
        r0 = r0 ^ r2;
        goto L_0x005c;
    L_0x006a:
        r0 = r0 ^ 16256;
        r1 = r2;
        goto L_0x005c;
    L_0x006e:
        r0 = r0 ^ -128;
        goto L_0x005c;
    L_0x0071:
        r0 = r5.mo10254l();
        r0 = (int) r0;
        goto L_0x0010;
        */
        throw new UnsupportedOperationException("Method not decompiled: krf.y():int");
    }

    /* JADX WARNING: Missing block: B:26:0x008b, code:
            if (((long) r4[r3]) < 0) goto L_0x008d;
     */
    /* renamed from: z */
    private final long m13980z() {
        /*
        r10 = this;
        r8 = 0;
        r0 = r10.f21963g;
        r1 = r10.f21961e;
        if (r1 == r0) goto L_0x008d;
    L_0x0008:
        r4 = r10.f21960d;
        r3 = r0 + 1;
        r0 = r4[r0];
        if (r0 < 0) goto L_0x0014;
    L_0x0010:
        r10.f21963g = r3;
        r0 = (long) r0;
    L_0x0013:
        return r0;
    L_0x0014:
        r1 = r1 - r3;
        r2 = 9;
        if (r1 < r2) goto L_0x008d;
    L_0x0019:
        r2 = r3 + 1;
        r1 = r4[r3];
        r1 = r1 << 7;
        r0 = r0 ^ r1;
        if (r0 < 0) goto L_0x00b5;
    L_0x0022:
        r3 = r2 + 1;
        r1 = r4[r2];
        r1 = r1 << 14;
        r0 = r0 ^ r1;
        if (r0 >= 0) goto L_0x00b0;
    L_0x002b:
        r2 = r3 + 1;
        r1 = r4[r3];
        r1 = r1 << 21;
        r0 = r0 ^ r1;
        if (r0 >= 0) goto L_0x003c;
    L_0x0034:
        r1 = -2080896; // 0xffffffffffe03f80 float:NaN double:NaN;
        r0 = r0 ^ r1;
        r0 = (long) r0;
    L_0x0039:
        r10.f21963g = r2;
        goto L_0x0013;
    L_0x003c:
        r3 = r2 + 1;
        r0 = (long) r0;
        r2 = r4[r2];
        r6 = (long) r2;
        r2 = 28;
        r6 = r6 << r2;
        r0 = r0 ^ r6;
        r2 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1));
        if (r2 >= 0) goto L_0x00aa;
    L_0x004a:
        r2 = r3 + 1;
        r3 = r4[r3];
        r6 = (long) r3;
        r3 = 35;
        r6 = r6 << r3;
        r0 = r0 ^ r6;
        r3 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1));
        if (r3 < 0) goto L_0x00a3;
    L_0x0057:
        r3 = r2 + 1;
        r2 = r4[r2];
        r6 = (long) r2;
        r2 = 42;
        r6 = r6 << r2;
        r0 = r0 ^ r6;
        r2 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1));
        if (r2 >= 0) goto L_0x009b;
    L_0x0064:
        r2 = r3 + 1;
        r3 = r4[r3];
        r6 = (long) r3;
        r3 = 49;
        r6 = r6 << r3;
        r0 = r0 ^ r6;
        r3 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1));
        if (r3 < 0) goto L_0x0094;
    L_0x0071:
        r3 = r2 + 1;
        r2 = r4[r2];
        r6 = (long) r2;
        r2 = 56;
        r6 = r6 << r2;
        r0 = r0 ^ r6;
        r6 = 71499008037633920; // 0xfe03f80fe03f80 float:2.2112565E-29 double:6.838959413692434E-304;
        r0 = r0 ^ r6;
        r2 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1));
        if (r2 >= 0) goto L_0x0092;
    L_0x0084:
        r2 = r3 + 1;
        r3 = r4[r3];
        r4 = (long) r3;
        r3 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1));
        if (r3 >= 0) goto L_0x0039;
    L_0x008d:
        r0 = r10.mo10254l();
        goto L_0x0013;
    L_0x0092:
        r2 = r3;
        goto L_0x0039;
    L_0x0094:
        r4 = -558586000294016; // 0xfffe03f80fe03f80 float:2.2112565E-29 double:NaN;
        r0 = r0 ^ r4;
        goto L_0x0039;
    L_0x009b:
        r4 = 4363953127296; // 0x3f80fe03f80 float:2.2112565E-29 double:2.1560793202584E-311;
        r0 = r0 ^ r4;
        r2 = r3;
        goto L_0x0039;
    L_0x00a3:
        r4 = -34093383808; // 0xfffffff80fe03f80 float:2.2112565E-29 double:NaN;
        r0 = r0 ^ r4;
        goto L_0x0039;
    L_0x00aa:
        r4 = 266354560; // 0xfe03f80 float:2.2112565E-29 double:1.315966377E-315;
        r0 = r0 ^ r4;
        r2 = r3;
        goto L_0x0039;
    L_0x00b0:
        r0 = r0 ^ 16256;
        r0 = (long) r0;
        r2 = r3;
        goto L_0x0039;
    L_0x00b5:
        r0 = r0 ^ -128;
        r0 = (long) r0;
        goto L_0x0039;
        */
        throw new UnsupportedOperationException("Method not decompiled: krf.z():long");
    }

    /* renamed from: l */
    final long mo10254l() {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            byte v = m13976v();
            j |= ((long) (v & ScriptIntrinsicBLAS.RsBlas_csyrk)) << i;
            if ((v & 128) == 0) {
                return j;
            }
        }
        throw ksh.m5206d();
    }

    /* renamed from: m */
    public final int mo10255m() {
        return m13977w();
    }

    /* renamed from: n */
    public final long mo10256n() {
        return m13978x();
    }

    /* renamed from: o */
    public final int mo10257o() {
        return kre.m5134b(m13979y());
    }

    /* renamed from: p */
    public final long mo10258p() {
        return kre.m5132a(m13980z());
    }

    /* renamed from: q */
    public final String mo10259q() {
        int y = m13979y();
        if (y > 0) {
            int i = this.f21961e;
            int i2 = this.f21963g;
            if (y <= i - i2) {
                String str = new String(this.f21960d, i2, y, ksd.f8883a);
                this.f21963g = y + this.f21963g;
                return str;
            }
        }
        if (y == 0) {
            return "";
        }
        if (y < 0) {
            throw ksh.m5207e();
        }
        throw ksh.m5209g();
    }

    /* renamed from: r */
    public final String mo10260r() {
        int y = m13979y();
        if (y > 0) {
            int i = this.f21961e;
            int i2 = this.f21963g;
            if (y <= i - i2) {
                if (kur.m5420b(this.f21960d, i2, i2 + y)) {
                    i2 = this.f21963g;
                    this.f21963g = i2 + y;
                    return new String(this.f21960d, i2, y, ksd.f8883a);
                }
                throw ksh.m5204b();
            }
        }
        if (y == 0) {
            return "";
        }
        if (y <= 0) {
            throw ksh.m5207e();
        }
        throw ksh.m5209g();
    }

    /* renamed from: s */
    public final int mo10261s() {
        int i = 0;
        if (mo10241b()) {
            this.f21965i = 0;
        } else {
            this.f21965i = m13979y();
            i = this.f21965i;
            if ((i >>> 3) == 0) {
                throw new ksh("Protocol message contained an invalid tag (zero).");
            }
        }
        return i;
    }

    /* renamed from: t */
    public final int mo10262t() {
        return m13979y();
    }

    /* renamed from: u */
    public final long mo10263u() {
        return m13980z();
    }

    /* renamed from: A */
    private final void m13974A() {
        this.f21961e += this.f21962f;
        int i = this.f21961e;
        int i2 = i - this.f21964h;
        int i3 = this.f21966j;
        if (i2 > i3) {
            this.f21962f = i2 - i3;
            this.f21961e = i - this.f21962f;
            return;
        }
        this.f21962f = 0;
    }

    /* renamed from: e */
    public final boolean mo10247e(int i) {
        int i2 = 0;
        switch (i & 7) {
            case 0:
                if (this.f21961e - this.f21963g >= 10) {
                    while (i2 < 10) {
                        byte[] bArr = this.f21960d;
                        int i3 = this.f21963g;
                        this.f21963g = i3 + 1;
                        if (bArr[i3] >= (byte) 0) {
                            return true;
                        }
                        i2++;
                    }
                    throw ksh.m5206d();
                }
                while (i2 < 10) {
                    if (m13976v() >= (byte) 0) {
                        return true;
                    }
                    i2++;
                }
                throw ksh.m5206d();
            case 1:
                m13975f(8);
                return true;
            case 2:
                m13975f(m13979y());
                return true;
            case 3:
                break;
            case 4:
                return false;
            case 5:
                m13975f(4);
                return true;
            default:
                throw ksh.m5205c();
        }
        do {
            i2 = mo10261s();
            if (i2 != 0) {
            }
            mo10240a(((i >>> 3) << 3) | 4);
            return true;
        } while (mo10247e(i2));
        mo10240a(((i >>> 3) << 3) | 4);
        return true;
    }

    /* renamed from: f */
    private final void m13975f(int i) {
        if (i >= 0) {
            int i2 = this.f21961e;
            int i3 = this.f21963g;
            if (i <= i2 - i3) {
                this.f21963g = i3 + i;
                return;
            }
        }
        if (i < 0) {
            throw ksh.m5207e();
        }
        throw ksh.m5209g();
    }
}
