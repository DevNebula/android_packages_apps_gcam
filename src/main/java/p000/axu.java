package p000;

/* compiled from: PG */
/* renamed from: axu */
public final class axu implements ayw {
    /* renamed from: a */
    private final kwk f11013a;

    public axu(kwk kwk) {
        this.f11013a = (kwk) axu.m7210a(kwk, 1);
    }

    /* renamed from: a */
    private static Object m7210a(Object obj, int i) {
        if (obj != null) {
            return obj;
        }
        StringBuilder stringBuilder = new StringBuilder(93);
        stringBuilder.append("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        stringBuilder.append(i);
        throw new NullPointerException(stringBuilder.toString());
    }

    /* renamed from: a */
    public final /* synthetic */ ayv mo1860a(axp axp) {
        return new axt((fbg) axu.m7210a((fbg) this.f11013a.mo10566a(), 1), (axp) axu.m7210a(axp, 2));
    }
}
