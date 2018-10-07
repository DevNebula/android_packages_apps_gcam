package p000;

import android.os.SystemClock;
import android.view.Choreographer.FrameCallback;

/* renamed from: gjs */
final /* synthetic */ class gjs implements FrameCallback {
    /* renamed from: a */
    private final kpw f5505a;

    gjs(gjr gjr, kpw kpw) {
        this.f5505a = kpw;
    }

    public final void doFrame(long j) {
        knk knk = this.f5505a;
        Object gkc = new gkc();
        SystemClock.uptimeMillis();
        gkc.f5518a = SystemClock.elapsedRealtimeNanos();
        knk.mo15641a(gkc);
    }
}
