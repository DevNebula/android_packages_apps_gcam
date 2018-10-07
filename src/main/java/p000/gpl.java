package p000;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* renamed from: gpl */
public final class gpl implements gqd {
    /* renamed from: a */
    private final ird f19445a;
    /* renamed from: b */
    private final gpn f19446b;
    /* renamed from: c */
    private final AtomicBoolean f19447c = new AtomicBoolean(false);

    gpl(gpn gpn, ird ird) {
        this.f19446b = gpn;
        this.f19445a = ird;
    }

    public final void run() {
        if (!this.f19447c.getAndSet(true)) {
            this.f19445a.mo8856a("AllAudioInit");
            this.f19446b.mo7331d();
            this.f19445a.mo8857b();
        }
    }
}
