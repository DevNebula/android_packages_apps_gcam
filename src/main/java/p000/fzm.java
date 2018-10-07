package p000;

/* compiled from: PG */
/* renamed from: fzm */
public final class fzm {
    /* renamed from: a */
    public final fzo f5085a;
    /* renamed from: b */
    public final int f5086b;
    /* renamed from: c */
    public final ken f5087c;
    /* renamed from: d */
    private final kes f5088d;

    public fzm(fzo fzo, kes kes, int i, ken ken) {
        this.f5085a = fzo;
        this.f5088d = kes;
        this.f5086b = i;
        this.f5087c = ken;
    }

    /* renamed from: a */
    public final int mo6968a(fzp fzp) {
        return ((Integer) this.f5088d.get(fzp)).intValue();
    }

    /* renamed from: b */
    public final boolean mo6969b(fzp fzp) {
        return this.f5088d.containsKey(fzp);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f5085a);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 22);
        stringBuilder.append("ImmutableCategorySpec#");
        stringBuilder.append(valueOf);
        return stringBuilder.toString();
    }
}
