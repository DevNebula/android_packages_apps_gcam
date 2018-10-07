package p000;

/* compiled from: PG */
/* renamed from: bir */
public final class bir {
    /* renamed from: a */
    public final kwk f1222a;
    /* renamed from: b */
    public final kwk f1223b;

    public bir(kwk kwk, kwk kwk2) {
        this.f1222a = (kwk) bir.m851a(kwk, 1);
        this.f1223b = (kwk) bir.m851a(kwk2, 2);
    }

    /* renamed from: a */
    public static Object m851a(Object obj, int i) {
        if (obj != null) {
            return obj;
        }
        StringBuilder stringBuilder = new StringBuilder(93);
        stringBuilder.append("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        stringBuilder.append(i);
        throw new NullPointerException(stringBuilder.toString());
    }
}
