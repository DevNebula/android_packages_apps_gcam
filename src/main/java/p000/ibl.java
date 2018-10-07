package p000;

import android.support.p003v8.renderscript.ScriptIntrinsicBLAS;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ReadOnlyBufferException;

/* renamed from: ibl */
public final class ibl {
    /* renamed from: a */
    public final ByteBuffer f7269a;

    private ibl(ByteBuffer byteBuffer) {
        this.f7269a = byteBuffer;
        this.f7269a.order(ByteOrder.LITTLE_ENDIAN);
    }

    private ibl(byte[] bArr, int i, int i2) {
        this(ByteBuffer.wrap(bArr, 0, i2));
    }

    /* renamed from: a */
    public static int m3672a(int i) {
        return i < 0 ? 10 : ibl.m3684c(i);
    }

    /* renamed from: a */
    public static int m3674a(String str) {
        int a = ibl.m3673a((CharSequence) str);
        return a + ibl.m3684c(a);
    }

    /* renamed from: a */
    public static int m3675a(byte[] bArr) {
        int length = bArr.length;
        return length + ibl.m3684c(length);
    }

    /* renamed from: a */
    public static long m3676a(long j) {
        return (j + j) ^ (j >> 63);
    }

    /* renamed from: a */
    public static ibl m3677a(byte[] bArr, int i) {
        return new ibl(bArr, 0, i);
    }

    /* renamed from: c */
    public static int m3684c(int i) {
        return (i & -128) != 0 ? (i & -16384) != 0 ? (-2097152 & i) != 0 ? (-268435456 & i) != 0 ? 5 : 4 : 3 : 2 : 1;
    }

    /* renamed from: c */
    public static int m3685c(long j) {
        return (-128 & j) != 0 ? (-16384 & j) != 0 ? (-2097152 & j) != 0 ? (-268435456 & j) != 0 ? (-34359738368L & j) != 0 ? (-4398046511104L & j) != 0 ? (-562949953421312L & j) != 0 ? (-72057594037927936L & j) != 0 ? (Long.MIN_VALUE & j) != 0 ? 10 : 9 : 8 : 7 : 6 : 5 : 4 : 3 : 2 : 1;
    }

    /* renamed from: d */
    public static int m3686d(int i) {
        return (i + i) ^ (i >> 31);
    }

    /* renamed from: e */
    private final void m3687e(int i) {
        byte b = (byte) i;
        if (this.f7269a.hasRemaining()) {
            this.f7269a.put(b);
            return;
        }
        throw new amx(this.f7269a.position(), this.f7269a.limit());
    }

    /* renamed from: b */
    public final void mo8328b(int i) {
        while ((i & -128) != 0) {
            m3687e((i & ScriptIntrinsicBLAS.RsBlas_csyrk) | 128);
            i >>>= 7;
        }
        m3687e(i);
    }

    /* renamed from: b */
    public final void mo8329b(long j) {
        while ((-128 & j) != 0) {
            m3687e((((int) j) & ScriptIntrinsicBLAS.RsBlas_csyrk) | 128);
            j >>>= 7;
        }
        m3687e((int) j);
    }

    /* renamed from: a */
    public final void mo8325a(int i, ibr ibr) {
        mo8330c(i, 2);
        if (ibr.f7278p < 0) {
            ibr.mo8346e();
        }
        mo8328b(ibr.f7278p);
        ibr.mo8343a(this);
    }

    /* renamed from: a */
    private static void m3678a(CharSequence charSequence, ByteBuffer byteBuffer) {
        int i = 0;
        int arrayOffset;
        int remaining;
        char charAt;
        char charAt2;
        if (byteBuffer.isReadOnly()) {
            throw new ReadOnlyBufferException();
        } else if (byteBuffer.hasArray()) {
            try {
                byte[] array = byteBuffer.array();
                arrayOffset = byteBuffer.arrayOffset() + byteBuffer.position();
                remaining = byteBuffer.remaining();
                int length = charSequence.length();
                int i2 = arrayOffset + remaining;
                while (i < length) {
                    remaining = i + arrayOffset;
                    if (remaining >= i2) {
                        break;
                    }
                    charAt = charSequence.charAt(i);
                    if (charAt >= 128) {
                        break;
                    }
                    array[remaining] = (byte) charAt;
                    i++;
                }
                if (i != length) {
                    int i3 = arrayOffset + i;
                    while (i < length) {
                        char charAt3 = charSequence.charAt(i);
                        StringBuilder stringBuilder;
                        if (charAt3 < 128 && i3 < i2) {
                            arrayOffset = i3 + 1;
                            array[i3] = (byte) charAt3;
                        } else if (charAt3 < 2048 && i3 <= i2 - 2) {
                            remaining = i3 + 1;
                            array[i3] = (byte) ((charAt3 >>> 6) | 960);
                            arrayOffset = remaining + 1;
                            array[remaining] = (byte) ((charAt3 & 63) | 128);
                        } else if ((charAt3 < 55296 || charAt3 > 57343) && i3 <= i2 - 3) {
                            arrayOffset = i3 + 1;
                            array[i3] = (byte) ((charAt3 >>> 12) | 480);
                            remaining = arrayOffset + 1;
                            array[arrayOffset] = (byte) (((charAt3 >>> 6) & 63) | 128);
                            arrayOffset = remaining + 1;
                            array[remaining] = (byte) ((charAt3 & 63) | 128);
                        } else if (i3 <= i2 - 4) {
                            remaining = i + 1;
                            if (remaining != charSequence.length()) {
                                charAt2 = charSequence.charAt(remaining);
                                if (Character.isSurrogatePair(charAt3, charAt2)) {
                                    i = Character.toCodePoint(charAt3, charAt2);
                                    arrayOffset = i3 + 1;
                                    array[i3] = (byte) ((i >>> 18) | 240);
                                    i3 = arrayOffset + 1;
                                    array[arrayOffset] = (byte) (((i >>> 12) & 63) | 128);
                                    int i4 = i3 + 1;
                                    array[i3] = (byte) (((i >>> 6) & 63) | 128);
                                    arrayOffset = i4 + 1;
                                    array[i4] = (byte) ((i & 63) | 128);
                                    i = remaining;
                                }
                            } else {
                                remaining = i;
                            }
                            stringBuilder = new StringBuilder(39);
                            stringBuilder.append("Unpaired surrogate at index ");
                            stringBuilder.append(remaining - 1);
                            throw new IllegalArgumentException(stringBuilder.toString());
                        } else {
                            stringBuilder = new StringBuilder(37);
                            stringBuilder.append("Failed writing ");
                            stringBuilder.append(charAt3);
                            stringBuilder.append(" at index ");
                            stringBuilder.append(i3);
                            throw new ArrayIndexOutOfBoundsException(stringBuilder.toString());
                        }
                        i++;
                        i3 = arrayOffset;
                    }
                    arrayOffset = i3;
                } else {
                    arrayOffset += length;
                }
                byteBuffer.position(arrayOffset - byteBuffer.arrayOffset());
            } catch (Throwable e) {
                BufferOverflowException bufferOverflowException = new BufferOverflowException();
                bufferOverflowException.initCause(e);
                throw bufferOverflowException;
            }
        } else {
            remaining = charSequence.length();
            arrayOffset = 0;
            while (arrayOffset < remaining) {
                charAt = charSequence.charAt(arrayOffset);
                if (charAt < 128) {
                    byteBuffer.put((byte) charAt);
                } else if (charAt < 2048) {
                    byteBuffer.put((byte) ((charAt >>> 6) | 960));
                    byteBuffer.put((byte) ((charAt & 63) | 128));
                } else if (charAt >= 55296 && charAt <= 57343) {
                    i = arrayOffset + 1;
                    if (i != charSequence.length()) {
                        charAt2 = charSequence.charAt(i);
                        if (Character.isSurrogatePair(charAt, charAt2)) {
                            arrayOffset = Character.toCodePoint(charAt, charAt2);
                            byteBuffer.put((byte) ((arrayOffset >>> 18) | 240));
                            byteBuffer.put((byte) (((arrayOffset >>> 12) & 63) | 128));
                            byteBuffer.put((byte) (((arrayOffset >>> 6) & 63) | 128));
                            byteBuffer.put((byte) ((arrayOffset & 63) | 128));
                            arrayOffset = i;
                        }
                    } else {
                        i = arrayOffset;
                    }
                    StringBuilder stringBuilder2 = new StringBuilder(39);
                    stringBuilder2.append("Unpaired surrogate at index ");
                    stringBuilder2.append(i - 1);
                    throw new IllegalArgumentException(stringBuilder2.toString());
                } else {
                    byteBuffer.put((byte) ((charAt >>> 12) | 480));
                    byteBuffer.put((byte) (((charAt >>> 6) & 63) | 128));
                    byteBuffer.put((byte) ((charAt & 63) | 128));
                }
                arrayOffset++;
            }
        }
    }

    /* renamed from: a */
    public final void mo8323a(int i, int i2) {
        mo8330c(i, 0);
        if (i2 < 0) {
            mo8329b((long) i2);
        } else {
            mo8328b(i2);
        }
    }

    /* renamed from: b */
    public static int m3679b(int i, int i2) {
        return ibl.m3684c(i << 3) + ibl.m3672a(i2);
    }

    /* renamed from: c */
    public final void mo8330c(int i, int i2) {
        mo8328b((i << 3) | i2);
    }

    /* renamed from: a */
    public final void mo8327a(int i, byte[] bArr) {
        mo8330c(i, 2);
        int length = bArr.length;
        mo8328b(length);
        if (this.f7269a.remaining() < length) {
            throw new amx(this.f7269a.position(), this.f7269a.limit());
        }
        this.f7269a.put(bArr, 0, length);
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x0092 A:{RETURN} */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0030  */
    /* renamed from: a */
    private static int m3673a(java.lang.CharSequence r8) {
        /*
        r7 = 2048; // 0x800 float:2.87E-42 double:1.0118E-320;
        r1 = 0;
        r3 = r8.length();
        r0 = r1;
    L_0x0008:
        if (r0 >= r3) goto L_0x0090;
    L_0x000a:
        r2 = r8.charAt(r0);
        r4 = 128; // 0x80 float:1.794E-43 double:6.32E-322;
        if (r2 >= r4) goto L_0x0015;
    L_0x0012:
        r0 = r0 + 1;
        goto L_0x0008;
    L_0x0015:
        r2 = r3;
    L_0x0016:
        if (r0 >= r3) goto L_0x008e;
    L_0x0018:
        r4 = r8.charAt(r0);
        if (r4 >= r7) goto L_0x0026;
    L_0x001e:
        r4 = 127 - r4;
        r4 = r4 >>> 31;
        r2 = r2 + r4;
        r0 = r0 + 1;
        goto L_0x0016;
    L_0x0026:
        r4 = r8.length();
    L_0x002a:
        if (r0 < r4) goto L_0x0050;
    L_0x002c:
        r0 = r2 + r1;
    L_0x002e:
        if (r0 >= r3) goto L_0x0092;
    L_0x0030:
        r1 = new java.lang.IllegalArgumentException;
        r2 = new java.lang.StringBuilder;
        r3 = 54;
        r2.<init>(r3);
        r3 = "UTF-8 length does not fit in int: ";
        r2.append(r3);
        r4 = (long) r0;
        r6 = 4294967296; // 0x100000000 float:0.0 double:2.121995791E-314;
        r4 = r4 + r6;
        r2.append(r4);
        r0 = r2.toString();
        r1.<init>(r0);
        throw r1;
    L_0x0050:
        r5 = r8.charAt(r0);
        if (r5 >= r7) goto L_0x005e;
    L_0x0056:
        r5 = 127 - r5;
        r5 = r5 >>> 31;
        r1 = r1 + r5;
    L_0x005b:
        r0 = r0 + 1;
        goto L_0x002a;
    L_0x005e:
        r1 = r1 + 2;
        r6 = 55296; // 0xd800 float:7.7486E-41 double:2.732E-319;
        if (r5 < r6) goto L_0x005b;
    L_0x0065:
        r6 = 57343; // 0xdfff float:8.0355E-41 double:2.8331E-319;
        if (r5 > r6) goto L_0x005b;
    L_0x006a:
        r5 = java.lang.Character.codePointAt(r8, r0);
        r6 = 65536; // 0x10000 float:9.18355E-41 double:3.2379E-319;
        if (r5 >= r6) goto L_0x008b;
    L_0x0072:
        r1 = new java.lang.IllegalArgumentException;
        r2 = new java.lang.StringBuilder;
        r3 = 39;
        r2.<init>(r3);
        r3 = "Unpaired surrogate at index ";
        r2.append(r3);
        r2.append(r0);
        r0 = r2.toString();
        r1.<init>(r0);
        throw r1;
    L_0x008b:
        r0 = r0 + 1;
        goto L_0x005b;
    L_0x008e:
        r0 = r2;
        goto L_0x002e;
    L_0x0090:
        r2 = r3;
        goto L_0x0016;
    L_0x0092:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: ibl.a(java.lang.CharSequence):int");
    }

    /* renamed from: a */
    public final void mo8322a(int i, float f) {
        mo8330c(i, 5);
        int floatToIntBits = Float.floatToIntBits(f);
        if (this.f7269a.remaining() < 4) {
            throw new amx(this.f7269a.position(), this.f7269a.limit());
        }
        this.f7269a.putInt(floatToIntBits);
    }

    /* renamed from: b */
    public static int m3681b(int i, ibr ibr) {
        int c = ibl.m3684c(i << 3);
        int e = ibr.mo8346e();
        return c + (e + ibl.m3684c(e));
    }

    /* renamed from: b */
    public static int m3683b(int i, byte[] bArr) {
        return ibl.m3684c(i << 3) + ibl.m3675a(bArr);
    }

    /* renamed from: a */
    public final void mo8324a(int i, long j) {
        mo8330c(i, 0);
        mo8329b(j);
    }

    /* renamed from: b */
    public static int m3680b(int i, long j) {
        return ibl.m3684c(i << 3) + ibl.m3685c(j);
    }

    /* renamed from: a */
    public final void mo8326a(int i, String str) {
        mo8330c(i, 2);
        try {
            int c = ibl.m3684c(str.length());
            if (c != ibl.m3684c(str.length() * 3)) {
                mo8328b(ibl.m3673a((CharSequence) str));
                ibl.m3678a((CharSequence) str, this.f7269a);
                return;
            }
            int position = this.f7269a.position();
            if (this.f7269a.remaining() >= c) {
                this.f7269a.position(position + c);
                ibl.m3678a((CharSequence) str, this.f7269a);
                int position2 = this.f7269a.position();
                this.f7269a.position(position);
                mo8328b((position2 - position) - c);
                this.f7269a.position(position2);
                return;
            }
            throw new amx(c + position, this.f7269a.limit());
        } catch (Throwable e) {
            amx amx = new amx(this.f7269a.position(), this.f7269a.limit());
            amx.initCause(e);
            throw amx;
        }
    }

    /* renamed from: b */
    public static int m3682b(int i, String str) {
        return ibl.m3684c(i << 3) + ibl.m3674a(str);
    }
}
