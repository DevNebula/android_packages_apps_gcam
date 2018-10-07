package p000;

/* compiled from: PG */
/* renamed from: gmn */
public final class gmn {
    /* renamed from: a */
    public final kwk f5679a;
    /* renamed from: b */
    public final kwk f5680b;
    /* renamed from: c */
    public final kwk f5681c;
    /* renamed from: d */
    public final kwk f5682d;
    /* renamed from: e */
    public final kwk f5683e;
    /* renamed from: f */
    public final kwk f5684f;
    /* renamed from: g */
    public final kwk f5685g;
    /* renamed from: h */
    public final kwk f5686h;
    /* renamed from: i */
    public final kwk f5687i;
    /* renamed from: j */
    public final kwk f5688j;
    /* renamed from: k */
    public final kwk f5689k;
    /* renamed from: l */
    public final kwk f5690l;
    /* renamed from: m */
    public final kwk f5691m;

    public gmn(kwk kwk, kwk kwk2, kwk kwk3, kwk kwk4, kwk kwk5, kwk kwk6, kwk kwk7, kwk kwk8, kwk kwk9, kwk kwk10, kwk kwk11, kwk kwk12, kwk kwk13) {
        this.f5679a = (kwk) gmn.m2669a(kwk, 1);
        this.f5680b = (kwk) gmn.m2669a(kwk2, 2);
        this.f5681c = (kwk) gmn.m2669a(kwk3, 3);
        this.f5682d = (kwk) gmn.m2669a(kwk4, 4);
        this.f5683e = (kwk) gmn.m2669a(kwk5, 5);
        this.f5684f = (kwk) gmn.m2669a(kwk6, 6);
        this.f5685g = (kwk) gmn.m2669a(kwk7, 7);
        this.f5686h = (kwk) gmn.m2669a(kwk8, 8);
        this.f5687i = (kwk) gmn.m2669a(kwk9, 9);
        this.f5688j = (kwk) gmn.m2669a(kwk10, 10);
        this.f5689k = (kwk) gmn.m2669a(kwk11, 11);
        this.f5690l = (kwk) gmn.m2669a(kwk12, 12);
        this.f5691m = (kwk) gmn.m2669a(kwk13, 13);
    }

    /* renamed from: a */
    public static Object m2669a(Object obj, int i) {
        if (obj != null) {
            return obj;
        }
        StringBuilder stringBuilder = new StringBuilder(93);
        stringBuilder.append("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        stringBuilder.append(i);
        throw new NullPointerException(stringBuilder.toString());
    }
}
