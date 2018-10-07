package p000;

/* compiled from: PG */
/* renamed from: hru */
public final class hru {
    /* renamed from: a */
    public hrk f6888a = new hrk(0.9f);
    /* renamed from: b */
    public long f6889b;
    /* renamed from: c */
    private long f6890c;
    /* renamed from: d */
    private long f6891d;

    public hru() {
        mo8076b();
        this.f6888a.mo8058a(0.0f);
    }

    /* renamed from: a */
    public final float mo8074a() {
        return ((float) (this.f6891d - this.f6890c)) / 1.0E9f;
    }

    /* renamed from: b */
    public final void mo8076b() {
        this.f6889b = 0;
        this.f6890c = 0;
        this.f6891d = 0;
    }

    /* renamed from: a */
    public final void mo8075a(long j) {
        float f = 1.0E9f / ((float) (j - this.f6891d));
        long j2 = this.f6889b;
        if (j2 == 0) {
            this.f6890c = j;
        } else if (j2 == 1) {
            this.f6888a.mo8058a(f);
        } else {
            this.f6888a.mo8059b(f);
        }
        this.f6891d = j;
        this.f6889b++;
    }
}
