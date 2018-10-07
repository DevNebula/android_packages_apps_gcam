package p000;

/* compiled from: PG */
/* renamed from: rq */
public final class C0458rq {
    /* renamed from: a */
    public long f9650a = 0;
    /* renamed from: b */
    public C0458rq f9651b;

    C0458rq() {
    }

    /* renamed from: a */
    final void mo11040a(int i) {
        while (i >= 64) {
            this = this.f9651b;
            if (this != null) {
                i -= 64;
            } else {
                return;
            }
        }
        this.f9650a &= (1 << i) ^ -1;
    }

    /* renamed from: b */
    final int mo11042b(int i) {
        C0458rq c0458rq = this.f9651b;
        if (c0458rq == null) {
            if (i >= 64) {
                return Long.bitCount(this.f9650a);
            }
            return Long.bitCount(this.f9650a & ((1 << i) - 1));
        } else if (i < 64) {
            return Long.bitCount(this.f9650a & ((1 << i) - 1));
        } else {
            return c0458rq.mo11042b(i - 64) + Long.bitCount(this.f9650a);
        }
    }

    /* renamed from: a */
    private final void m5832a() {
        if (this.f9651b == null) {
            this.f9651b = new C0458rq();
        }
    }

    /* renamed from: c */
    final boolean mo11043c(int i) {
        while (i >= 64) {
            this.m5832a();
            this = this.f9651b;
            i -= 64;
        }
        return (this.f9650a & (1 << i)) != 0;
    }

    /* renamed from: a */
    final void mo11041a(int i, boolean z) {
        while (true) {
            if (i >= 64) {
                this.m5832a();
                this = this.f9651b;
                i -= 64;
            } else {
                boolean z2;
                long j = this.f9650a;
                if ((Long.MIN_VALUE & j) != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                long j2 = (1 << i) - 1;
                long j3 = (j2 ^ -1) & j;
                this.f9650a = (j & j2) | (j3 + j3);
                if (z) {
                    this.mo11045e(i);
                } else {
                    this.mo11040a(i);
                }
                if (z2 || this.f9651b != null) {
                    this.m5832a();
                    this = this.f9651b;
                    z = z2;
                    i = 0;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: d */
    public final boolean mo11044d(int i) {
        boolean z;
        while (i >= 64) {
            this.m5832a();
            this = this.f9651b;
            i -= 64;
        }
        long j = 1 << i;
        long j2 = this.f9650a;
        if ((j2 & j) != 0) {
            z = true;
        } else {
            z = false;
        }
        this.f9650a = j2 & (j ^ -1);
        j--;
        j2 = this.f9650a;
        this.f9650a = Long.rotateRight((j ^ -1) & j2, 1) | (j2 & j);
        C0458rq c0458rq = this.f9651b;
        if (c0458rq != null) {
            if (c0458rq.mo11043c(0)) {
                this.mo11045e(63);
            }
            this.f9651b.mo11044d(0);
        }
        return z;
    }

    /* renamed from: e */
    public final void mo11045e(int i) {
        while (i >= 64) {
            this.m5832a();
            this = this.f9651b;
            i -= 64;
        }
        this.f9650a |= 1 << i;
    }

    public final String toString() {
        if (this.f9651b == null) {
            return Long.toBinaryString(this.f9650a);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.f9651b.toString());
        stringBuilder.append("xx");
        stringBuilder.append(Long.toBinaryString(this.f9650a));
        return stringBuilder.toString();
    }
}
