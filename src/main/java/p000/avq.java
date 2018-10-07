package p000;

import java.util.concurrent.Future;

/* renamed from: avq */
final /* synthetic */ class avq implements iqb {
    /* renamed from: a */
    private final kpk f10897a;
    /* renamed from: b */
    private final aub f10898b;

    avq(kpk kpk, aub aub) {
        this.f10897a = kpk;
        this.f10898b = aub;
    }

    /* renamed from: a */
    public final void mo8765a(Object obj) {
        Future future = this.f10897a;
        aub aub = this.f10898b;
        if (!future.isDone() || !((Boolean) kow.m13881c(future)).booleanValue()) {
            aub.mo1802e();
        }
    }
}
