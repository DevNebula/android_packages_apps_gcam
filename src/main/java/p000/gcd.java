package p000;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: gcd */
final class gcd implements gbw {
    /* renamed from: a */
    public final /* synthetic */ iqt f18998a;
    /* renamed from: b */
    private final /* synthetic */ Executor f18999b;

    gcd(Executor executor, iqt iqt) {
        this.f18999b = executor;
        this.f18998a = iqt;
    }

    /* renamed from: a */
    public final void mo7028a(iqm iqm) {
        this.f18999b.execute(new gce(this, iqm));
    }
}
