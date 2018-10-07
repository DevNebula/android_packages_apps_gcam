package p000;

/* compiled from: PG */
/* renamed from: atn */
public final class atn {
    /* renamed from: a */
    private final kwk f991a;
    /* renamed from: b */
    private final kwk f992b;

    public atn(kwk kwk, kwk kwk2) {
        this.f991a = (kwk) atn.m717a(kwk, 1);
        this.f992b = (kwk) atn.m717a(kwk2, 2);
    }

    /* renamed from: a */
    private static Object m717a(Object obj, int i) {
        if (obj != null) {
            return obj;
        }
        StringBuilder stringBuilder = new StringBuilder(93);
        stringBuilder.append("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        stringBuilder.append(i);
        throw new NullPointerException(stringBuilder.toString());
    }

    /* renamed from: a */
    public final /* synthetic */ atm mo1796a(ilp ilp) {
        return new aux((ikd) atn.m717a((ikd) this.f991a.mo10566a(), 1), (atb) atn.m717a((atb) this.f992b.mo10566a(), 2), (ilp) atn.m717a(ilp, 3));
    }
}
