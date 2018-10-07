package p000;

import com.google.googlex.gcam.DngColorCalibration.Illuminant;
import java.io.OutputStream;

/* compiled from: PG */
/* renamed from: ikn */
public abstract class ikn {
    /* renamed from: a */
    public final iqa f7426a;
    /* renamed from: b */
    public final OutputStream f7427b;
    /* renamed from: c */
    public int f7428c = 0;
    /* renamed from: d */
    public int f7429d = 0;
    /* renamed from: e */
    private int f7430e;
    /* renamed from: f */
    private int f7431f = 0;

    public ikn(OutputStream outputStream, iqa iqa) {
        this.f7427b = outputStream;
        this.f7426a = iqa;
        this.f7430e = 0;
    }

    /* renamed from: c */
    public abstract int mo8590c(int i);

    /* renamed from: a */
    public final void mo8583a(int i, int i2) {
        if (this.f7426a.mo8760a() < i || this.f7429d != 0 || this.f7428c != 0) {
            throw new iko(i, i2);
        }
    }

    /* renamed from: a */
    public final void mo8582a() {
        if (this.f7429d != 0 || this.f7428c != 0) {
            throw new IllegalStateException("Can not read or write bytes while forwarding or skipping");
        }
    }

    /* renamed from: a */
    public final boolean mo8587a(int i) {
        mo8582a();
        if (this.f7426a.mo8760a() >= i) {
            this.f7426a.mo8762a(this.f7427b, i);
            return true;
        }
        this.f7429d = i - this.f7426a.mo8760a();
        iqa iqa = this.f7426a;
        iqa.mo8762a(this.f7427b, iqa.mo8760a());
        return false;
    }

    /* renamed from: a */
    public final void mo8586a(byte[] bArr, int i, int i2) {
        int i3 = this.f7428c;
        if (i3 < i2 && i3 >= 0) {
            int i4 = this.f7429d;
            if (i4 >= i2 || i4 < 0) {
                this.f7427b.write(bArr, i, i2);
                i3 = this.f7429d;
                if (i3 > 0) {
                    this.f7429d = i3 - i2;
                    return;
                }
                return;
            }
            if (i3 > 0) {
                i += i3;
                i2 -= i3;
                this.f7428c = 0;
            } else if (i4 > 0) {
                this.f7427b.write(bArr, i, i4);
                i3 = this.f7429d;
                i += i3;
                i2 -= i3;
                this.f7429d = 0;
            }
            iqa iqa = this.f7426a;
            iqa.mo8761a(i2);
            System.arraycopy(bArr, i, iqa.f7678a, iqa.f7680c, i2);
            iqa.f7680c += i2;
            mo8588b();
        } else if (i3 > 0) {
            this.f7428c = i3 - i2;
        }
    }

    /* renamed from: b */
    final void mo8588b() {
        while (this.f7426a.mo8760a() >= this.f7431f && this.f7429d == 0 && this.f7428c == 0) {
            try {
                this.f7431f = 0;
                this.f7430e = mo8590c(this.f7430e);
            } catch (iko e) {
                this.f7431f = e.f7432a;
                this.f7430e = e.f7433b;
                return;
            }
        }
    }

    /* renamed from: b */
    public final boolean mo8589b(int i) {
        mo8582a();
        if (this.f7426a.mo8760a() >= i) {
            this.f7426a.mo8763b(i);
            return true;
        }
        this.f7428c = i - this.f7426a.mo8760a();
        iqa iqa = this.f7426a;
        iqa.mo8763b(iqa.mo8760a());
        return false;
    }

    /* renamed from: d */
    public final short mo8591d(int i) {
        mo8582a();
        mo8583a(2, i);
        mo8582a();
        iqa iqa = this.f7426a;
        int i2 = iqa.f7679b;
        if (i2 + 2 <= iqa.f7680c) {
            byte[] bArr = iqa.f7678a;
            iqa.f7679b = i2 + 1;
            byte b = bArr[i2];
            int i3 = iqa.f7679b;
            iqa.f7679b = i3 + 1;
            return (short) (((b & Illuminant.kOther) << 8) + (bArr[i3] & Illuminant.kOther));
        }
        throw new IllegalStateException("Byte queue is too short");
    }

    /* renamed from: a */
    public final void mo8585a(byte[] bArr) {
        mo8582a();
        this.f7427b.write(bArr);
    }

    /* renamed from: a */
    public final void mo8584a(short s) {
        mo8582a();
        this.f7427b.write((s >> 8) & Illuminant.kOther);
        this.f7427b.write(s & Illuminant.kOther);
    }
}
