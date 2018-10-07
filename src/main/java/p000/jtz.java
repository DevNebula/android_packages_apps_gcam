package p000;

/* compiled from: PG */
/* renamed from: jtz */
public final class jtz implements jtv {
    /* renamed from: a */
    private final jxm f21747a;
    /* renamed from: b */
    private final jxi f21748b;
    /* renamed from: c */
    private final float f21749c;

    public jtz(jxm jxm, jxi jxi) {
        this(jxm, jxi, Float.NEGATIVE_INFINITY);
    }

    public jtz(jxm jxm, jxi jxi, float f) {
        jri.m13404b((Object) jxm);
        this.f21747a = jxm;
        this.f21748b = jxi;
        this.f21749c = f;
    }

    /* renamed from: a */
    public final jzf mo9554a(long j) {
        jxa a = this.f21747a.mo9599a(j);
        if (a.mo9592b(this.f21748b)) {
            return new jzc(((Float) a.mo9589a(this.f21748b)).floatValue());
        }
        return new jzc(this.f21749c);
    }

    /* renamed from: b */
    public final void mo9556b(long j) {
    }

    /* renamed from: c */
    public final void mo9557c(long j) {
    }

    /* renamed from: a */
    public final void mo9555a() {
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f21748b);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 25);
        stringBuilder.append("MetadataFrameScorer[key=");
        stringBuilder.append(valueOf);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
