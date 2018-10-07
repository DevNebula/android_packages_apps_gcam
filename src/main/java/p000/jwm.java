package p000;

/* compiled from: PG */
/* renamed from: jwm */
final class jwm {
    /* renamed from: a */
    private final long f8402a;
    /* renamed from: b */
    private final long f8403b;
    /* renamed from: c */
    private final int f8404c;
    /* renamed from: d */
    private final /* synthetic */ jwl f8405d;

    public jwm(jwl jwl, jky jky, jky jky2) {
        this.f8405d = jwl;
        this.f8402a = jky.mo9481b();
        this.f8403b = jky2.mo9481b();
        long j = this.f8402a;
        long j2 = this.f8403b;
        this.f8404c = ((int) (j ^ (j >>> 32))) ^ ((int) (j2 ^ (j2 >>> 32)));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof jwm)) {
            return false;
        }
        jwm jwm = (jwm) obj;
        long j = this.f8402a;
        long j2 = this.f8403b;
        long j3 = jwm.f8402a;
        long j4 = jwm.f8403b;
        long j5;
        if (this.f8405d.f21781a) {
            if (j > j2) {
                j5 = j;
            } else {
                j5 = j2;
            }
            if (j <= j2) {
                j2 = j;
            }
            if (j3 > j4) {
                j = j3;
                j3 = j4;
            } else {
                j = j4;
            }
        } else {
            j5 = j2;
            j2 = j;
            j = j4;
        }
        if (j2 == j3 && r2 == r6) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f8404c;
    }
}
