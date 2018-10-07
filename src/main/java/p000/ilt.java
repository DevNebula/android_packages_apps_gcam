package p000;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: ilt */
final /* synthetic */ class ilt implements iqo {
    /* renamed from: a */
    private final kpw f21051a;
    /* renamed from: b */
    private final AtomicBoolean f21052b;

    ilt(kpw kpw, AtomicBoolean atomicBoolean) {
        this.f21051a = kpw;
        this.f21052b = atomicBoolean;
    }

    public final void close() {
        this.f21051a.mo15641a(Boolean.valueOf(this.f21052b.get()));
    }
}
