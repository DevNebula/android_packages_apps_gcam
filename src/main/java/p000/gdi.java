package p000;

/* compiled from: PG */
/* renamed from: gdi */
final class gdi extends gdy {
    /* renamed from: a */
    private final kbg f19081a;
    /* renamed from: b */
    private final kbg f19082b;

    gdi(kbg kbg, kbg kbg2) {
        this.f19081a = kbg;
        this.f19082b = kbg2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof gdy)) {
            return false;
        }
        gdy gdy = (gdy) obj;
        if (this.f19081a.equals(gdy.mo7061b()) && this.f19082b.equals(gdy.mo7060a())) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final kbg mo7060a() {
        return this.f19082b;
    }

    public final int hashCode() {
        return ((this.f19081a.hashCode() ^ 1000003) * 1000003) ^ this.f19082b.hashCode();
    }

    /* renamed from: b */
    public final kbg mo7061b() {
        return this.f19081a;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f19081a);
        String valueOf2 = String.valueOf(this.f19082b);
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(valueOf).length() + 33) + String.valueOf(valueOf2).length());
        stringBuilder.append("XmpMetadataPair{main=");
        stringBuilder.append(valueOf);
        stringBuilder.append(", extended=");
        stringBuilder.append(valueOf2);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
