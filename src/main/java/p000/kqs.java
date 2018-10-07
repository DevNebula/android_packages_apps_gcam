package p000;

/* compiled from: PG */
/* renamed from: kqs */
final class kqs {
    /* renamed from: a */
    public static final Class f8793a = kqs.m5111a("libcore.io.Memory");
    /* renamed from: b */
    private static final boolean f8794b;

    static {
        boolean z;
        if (kqs.m5111a("org.robolectric.Robolectric") != null) {
            z = true;
        } else {
            z = false;
        }
        f8794b = z;
    }

    /* renamed from: a */
    private static Class m5111a(String str) {
        try {
            return Class.forName(str);
        } catch (Throwable th) {
            return null;
        }
    }

    /* renamed from: a */
    static boolean m5112a() {
        return (f8793a == null || f8794b) ? false : true;
    }
}
