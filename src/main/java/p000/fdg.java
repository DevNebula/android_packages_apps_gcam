package p000;

/* compiled from: PG */
/* renamed from: fdg */
public final class fdg {
    /* renamed from: a */
    public final fdh f4706a;
    /* renamed from: b */
    public final fdh f4707b;
    /* renamed from: c */
    public final fdh f4708c;

    public fdg(fdh fdh, fdh fdh2, fdh fdh3) {
        this.f4707b = fdh2;
        this.f4706a = fdh;
        this.f4708c = fdh3;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f4706a);
        String valueOf2 = String.valueOf(this.f4707b);
        String valueOf3 = String.valueOf(this.f4708c);
        int length = String.valueOf(valueOf).length();
        StringBuilder stringBuilder = new StringBuilder(((length + 35) + String.valueOf(valueOf2).length()) + String.valueOf(valueOf3).length());
        stringBuilder.append("{ exposure=");
        stringBuilder.append(valueOf);
        stringBuilder.append(", focus=");
        stringBuilder.append(valueOf2);
        stringBuilder.append(", whiteBalance=");
        stringBuilder.append(valueOf3);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }

    /* renamed from: a */
    public final fdg mo6755a(fdh fdh) {
        return new fdg(fdh, this.f4707b, this.f4708c);
    }

    /* renamed from: b */
    public final fdg mo6756b(fdh fdh) {
        return new fdg(this.f4706a, fdh, this.f4708c);
    }

    /* renamed from: c */
    public final fdg mo6757c(fdh fdh) {
        return new fdg(this.f4706a, this.f4707b, fdh);
    }
}
