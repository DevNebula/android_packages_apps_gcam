package p000;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* renamed from: gps */
public final class gps implements gqd {
    /* renamed from: a */
    private final ird f19461a;
    /* renamed from: b */
    private final gpn f19462b;
    /* renamed from: c */
    private final AtomicBoolean f19463c = new AtomicBoolean(false);

    gps(gpn gpn, ird ird) {
        this.f19462b = gpn;
        this.f19461a = ird;
    }

    public final void run() {
        if (!this.f19463c.getAndSet(true)) {
            this.f19461a.mo8856a("AudioInit");
            this.f19462b.mo7332e();
            this.f19461a.mo8857b();
        }
    }
}
