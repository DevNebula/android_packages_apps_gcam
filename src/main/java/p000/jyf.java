package p000;

/* compiled from: PG */
/* renamed from: jyf */
public final class jyf implements jmu {
    /* renamed from: a */
    private final /* synthetic */ jyt f21808a;

    public jyf(jyt jyt) {
        this.f21808a = jyt;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo9523a(Object obj, String str) {
        jwt jwt = new jwt((jwp) obj);
        this.f21808a.mo9618a(String.format("row_distance_%s.csv", new Object[]{str}), new jwu(jwt));
        return jwt;
    }
}
