package p000;

/* compiled from: PG */
/* renamed from: bkf */
public final class bkf {
    /* renamed from: a */
    public final kwk f1264a;
    /* renamed from: b */
    public final kwk f1265b;
    /* renamed from: c */
    public final kwk f1266c;
    /* renamed from: d */
    public final kwk f1267d;

    public bkf(kwk kwk, kwk kwk2, kwk kwk3, kwk kwk4) {
        this.f1264a = (kwk) bkf.m870a(kwk, 1);
        this.f1265b = (kwk) bkf.m870a(kwk2, 2);
        this.f1266c = (kwk) bkf.m870a(kwk3, 3);
        this.f1267d = (kwk) bkf.m870a(kwk4, 4);
    }

    /* renamed from: a */
    public static Object m870a(Object obj, int i) {
        if (obj != null) {
            return obj;
        }
        StringBuilder stringBuilder = new StringBuilder(93);
        stringBuilder.append("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        stringBuilder.append(i);
        throw new NullPointerException(stringBuilder.toString());
    }
}
