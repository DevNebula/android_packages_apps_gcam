package p000;

/* compiled from: PG */
/* renamed from: krm */
final class krm {
    /* renamed from: a */
    private static final Class f8809a = krm.m5163c();

    /* renamed from: a */
    public static krn m5160a() {
        if (f8809a != null) {
            try {
                return krm.m5161a("newInstance");
            } catch (Exception e) {
            }
        }
        return new krn();
    }

    /* renamed from: b */
    public static krn m5162b() {
        if (f8809a != null) {
            try {
                return krm.m5161a("getEmptyRegistry");
            } catch (Exception e) {
            }
        }
        return krn.f8810a;
    }

    /* renamed from: a */
    private static final krn m5161a(String str) {
        return (krn) f8809a.getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0]);
    }

    /* renamed from: c */
    private static Class m5163c() {
        try {
            return Class.forName("com.google.protobuf.ExtensionRegistry");
        } catch (ClassNotFoundException e) {
            return null;
        }
    }
}
