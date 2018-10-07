package p000;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* renamed from: fou */
public final class fou extends fkp {
    /* renamed from: a */
    private final fyr f26645a;
    /* renamed from: c */
    private final AtomicBoolean f26646c = new AtomicBoolean(false);

    public fou(fkp fkp, fyr fyr) {
        super(fkp);
        this.f26645a = fyr;
    }

    public final void close() {
        if (!this.f26646c.getAndSet(true)) {
            super.close();
            this.f26645a.close();
        }
    }
}
