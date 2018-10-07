package p000;

import java.util.concurrent.ExecutorService;

/* renamed from: iyf */
final /* synthetic */ class iyf implements izr {
    /* renamed from: a */
    private final ExecutorService f21390a;

    iyf(ExecutorService executorService) {
        this.f21390a = executorService;
    }

    public final void close() {
        this.f21390a.shutdown();
    }
}
