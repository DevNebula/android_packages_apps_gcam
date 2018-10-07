package p000;

/* compiled from: PG */
/* renamed from: kdu */
public abstract class kdu implements Iterable {
    /* renamed from: a */
    private final kbg f8610a = kau.f21835a;

    protected kdu() {
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append('[');
        Object obj = 1;
        for (Object obj2 : (Iterable) this.f8610a.mo9707a((Object) this)) {
            if (obj2 == null) {
                stringBuilder.append(", ");
            }
            stringBuilder.append(obj2);
            obj2 = null;
        }
        stringBuilder.append(']');
        return stringBuilder.toString();
    }
}
