package p000;

/* compiled from: PG */
/* renamed from: kut */
final class kut extends kus {
    kut() {
    }

    /* renamed from: a */
    final int mo10442a(CharSequence charSequence, byte[] bArr, int i, int i2) {
        int i3;
        int length = charSequence.length();
        int i4 = i + i2;
        int i5 = 0;
        while (i5 < length) {
            i3 = i5 + i;
            if (i3 >= i4) {
                break;
            }
            char charAt = charSequence.charAt(i5);
            if (charAt >= 128) {
                break;
            }
            bArr[i3] = (byte) charAt;
            i5++;
        }
        if (i5 == length) {
            return i + length;
        }
        int i6 = i + i5;
        while (i5 < length) {
            char charAt2 = charSequence.charAt(i5);
            int i7;
            if (charAt2 < 128 && i6 < i4) {
                i3 = i6 + 1;
                bArr[i6] = (byte) charAt2;
            } else if (charAt2 < 2048 && i6 <= i4 - 2) {
                i7 = i6 + 1;
                bArr[i6] = (byte) ((charAt2 >>> 6) | 960);
                i3 = i7 + 1;
                bArr[i7] = (byte) ((charAt2 & 63) | 128);
            } else if ((charAt2 < 55296 || charAt2 > 57343) && i6 <= i4 - 3) {
                i3 = i6 + 1;
                bArr[i6] = (byte) ((charAt2 >>> 12) | 480);
                i7 = i3 + 1;
                bArr[i3] = (byte) (((charAt2 >>> 6) & 63) | 128);
                i3 = i7 + 1;
                bArr[i7] = (byte) ((charAt2 & 63) | 128);
            } else if (i6 <= i4 - 4) {
                i7 = i5 + 1;
                if (i7 != charSequence.length()) {
                    char charAt3 = charSequence.charAt(i7);
                    if (Character.isSurrogatePair(charAt2, charAt3)) {
                        i5 = Character.toCodePoint(charAt2, charAt3);
                        i3 = i6 + 1;
                        bArr[i6] = (byte) ((i5 >>> 18) | 240);
                        i6 = i3 + 1;
                        bArr[i3] = (byte) (((i5 >>> 12) & 63) | 128);
                        int i8 = i6 + 1;
                        bArr[i6] = (byte) (((i5 >>> 6) & 63) | 128);
                        i3 = i8 + 1;
                        bArr[i8] = (byte) ((i5 & 63) | 128);
                        i5 = i7;
                    }
                } else {
                    i7 = i5;
                }
                throw new kuu(i7 - 1, length);
            } else {
                if (charAt2 >= 55296 && charAt2 <= 57343) {
                    i3 = i5 + 1;
                    if (i3 == charSequence.length() || !Character.isSurrogatePair(charAt2, charSequence.charAt(i3))) {
                        throw new kuu(i5, length);
                    }
                }
                StringBuilder stringBuilder = new StringBuilder(37);
                stringBuilder.append("Failed writing ");
                stringBuilder.append(charAt2);
                stringBuilder.append(" at index ");
                stringBuilder.append(i6);
                throw new ArrayIndexOutOfBoundsException(stringBuilder.toString());
            }
            i5++;
            i6 = i3;
        }
        return i6;
    }

    /* renamed from: b */
    final int mo10444b(byte[] bArr, int i, int i2) {
        int i3 = i;
        while (i3 < i2 && bArr[i3] >= (byte) 0) {
            i3++;
        }
        if (i3 >= i2) {
            return 0;
        }
        while (i3 < i2) {
            int i4 = i3 + 1;
            byte b = bArr[i3];
            if (b >= (byte) 0) {
                i3 = i4;
            } else {
                int i5;
                byte b2;
                if (b < (byte) -32) {
                    if (i4 >= i2) {
                        return b;
                    }
                    if (b < (byte) -62) {
                        return -1;
                    }
                    i3 = i4 + 1;
                    if (bArr[i4] > (byte) -65) {
                    }
                } else if (b < (byte) -16) {
                    if (i4 >= i2 - 1) {
                        return kur.m5419a(bArr, i4, i2);
                    }
                    i5 = i4 + 1;
                    b2 = bArr[i4];
                    if (b2 > (byte) -65) {
                        return -1;
                    }
                    if ((b != (byte) -32 || b2 >= (byte) -96) && (b != (byte) -19 || b2 < (byte) -96)) {
                        i3 = i5 + 1;
                        if (bArr[i5] > (byte) -65) {
                            return -1;
                        }
                    }
                } else if (i4 >= i2 - 2) {
                    return kur.m5419a(bArr, i4, i2);
                } else {
                    i5 = i4 + 1;
                    b2 = bArr[i4];
                    if (b2 > (byte) -65) {
                        return -1;
                    }
                    if ((((b << 28) + (b2 + 112)) >> 30) != 0) {
                        return -1;
                    }
                    i4 = i5 + 1;
                    if (bArr[i5] > (byte) -65) {
                        return -1;
                    }
                    i3 = i4 + 1;
                    if (bArr[i4] > (byte) -65) {
                        return -1;
                    }
                }
                return -1;
            }
        }
        return 0;
    }
}
