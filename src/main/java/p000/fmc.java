package p000;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* renamed from: fmc */
final class fmc extends iww {
    /* renamed from: a */
    private AtomicBoolean f26371a = new AtomicBoolean(false);
    /* renamed from: b */
    private final /* synthetic */ AtomicInteger f26372b;
    /* renamed from: c */
    private final /* synthetic */ fyr f26373c;

    fmc(iwz iwz, AtomicInteger atomicInteger, fyr fyr) {
        this.f26372b = atomicInteger;
        this.f26373c = fyr;
        super(iwz);
    }

    public final void close() {
        if (!this.f26371a.getAndSet(true)) {
            super.close();
            if (this.f26372b.decrementAndGet() == 0) {
                this.f26373c.close();
            }
        }
    }
}
