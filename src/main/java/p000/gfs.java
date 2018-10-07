package p000;

/* renamed from: gfs */
final /* synthetic */ class gfs implements kbn {
    /* renamed from: a */
    private final gfo f19149a;

    gfs(gfo gfo) {
        this.f19149a = gfo;
    }

    /* renamed from: b */
    public final Object mo9715b() {
        int size = this.f19149a.f19144a.size();
        StringBuilder stringBuilder = new StringBuilder(70);
        stringBuilder.append("Couldn't find listener.  There are ");
        stringBuilder.append(size);
        stringBuilder.append(" listeners after removal");
        return stringBuilder.toString();
    }
}
