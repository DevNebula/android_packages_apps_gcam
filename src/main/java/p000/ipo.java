package p000;

import java.util.concurrent.Callable;

/* renamed from: ipo */
public final /* synthetic */ class ipo implements Callable {
    /* renamed from: a */
    private final ios f7660a;
    /* renamed from: b */
    private final long f7661b;

    public ipo(ios ios, long j) {
        this.f7660a = ios;
        this.f7661b = j;
    }

    public final Object call() {
        ios ios = this.f7660a;
        long j = this.f7661b;
        ior ior = ios.f21144f;
        if (ior != null) {
            ior.mo13688a(j);
        }
        return null;
    }
}
