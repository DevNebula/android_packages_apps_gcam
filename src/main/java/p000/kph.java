package p000;

/* compiled from: PG */
/* renamed from: kph */
final class kph extends kpf {
    /* renamed from: a */
    public static final kph f26746a = new kph(null);
    /* renamed from: b */
    private final Object f26747b;

    kph(Object obj) {
        this.f26747b = obj;
    }

    public final Object get() {
        return this.f26747b;
    }

    public final String toString() {
        String obj = super.toString();
        String valueOf = String.valueOf(this.f26747b);
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(obj).length() + 27) + String.valueOf(valueOf).length());
        stringBuilder.append(obj);
        stringBuilder.append("[status=SUCCESS, result=[");
        stringBuilder.append(valueOf);
        stringBuilder.append("]]");
        return stringBuilder.toString();
    }
}
