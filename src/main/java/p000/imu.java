package p000;

/* renamed from: imu */
final /* synthetic */ class imu implements kaw {
    /* renamed from: a */
    private final imt f21069a;

    imu(imt imt) {
        this.f21069a = imt;
    }

    /* renamed from: a */
    public final Object mo9689a(Object obj) {
        imt imt = this.f21069a;
        jri.m13404b(obj);
        Object b = imt.mo15011b(obj);
        if (b != null) {
            return b;
        }
        String valueOf = String.valueOf(obj);
        String name = imt.getClass().getName();
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(valueOf).length() + 64) + String.valueOf(name).length());
        stringBuilder.append("Transforming input value: ");
        stringBuilder.append(valueOf);
        stringBuilder.append(" resulted in a null output value for: ");
        stringBuilder.append(name);
        throw new NullPointerException(stringBuilder.toString());
    }
}
