package p000;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* renamed from: bcl */
public final class bcl implements iqo {
    /* renamed from: a */
    public AtomicBoolean f11172a = new AtomicBoolean(false);

    public final void close() {
        this.f11172a.set(true);
    }
}
