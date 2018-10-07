package p000;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* renamed from: ivk */
final class ivk extends iww {
    /* renamed from: a */
    private final AtomicBoolean f26551a = new AtomicBoolean(false);
    /* renamed from: b */
    private final /* synthetic */ ivj f26552b;

    ivk(ivj ivj, iwz iwz) {
        this.f26552b = ivj;
        super(iwz);
    }

    public final void close() {
        if (!this.f26551a.getAndSet(true)) {
            super.close();
            this.f26552b.mo15562b();
        }
    }
}
