package p000;

/* compiled from: PG */
/* renamed from: jvo */
public final class jvo extends jun {
    /* renamed from: a */
    private final int f24854a;

    public jvo(int i) {
        this.f24854a = i;
    }

    /* renamed from: a */
    public final boolean mo13871a(juh juh) {
        return juh.mo9565d() >= this.f24854a;
    }

    public final String toString() {
        int i = this.f24854a;
        StringBuilder stringBuilder = new StringBuilder(45);
        stringBuilder.append("MinCountSegmentSelector[minCount=");
        stringBuilder.append(i);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
