package p000;

import android.text.SpannableStringBuilder;
import java.util.Locale;

/* compiled from: PG */
/* renamed from: hy */
public final class C0281hy {
    /* renamed from: a */
    public static final C0284ib f7166a = C0285ic.f7287c;
    /* renamed from: b */
    private static final String f7167b = Character.toString(8206);
    /* renamed from: c */
    private static final String f7168c = Character.toString(8207);
    /* renamed from: d */
    private static final C0281hy f7169d = new C0281hy(false, 2, f7166a);
    /* renamed from: e */
    private static final C0281hy f7170e = new C0281hy(true, 2, f7166a);
    /* renamed from: f */
    private final boolean f7171f;
    /* renamed from: g */
    private final int f7172g;
    /* renamed from: h */
    private final C0284ib f7173h;

    private C0281hy(boolean z, int i, C0284ib c0284ib) {
        this.f7171f = z;
        this.f7172g = i;
        this.f7173h = c0284ib;
    }

    /* JADX WARNING: Removed duplicated region for block: B:6:0x0019  */
    /* JADX WARNING: Removed duplicated region for block: B:5:0x0017  */
    /* renamed from: b */
    private static int m3639b(java.lang.CharSequence r10) {
        /*
        r4 = 1;
        r5 = -1;
        r1 = 0;
        r7 = new ia;
        r7.<init>(r10);
        r7.f7229d = r1;
        r0 = r1;
        r3 = r1;
        r2 = r1;
    L_0x000d:
        r6 = r7.f7229d;
        r8 = r7.f7228c;
        if (r6 >= r8) goto L_0x0015;
    L_0x0013:
        if (r0 == 0) goto L_0x003a;
    L_0x0015:
        if (r0 != 0) goto L_0x0019;
    L_0x0017:
        r5 = r1;
    L_0x0018:
        return r5;
    L_0x0019:
        if (r3 != 0) goto L_0x0038;
    L_0x001b:
        r3 = r7.f7229d;
        if (r3 <= 0) goto L_0x0036;
    L_0x001f:
        r3 = r7.mo8295a();
        switch(r3) {
            case 14: goto L_0x0027;
            case 15: goto L_0x0027;
            case 16: goto L_0x002f;
            case 17: goto L_0x002f;
            case 18: goto L_0x002c;
            default: goto L_0x0026;
        };
    L_0x0026:
        goto L_0x001b;
    L_0x0027:
        if (r0 == r2) goto L_0x0018;
    L_0x0029:
        r2 = r2 + -1;
        goto L_0x001b;
    L_0x002c:
        r2 = r2 + 1;
        goto L_0x001b;
    L_0x002f:
        if (r0 != r2) goto L_0x0033;
    L_0x0031:
        r5 = r4;
        goto L_0x0018;
    L_0x0033:
        r2 = r2 + -1;
        goto L_0x001b;
    L_0x0036:
        r5 = r1;
        goto L_0x0018;
    L_0x0038:
        r5 = r3;
        goto L_0x0018;
    L_0x003a:
        r8 = r7.f7226a;
        r6 = r8.charAt(r6);
        r7.f7230e = r6;
        r6 = r7.f7230e;
        r6 = java.lang.Character.isHighSurrogate(r6);
        if (r6 == 0) goto L_0x007a;
    L_0x004a:
        r6 = r7.f7226a;
        r8 = r7.f7229d;
        r6 = java.lang.Character.codePointAt(r6, r8);
        r8 = r7.f7229d;
        r9 = java.lang.Character.charCount(r6);
        r8 = r8 + r9;
        r7.f7229d = r8;
        r6 = java.lang.Character.getDirectionality(r6);
    L_0x005f:
        switch(r6) {
            case 0: goto L_0x0070;
            case 1: goto L_0x0074;
            case 2: goto L_0x0074;
            case 3: goto L_0x0062;
            case 4: goto L_0x0062;
            case 5: goto L_0x0062;
            case 6: goto L_0x0062;
            case 7: goto L_0x0062;
            case 8: goto L_0x0062;
            case 9: goto L_0x000d;
            case 10: goto L_0x0062;
            case 11: goto L_0x0062;
            case 12: goto L_0x0062;
            case 13: goto L_0x0062;
            case 14: goto L_0x006c;
            case 15: goto L_0x006c;
            case 16: goto L_0x0068;
            case 17: goto L_0x0068;
            case 18: goto L_0x0064;
            default: goto L_0x0062;
        };
    L_0x0062:
        r0 = r2;
        goto L_0x000d;
    L_0x0064:
        r2 = r2 + -1;
        r3 = r1;
        goto L_0x000d;
    L_0x0068:
        r2 = r2 + 1;
        r3 = r4;
        goto L_0x000d;
    L_0x006c:
        r2 = r2 + 1;
        r3 = r5;
        goto L_0x000d;
    L_0x0070:
        if (r2 == 0) goto L_0x0018;
    L_0x0072:
        r0 = r2;
        goto L_0x000d;
    L_0x0074:
        if (r2 == 0) goto L_0x0078;
    L_0x0076:
        r0 = r2;
        goto L_0x000d;
    L_0x0078:
        r5 = r4;
        goto L_0x0018;
    L_0x007a:
        r6 = r7.f7229d;
        r6 = r6 + 1;
        r7.f7229d = r6;
        r6 = r7.f7230e;
        r6 = p000.C0283ia.m3654a(r6);
        r8 = r7.f7227b;
        goto L_0x005f;
        */
        throw new UnsupportedOperationException("Method not decompiled: hy.b(java.lang.CharSequence):int");
    }

    /* renamed from: c */
    private static int m3640c(CharSequence charSequence) {
        C0283ia c0283ia = new C0283ia(charSequence);
        c0283ia.f7229d = c0283ia.f7228c;
        int i = 0;
        int i2 = 0;
        while (c0283ia.f7229d > 0) {
            switch (c0283ia.mo8295a()) {
                case (byte) 0:
                    if (i2 != 0) {
                        if (i != 0) {
                            break;
                        }
                        i = i2;
                        break;
                    }
                    return -1;
                case (byte) 1:
                case (byte) 2:
                    if (i2 != 0) {
                        if (i != 0) {
                            break;
                        }
                        i = i2;
                        break;
                    }
                    return 1;
                case (byte) 9:
                    break;
                case (byte) 14:
                case (byte) 15:
                    if (i != i2) {
                        i2--;
                        break;
                    }
                    return -1;
                case (byte) 16:
                case (byte) 17:
                    if (i != i2) {
                        i2--;
                        break;
                    }
                    return 1;
                case (byte) 18:
                    i2++;
                    break;
                default:
                    if (i != 0) {
                        break;
                    }
                    i = i2;
                    break;
            }
        }
        return 0;
    }

    /* renamed from: a */
    public static C0281hy m3637a() {
        C0282hz c0282hz = new C0282hz();
        if (c0282hz.f7194b != 2 || c0282hz.f7195c != f7166a) {
            return new C0281hy(c0282hz.f7193a, c0282hz.f7194b, c0282hz.f7195c);
        }
        if (c0282hz.f7193a) {
            return f7170e;
        }
        return f7169d;
    }

    /* renamed from: a */
    static boolean m3638a(Locale locale) {
        return C0287ig.m3795a(locale) == 1;
    }

    /* renamed from: a */
    public final CharSequence mo8262a(CharSequence charSequence) {
        C0284ib c0284ib = this.f7173h;
        if (charSequence == null) {
            return null;
        }
        boolean a;
        CharSequence charSequence2;
        boolean a2 = c0284ib.mo8315a(charSequence, charSequence.length());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if ((this.f7172g & 2) != 0) {
            if (a2) {
                c0284ib = C0285ic.f7286b;
            } else {
                c0284ib = C0285ic.f7285a;
            }
            a = c0284ib.mo8315a(charSequence, charSequence.length());
            if (!this.f7171f && (a || C0281hy.m3639b(charSequence) == 1)) {
                charSequence2 = f7167b;
            } else if (!this.f7171f || (a && C0281hy.m3639b(charSequence) != -1)) {
                charSequence2 = "";
            } else {
                charSequence2 = f7168c;
            }
            spannableStringBuilder.append(charSequence2);
        }
        if (a2 != this.f7171f) {
            char c;
            if (a2) {
                c = 8235;
            } else {
                c = 8234;
            }
            spannableStringBuilder.append(c);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append(8236);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        if (a2) {
            c0284ib = C0285ic.f7286b;
        } else {
            c0284ib = C0285ic.f7285a;
        }
        a = c0284ib.mo8315a(charSequence, charSequence.length());
        if (!this.f7171f && (a || C0281hy.m3640c(charSequence) == 1)) {
            charSequence2 = f7167b;
        } else if (!this.f7171f || (a && C0281hy.m3640c(charSequence) != -1)) {
            charSequence2 = "";
        } else {
            charSequence2 = f7168c;
        }
        spannableStringBuilder.append(charSequence2);
        return spannableStringBuilder;
    }
}
