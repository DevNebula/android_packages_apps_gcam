package p000;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* renamed from: imp */
final class imp implements iqo {
    /* renamed from: a */
    private final AtomicBoolean f21065a = new AtomicBoolean(false);
    /* renamed from: b */
    private final /* synthetic */ imn f21066b;

    imp(imn imn) {
        this.f21066b = imn;
    }

    public final void close() {
        if (!this.f21065a.getAndSet(true)) {
            imn imn = this.f21066b;
            synchronized (imn.f24642b) {
                imn.f24643c--;
                imn.f24641a.f24640b = Integer.valueOf(imn.f24643c);
            }
            imn.f24641a.f24639a.m2973a();
        }
    }
}
