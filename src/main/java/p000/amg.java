package p000;

/* compiled from: PG */
/* renamed from: amg */
final class amg extends amf {
    amg() {
    }

    /* renamed from: a */
    public final int mo369a() {
        return C0252go.f5936h;
    }

    /* renamed from: a */
    public final float mo368a(int i, int i2, int i3, int i4) {
        int min = Math.min(i2 / i4, i / i3);
        if (min != 0) {
            return 1.0f / ((float) Integer.highestOneBit(min));
        }
        return 1.0f;
    }
}
