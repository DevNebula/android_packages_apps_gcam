package p000;

/* compiled from: PG */
/* renamed from: brk */
final class brk extends brl {
    /* renamed from: a */
    private final long f11737a;
    /* renamed from: b */
    private final ken f11738b;

    brk(long j, ken ken) {
        this.f11737a = j;
        if (ken == null) {
            throw new NullPointerException("Null faces");
        }
        this.f11738b = ken;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof brl)) {
            return false;
        }
        brl brl = (brl) obj;
        if (this.f11737a == brl.mo2093b() && this.f11738b.equals(brl.mo2092a())) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final ken mo2092a() {
        return this.f11738b;
    }

    /* renamed from: b */
    public final long mo2093b() {
        return this.f11737a;
    }

    public final int hashCode() {
        long j = this.f11737a;
        return ((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.f11738b.hashCode();
    }

    public final String toString() {
        long j = this.f11737a;
        String valueOf = String.valueOf(this.f11738b);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 54);
        stringBuilder.append("FaceMetadata{timestampNs=");
        stringBuilder.append(j);
        stringBuilder.append(", faces=");
        stringBuilder.append(valueOf);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
