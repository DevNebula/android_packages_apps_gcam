package p000;

/* renamed from: gfp */
final /* synthetic */ class gfp implements kbn {
    /* renamed from: a */
    private final gfo f19146a;

    gfp(gfo gfo) {
        this.f19146a = gfo;
    }

    /* renamed from: b */
    public final Object mo9715b() {
        int size = this.f19146a.f19144a.size();
        StringBuilder stringBuilder = new StringBuilder(47);
        stringBuilder.append("There are ");
        stringBuilder.append(size);
        stringBuilder.append(" listeners before addition");
        return stringBuilder.toString();
    }
}
