package p000;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* renamed from: ckw */
public final class ckw implements iqo {
    /* renamed from: a */
    public final bcy f12673a;
    /* renamed from: b */
    private final AtomicBoolean f12674b = new AtomicBoolean(false);

    public ckw(bcy bcy) {
        this.f12673a = bcy;
    }

    public final void close() {
        if (this.f12674b.compareAndSet(true, false)) {
            this.f12673a.mo1908c();
            bcy bcy = this.f12673a;
            Exception exception = new Exception("Burst closed while running");
            bcy.mo1906b();
        }
    }

    /* renamed from: a */
    public final synchronized void mo12517a(int i) {
        this.f12673a.mo1907b(i);
    }

    /* renamed from: a */
    public final synchronized void mo12516a() {
        if (this.f12674b.compareAndSet(false, true)) {
            this.f12673a.mo1905a(false);
        }
    }

    /* renamed from: b */
    public final synchronized void mo12518b() {
        if (this.f12674b.compareAndSet(true, false)) {
            this.f12673a.mo1908c();
        }
    }
}
