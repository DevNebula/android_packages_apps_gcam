package p000;

import android.support.p003v8.renderscript.ScriptIntrinsicBLAS;
import com.google.googlex.gcam.DngColorCalibration.Illuminant;

/* compiled from: PG */
/* renamed from: kvc */
public final class kvc {
    /* renamed from: a */
    public final byte[] f9002a;
    /* renamed from: b */
    public int f9003b;
    /* renamed from: c */
    public int f9004c;
    /* renamed from: d */
    private final int f9005d;
    /* renamed from: e */
    private int f9006e;
    /* renamed from: f */
    private int f9007f;
    /* renamed from: g */
    private int f9008g = LfuScheduler.MAX_PRIORITY;
    /* renamed from: h */
    private int f9009h;
    /* renamed from: i */
    private int f9010i = 64;

    private kvc(byte[] bArr, int i, int i2) {
        this.f9002a = bArr;
        this.f9005d = i;
        this.f9003b = i + i2;
        this.f9004c = i;
    }

    /* renamed from: a */
    public final void mo10473a(int i) {
        if (this.f9007f != i) {
            throw new kvk("Protocol message end-group tag did not match expected tag.");
        }
    }

    /* renamed from: a */
    public final int mo10472a() {
        int i = this.f9008g;
        if (i == LfuScheduler.MAX_PRIORITY) {
            return -1;
        }
        return i - this.f9004c;
    }

    /* renamed from: a */
    public final byte[] mo10475a(int i, int i2) {
        if (i2 == 0) {
            return kvn.f9034i;
        }
        byte[] bArr = new byte[i2];
        System.arraycopy(this.f9002a, this.f9005d + i, bArr, 0, i2);
        return bArr;
    }

    /* renamed from: b */
    public final int mo10476b() {
        return this.f9004c - this.f9005d;
    }

    /* renamed from: a */
    public static kvc m5454a(byte[] bArr, int i, int i2) {
        return new kvc(bArr, i, i2);
    }

    /* renamed from: b */
    public final void mo10477b(int i) {
        this.f9008g = i;
        m5457k();
    }

    /* renamed from: c */
    public final int mo10479c(int i) {
        if (i < 0) {
            throw kvk.m5516b();
        }
        int i2 = this.f9004c + i;
        int i3 = this.f9008g;
        if (i2 > i3) {
            throw kvk.m5517c();
        }
        this.f9008g = i2;
        m5457k();
        return i3;
    }

    /* renamed from: c */
    public final boolean mo10480c() {
        return mo10485f() != 0;
    }

    /* renamed from: a */
    public final void mo10474a(kvl kvl) {
        int f = mo10485f();
        if (this.f9009h < this.f9010i) {
            f = mo10479c(f);
            this.f9009h++;
            kvl.mergeFrom(this);
            mo10473a(0);
            this.f9009h--;
            mo10477b(f);
            return;
        }
        throw new kvk("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    /* renamed from: j */
    private final byte m5456j() {
        int i = this.f9004c;
        if (i == this.f9003b) {
            throw kvk.m5517c();
        }
        byte[] bArr = this.f9002a;
        this.f9004c = i + 1;
        return bArr[i];
    }

    /* renamed from: d */
    public final int mo10481d() {
        return (((m5456j() & Illuminant.kOther) | ((m5456j() & Illuminant.kOther) << 8)) | ((m5456j() & Illuminant.kOther) << 16)) | ((m5456j() & Illuminant.kOther) << 24);
    }

    /* renamed from: e */
    public final long mo10483e() {
        return (((((((((long) m5456j()) & 255) | ((((long) m5456j()) & 255) << 8)) | ((((long) m5456j()) & 255) << 16)) | ((((long) m5456j()) & 255) << 24)) | ((((long) m5456j()) & 255) << 32)) | ((((long) m5456j()) & 255) << 40)) | ((((long) m5456j()) & 255) << 48)) | ((((long) m5456j()) & 255) << 56);
    }

    /* renamed from: f */
    public final int mo10485f() {
        byte j = m5456j();
        if (j >= (byte) 0) {
            return j;
        }
        int i = j & ScriptIntrinsicBLAS.RsBlas_csyrk;
        byte j2 = m5456j();
        if (j2 >= (byte) 0) {
            return i | (j2 << 7);
        }
        i |= (j2 & ScriptIntrinsicBLAS.RsBlas_csyrk) << 7;
        j2 = m5456j();
        if (j2 >= (byte) 0) {
            return i | (j2 << 14);
        }
        i |= (j2 & ScriptIntrinsicBLAS.RsBlas_csyrk) << 14;
        j2 = m5456j();
        if (j2 >= (byte) 0) {
            return i | (j2 << 21);
        }
        byte j3 = m5456j();
        i = (i | ((j2 & ScriptIntrinsicBLAS.RsBlas_csyrk) << 21)) | (j3 << 28);
        if (j3 >= (byte) 0) {
            return i;
        }
        for (int i2 = 0; i2 < 5; i2++) {
            if (m5456j() >= (byte) 0) {
                return i;
            }
        }
        throw kvk.m5515a();
    }

    /* renamed from: g */
    public final long mo10486g() {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            byte j2 = m5456j();
            j |= ((long) (j2 & ScriptIntrinsicBLAS.RsBlas_csyrk)) << i;
            if ((j2 & 128) == 0) {
                return j;
            }
        }
        throw kvk.m5515a();
    }

    /* renamed from: h */
    public final String mo10487h() {
        int f = mo10485f();
        if (f < 0) {
            throw kvk.m5516b();
        }
        int i = this.f9003b;
        int i2 = this.f9004c;
        if (f > i - i2) {
            throw kvk.m5517c();
        }
        String str = new String(this.f9002a, i2, f, kvj.f9022a);
        this.f9004c = f + this.f9004c;
        return str;
    }

    /* renamed from: i */
    public final int mo10488i() {
        int i = 0;
        if (this.f9004c != this.f9003b) {
            this.f9007f = mo10485f();
            i = this.f9007f;
            if (i == 0) {
                throw new kvk("Protocol message contained an invalid tag (zero).");
            }
        }
        this.f9007f = 0;
        return i;
    }

    /* renamed from: k */
    private final void m5457k() {
        this.f9003b += this.f9006e;
        int i = this.f9003b;
        int i2 = this.f9008g;
        if (i > i2) {
            this.f9006e = i - i2;
            this.f9003b = i - this.f9006e;
            return;
        }
        this.f9006e = 0;
    }

    /* renamed from: d */
    public final void mo10482d(int i) {
        mo10478b(i, this.f9007f);
    }

    /* renamed from: b */
    final void mo10478b(int i, int i2) {
        int i3 = this.f9004c;
        int i4 = this.f9005d;
        i3 -= i4;
        if (i > i3) {
            StringBuilder stringBuilder = new StringBuilder(50);
            stringBuilder.append("Position ");
            stringBuilder.append(i);
            stringBuilder.append(" is beyond current ");
            stringBuilder.append(i3);
            throw new IllegalArgumentException(stringBuilder.toString());
        } else if (i < 0) {
            StringBuilder stringBuilder2 = new StringBuilder(24);
            stringBuilder2.append("Bad position ");
            stringBuilder2.append(i);
            throw new IllegalArgumentException(stringBuilder2.toString());
        } else {
            this.f9004c = i4 + i;
            this.f9007f = i2;
        }
    }

    /* renamed from: e */
    public final boolean mo10484e(int i) {
        switch (i & 7) {
            case 0:
                mo10485f();
                return true;
            case 1:
                mo10483e();
                return true;
            case 2:
                m5455f(mo10485f());
                return true;
            case 3:
                break;
            case 4:
                return false;
            case 5:
                mo10481d();
                return true;
            default:
                throw new kvk("Protocol message tag had invalid wire type.");
        }
        int i2;
        do {
            i2 = mo10488i();
            if (i2 != 0) {
            }
            mo10473a(((i >>> 3) << 3) | 4);
            return true;
        } while (mo10484e(i2));
        mo10473a(((i >>> 3) << 3) | 4);
        return true;
    }

    /* renamed from: f */
    private final void m5455f(int i) {
        if (i < 0) {
            throw kvk.m5516b();
        }
        int i2 = this.f9004c;
        int i3 = i2 + i;
        int i4 = this.f9008g;
        if (i3 > i4) {
            m5455f(i4 - i2);
            throw kvk.m5517c();
        } else if (i <= this.f9003b - i2) {
            this.f9004c = i3;
        } else {
            throw kvk.m5517c();
        }
    }
}
