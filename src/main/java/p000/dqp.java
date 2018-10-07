package p000;

/* compiled from: PG */
/* renamed from: dqp */
public final class dqp implements dqo {
    /* renamed from: a */
    private final Object f16508a = new Object();
    /* renamed from: b */
    private long f16509b = -1;

    /* renamed from: a */
    public final long mo6046a(long j) {
        long j2;
        synchronized (this.f16508a) {
            j2 = this.f16509b;
            this.f16509b = Math.max(j2, j);
        }
        return j2;
    }
}
