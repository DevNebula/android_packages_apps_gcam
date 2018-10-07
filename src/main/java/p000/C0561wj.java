package p000;

import com.google.googlex.gcam.DngColorCalibration.Illuminant;
import java.io.ByteArrayInputStream;
import java.io.InputStream;

/* compiled from: PG */
/* renamed from: wj */
public final class C0561wj {
    /* renamed from: a */
    public byte[] f9963a;
    /* renamed from: b */
    public int f9964b;
    /* renamed from: c */
    private String f9965c;

    public C0561wj(int i) {
        this.f9965c = null;
        this.f9963a = new byte[i];
        this.f9964b = 0;
    }

    public C0561wj(InputStream inputStream) {
        this.f9965c = null;
        this.f9964b = 0;
        this.f9963a = new byte[16384];
        while (true) {
            int read = inputStream.read(this.f9963a, this.f9964b, 16384);
            if (read > 0) {
                this.f9964b += read;
                if (read == 16384) {
                    mo11465a(this.f9964b + 16384);
                } else {
                    return;
                }
            }
            return;
        }
    }

    public C0561wj(byte[] bArr) {
        this.f9965c = null;
        this.f9963a = bArr;
        this.f9964b = bArr.length;
    }

    /* renamed from: a */
    public final void mo11466a(byte[] bArr, int i) {
        mo11465a(this.f9964b + i);
        System.arraycopy(bArr, 0, this.f9963a, this.f9964b, i);
        this.f9964b += i;
    }

    /* renamed from: a */
    public final void mo11465a(int i) {
        Object obj = this.f9963a;
        int length = obj.length;
        if (i > length) {
            this.f9963a = new byte[(length + length)];
            System.arraycopy(obj, 0, this.f9963a, 0, length);
        }
    }

    /* renamed from: a */
    public final InputStream mo11464a() {
        return new ByteArrayInputStream(this.f9963a, 0, this.f9964b);
    }

    /* renamed from: b */
    public final String mo11467b() {
        if (this.f9965c == null) {
            int i = this.f9964b;
            if (i < 2) {
                this.f9965c = "UTF-8";
            } else {
                byte[] bArr = this.f9963a;
                byte b = bArr[0];
                if (b != (byte) 0) {
                    int i2 = b & Illuminant.kOther;
                    if (i2 < 128) {
                        if (bArr[1] != (byte) 0) {
                            this.f9965c = "UTF-8";
                        } else if (i < 4 || bArr[2] != (byte) 0) {
                            this.f9965c = "UTF-16LE";
                        } else {
                            this.f9965c = "UTF-32LE";
                        }
                    } else if (i2 == 239) {
                        this.f9965c = "UTF-8";
                    } else if (i2 == 254) {
                        this.f9965c = "UTF-16";
                    } else if (i < 4 || bArr[2] != (byte) 0) {
                        this.f9965c = "UTF-16";
                    } else {
                        this.f9965c = "UTF-32";
                    }
                } else if (i < 4 || bArr[1] != (byte) 0) {
                    this.f9965c = "UTF-16BE";
                } else if ((bArr[2] & Illuminant.kOther) == 254 && (bArr[3] & Illuminant.kOther) == Illuminant.kOther) {
                    this.f9965c = "UTF-32BE";
                } else {
                    this.f9965c = "UTF-32";
                }
            }
        }
        return this.f9965c;
    }
}
