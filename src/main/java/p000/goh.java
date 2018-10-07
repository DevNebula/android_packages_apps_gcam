package p000;

import java.util.HashMap;

/* compiled from: PG */
/* renamed from: goh */
final class goh {
    /* renamed from: a */
    private static HashMap f5960a = new HashMap();

    goh() {
    }

    /* renamed from: a */
    public static String m2708a(String str) {
        goi goi = (goi) f5960a.get(str);
        if (goi == null) {
            return null;
        }
        return goi.f5961a;
    }

    /* renamed from: b */
    public static String[] m2710b(String str) {
        goi goi = (goi) f5960a.get(str);
        if (goi == null) {
            return new String[0];
        }
        return goi.f5962b;
    }

    /* renamed from: a */
    public static void m2709a(String str, String str2, String[] strArr) {
        f5960a.put(str, new goi(str2, strArr));
    }
}
