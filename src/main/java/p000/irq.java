package p000;

/* compiled from: PG */
/* renamed from: irq */
public final class irq {
    /* renamed from: a */
    public final kwk f7736a;
    /* renamed from: b */
    public final kwk f7737b;
    /* renamed from: c */
    public final kwk f7738c;
    /* renamed from: d */
    public final kwk f7739d;
    /* renamed from: e */
    public final kwk f7740e;
    /* renamed from: f */
    public final kwk f7741f;

    public irq(kwk kwk, kwk kwk2, kwk kwk3, kwk kwk4, kwk kwk5, kwk kwk6) {
        this.f7736a = (kwk) irq.m4146a(kwk, 1);
        this.f7737b = (kwk) irq.m4146a(kwk2, 2);
        this.f7738c = (kwk) irq.m4146a(kwk3, 3);
        this.f7739d = (kwk) irq.m4146a(kwk4, 4);
        this.f7740e = (kwk) irq.m4146a(kwk5, 5);
        this.f7741f = (kwk) irq.m4146a(kwk6, 6);
    }

    /* renamed from: a */
    static Object m4146a(Object obj, int i) {
        if (obj != null) {
            return obj;
        }
        StringBuilder stringBuilder = new StringBuilder(93);
        stringBuilder.append("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        stringBuilder.append(i);
        throw new NullPointerException(stringBuilder.toString());
    }
}
