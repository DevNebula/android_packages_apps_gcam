package p000;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* renamed from: fxx */
final class fxx implements fyr {
    /* renamed from: a */
    private final AtomicBoolean f24327a = new AtomicBoolean(false);
    /* renamed from: b */
    private final /* synthetic */ fxv f24328b;

    fxx(fxv fxv) {
        this.f24328b = fxv;
        fxv.f18887a.incrementAndGet();
    }

    public final void close() {
        if (!this.f24327a.getAndSet(true)) {
            this.f24328b.f18887a.decrementAndGet();
        }
    }
}
