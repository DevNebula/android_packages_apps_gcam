package p000;

import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* renamed from: fya */
final class fya implements fyr {
    /* renamed from: a */
    private final AtomicBoolean f24329a = new AtomicBoolean(false);
    /* renamed from: b */
    private final List f24330b;

    fya(List list) {
        this.f24330b = list;
    }

    public final void close() {
        if (!this.f24329a.getAndSet(true)) {
            for (fyr close : this.f24330b) {
                close.close();
            }
        }
    }
}
