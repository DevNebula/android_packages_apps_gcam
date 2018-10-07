package p000;

/* compiled from: PG */
/* renamed from: jir */
public class jir {
    /* renamed from: a */
    public final juk f8219a;
    /* renamed from: b */
    public final jiq f8220b;

    public jir(juk juk, jiq jiq) {
        jri.m13404b((Object) juk);
        jri.m13404b((Object) jiq);
        this.f8219a = juk;
        this.f8220b = jiq;
    }

    public String toString() {
        String valueOf = String.valueOf(this.f8219a);
        String valueOf2 = String.valueOf(this.f8220b);
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(valueOf).length() + 35) + String.valueOf(valueOf2).length());
        stringBuilder.append("ArtifactSpec[segmenter=");
        stringBuilder.append(valueOf);
        stringBuilder.append(", renderer=");
        stringBuilder.append(valueOf2);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
