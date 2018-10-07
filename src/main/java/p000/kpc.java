package p000;

/* compiled from: PG */
/* renamed from: kpc */
class kpc {
    /* renamed from: a */
    public static final kpb f8767a = kpc.m5094a();
    /* renamed from: b */
    private static final String f8768b = String.valueOf(kpc.class.getName()).concat("$ClassValueValidator");

    kpc() {
    }

    /* renamed from: a */
    private static kpb m5094a() {
        try {
            return (kpb) Class.forName(f8768b).getEnumConstants()[0];
        } catch (Throwable th) {
            return koz.m5090a();
        }
    }
}
