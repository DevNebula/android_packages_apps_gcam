package p000;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* renamed from: ivd */
final class ivd extends iww {
    /* renamed from: a */
    private final AtomicBoolean f26541a = new AtomicBoolean(false);
    /* renamed from: b */
    private final /* synthetic */ ivb f26542b;

    ivd(ivb ivb, iwz iwz) {
        this.f26542b = ivb;
        super(iwz);
    }

    public final void close() {
        if (!this.f26541a.getAndSet(true)) {
            super.close();
            this.f26542b.mo15559i();
        }
    }

    public final void finalize() {
        close();
        super.finalize();
    }
}
