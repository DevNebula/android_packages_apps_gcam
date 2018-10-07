package p000;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* renamed from: bbx */
public final class bbx implements iqo {
    /* renamed from: a */
    public final ikb f11160a;
    /* renamed from: b */
    private final bbv f11161b;
    /* renamed from: c */
    private final AtomicBoolean f11162c = new AtomicBoolean(false);

    public bbx(bbv bbv, ikb ikb) {
        this.f11161b = bbv;
        this.f11160a = ikb;
    }

    public final void close() {
        if (!this.f11162c.getAndSet(true)) {
            this.f11161b.execute(new bby(this));
            this.f11161b.close();
        }
    }
}
