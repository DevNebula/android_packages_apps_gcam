package p000;

import android.os.SystemClock;

/* compiled from: PG */
/* renamed from: gge */
public final class gge implements ggc {
    /* renamed from: a */
    private static final String f19153a = bli.m887a("LSDefaultMetricJni");
    /* renamed from: b */
    private final ird f19154b;

    public gge(ird ird, iya iya) {
        this.f19154b = ird;
    }

    /* renamed from: a */
    public final ggd mo7121a(gfw gfw) {
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        this.f19154b.mo8856a("LuckyShotScore");
        double a = ggg.m2594a(gfw);
        this.f19154b.mo8857b();
        String str = f19153a;
        StringBuilder stringBuilder = new StringBuilder(46);
        stringBuilder.append("LS metric (default) = ");
        stringBuilder.append(a);
        bli.m896d(str, stringBuilder.toString());
        if (a <= 0.0d) {
            bli.m898e(f19153a, "invalid metric value from LS metric calculation.");
        }
        elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos() - elapsedRealtimeNanos;
        str = f19153a;
        stringBuilder = new StringBuilder(42);
        stringBuilder.append("LS calculation time = ");
        stringBuilder.append(elapsedRealtimeNanos / 1000000);
        bli.m896d(str, stringBuilder.toString());
        return new ggd(a, new epk(epm.LUCKY_SHOT_DEFAULT_METRIC, (float) a, elapsedRealtimeNanos));
    }
}
