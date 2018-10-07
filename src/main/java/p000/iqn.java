package p000;

import java.util.Arrays;

/* compiled from: PG */
/* renamed from: iqn */
public final class iqn {
    /* renamed from: a */
    public final long f7693a;
    /* renamed from: b */
    public final long f7694b;

    public iqn(long j, long j2) {
        this.f7693a = j;
        this.f7694b = j2;
    }

    public iqn(iqn iqn) {
        this.f7693a = iqn.f7693a;
        this.f7694b = iqn.f7694b;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iqn)) {
            return false;
        }
        iqn iqn = (iqn) obj;
        if (this.f7693a == iqn.f7693a && this.f7694b == iqn.f7694b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f7693a), Long.valueOf(this.f7694b)});
    }

    /* renamed from: a */
    public final double mo8807a() {
        return ((double) this.f7693a) / ((double) this.f7694b);
    }

    public final String toString() {
        long j = this.f7693a;
        long j2 = this.f7694b;
        StringBuilder stringBuilder = new StringBuilder(41);
        stringBuilder.append(j);
        stringBuilder.append("/");
        stringBuilder.append(j2);
        return stringBuilder.toString();
    }
}
