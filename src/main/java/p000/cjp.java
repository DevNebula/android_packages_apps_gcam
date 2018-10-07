package p000;

import android.os.SystemClock;

/* compiled from: PG */
/* renamed from: cjp */
public final class cjp {
    /* renamed from: a */
    private static final long f2267a = 100000000;
    /* renamed from: b */
    private final Object f2268b;
    /* renamed from: c */
    private final long f2269c;
    /* renamed from: d */
    private final chx f2270d;
    /* renamed from: e */
    private int f2271e;
    /* renamed from: f */
    private long f2272f;

    static {
        bli.m887a("BurstVolKey");
    }

    public cjp(chx chx) {
        this(chx, f2267a, new iya());
    }

    private cjp(chx chx, long j, iya iya) {
        boolean z;
        this.f2268b = new Object();
        this.f2271e = C0252go.f5780F;
        jri.m13404b((Object) chx);
        if (j > 0) {
            z = true;
        } else {
            z = false;
        }
        jri.m13395a(z);
        jri.m13404b((Object) iya);
        this.f2270d = chx;
        this.f2269c = j;
    }

    /* renamed from: a */
    public final boolean mo2340a() {
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        synchronized (this.f2268b) {
            if (this.f2271e == C0252go.f5780F) {
                this.f2271e = C0252go.f5781G;
                this.f2272f = elapsedRealtimeNanos;
            } else if (elapsedRealtimeNanos - this.f2272f > this.f2269c && this.f2271e == C0252go.f5781G) {
                this.f2271e = C0252go.f5782H;
                this.f2270d.mo2306a(chw.VOLUME_BUTTON);
            }
        }
        return true;
    }

    /* renamed from: b */
    public final boolean mo2341b() {
        synchronized (this.f2268b) {
            if (this.f2271e == C0252go.f5781G) {
                this.f2271e = C0252go.f5780F;
                return false;
            } else if (this.f2271e == C0252go.f5782H) {
                this.f2271e = C0252go.f5780F;
                this.f2270d.mo2307a(chw.VOLUME_BUTTON, true);
                return true;
            } else {
                return false;
            }
        }
    }
}
