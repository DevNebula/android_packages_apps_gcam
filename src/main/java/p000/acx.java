package p000;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

/* compiled from: PG */
/* renamed from: acx */
final class acx implements Closeable {
    /* renamed from: a */
    public final Charset f283a;
    /* renamed from: b */
    public int f284b;
    /* renamed from: c */
    private final InputStream f285c;
    /* renamed from: d */
    private byte[] f286d;
    /* renamed from: e */
    private int f287e;

    private acx(InputStream inputStream, Charset charset) {
        if (inputStream == null || charset == null) {
            throw new NullPointerException();
        } else if (charset.equals(acz.f289a)) {
            this.f285c = inputStream;
            this.f283a = charset;
            this.f286d = new byte[8192];
        } else {
            throw new IllegalArgumentException("Unsupported encoding");
        }
    }

    public acx(InputStream inputStream, Charset charset, byte b) {
        this(inputStream, charset);
    }

    public final void close() {
        synchronized (this.f285c) {
            if (this.f286d != null) {
                this.f286d = null;
                this.f285c.close();
            }
        }
    }

    /* renamed from: b */
    private final void m143b() {
        InputStream inputStream = this.f285c;
        byte[] bArr = this.f286d;
        int read = inputStream.read(bArr, 0, bArr.length);
        if (read == -1) {
            throw new EOFException();
        }
        this.f287e = 0;
        this.f284b = read;
    }

    /* renamed from: a */
    public final String mo150a() {
        String str;
        synchronized (this.f285c) {
            if (this.f286d == null) {
                throw new IOException("LineReader is closed");
            }
            if (this.f287e >= this.f284b) {
                m143b();
            }
            int i = this.f287e;
            while (true) {
                int i2 = this.f284b;
                if (i != i2) {
                    byte[] bArr = this.f286d;
                    if (bArr[i] != (byte) 10) {
                        i++;
                    } else {
                        int i3;
                        int i4 = this.f287e;
                        if (i != i4) {
                            i2 = i - 1;
                            i3 = bArr[i2] != (byte) 13 ? i : i2;
                        } else {
                            i3 = i;
                        }
                        str = new String(bArr, i4, i3 - i4, this.f283a.name());
                        this.f287e = i + 1;
                    }
                } else {
                    byte[] bArr2;
                    ByteArrayOutputStream acy = new acy(this, (i2 - this.f287e) + 80);
                    loop1:
                    while (true) {
                        byte[] bArr3 = this.f286d;
                        i = this.f287e;
                        acy.write(bArr3, i, this.f284b - i);
                        this.f284b = -1;
                        m143b();
                        i2 = this.f287e;
                        while (i2 != this.f284b) {
                            bArr2 = this.f286d;
                            if (bArr2[i2] == (byte) 10) {
                                break loop1;
                            }
                            i2++;
                        }
                    }
                    int i5 = this.f287e;
                    if (i2 != i5) {
                        acy.write(bArr2, i5, i2 - i5);
                    }
                    this.f287e = i2 + 1;
                    str = acy.toString();
                }
            }
        }
        return str;
    }
}
