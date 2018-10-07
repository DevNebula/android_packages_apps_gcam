package p000;

/* compiled from: PG */
/* renamed from: kuv */
final class kuv extends kus {
    kuv() {
    }

    /* renamed from: a */
    final int mo10442a(CharSequence charSequence, byte[] bArr, int i, int i2) {
        long j = (long) i;
        long j2 = j + ((long) i2);
        int length = charSequence.length();
        if (length > i2 || bArr.length - i2 < i) {
            char charAt = charSequence.charAt(length - 1);
            StringBuilder stringBuilder = new StringBuilder(37);
            stringBuilder.append("Failed writing ");
            stringBuilder.append(charAt);
            stringBuilder.append(" at index ");
            stringBuilder.append(i + i2);
            throw new ArrayIndexOutOfBoundsException(stringBuilder.toString());
        }
        long j3;
        int i3 = 0;
        while (i3 < length) {
            char charAt2 = charSequence.charAt(i3);
            if (charAt2 >= 128) {
                break;
            }
            j3 = 1 + j;
            kul.m5383a(bArr, j, (byte) charAt2);
            i3++;
            j = j3;
        }
        if (i3 == length) {
            return (int) j;
        }
        j3 = j;
        while (i3 < length) {
            char charAt3 = charSequence.charAt(i3);
            long j4;
            if (charAt3 < 128 && j3 < j2) {
                j = 1 + j3;
                kul.m5383a(bArr, j3, (byte) charAt3);
            } else if (charAt3 < 2048 && j3 <= -2 + j2) {
                j4 = j3 + 1;
                kul.m5383a(bArr, j3, (byte) ((charAt3 >>> 6) | 960));
                j = 1 + j4;
                kul.m5383a(bArr, j4, (byte) ((charAt3 & 63) | 128));
            } else if ((charAt3 < 55296 || charAt3 > 57343) && j3 <= -3 + j2) {
                j = 1 + j3;
                kul.m5383a(bArr, j3, (byte) ((charAt3 >>> 12) | 480));
                j3 = 1 + j;
                kul.m5383a(bArr, j, (byte) (((charAt3 >>> 6) & 63) | 128));
                j = 1 + j3;
                kul.m5383a(bArr, j3, (byte) ((charAt3 & 63) | 128));
            } else if (j3 <= -4 + j2) {
                int i4 = i3 + 1;
                if (i4 != length) {
                    char charAt4 = charSequence.charAt(i4);
                    if (Character.isSurrogatePair(charAt3, charAt4)) {
                        i3 = Character.toCodePoint(charAt3, charAt4);
                        j = 1 + j3;
                        kul.m5383a(bArr, j3, (byte) ((i3 >>> 18) | 240));
                        j3 = 1 + j;
                        kul.m5383a(bArr, j, (byte) (((i3 >>> 12) & 63) | 128));
                        j4 = j3 + 1;
                        kul.m5383a(bArr, j3, (byte) (((i3 >>> 6) & 63) | 128));
                        j = 1 + j4;
                        kul.m5383a(bArr, j4, (byte) ((i3 & 63) | 128));
                        i3 = i4;
                    }
                } else {
                    i4 = i3;
                }
                throw new kuu(i4 - 1, length);
            } else {
                if (charAt3 >= 55296 && charAt3 <= 57343) {
                    int i5 = i3 + 1;
                    if (i5 == length || !Character.isSurrogatePair(charAt3, charSequence.charAt(i5))) {
                        throw new kuu(i3, length);
                    }
                }
                StringBuilder stringBuilder2 = new StringBuilder(46);
                stringBuilder2.append("Failed writing ");
                stringBuilder2.append(charAt3);
                stringBuilder2.append(" at index ");
                stringBuilder2.append(j3);
                throw new ArrayIndexOutOfBoundsException(stringBuilder2.toString());
            }
            i3++;
            j3 = j;
        }
        return (int) j3;
    }

    /* JADX WARNING: Missing block: B:85:?, code:
            return -1;
     */
    /* JADX WARNING: Missing block: B:87:?, code:
            return -1;
     */
    /* renamed from: b */
    final int mo10444b(byte[] r10, int r11, int r12) {
        /*
        r9 = this;
        r0 = r10.length;
        r1 = r11 | r12;
        r2 = r0 - r12;
        r1 = r1 | r2;
        if (r1 >= 0) goto L_0x002c;
    L_0x0008:
        r1 = new java.lang.ArrayIndexOutOfBoundsException;
        r2 = 3;
        r2 = new java.lang.Object[r2];
        r3 = 0;
        r0 = java.lang.Integer.valueOf(r0);
        r2[r3] = r0;
        r0 = 1;
        r3 = java.lang.Integer.valueOf(r11);
        r2[r0] = r3;
        r0 = 2;
        r3 = java.lang.Integer.valueOf(r12);
        r2[r0] = r3;
        r0 = "Array length=%d, index=%d, limit=%d";
        r0 = java.lang.String.format(r0, r2);
        r1.<init>(r0);
        throw r1;
    L_0x002c:
        r4 = (long) r11;
        r0 = (long) r12;
        r0 = r0 - r4;
        r1 = (int) r0;
        r0 = 16;
        if (r1 < r0) goto L_0x00f2;
    L_0x0034:
        r0 = 0;
        r2 = r4;
    L_0x0036:
        if (r0 >= r1) goto L_0x0045;
    L_0x0038:
        r6 = 1;
        r6 = r6 + r2;
        r2 = p000.kul.m5371a(r10, r2);
        if (r2 < 0) goto L_0x0046;
    L_0x0041:
        r0 = r0 + 1;
        r2 = r6;
        goto L_0x0036;
    L_0x0045:
        r0 = r1;
    L_0x0046:
        r2 = r1 - r0;
        r0 = (long) r0;
        r0 = r0 + r4;
    L_0x004a:
        r3 = 0;
        r6 = r2;
        r8 = r3;
        r2 = r0;
        r0 = r8;
    L_0x004f:
        if (r6 <= 0) goto L_0x0061;
    L_0x0051:
        r0 = 1;
        r0 = r0 + r2;
        r2 = p000.kul.m5371a(r10, r2);
        if (r2 < 0) goto L_0x00f5;
    L_0x005a:
        r3 = r6 + -1;
        r6 = r3;
        r8 = r2;
        r2 = r0;
        r0 = r8;
        goto L_0x004f;
    L_0x0061:
        r4 = r2;
    L_0x0062:
        if (r6 != 0) goto L_0x0066;
    L_0x0064:
        r0 = 0;
    L_0x0065:
        return r0;
    L_0x0066:
        r1 = r6 + -1;
        r2 = -32;
        if (r0 >= r2) goto L_0x0081;
    L_0x006c:
        if (r1 == 0) goto L_0x0065;
    L_0x006e:
        r2 = r1 + -1;
        r1 = -62;
        if (r0 < r1) goto L_0x007f;
    L_0x0074:
        r0 = 1;
        r0 = r0 + r4;
        r3 = p000.kul.m5371a(r10, r4);
        r4 = -65;
        if (r3 <= r4) goto L_0x004a;
    L_0x007f:
        r0 = -1;
        goto L_0x0065;
    L_0x0081:
        r2 = -16;
        if (r0 >= r2) goto L_0x00b9;
    L_0x0085:
        r2 = 2;
        if (r1 < r2) goto L_0x00b4;
    L_0x0088:
        r2 = r1 + -2;
        r6 = 1;
        r6 = r6 + r4;
        r1 = p000.kul.m5371a(r10, r4);
        r3 = -65;
        if (r1 > r3) goto L_0x00a8;
    L_0x0095:
        r3 = -32;
        if (r0 == r3) goto L_0x00af;
    L_0x0099:
        r3 = -19;
        if (r0 == r3) goto L_0x00aa;
    L_0x009d:
        r0 = 1;
        r0 = r0 + r6;
        r3 = p000.kul.m5371a(r10, r6);
        r4 = -65;
        if (r3 <= r4) goto L_0x004a;
    L_0x00a8:
        r0 = -1;
        goto L_0x0065;
    L_0x00aa:
        r0 = -96;
        if (r1 < r0) goto L_0x009d;
    L_0x00ae:
        goto L_0x00a8;
    L_0x00af:
        r3 = -96;
        if (r1 < r3) goto L_0x00a8;
    L_0x00b3:
        goto L_0x0099;
    L_0x00b4:
        r0 = p000.kuv.m14267a(r10, r0, r4, r1);
        goto L_0x0065;
    L_0x00b9:
        r2 = 3;
        if (r1 < r2) goto L_0x00ec;
    L_0x00bc:
        r2 = r1 + -3;
        r6 = 1;
        r6 = r6 + r4;
        r1 = p000.kul.m5371a(r10, r4);
        r3 = -65;
        if (r1 > r3) goto L_0x00e9;
    L_0x00c9:
        r0 = r0 << 28;
        r1 = r1 + 112;
        r0 = r0 + r1;
        r0 = r0 >> 30;
        if (r0 != 0) goto L_0x00e9;
    L_0x00d2:
        r0 = 1;
        r4 = r6 + r0;
        r0 = p000.kul.m5371a(r10, r6);
        r1 = -65;
        if (r0 > r1) goto L_0x00e9;
    L_0x00de:
        r0 = 1;
        r0 = r0 + r4;
        r3 = p000.kul.m5371a(r10, r4);
        r4 = -65;
        if (r3 <= r4) goto L_0x004a;
    L_0x00e9:
        r0 = -1;
        goto L_0x0065;
    L_0x00ec:
        r0 = p000.kuv.m14267a(r10, r0, r4, r1);
        goto L_0x0065;
    L_0x00f2:
        r0 = 0;
        goto L_0x0046;
    L_0x00f5:
        r4 = r0;
        r0 = r2;
        goto L_0x0062;
        */
        throw new UnsupportedOperationException("Method not decompiled: kuv.b(byte[], int, int):int");
    }

    /* renamed from: a */
    private static int m14267a(byte[] bArr, int i, long j, int i2) {
        switch (i2) {
            case 0:
                return kur.m5414a(i);
            case 1:
                return kur.m5415a(i, kul.m5371a(bArr, j));
            case 2:
                return kur.m5416a(i, kul.m5371a(bArr, j), kul.m5371a(bArr, 1 + j));
            default:
                throw new AssertionError();
        }
    }
}
