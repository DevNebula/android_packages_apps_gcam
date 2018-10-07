package p000;

import android.support.p003v8.renderscript.ScriptIntrinsicBLAS;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ReadOnlyBufferException;

/* compiled from: PG */
/* renamed from: kvd */
public final class kvd {
    /* renamed from: a */
    public final ByteBuffer f9011a;

    private kvd(ByteBuffer byteBuffer) {
        this.f9011a = byteBuffer;
        this.f9011a.order(ByteOrder.LITTLE_ENDIAN);
    }

    private kvd(byte[] bArr, int i, int i2) {
        this(ByteBuffer.wrap(bArr, i, i2));
    }

    /* renamed from: a */
    public static int m5476a(int i, int i2) {
        return kvd.m5484b(i << 3) + kvd.m5475a(i2);
    }

    /* renamed from: a */
    public static int m5475a(int i) {
        return i >= 0 ? kvd.m5484b(i) : 10;
    }

    /* renamed from: a */
    public static int m5477a(int i, long j) {
        return kvd.m5484b(i << 3) + kvd.m5480a(j);
    }

    /* renamed from: a */
    public static int m5479a(int i, kvl kvl) {
        int b = kvd.m5484b(i << 3);
        int serializedSize = kvl.getSerializedSize();
        return b + (serializedSize + kvd.m5484b(serializedSize));
    }

    /* renamed from: b */
    public static int m5484b(int i) {
        if ((i & -128) == 0) {
            return 1;
        }
        if ((i & -16384) == 0) {
            return 2;
        }
        if ((-2097152 & i) == 0) {
            return 3;
        }
        return (-268435456 & i) == 0 ? 4 : 5;
    }

    /* renamed from: a */
    public static int m5480a(long j) {
        if ((-128 & j) == 0) {
            return 1;
        }
        if ((-16384 & j) == 0) {
            return 2;
        }
        if ((-2097152 & j) == 0) {
            return 3;
        }
        if ((-268435456 & j) == 0) {
            return 4;
        }
        if ((-34359738368L & j) == 0) {
            return 5;
        }
        if ((-4398046511104L & j) == 0) {
            return 6;
        }
        if ((-562949953421312L & j) == 0) {
            return 7;
        }
        if ((-72057594037927936L & j) == 0) {
            return 8;
        }
        return (Long.MIN_VALUE & j) == 0 ? 9 : 10;
    }

    /* renamed from: a */
    public static int m5478a(int i, String str) {
        int b = kvd.m5484b(i << 3);
        int a = kvd.m5481a((CharSequence) str);
        return b + (a + kvd.m5484b(a));
    }

    /* renamed from: b */
    public static int m5485b(long j) {
        return kvd.m5484b(8) + kvd.m5480a(j);
    }

    /* renamed from: a */
    private static void m5483a(CharSequence charSequence, ByteBuffer byteBuffer) {
        int i = 0;
        int position;
        int remaining;
        char charAt;
        char charAt2;
        if (byteBuffer.isReadOnly()) {
            throw new ReadOnlyBufferException();
        } else if (byteBuffer.hasArray()) {
            try {
                int i2;
                byte[] array = byteBuffer.array();
                position = byteBuffer.position() + byteBuffer.arrayOffset();
                remaining = byteBuffer.remaining();
                int length = charSequence.length();
                int i3 = position + remaining;
                remaining = 0;
                while (remaining < length) {
                    i = remaining + position;
                    if (i >= i3) {
                        break;
                    }
                    charAt = charSequence.charAt(remaining);
                    if (charAt >= 128) {
                        break;
                    }
                    array[i] = (byte) charAt;
                    remaining++;
                }
                if (remaining == length) {
                    i2 = position + length;
                } else {
                    i2 = position + remaining;
                    while (remaining < length) {
                        char charAt3 = charSequence.charAt(remaining);
                        StringBuilder stringBuilder;
                        if (charAt3 < 128 && i2 < i3) {
                            i = i2 + 1;
                            array[i2] = (byte) charAt3;
                        } else if (charAt3 < 2048 && i2 <= i3 - 2) {
                            position = i2 + 1;
                            array[i2] = (byte) ((charAt3 >>> 6) | 960);
                            i = position + 1;
                            array[position] = (byte) ((charAt3 & 63) | 128);
                        } else if ((charAt3 < 55296 || charAt3 > 57343) && i2 <= i3 - 3) {
                            i = i2 + 1;
                            array[i2] = (byte) ((charAt3 >>> 12) | 480);
                            position = i + 1;
                            array[i] = (byte) (((charAt3 >>> 6) & 63) | 128);
                            i = position + 1;
                            array[position] = (byte) ((charAt3 & 63) | 128);
                        } else if (i2 <= i3 - 4) {
                            position = remaining + 1;
                            if (position != charSequence.length()) {
                                charAt2 = charSequence.charAt(position);
                                if (Character.isSurrogatePair(charAt3, charAt2)) {
                                    remaining = Character.toCodePoint(charAt3, charAt2);
                                    i = i2 + 1;
                                    array[i2] = (byte) ((remaining >>> 18) | 240);
                                    i2 = i + 1;
                                    array[i] = (byte) (((remaining >>> 12) & 63) | 128);
                                    int i4 = i2 + 1;
                                    array[i2] = (byte) (((remaining >>> 6) & 63) | 128);
                                    i = i4 + 1;
                                    array[i4] = (byte) ((remaining & 63) | 128);
                                    remaining = position;
                                }
                            } else {
                                position = remaining;
                            }
                            stringBuilder = new StringBuilder(39);
                            stringBuilder.append("Unpaired surrogate at index ");
                            stringBuilder.append(position - 1);
                            throw new IllegalArgumentException(stringBuilder.toString());
                        } else {
                            stringBuilder = new StringBuilder(37);
                            stringBuilder.append("Failed writing ");
                            stringBuilder.append(charAt3);
                            stringBuilder.append(" at index ");
                            stringBuilder.append(i2);
                            throw new ArrayIndexOutOfBoundsException(stringBuilder.toString());
                        }
                        remaining++;
                        i2 = i;
                    }
                }
                byteBuffer.position(i2 - byteBuffer.arrayOffset());
            } catch (Throwable e) {
                BufferOverflowException bufferOverflowException = new BufferOverflowException();
                bufferOverflowException.initCause(e);
                throw bufferOverflowException;
            }
        } else {
            position = charSequence.length();
            while (i < position) {
                charAt = charSequence.charAt(i);
                if (charAt < 128) {
                    byteBuffer.put((byte) charAt);
                } else if (charAt < 2048) {
                    byteBuffer.put((byte) ((charAt >>> 6) | 960));
                    byteBuffer.put((byte) ((charAt & 63) | 128));
                } else if (charAt < 55296 || charAt > 57343) {
                    byteBuffer.put((byte) ((charAt >>> 12) | 480));
                    byteBuffer.put((byte) (((charAt >>> 6) & 63) | 128));
                    byteBuffer.put((byte) ((charAt & 63) | 128));
                } else {
                    remaining = i + 1;
                    if (remaining != charSequence.length()) {
                        charAt2 = charSequence.charAt(remaining);
                        if (Character.isSurrogatePair(charAt, charAt2)) {
                            i = Character.toCodePoint(charAt, charAt2);
                            byteBuffer.put((byte) ((i >>> 18) | 240));
                            byteBuffer.put((byte) (((i >>> 12) & 63) | 128));
                            byteBuffer.put((byte) (((i >>> 6) & 63) | 128));
                            byteBuffer.put((byte) ((i & 63) | 128));
                            i = remaining;
                        }
                    } else {
                        remaining = i;
                    }
                    StringBuilder stringBuilder2 = new StringBuilder(39);
                    stringBuilder2.append("Unpaired surrogate at index ");
                    stringBuilder2.append(remaining - 1);
                    throw new IllegalArgumentException(stringBuilder2.toString());
                }
                i++;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x0091 A:{RETURN} */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x006d  */
    /* renamed from: a */
    private static int m5481a(java.lang.CharSequence r8) {
        /*
        r7 = 2048; // 0x800 float:2.87E-42 double:1.0118E-320;
        r0 = 0;
        r3 = r8.length();
        r1 = r0;
    L_0x0008:
        if (r1 >= r3) goto L_0x008f;
    L_0x000a:
        r2 = r8.charAt(r1);
        r4 = 128; // 0x80 float:1.794E-43 double:6.32E-322;
        if (r2 >= r4) goto L_0x0015;
    L_0x0012:
        r1 = r1 + 1;
        goto L_0x0008;
    L_0x0015:
        r2 = r3;
    L_0x0016:
        if (r1 >= r3) goto L_0x008d;
    L_0x0018:
        r4 = r8.charAt(r1);
        if (r4 >= r7) goto L_0x0026;
    L_0x001e:
        r4 = 127 - r4;
        r4 = r4 >>> 31;
        r2 = r2 + r4;
        r1 = r1 + 1;
        goto L_0x0016;
    L_0x0026:
        r4 = r8.length();
    L_0x002a:
        if (r1 >= r4) goto L_0x006a;
    L_0x002c:
        r5 = r8.charAt(r1);
        if (r5 >= r7) goto L_0x003a;
    L_0x0032:
        r5 = 127 - r5;
        r5 = r5 >>> 31;
        r0 = r0 + r5;
    L_0x0037:
        r1 = r1 + 1;
        goto L_0x002a;
    L_0x003a:
        r0 = r0 + 2;
        r6 = 55296; // 0xd800 float:7.7486E-41 double:2.732E-319;
        if (r5 < r6) goto L_0x0037;
    L_0x0041:
        r6 = 57343; // 0xdfff float:8.0355E-41 double:2.8331E-319;
        if (r5 > r6) goto L_0x0037;
    L_0x0046:
        r5 = java.lang.Character.codePointAt(r8, r1);
        r6 = 65536; // 0x10000 float:9.18355E-41 double:3.2379E-319;
        if (r5 >= r6) goto L_0x0067;
    L_0x004e:
        r0 = new java.lang.IllegalArgumentException;
        r2 = new java.lang.StringBuilder;
        r3 = 39;
        r2.<init>(r3);
        r3 = "Unpaired surrogate at index ";
        r2.append(r3);
        r2.append(r1);
        r1 = r2.toString();
        r0.<init>(r1);
        throw r0;
    L_0x0067:
        r1 = r1 + 1;
        goto L_0x0037;
    L_0x006a:
        r0 = r0 + r2;
    L_0x006b:
        if (r0 >= r3) goto L_0x0091;
    L_0x006d:
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
    L_0x008d:
        r0 = r2;
        goto L_0x006b;
    L_0x008f:
        r2 = r3;
        goto L_0x0016;
    L_0x0091:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: kvd.a(java.lang.CharSequence):int");
    }

    /* renamed from: a */
    public static kvd m5482a(byte[] bArr, int i, int i2) {
        return new kvd(bArr, i, i2);
    }

    /* renamed from: a */
    public final void mo10491a(int i, boolean z) {
        mo10498c(i, 0);
        if (this.f9011a.hasRemaining()) {
            this.f9011a.put(z);
            return;
        }
        throw new kve(this.f9011a.position(), this.f9011a.limit());
    }

    /* renamed from: a */
    public final void mo10490a(int i, float f) {
        mo10498c(i, 5);
        mo10489a(f);
    }

    /* renamed from: a */
    public final void mo10489a(float f) {
        mo10500d(Float.floatToIntBits(f));
    }

    /* renamed from: b */
    public final void mo10493b(int i, int i2) {
        mo10498c(i, 0);
        mo10497c(i2);
    }

    /* renamed from: c */
    public final void mo10497c(int i) {
        if (i >= 0) {
            mo10501e(i);
        } else {
            m5486d((long) i);
        }
    }

    /* renamed from: b */
    public final void mo10494b(int i, long j) {
        mo10498c(i, 0);
        m5486d(j);
    }

    /* renamed from: b */
    public final void mo10496b(int i, kvl kvl) {
        mo10498c(i, 2);
        mo10501e(kvl.getCachedSize());
        kvl.writeTo(this);
    }

    /* renamed from: f */
    private final void m5487f(int i) {
        byte b = (byte) i;
        if (this.f9011a.hasRemaining()) {
            this.f9011a.put(b);
            return;
        }
        throw new kve(this.f9011a.position(), this.f9011a.limit());
    }

    /* renamed from: a */
    public final void mo10492a(byte[] bArr) {
        int length = bArr.length;
        if (this.f9011a.remaining() >= length) {
            this.f9011a.put(bArr, 0, length);
            return;
        }
        throw new kve(this.f9011a.position(), this.f9011a.limit());
    }

    /* renamed from: d */
    public final void mo10500d(int i) {
        if (this.f9011a.remaining() < 4) {
            throw new kve(this.f9011a.position(), this.f9011a.limit());
        }
        this.f9011a.putInt(i);
    }

    /* renamed from: e */
    public final void mo10501e(int i) {
        while ((i & -128) != 0) {
            m5487f((i & ScriptIntrinsicBLAS.RsBlas_csyrk) | 128);
            i >>>= 7;
        }
        m5487f(i);
    }

    /* renamed from: d */
    private final void m5486d(long j) {
        while ((-128 & j) != 0) {
            m5487f((((int) j) & ScriptIntrinsicBLAS.RsBlas_csyrk) | 128);
            j >>>= 7;
        }
        m5487f((int) j);
    }

    /* renamed from: b */
    public final void mo10495b(int i, String str) {
        mo10498c(i, 2);
        try {
            int b = kvd.m5484b(str.length());
            if (b == kvd.m5484b(str.length() * 3)) {
                int position = this.f9011a.position();
                if (this.f9011a.remaining() < b) {
                    throw new kve(b + position, this.f9011a.limit());
                }
                this.f9011a.position(position + b);
                kvd.m5483a((CharSequence) str, this.f9011a);
                int position2 = this.f9011a.position();
                this.f9011a.position(position);
                mo10501e((position2 - position) - b);
                this.f9011a.position(position2);
                return;
            }
            mo10501e(kvd.m5481a((CharSequence) str));
            kvd.m5483a((CharSequence) str, this.f9011a);
        } catch (Throwable e) {
            kve kve = new kve(this.f9011a.position(), this.f9011a.limit());
            kve.initCause(e);
            throw kve;
        }
    }

    /* renamed from: c */
    public final void mo10498c(int i, int i2) {
        mo10501e((i << 3) | i2);
    }

    /* renamed from: c */
    public final void mo10499c(long j) {
        mo10498c(1, 0);
        m5486d(j);
    }
}
