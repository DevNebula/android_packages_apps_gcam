package p000;

import java.util.concurrent.ExecutorService;

/* compiled from: PG */
/* renamed from: clx */
final class clx extends izy {
    /* renamed from: a */
    private final /* synthetic */ ExecutorService f23214a;
    /* renamed from: b */
    private final /* synthetic */ cls f23215b;

    clx(cls cls, ExecutorService executorService) {
        this.f23215b = cls;
        this.f23214a = executorService;
    }

    /* renamed from: a_ */
    public final /* synthetic */ void mo13769a_(Object obj) {
        this.f23215b.f12708f.mo5651b();
        this.f23214a.shutdown();
    }
}
