package p000;

import android.graphics.PointF;

/* compiled from: PG */
/* renamed from: fdc */
final class fdc extends fcj {
    /* renamed from: a */
    private final PointF f18142a;
    /* renamed from: b */
    private final int f18143b;

    fdc(PointF pointF, int i) {
        this.f18142a = pointF;
        this.f18143b = i;
    }

    /* renamed from: b */
    public final int mo6743b() {
        return this.f18143b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof fcj)) {
            return false;
        }
        fcj fcj = (fcj) obj;
        if (this.f18142a.equals(fcj.mo6744c()) && this.f18143b == fcj.mo6743b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f18142a.hashCode() ^ 1000003) * 1000003) ^ this.f18143b;
    }

    /* renamed from: c */
    public final PointF mo6744c() {
        return this.f18142a;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f18142a);
        int i = this.f18143b;
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 58);
        stringBuilder.append("AfRoi{normalizedCenterPoint=");
        stringBuilder.append(valueOf);
        stringBuilder.append(", confidenceScore=");
        stringBuilder.append(i);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
