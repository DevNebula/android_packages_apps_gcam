package p000;

/* compiled from: PG */
/* renamed from: jty */
public final class jty implements jtl {
    /* renamed from: a */
    private final jxm f21746a;

    public jty(jxm jxm) {
        jri.m13404b((Object) jxm);
        this.f21746a = jxm;
    }

    /* renamed from: a */
    public final jtv mo9552a(String str) {
        jxi a = jxa.m4723a(str.toUpperCase());
        return a != null ? new jtz(this.f21746a, a, 0.0f) : null;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f21746a);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 47);
        stringBuilder.append("MetadataFeatureScorerProvider[metadataStore = ");
        stringBuilder.append(valueOf);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
