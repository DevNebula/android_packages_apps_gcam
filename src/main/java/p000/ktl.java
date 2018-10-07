package p000;

/* compiled from: PG */
/* renamed from: ktl */
final class ktl {
    /* renamed from: a */
    public static final ktk f8908a = ktl.m5233a();
    /* renamed from: b */
    public static final ktk f8909b = new ktk();

    /* renamed from: a */
    private static ktk m5233a() {
        try {
            return (ktk) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception e) {
            return null;
        }
    }
}
