package p000;

import android.os.SystemClock;
import com.google.android.libraries.smartburst.utils.Feature;

/* compiled from: PG */
/* renamed from: jle */
final class jle implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ long f8273a;
    /* renamed from: b */
    private final /* synthetic */ Feature f8274b;
    /* renamed from: c */
    private final /* synthetic */ jld f8275c;

    jle(jld jld, long j, Feature feature) {
        this.f8275c = jld;
        this.f8273a = j;
        this.f8274b = feature;
    }

    public final void run() {
        try {
            this.f8275c.f21620a.write(String.format("%d,%d,%s%n", new Object[]{Long.valueOf(this.f8273a), Long.valueOf(SystemClock.elapsedRealtimeNanos()), this.f8274b.getType().name()}));
        } catch (Throwable e) {
            kqg.f8786a.mo10213b(e);
        }
    }
}
