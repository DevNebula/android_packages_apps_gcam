package p000;

import android.os.Build;
import android.os.Build.VERSION;

/* compiled from: PG */
/* renamed from: ivx */
public final class ivx {
    /* renamed from: a */
    public final boolean f7866a;
    /* renamed from: b */
    public final boolean f7867b;
    /* renamed from: c */
    public final boolean f7868c;
    /* renamed from: d */
    public final boolean f7869d;
    /* renamed from: e */
    public final boolean f7870e;

    private ivx(int i, String str) {
        boolean z;
        boolean z2 = false;
        if (i >= 21) {
        }
        if (i >= 23) {
            z = true;
        } else {
            z = false;
        }
        this.f7866a = z;
        if (i >= 24) {
            z = true;
        } else {
            z = false;
        }
        this.f7867b = z;
        if (i >= 26) {
            z = true;
        } else {
            z = false;
        }
        this.f7868c = z;
        if (i > 27) {
            z = true;
        } else if (i >= 27) {
            String str2 = "P";
            if (str2.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            jri.m13395a(z);
            if (str2.length() <= 4) {
                z = true;
            } else {
                z = false;
            }
            jri.m13395a(z);
            if (str.charAt(0) > str2.charAt(0)) {
                z = true;
            } else if (str.startsWith(str2)) {
                z = true;
            } else if ("MASTER".equals(str)) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        this.f7869d = z;
        if (this.f7868c && !this.f7869d) {
            z2 = true;
        }
        this.f7870e = z2;
    }

    /* renamed from: a */
    public static ivx m4327a() {
        int intValue;
        Integer valueOf = Integer.valueOf(VERSION.SDK_INT);
        String str = Build.ID;
        if (valueOf.intValue() > 0) {
            intValue = valueOf.intValue();
        } else {
            intValue = 1;
        }
        if (str == null) {
            str = "AAA01";
        }
        return new ivx(intValue, str);
    }
}
