package p000;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* renamed from: fuz */
public final class fuz extends iww {
    /* renamed from: a */
    private final AtomicBoolean f26383a = new AtomicBoolean(false);

    public fuz(iwz iwz) {
        super(iwz);
    }

    public final void close() {
        super.close();
        this.f26383a.getAndSet(true);
    }
}
