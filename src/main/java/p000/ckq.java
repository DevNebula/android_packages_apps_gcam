package p000;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* renamed from: ckq */
final class ckq extends fkp {
    /* renamed from: a */
    public final fkp f26619a;
    /* renamed from: c */
    private final AtomicInteger f26620c;
    /* renamed from: d */
    private final AtomicBoolean f26621d = new AtomicBoolean(false);

    public ckq(fkp fkp, AtomicInteger atomicInteger) {
        super((iwz) fkp, fkp.mo15529h());
        this.f26619a = fkp;
        this.f26620c = atomicInteger;
        this.f26620c.incrementAndGet();
    }

    public final void close() {
        if (!this.f26621d.getAndSet(true)) {
            this.f26619a.close();
            if (this.f26620c.decrementAndGet() < 0) {
                throw new IllegalStateException("Image count negative.");
            }
        }
    }
}
