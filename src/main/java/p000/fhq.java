package p000;

import java.util.Arrays;

/* compiled from: PG */
/* renamed from: fhq */
public final class fhq implements Comparable {
    /* renamed from: a */
    public final long f4791a;
    /* renamed from: b */
    public final long f4792b;
    /* renamed from: c */
    private final long f4793c;

    public fhq(long j, long j2, long j3) {
        this.f4791a = j;
        this.f4792b = j2;
        this.f4793c = j3;
    }

    public final /* synthetic */ int compareTo(Object obj) {
        return (this.f4792b > ((fhq) obj).f4792b ? 1 : (this.f4792b == ((fhq) obj).f4792b ? 0 : -1));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof fhq)) {
            return false;
        }
        fhq fhq = (fhq) obj;
        if (this.f4792b == fhq.f4792b && this.f4791a == fhq.f4791a && this.f4793c == fhq.f4793c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f4791a), Long.valueOf(this.f4792b), Long.valueOf(this.f4793c)});
    }

    public final String toString() {
        return jqk.m13350b((Object) this).mo9702a("timestamp", this.f4791a).mo9702a("onStartedId", this.f4792b).mo9702a("frameNumber", this.f4793c).toString();
    }
}
