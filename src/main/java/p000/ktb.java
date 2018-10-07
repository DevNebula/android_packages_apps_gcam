package p000;

/* compiled from: PG */
/* renamed from: ktb */
final class ktb {
    /* renamed from: a */
    public static final kta f8906a = ktb.m5225a();
    /* renamed from: b */
    public static final kta f8907b = new kta();

    /* renamed from: a */
    private static kta m5225a() {
        try {
            return (kta) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception e) {
            return null;
        }
    }
}
