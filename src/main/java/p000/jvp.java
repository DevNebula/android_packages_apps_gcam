package p000;

/* compiled from: PG */
/* renamed from: jvp */
public final class jvp extends jun {
    /* renamed from: a */
    private final int f24855a = 500;
    /* renamed from: b */
    private final jtv f24856b;

    public jvp(jtv jtv) {
        this.f24856b = jtv;
    }

    /* renamed from: a */
    public final boolean mo13871a(juh juh) {
        return this.f24856b.mo9554a(juh.f8353d).mo9629a() - this.f24856b.mo9554a(juh.f8352c).mo9629a() >= ((float) this.f24855a);
    }

    public final String toString() {
        int i = this.f24855a;
        StringBuilder stringBuilder = new StringBuilder(49);
        stringBuilder.append("MinLengthSegmentSelector[minLengthMs=");
        stringBuilder.append(i);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
