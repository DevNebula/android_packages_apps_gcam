package p000;

import android.os.SystemClock;

/* compiled from: PG */
/* renamed from: eju */
public final class eju {
    /* renamed from: a */
    public boolean f3899a = true;
    /* renamed from: b */
    private long f3900b;
    /* renamed from: c */
    private double f3901c;
    /* renamed from: d */
    private final double f3902d = 6.5d;

    /* renamed from: a */
    public final double mo6261a() {
        if (this.f3899a) {
            return 1.0d;
        }
        double min = Math.min(this.f3901c, ((double) (SystemClock.elapsedRealtimeNanos() - this.f3900b)) / 1.0E9d) / this.f3901c;
        if (Math.abs(-1.0d + min) < 1.0E-4d) {
            this.f3899a = true;
        }
        return 1.0d - Math.exp(min * (-this.f3902d));
    }

    /* renamed from: b */
    public final void mo6262b() {
        this.f3900b = SystemClock.elapsedRealtimeNanos();
        this.f3901c = 0.7d;
        this.f3899a = false;
    }
}
