package p000;

import java.util.TimerTask;

/* compiled from: PG */
/* renamed from: bka */
final class bka extends TimerTask {
    /* renamed from: a */
    private final /* synthetic */ kpw f1257a;
    /* renamed from: b */
    private final /* synthetic */ bjz f1258b;

    bka(bjz bjz, kpw kpw) {
        this.f1258b = bjz;
        this.f1257a = kpw;
    }

    public final void run() {
        bli.m891b(bjz.f22791a, "onCaptureFailed: Timeout waiting for the jpeg image");
        this.f1257a.mo15642a(new IllegalStateException("Timeout"));
        this.f1258b.mo14569b();
    }
}
