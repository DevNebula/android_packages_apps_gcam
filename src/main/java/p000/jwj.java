package p000;

import com.google.android.libraries.smartburst.utils.MathUtils;

/* compiled from: PG */
/* renamed from: jwj */
public final class jwj implements jwb {
    /* renamed from: a */
    public long f21775a;
    /* renamed from: b */
    public long f21776b;
    /* renamed from: c */
    private long f21777c = -1;
    /* renamed from: d */
    private long f21778d;
    /* renamed from: e */
    private final jtv f21779e;
    /* renamed from: f */
    private long f21780f;

    public jwj(jtv jtv) {
        this.f21779e = jtv;
    }

    /* renamed from: a */
    public final boolean mo9574a(long j) {
        if (this.f21777c < 0) {
            this.f21777c = j;
            this.f21778d = j;
        }
        this.f21775a = j - this.f21777c;
        this.f21777c = j;
        this.f21780f = ((long) (MathUtils.linearMapToRange(this.f21779e.mo9554a(j).mo9629a(), 0.0f, 0.3f, 0.5f, 1.0f) * ((float) (j - this.f21778d)))) + this.f21780f;
        this.f21776b = 0;
        long j2 = this.f21780f;
        if (j2 <= 16666666) {
            return false;
        }
        this.f21778d = j;
        this.f21776b = j2;
        this.f21780f = 0;
        return true;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f21779e);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 39);
        stringBuilder.append("VariableSamplingRateFrameFilter[range=");
        stringBuilder.append(valueOf);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
