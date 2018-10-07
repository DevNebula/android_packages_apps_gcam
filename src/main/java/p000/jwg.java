package p000;

import android.os.SystemClock;

/* compiled from: PG */
/* renamed from: jwg */
final class jwg implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ String f8399a;
    /* renamed from: b */
    private final /* synthetic */ long f8400b;
    /* renamed from: c */
    private final /* synthetic */ jwf f8401c;

    jwg(jwf jwf, String str, long j) {
        this.f8401c = jwf;
        this.f8399a = str;
        this.f8400b = j;
    }

    public final void run() {
        try {
            this.f8401c.f24883a.write(String.format("%d,%s,%d%n", new Object[]{Long.valueOf(SystemClock.elapsedRealtimeNanos()), this.f8399a, Long.valueOf(this.f8400b)}));
        } catch (Throwable e) {
            kqg.f8786a.mo10213b(e);
        }
    }
}
