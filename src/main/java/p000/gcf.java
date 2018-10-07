package p000;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: gcf */
final class gcf implements Runnable {
    /* renamed from: a */
    public final /* synthetic */ iqt f5306a;
    /* renamed from: b */
    private final /* synthetic */ Executor f5307b;
    /* renamed from: c */
    private final /* synthetic */ gcc f5308c;

    gcf(gcc gcc, Executor executor, iqt iqt) {
        this.f5308c = gcc;
        this.f5307b = executor;
        this.f5306a = iqt;
    }

    public final void run() {
        this.f5307b.execute(new gcg(this, this.f5308c.f24336a.f5283e));
    }
}
