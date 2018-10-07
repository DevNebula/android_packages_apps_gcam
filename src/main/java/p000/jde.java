package p000;

/* compiled from: PG */
/* renamed from: jde */
public class jde extends jdc {
    public jde(jcg jcg, izv izv) {
        super(jcg, izv);
    }

    /* renamed from: b */
    public jde mo9319a(izu izu) {
        return new jde(this.f21431c, izu.mo9244a());
    }

    public String toString() {
        String valueOf = String.valueOf(this.f21431c);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 4);
        stringBuilder.append("RGBA");
        stringBuilder.append(valueOf);
        return stringBuilder.toString();
    }
}
