package p000;

/* compiled from: PG */
/* renamed from: hks */
public final class hks {
    /* renamed from: a */
    public final kwk f6675a;
    /* renamed from: b */
    public final kwk f6676b;
    /* renamed from: c */
    public final kwk f6677c;
    /* renamed from: d */
    public final kwk f6678d;

    public hks(kwk kwk, kwk kwk2, kwk kwk3, kwk kwk4) {
        this.f6675a = (kwk) hks.m3286a(kwk, 1);
        this.f6676b = (kwk) hks.m3286a(kwk2, 2);
        this.f6677c = (kwk) hks.m3286a(kwk3, 3);
        this.f6678d = (kwk) hks.m3286a(kwk4, 4);
    }

    /* renamed from: a */
    public static Object m3286a(Object obj, int i) {
        if (obj != null) {
            return obj;
        }
        StringBuilder stringBuilder = new StringBuilder(93);
        stringBuilder.append("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        stringBuilder.append(i);
        throw new NullPointerException(stringBuilder.toString());
    }
}
