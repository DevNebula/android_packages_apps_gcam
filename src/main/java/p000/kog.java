package p000;

import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: PG */
/* renamed from: kog */
final class kog extends kof {
    /* renamed from: a */
    private final AtomicReferenceFieldUpdater f21941a;
    /* renamed from: b */
    private final AtomicIntegerFieldUpdater f21942b;

    kog(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicIntegerFieldUpdater atomicIntegerFieldUpdater) {
        this.f21941a = atomicReferenceFieldUpdater;
        this.f21942b = atomicIntegerFieldUpdater;
    }

    /* renamed from: a */
    final void mo10181a(koe koe, Set set) {
        this.f21941a.compareAndSet(koe, null, set);
    }

    /* renamed from: a */
    final int mo10180a(koe koe) {
        return this.f21942b.decrementAndGet(koe);
    }
}
