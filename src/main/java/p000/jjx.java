package p000;

/* compiled from: PG */
/* renamed from: jjx */
final class jjx implements Comparable {
    /* renamed from: a */
    public final int f8254a;
    /* renamed from: b */
    private final float f8255b;

    public jjx(float f, int i) {
        this.f8255b = f;
        this.f8254a = i;
    }

    public final /* synthetic */ int compareTo(Object obj) {
        jjx jjx = (jjx) obj;
        float f = this.f8255b;
        float f2 = jjx.f8255b;
        if (f <= f2) {
            return f <= f2 ? 0 : 1;
        } else {
            return -1;
        }
    }
}
