package p000;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* renamed from: iva */
public final class iva extends iww {
    /* renamed from: a */
    private final AtomicBoolean f26536a = new AtomicBoolean(false);

    public iva(iwz iwz) {
        super(iwz);
    }

    public final void close() {
        if (!this.f26536a.getAndSet(true)) {
            super.close();
        }
    }
}
