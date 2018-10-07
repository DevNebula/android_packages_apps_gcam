package p000;

/* compiled from: PG */
/* renamed from: kgi */
public final class kgi extends kes {
    /* renamed from: a */
    public static final kes f21897a = new kgi(null, new Object[0], 0);
    public static final long serialVersionUID = 0;
    /* renamed from: b */
    private final transient int[] f21898b;
    /* renamed from: c */
    private final transient Object[] f21899c;
    /* renamed from: d */
    private final transient int f21900d;

    private kgi(int[] iArr, Object[] objArr, int i) {
        this.f21898b = iArr;
        this.f21899c = objArr;
        this.f21900d = i;
    }

    /* renamed from: a */
    public static kgi m13758a(int i, Object[] objArr) {
        if (i == 0) {
            return (kgi) f21897a;
        }
        if (i == 1) {
            khb.m4952b(objArr[0], objArr[1]);
            return new kgi(null, objArr, 1);
        }
        jri.m13403b(i, objArr.length >> 1);
        return new kgi(kgi.m13759a(objArr, i, keu.m13736b(i), 0), objArr, i);
    }

    /* renamed from: f */
    final keu mo9859f() {
        return new kgj(this, this.f21899c, 0, this.f21900d);
    }

    /* JADX WARNING: Missing block: B:8:0x0035, code:
            r1[r0] = r4;
            r2 = r2 + 1;
     */
    /* renamed from: a */
    static int[] m13759a(java.lang.Object[] r10, int r11, int r12, int r13) {
        /*
        r9 = -1;
        r0 = 1;
        if (r11 != r0) goto L_0x000f;
    L_0x0004:
        r0 = r10[r13];
        r1 = r13 ^ 1;
        r1 = r10[r1];
        p000.khb.m4952b(r0, r1);
        r0 = 0;
    L_0x000e:
        return r0;
    L_0x000f:
        r3 = r12 + -1;
        r1 = new int[r12];
        java.util.Arrays.fill(r1, r9);
        r0 = 0;
        r2 = r0;
    L_0x0018:
        if (r2 >= r11) goto L_0x00b0;
    L_0x001a:
        r0 = r2 + r2;
        r4 = r0 + r13;
        r5 = r10[r4];
        r6 = r13 ^ 1;
        r0 = r0 + r6;
        r6 = r10[r0];
        p000.khb.m4952b(r5, r6);
        r0 = r5.hashCode();
        r0 = p000.khb.m4953c(r0);
    L_0x0030:
        r0 = r0 & r3;
        r7 = r1[r0];
        if (r7 != r9) goto L_0x003b;
    L_0x0035:
        r1[r0] = r4;
        r0 = r2 + 1;
        r2 = r0;
        goto L_0x0018;
    L_0x003b:
        r8 = r10[r7];
        r8 = r8.equals(r5);
        if (r8 == 0) goto L_0x00ad;
    L_0x0043:
        r0 = new java.lang.IllegalArgumentException;
        r1 = java.lang.String.valueOf(r5);
        r2 = java.lang.String.valueOf(r6);
        r3 = r10[r7];
        r3 = java.lang.String.valueOf(r3);
        r4 = r7 ^ 1;
        r4 = r10[r4];
        r4 = java.lang.String.valueOf(r4);
        r5 = java.lang.String.valueOf(r1);
        r5 = r5.length();
        r6 = java.lang.String.valueOf(r2);
        r6 = r6.length();
        r7 = java.lang.String.valueOf(r3);
        r7 = r7.length();
        r8 = java.lang.String.valueOf(r4);
        r8 = r8.length();
        r9 = new java.lang.StringBuilder;
        r5 = r5 + 39;
        r5 = r5 + r6;
        r5 = r5 + r7;
        r5 = r5 + r8;
        r9.<init>(r5);
        r5 = "Multiple entries with same key: ";
        r9.append(r5);
        r9.append(r1);
        r1 = "=";
        r9.append(r1);
        r9.append(r2);
        r1 = " and ";
        r9.append(r1);
        r9.append(r3);
        r1 = "=";
        r9.append(r1);
        r9.append(r4);
        r1 = r9.toString();
        r0.<init>(r1);
        throw r0;
    L_0x00ad:
        r0 = r0 + 1;
        goto L_0x0030;
    L_0x00b0:
        r0 = r1;
        goto L_0x000e;
        */
        throw new UnsupportedOperationException("Method not decompiled: kgi.a(java.lang.Object[], int, int, int):int[]");
    }

    /* renamed from: g */
    final keu mo9860g() {
        return new kgl(this, new kgm(this.f21899c, 0, this.f21900d));
    }

    /* renamed from: b */
    final keh mo9852b() {
        return new kgm(this.f21899c, 1, this.f21900d);
    }

    public final Object get(Object obj) {
        return kgi.m13757a(this.f21898b, this.f21899c, this.f21900d, 0, obj);
    }

    /* renamed from: a */
    static Object m13757a(int[] iArr, Object[] objArr, int i, int i2, Object obj) {
        if (obj == null) {
            return null;
        }
        if (i == 1) {
            if (objArr[i2].equals(obj)) {
                return objArr[i2 ^ 1];
            }
            return null;
        } else if (iArr == null) {
            return null;
        } else {
            int length = iArr.length - 1;
            int c = khb.m4953c(obj.hashCode());
            while (true) {
                c &= length;
                int i3 = iArr[c];
                if (i3 == -1) {
                    return null;
                }
                if (objArr[i3].equals(obj)) {
                    return objArr[i3 ^ 1];
                }
                c++;
            }
        }
    }

    /* renamed from: i */
    final boolean mo9865i() {
        return false;
    }

    public final int size() {
        return this.f21900d;
    }
}
