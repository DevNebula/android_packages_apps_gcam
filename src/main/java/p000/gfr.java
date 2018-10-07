package p000;

/* renamed from: gfr */
final /* synthetic */ class gfr implements kbn {
    /* renamed from: a */
    private final gfo f19148a;

    gfr(gfo gfo) {
        this.f19148a = gfo;
    }

    /* renamed from: b */
    public final Object mo9715b() {
        int size = this.f19148a.f19144a.size();
        StringBuilder stringBuilder = new StringBuilder(45);
        stringBuilder.append("There are ");
        stringBuilder.append(size);
        stringBuilder.append(" listeners after removal");
        return stringBuilder.toString();
    }
}
