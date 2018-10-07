package p000;

import android.annotation.TargetApi;

@TargetApi(21)
/* compiled from: PG */
/* renamed from: fgw */
public final class fgw {
    /* renamed from: a */
    private static fgw f4778a = null;
    /* renamed from: b */
    private static final Object f4779b = new Object();
    /* renamed from: c */
    private final iwc f4780c;

    static {
        bli.m887a("OneCamDbgHpr");
    }

    private fgw(iwc iwc) {
        this.f4780c = iwc;
    }

    /* renamed from: a */
    public final boolean mo6781a() {
        if (mo6783a("persist.gcam.save_metering", false) || mo6783a("persist.gcam.debug", false)) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final boolean mo6784b() {
        if (mo6783a("persist.gcam.save_payload", false) || mo6783a("persist.gcam.debug", false)) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public final boolean mo6785c() {
        if (mo6783a("persist.gcam.save_text", false) || mo6783a("persist.gcam.debug", false)) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public static boolean m2327d() {
        return false;
    }

    /* renamed from: e */
    public static boolean m2328e() {
        return false;
    }

    /* renamed from: a */
    public final boolean mo6783a(String str, boolean z) {
        jri.m13404b((Object) str);
        String a = this.f4780c.mo9116a(str);
        if (a == null || a.isEmpty()) {
            return z;
        }
        if ("0".equals(a)) {
            return false;
        }
        if ("1".equals(a)) {
            return true;
        }
        return z;
    }

    /* renamed from: a */
    public final int mo6780a(String str) {
        int i = 4;
        jri.m13404b((Object) str);
        String a = this.f4780c.mo9116a(str);
        if (a == null || a.isEmpty()) {
            return i;
        }
        try {
            return Integer.parseInt(a);
        } catch (NumberFormatException e) {
            return i;
        }
    }

    /* renamed from: a */
    public final boolean mo6782a(String str, String str2) {
        jri.m13404b((Object) str);
        String a = this.f4780c.mo9116a(str);
        if (a == null || a.isEmpty() || str2.isEmpty()) {
            return false;
        }
        return str2.equals(a);
    }

    @Deprecated
    /* renamed from: f */
    public static fgw m2329f() {
        synchronized (f4779b) {
            if (f4778a == null) {
                f4778a = new fgw(iwd.f7884a);
            }
        }
        return f4778a;
    }
}
