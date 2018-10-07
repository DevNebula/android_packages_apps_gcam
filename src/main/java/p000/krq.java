package p000;

/* compiled from: PG */
/* renamed from: krq */
final class krq {
    /* renamed from: a */
    public static final krp f8815a = new krp((byte) 0);
    /* renamed from: b */
    private static final krp f8816b = krq.m5174b();

    /* renamed from: a */
    static krp m5173a() {
        if (f8816b != null) {
            return f8816b;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    /* renamed from: b */
    private static krp m5174b() {
        try {
            return (krp) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception e) {
            return null;
        }
    }
}
