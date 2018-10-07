package p000;

import com.google.googlex.gcam.DngColorCalibration.Illuminant;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: PG */
/* renamed from: amw */
public final class amw extends FilterInputStream {
    /* renamed from: a */
    private volatile byte[] f543a;
    /* renamed from: b */
    private int f544b;
    /* renamed from: c */
    private int f545c;
    /* renamed from: d */
    private int f546d;
    /* renamed from: e */
    private int f547e;
    /* renamed from: f */
    private final agu f548f;

    public amw(InputStream inputStream, agu agu) {
        this(inputStream, agu, (byte) 0);
    }

    private amw(InputStream inputStream, agu agu, byte b) {
        super(inputStream);
        this.f546d = -1;
        this.f548f = agu;
        this.f543a = (byte[]) agu.mo272a(65536, byte[].class);
    }

    public final synchronized int available() {
        InputStream inputStream;
        inputStream = this.in;
        if (this.f543a == null || inputStream == null) {
            throw amw.m359c();
        }
        return inputStream.available() + (this.f544b - this.f547e);
    }

    public final void close() {
        if (this.f543a != null) {
            this.f548f.mo276a(this.f543a);
            this.f543a = null;
        }
        InputStream inputStream = this.in;
        this.in = null;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0051  */
    /* renamed from: a */
    private final int m358a(java.io.InputStream r6, byte[] r7) {
        /*
        r5 = this;
        r3 = -1;
        r4 = 0;
        r1 = r5.f546d;
        if (r1 == r3) goto L_0x000d;
    L_0x0006:
        r2 = r5.f547e;
        r0 = r5.f545c;
        r2 = r2 - r1;
        if (r2 < r0) goto L_0x001a;
    L_0x000d:
        r0 = r6.read(r7);
        if (r0 <= 0) goto L_0x0019;
    L_0x0013:
        r5.f546d = r3;
        r5.f547e = r4;
        r5.f544b = r0;
    L_0x0019:
        return r0;
    L_0x001a:
        if (r1 != 0) goto L_0x005d;
    L_0x001c:
        r2 = r7.length;
        if (r0 <= r2) goto L_0x005d;
    L_0x001f:
        r3 = r5.f544b;
        if (r3 != r2) goto L_0x005d;
    L_0x0023:
        r1 = r2 + r2;
        if (r1 <= r0) goto L_0x005b;
    L_0x0027:
        r1 = r5.f548f;
        r3 = byte[].class;
        r0 = r1.mo272a(r0, r3);
        r0 = (byte[]) r0;
        java.lang.System.arraycopy(r7, r4, r0, r4, r2);
        r5.f543a = r0;
        r1 = r5.f548f;
        r1.mo276a(r7);
        r7 = r0;
    L_0x003c:
        r0 = r5.f547e;
        r1 = r5.f546d;
        r0 = r0 - r1;
        r5.f547e = r0;
        r5.f546d = r4;
        r5.f544b = r4;
        r0 = r5.f547e;
        r1 = r7.length;
        r1 = r1 - r0;
        r1 = r6.read(r7, r0, r1);
        if (r1 <= 0) goto L_0x0058;
    L_0x0051:
        r0 = r5.f547e;
        r0 = r0 + r1;
    L_0x0054:
        r5.f544b = r0;
        r0 = r1;
        goto L_0x0019;
    L_0x0058:
        r0 = r5.f547e;
        goto L_0x0054;
    L_0x005b:
        r0 = r1;
        goto L_0x0027;
    L_0x005d:
        if (r1 <= 0) goto L_0x003c;
    L_0x005f:
        r0 = r7.length;
        r0 = r0 - r1;
        java.lang.System.arraycopy(r7, r1, r7, r4, r0);
        goto L_0x003c;
        */
        throw new UnsupportedOperationException("Method not decompiled: amw.a(java.io.InputStream, byte[]):int");
    }

    /* renamed from: a */
    public final synchronized void mo374a() {
        this.f545c = this.f543a.length;
    }

    public final synchronized void mark(int i) {
        this.f545c = Math.max(this.f545c, i);
        this.f546d = this.f547e;
    }

    public final boolean markSupported() {
        return true;
    }

    public final synchronized int read() {
        int i = -1;
        synchronized (this) {
            byte[] bArr = this.f543a;
            InputStream inputStream = this.in;
            if (bArr == null || inputStream == null) {
                throw amw.m359c();
            }
            if (this.f547e < this.f544b || m358a(inputStream, bArr) != -1) {
                if (bArr != this.f543a) {
                    bArr = this.f543a;
                    if (bArr == null) {
                        throw amw.m359c();
                    }
                }
                int i2 = this.f544b;
                int i3 = this.f547e;
                if (i2 - i3 > 0) {
                    this.f547e = i3 + 1;
                    i = bArr[i3] & Illuminant.kOther;
                }
            }
        }
        return i;
    }

    public final synchronized int read(byte[] bArr, int i, int i2) {
        Object obj = this.f543a;
        if (obj == null) {
            throw amw.m359c();
        } else if (i2 == 0) {
            i2 = 0;
        } else {
            InputStream inputStream = this.in;
            if (inputStream == null) {
                throw amw.m359c();
            }
            int i3 = this.f547e;
            int i4 = this.f544b;
            if (i3 < i4) {
                i4 -= i3;
                if (i4 >= i2) {
                    i4 = i2;
                }
                System.arraycopy(obj, i3, bArr, i, i4);
                this.f547e += i4;
                if (i4 == i2 || inputStream.available() == 0) {
                    i2 = i4;
                } else {
                    i += i4;
                    i3 = i2 - i4;
                }
            } else {
                i3 = i2;
            }
            while (true) {
                Object obj2 = obj;
                if (this.f546d == -1 && i3 >= obj2.length) {
                    int read = inputStream.read(bArr, i, i3);
                    if (read == -1) {
                        i2 = i3 != i2 ? i2 - i3 : -1;
                    } else {
                        int i5 = read;
                        obj = obj2;
                        i4 = i5;
                    }
                } else if (m358a(inputStream, obj2) == -1) {
                    i2 = i3 != i2 ? i2 - i3 : -1;
                } else {
                    if (obj2 != this.f543a) {
                        obj2 = this.f543a;
                        if (obj2 != null) {
                            obj = obj2;
                        } else {
                            throw amw.m359c();
                        }
                    }
                    obj = obj2;
                    i4 = this.f544b;
                    int i6 = this.f547e;
                    i4 -= i6;
                    if (i4 >= i3) {
                        i4 = i3;
                    }
                    System.arraycopy(obj, i6, bArr, i, i4);
                    this.f547e += i4;
                }
                i3 -= i4;
                if (i3 == 0) {
                    break;
                } else if (inputStream.available() == 0) {
                    i2 -= i3;
                    break;
                } else {
                    i += i4;
                }
            }
        }
        return i2;
    }

    /* renamed from: b */
    public final synchronized void mo376b() {
        if (this.f543a != null) {
            this.f548f.mo276a(this.f543a);
            this.f543a = null;
        }
    }

    public final synchronized void reset() {
        if (this.f543a == null) {
            throw new IOException("Stream is closed");
        }
        int i = this.f546d;
        if (i == -1) {
            int i2 = this.f547e;
            int i3 = this.f545c;
            StringBuilder stringBuilder = new StringBuilder(66);
            stringBuilder.append("Mark has been invalidated, pos: ");
            stringBuilder.append(i2);
            stringBuilder.append(" markLimit: ");
            stringBuilder.append(i3);
            throw new amx(stringBuilder.toString());
        }
        this.f547e = i;
    }

    public final synchronized long skip(long j) {
        if (j < 1) {
            j = 0;
        } else {
            byte[] bArr = this.f543a;
            if (bArr == null) {
                throw amw.m359c();
            }
            InputStream inputStream = this.in;
            if (inputStream == null) {
                throw amw.m359c();
            }
            int i = this.f544b;
            int i2 = this.f547e;
            if (((long) (i - i2)) >= j) {
                this.f547e = (int) (((long) i2) + j);
            } else {
                long j2 = ((long) i) - ((long) i2);
                this.f547e = i;
                if (this.f546d == -1 || j > ((long) this.f545c)) {
                    j = j2 + inputStream.skip(j - j2);
                } else if (m358a(inputStream, bArr) == -1) {
                    j = j2;
                } else {
                    int i3 = this.f544b;
                    int i4 = this.f547e;
                    if (((long) (i3 - i4)) >= j - j2) {
                        this.f547e = (int) ((((long) i4) + j) - j2);
                    } else {
                        this.f547e = i3;
                        j = (j2 + ((long) i3)) - ((long) i4);
                    }
                }
            }
        }
        return j;
    }

    /* renamed from: c */
    private static IOException m359c() {
        throw new IOException("BufferedInputStream is closed");
    }
}
