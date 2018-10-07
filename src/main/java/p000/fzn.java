package p000;

/* compiled from: PG */
/* renamed from: fzn */
public final class fzn {
    /* renamed from: a */
    public final fzp f5089a;
    /* renamed from: b */
    public final int f5090b;
    /* renamed from: c */
    public final int f5091c;
    /* renamed from: d */
    public final int f5092d;

    public fzn(fzp fzp, int i, int i2, int i3) {
        this.f5089a = fzp;
        this.f5090b = i;
        this.f5091c = i2;
        this.f5092d = i3;
    }

    public final boolean equals(Object obj) {
        if (obj != null && this.f5089a == ((fzn) obj).f5089a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f5090b;
    }
}
