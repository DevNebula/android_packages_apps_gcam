package p000;

import java.util.concurrent.Callable;

/* renamed from: ipp */
public final /* synthetic */ class ipp implements Callable {
    /* renamed from: a */
    private final ios f7662a;
    /* renamed from: b */
    private final long f7663b;

    public ipp(ios ios, long j) {
        this.f7662a = ios;
        this.f7663b = j;
    }

    public final Object call() {
        ios ios = this.f7662a;
        long j = this.f7663b;
        iow iow = ios.f21145g;
        if (iow != null) {
            iow.mo13700a(j);
            iov iov = ios.f21149k;
            if (iov != null) {
                iov.mo13697a();
            }
            ios.f21145g.mo13699a();
        }
        return null;
    }
}
