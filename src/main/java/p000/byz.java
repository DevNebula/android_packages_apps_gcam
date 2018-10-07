package p000;

import com.google.googlex.gcam.MemoryStateCallback;

/* compiled from: PG */
/* renamed from: byz */
final class byz extends MemoryStateCallback {
    /* renamed from: a */
    private final /* synthetic */ byy f12028a;

    byz(byy byy) {
        this.f12028a = byy;
    }

    public final void Run(long j, long j2) {
        String str = byy.f1748a;
        StringBuilder stringBuilder = new StringBuilder(105);
        stringBuilder.append("MemoryStateCallback: peakMemoryBytes=");
        stringBuilder.append(j);
        stringBuilder.append(" peakMemoryWithNewShotBytes=");
        stringBuilder.append(j2);
        bli.m896d(str, stringBuilder.toString());
        this.f12028a.f1751d.mo8826a(Long.valueOf(j));
        this.f12028a.f1752e.mo8826a(Long.valueOf(j2));
    }
}
