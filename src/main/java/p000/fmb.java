package p000;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* renamed from: fmb */
final class fmb extends iww {
    /* renamed from: a */
    private AtomicBoolean f26368a = new AtomicBoolean(false);
    /* renamed from: b */
    private final /* synthetic */ AtomicInteger f26369b;
    /* renamed from: c */
    private final /* synthetic */ fyr f26370c;

    fmb(iwz iwz, AtomicInteger atomicInteger, fyr fyr) {
        this.f26369b = atomicInteger;
        this.f26370c = fyr;
        super(iwz);
    }

    public final void close() {
        if (!this.f26368a.getAndSet(true)) {
            super.close();
            if (this.f26369b.decrementAndGet() == 0) {
                this.f26370c.close();
            }
        }
    }
}
