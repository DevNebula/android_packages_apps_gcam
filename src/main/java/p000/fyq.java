package p000;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* renamed from: fyq */
final class fyq implements iqo {
    /* renamed from: a */
    private final AtomicBoolean f18909a = new AtomicBoolean(false);
    /* renamed from: b */
    private final fyl f18910b;
    /* renamed from: c */
    private final /* synthetic */ fyk f18911c;

    fyq(fyk fyk, fyl fyl) {
        this.f18911c = fyk;
        this.f18910b = fyl;
    }

    public final void close() {
        if (!this.f18909a.getAndSet(true)) {
            synchronized (this.f18911c.f18901a) {
                this.f18911c.f18902b.remove(this.f18910b);
                fyk fyk = this.f18911c;
                fyk.f18903c.f24640b = new ArrayList(fyk.f18902b);
            }
            this.f18911c.f18903c.f24639a.m2973a();
        }
    }
}
