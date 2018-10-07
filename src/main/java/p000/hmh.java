package p000;

/* compiled from: PG */
/* renamed from: hmh */
public final class hmh extends hml {
    /* renamed from: a */
    private final hmm f20192a;
    /* renamed from: b */
    private final ilp f20193b;
    /* renamed from: c */
    private final hmn f20194c;

    public hmh(hmm hmm, ilp ilp, hmn hmn) {
        if (hmm == null) {
            throw new NullPointerException("Null effectFactory");
        }
        this.f20192a = hmm;
        if (ilp == null) {
            throw new NullPointerException("Null activation");
        }
        this.f20193b = ilp;
        if (hmn == null) {
            throw new NullPointerException("Null order");
        }
        this.f20194c = hmn;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof hml)) {
            return false;
        }
        hml hml = (hml) obj;
        if (this.f20192a.equals(hml.mo7958b()) && this.f20193b.equals(hml.mo7957a()) && this.f20194c.equals(hml.mo7959c())) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final ilp mo7957a() {
        return this.f20193b;
    }

    /* renamed from: b */
    public final hmm mo7958b() {
        return this.f20192a;
    }

    /* renamed from: c */
    public final hmn mo7959c() {
        return this.f20194c;
    }

    public final int hashCode() {
        return ((((this.f20192a.hashCode() ^ 1000003) * 1000003) ^ this.f20193b.hashCode()) * 1000003) ^ this.f20194c.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f20192a);
        String valueOf2 = String.valueOf(this.f20193b);
        String valueOf3 = String.valueOf(this.f20194c);
        int length = String.valueOf(valueOf).length();
        StringBuilder stringBuilder = new StringBuilder(((length + 60) + String.valueOf(valueOf2).length()) + String.valueOf(valueOf3).length());
        stringBuilder.append("ViewfinderEffectElement{effectFactory=");
        stringBuilder.append(valueOf);
        stringBuilder.append(", activation=");
        stringBuilder.append(valueOf2);
        stringBuilder.append(", order=");
        stringBuilder.append(valueOf3);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
