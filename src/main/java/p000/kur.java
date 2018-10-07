package p000;

/* compiled from: PG */
/* renamed from: kur */
final class kur {
    /* renamed from: a */
    public static final kus f8962a;

    static {
        kus kut;
        Object obj = null;
        if (kul.f8952b && kul.f8951a) {
            obj = 1;
        }
        if (obj == null) {
            kut = new kut();
        } else {
            kut = new kuv();
        }
        f8962a = kut;
    }

    /* renamed from: a */
    static int m5418a(CharSequence charSequence, byte[] bArr, int i, int i2) {
        return f8962a.mo10442a(charSequence, bArr, i, i2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x007e A:{RETURN} */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x005a  */
    /* renamed from: a */
    static int m5417a(java.lang.CharSequence r8) {
        /*
        r7 = 2048; // 0x800 float:2.87E-42 double:1.0118E-320;
        r0 = 0;
        r3 = r8.length();
        r1 = r0;
    L_0x0008:
        if (r1 >= r3) goto L_0x007c;
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
        if (r1 >= r3) goto L_0x007a;
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
        if (r1 >= r4) goto L_0x0057;
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
        if (r5 >= r6) goto L_0x0054;
    L_0x004e:
        r0 = new kuu;
        r0.<init>(r1, r4);
        throw r0;
    L_0x0054:
        r1 = r1 + 1;
        goto L_0x0037;
    L_0x0057:
        r0 = r0 + r2;
    L_0x0058:
        if (r0 >= r3) goto L_0x007e;
    L_0x005a:
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
    L_0x007a:
        r0 = r2;
        goto L_0x0058;
    L_0x007c:
        r2 = r3;
        goto L_0x0016;
    L_0x007e:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: kur.a(java.lang.CharSequence):int");
    }

    /* renamed from: a */
    static int m5414a(int i) {
        return i > -12 ? -1 : i;
    }

    /* renamed from: a */
    static int m5415a(int i, int i2) {
        if (i > -12 || i2 > -65) {
            return -1;
        }
        return (i2 << 8) ^ i;
    }

    /* renamed from: a */
    static int m5416a(int i, int i2, int i3) {
        if (i > -12 || i2 > -65 || i3 > -65) {
            return -1;
        }
        return ((i2 << 8) ^ i) ^ (i3 << 16);
    }

    /* renamed from: a */
    static int m5419a(byte[] bArr, int i, int i2) {
        int i3 = bArr[i - 1];
        switch (i2 - i) {
            case 0:
                return kur.m5414a(i3);
            case 1:
                return kur.m5415a(i3, bArr[i]);
            case 2:
                return kur.m5416a(i3, bArr[i], bArr[i + 1]);
            default:
                throw new AssertionError();
        }
    }

    /* renamed from: b */
    public static boolean m5420b(byte[] bArr, int i, int i2) {
        return f8962a.mo10443a(bArr, i, i2);
    }
}
