package p000;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: PG */
/* renamed from: knq */
final class knq extends knl {
    /* renamed from: a */
    public final AtomicReferenceFieldUpdater f21926a;
    /* renamed from: b */
    public final AtomicReferenceFieldUpdater f21927b;
    /* renamed from: c */
    public final AtomicReferenceFieldUpdater f21928c;
    /* renamed from: d */
    public final AtomicReferenceFieldUpdater f21929d;
    /* renamed from: e */
    public final AtomicReferenceFieldUpdater f21930e;

    knq(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.f21926a = atomicReferenceFieldUpdater;
        this.f21927b = atomicReferenceFieldUpdater2;
        this.f21928c = atomicReferenceFieldUpdater3;
        this.f21929d = atomicReferenceFieldUpdater4;
        this.f21930e = atomicReferenceFieldUpdater5;
    }

    /* renamed from: a */
    final boolean mo10172a(knk knk, knp knp, knp knp2) {
        return this.f21929d.compareAndSet(knk, knp, knp2);
    }

    /* renamed from: a */
    final boolean mo10171a(knk knk, Object obj, Object obj2) {
        return this.f21930e.compareAndSet(knk, obj, obj2);
    }

    /* renamed from: a */
    final boolean mo10173a(knk knk, knw knw, knw knw2) {
        return this.f21928c.compareAndSet(knk, knw, knw2);
    }

    /* renamed from: a */
    final void mo10170a(knw knw, knw knw2) {
        this.f21927b.lazySet(knw, knw2);
    }

    /* renamed from: a */
    final void mo10169a(knw knw, Thread thread) {
        this.f21926a.lazySet(knw, thread);
    }
}
