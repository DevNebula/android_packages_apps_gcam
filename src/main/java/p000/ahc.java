package p000;

/* compiled from: PG */
/* renamed from: ahc */
final class ahc implements ahh {
    /* renamed from: a */
    public int f10289a;
    /* renamed from: b */
    public Class f10290b;
    /* renamed from: c */
    private final ahd f10291c;

    ahc(ahd ahd) {
        this.f10291c = ahd;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ahc)) {
            return false;
        }
        ahc ahc = (ahc) obj;
        if (this.f10289a == ahc.f10289a && this.f10290b == ahc.f10290b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i = this.f10289a * 31;
        Class cls = this.f10290b;
        if (cls != null) {
            hashCode = cls.hashCode();
        } else {
            hashCode = 0;
        }
        return hashCode + i;
    }

    /* renamed from: a */
    public final void mo298a() {
        this.f10291c.mo278a(this);
    }

    public final String toString() {
        int i = this.f10289a;
        String valueOf = String.valueOf(this.f10290b);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 27);
        stringBuilder.append("Key{size=");
        stringBuilder.append(i);
        stringBuilder.append("array=");
        stringBuilder.append(valueOf);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
