package p000;

import android.graphics.Path;
import java.util.ArrayList;

/* compiled from: PG */
/* renamed from: qr */
public final class C0437qr {
    /* renamed from: a */
    public final String f9585a;
    /* renamed from: b */
    public int f9586b;
    /* renamed from: c */
    public boolean f9587c;
    /* renamed from: d */
    public String f9588d;
    /* renamed from: e */
    public int f9589e;
    /* renamed from: f */
    public int f9590f;

    C0437qr() {
    }

    public C0437qr(String str, int i, boolean z, String str2, int i2, int i3) {
        this.f9585a = str;
        this.f9586b = i;
        this.f9587c = z;
        this.f9588d = str2;
        this.f9589e = i2;
        this.f9590f = i3;
    }

    /* renamed from: a */
    private static void m5795a(ArrayList arrayList, char c, float[] fArr) {
        arrayList.add(new C0438qt(c, fArr));
    }

    /* renamed from: a */
    public static boolean m5796a(C0438qt[] c0438qtArr, C0438qt[] c0438qtArr2) {
        if (c0438qtArr == null || c0438qtArr2 == null || c0438qtArr.length != c0438qtArr2.length) {
            return false;
        }
        for (int i = 0; i < c0438qtArr.length; i++) {
            C0438qt c0438qt = c0438qtArr[i];
            char c = c0438qt.f9591a;
            C0438qt c0438qt2 = c0438qtArr2[i];
            if (c != c0438qt2.f9591a || c0438qt.f9592b.length != c0438qt2.f9592b.length) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public static float[] m5797a(float[] fArr, int i) {
        if (i >= 0) {
            Object obj = new float[i];
            System.arraycopy(fArr, 0, obj, 0, Math.min(i, fArr.length));
            return obj;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: a */
    public static C0438qt[] m5798a(String str) {
        if (str == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int i = 1;
        int i2 = 0;
        while (i < str.length()) {
            int i3 = i;
            while (i3 < str.length()) {
                char charAt = str.charAt(i3);
                if (((charAt - 65) * (charAt - 90) <= 0 || (charAt - 97) * (charAt - 122) <= 0) && charAt != 'e' && charAt != 'E') {
                    break;
                }
                i3++;
            }
            String trim = str.substring(i2, i3).trim();
            if (trim.length() > 0) {
                C0437qr.m5795a(arrayList, trim.charAt(0), C0437qr.m5801c(trim));
            }
            i = i3 + 1;
            i2 = i3;
        }
        if (i - i2 == 1 && i2 < str.length()) {
            C0437qr.m5795a(arrayList, str.charAt(i2), new float[0]);
        }
        return (C0438qt[]) arrayList.toArray(new C0438qt[arrayList.size()]);
    }

    /* renamed from: b */
    public static Path m5800b(String str) {
        Path path = new Path();
        C0438qt[] a = C0437qr.m5798a(str);
        if (a == null) {
            return null;
        }
        try {
            C0438qt.m5803a(a, path);
            return path;
        } catch (Throwable e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Error in parsing ");
            stringBuilder.append(str);
            throw new RuntimeException(stringBuilder.toString(), e);
        }
    }

    /* renamed from: a */
    public static C0438qt[] m5799a(C0438qt[] c0438qtArr) {
        if (c0438qtArr == null) {
            return null;
        }
        C0438qt[] c0438qtArr2 = new C0438qt[c0438qtArr.length];
        for (int i = 0; i < c0438qtArr.length; i++) {
            c0438qtArr2[i] = new C0438qt(c0438qtArr[i]);
        }
        return c0438qtArr2;
    }

    /* JADX WARNING: Missing block: B:14:0x0041, code:
            r5 = r0;
            r0 = r3;
            r3 = 0;
     */
    /* JADX WARNING: Missing block: B:15:0x0044, code:
            if (r5 == 0) goto L_0x0065;
     */
    /* JADX WARNING: Missing block: B:24:0x0065, code:
            r6 = r6 + 1;
            r12 = r3;
            r3 = r0;
            r0 = r5;
            r5 = r12;
     */
    /* renamed from: c */
    private static float[] m5801c(java.lang.String r13) {
        /*
        r1 = 1;
        r4 = 0;
        r0 = r13.charAt(r4);
        r2 = 122; // 0x7a float:1.71E-43 double:6.03E-322;
        if (r0 == r2) goto L_0x0012;
    L_0x000a:
        r0 = r13.charAt(r4);
        r2 = 90;
        if (r0 != r2) goto L_0x0015;
    L_0x0012:
        r0 = new float[r4];
    L_0x0014:
        return r0;
    L_0x0015:
        r0 = r13.length();	 Catch:{ NumberFormatException -> 0x008e }
        r8 = new float[r0];	 Catch:{ NumberFormatException -> 0x008e }
        r9 = new gv;	 Catch:{ NumberFormatException -> 0x008e }
        r9.<init>();	 Catch:{ NumberFormatException -> 0x008e }
        r10 = r13.length();	 Catch:{ NumberFormatException -> 0x008e }
        r7 = r1;
        r2 = r4;
    L_0x0026:
        if (r7 < r10) goto L_0x002d;
    L_0x0028:
        r0 = p000.C0437qr.m5797a(r8, r2);	 Catch:{ NumberFormatException -> 0x008e }
        goto L_0x0014;
    L_0x002d:
        r0 = 0;
        r9.f6077b = r0;	 Catch:{ NumberFormatException -> 0x008e }
        r5 = r4;
        r3 = r4;
        r0 = r4;
        r6 = r7;
    L_0x0034:
        r11 = r13.length();	 Catch:{ NumberFormatException -> 0x008e }
        if (r6 >= r11) goto L_0x0046;
    L_0x003a:
        r11 = r13.charAt(r6);	 Catch:{ NumberFormatException -> 0x008e }
        switch(r11) {
            case 32: goto L_0x0070;
            case 44: goto L_0x0070;
            case 45: goto L_0x007d;
            case 46: goto L_0x0072;
            case 69: goto L_0x006c;
            case 101: goto L_0x006c;
            default: goto L_0x0041;
        };	 Catch:{ NumberFormatException -> 0x008e }
    L_0x0041:
        r5 = r0;
        r0 = r3;
        r3 = r4;
    L_0x0044:
        if (r5 == 0) goto L_0x0065;
    L_0x0046:
        r9.f6076a = r6;	 Catch:{ NumberFormatException -> 0x008e }
        r3 = r9.f6076a;	 Catch:{ NumberFormatException -> 0x008e }
        if (r7 >= r3) goto L_0x0063;
    L_0x004c:
        r0 = r2 + 1;
        r5 = r13.substring(r7, r3);	 Catch:{ NumberFormatException -> 0x008e }
        r5 = java.lang.Float.parseFloat(r5);	 Catch:{ NumberFormatException -> 0x008e }
        r8[r2] = r5;	 Catch:{ NumberFormatException -> 0x008e }
    L_0x0058:
        r2 = r9.f6077b;	 Catch:{ NumberFormatException -> 0x008e }
        if (r2 != 0) goto L_0x0060;
    L_0x005c:
        r7 = r3 + 1;
        r2 = r0;
        goto L_0x0026;
    L_0x0060:
        r7 = r3;
        r2 = r0;
        goto L_0x0026;
    L_0x0063:
        r0 = r2;
        goto L_0x0058;
    L_0x0065:
        r6 = r6 + 1;
        r12 = r3;
        r3 = r0;
        r0 = r5;
        r5 = r12;
        goto L_0x0034;
    L_0x006c:
        r5 = r0;
        r0 = r3;
        r3 = r1;
        goto L_0x0044;
    L_0x0070:
        r0 = r1;
        goto L_0x0041;
    L_0x0072:
        if (r3 == 0) goto L_0x0079;
    L_0x0074:
        r0 = 1;
        r9.f6077b = r0;	 Catch:{ NumberFormatException -> 0x008e }
        r0 = r1;
        goto L_0x0041;
    L_0x0079:
        r3 = r4;
        r5 = r0;
        r0 = r1;
        goto L_0x0044;
    L_0x007d:
        if (r6 == r7) goto L_0x008a;
    L_0x007f:
        if (r5 != 0) goto L_0x0086;
    L_0x0081:
        r0 = 1;
        r9.f6077b = r0;	 Catch:{ NumberFormatException -> 0x008e }
        r0 = r1;
        goto L_0x0041;
    L_0x0086:
        r5 = r0;
        r0 = r3;
        r3 = r4;
        goto L_0x0044;
    L_0x008a:
        r5 = r0;
        r0 = r3;
        r3 = r4;
        goto L_0x0044;
    L_0x008e:
        r0 = move-exception;
        r1 = new java.lang.RuntimeException;
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = "error in parsing \"";
        r2.append(r3);
        r2.append(r13);
        r3 = "\"";
        r2.append(r3);
        r2 = r2.toString();
        r1.<init>(r2, r0);
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: qr.c(java.lang.String):float[]");
    }
}
