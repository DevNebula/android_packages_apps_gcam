package p000;

/* renamed from: gfq */
final /* synthetic */ class gfq implements kbn {
    /* renamed from: a */
    private final gfo f19147a;

    gfq(gfo gfo) {
        this.f19147a = gfo;
    }

    /* renamed from: b */
    public final Object mo9715b() {
        int size = this.f19147a.f19144a.size();
        StringBuilder stringBuilder = new StringBuilder(46);
        stringBuilder.append("There are ");
        stringBuilder.append(size);
        stringBuilder.append(" listeners after addition");
        return stringBuilder.toString();
    }
}
