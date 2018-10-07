package p000;

/* compiled from: PG */
/* renamed from: cfo */
final class cfo implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ cfn f2105a;

    cfo(cfn cfn) {
        this.f2105a = cfn;
    }

    public final void run() {
        if (this.f2105a.f2104a.f23073U) {
            bli.m888a(cfk.f23052a, "isPreviewStopTimeoutExpired = true");
            cfk cfk = this.f2105a.f2104a;
            cfk.f23074V = true;
            cfk.f23108ad.mo8826a((Boolean) cfk.f23131b.mo2303b().mo13673b());
        }
    }
}
