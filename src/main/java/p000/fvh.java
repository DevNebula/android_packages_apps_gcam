package p000;

import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* renamed from: fvh */
public final class fvh extends ikb {
    /* renamed from: a */
    private final Set f24312a;
    /* renamed from: b */
    private final AtomicBoolean f24313b = new AtomicBoolean(false);

    fvh(Set set, ikv ikv) {
        super(ikv);
        this.f24312a = set;
    }

    public final void close() {
        if (!this.f24313b.getAndSet(true)) {
            for (fvg run : this.f24312a) {
                run.run();
            }
            super.close();
        }
    }

    /* renamed from: a */
    public final boolean mo13666a() {
        return this.f24313b.get();
    }
}
