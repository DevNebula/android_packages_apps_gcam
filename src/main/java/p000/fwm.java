package p000;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* renamed from: fwm */
public final class fwm implements iqo {
    /* renamed from: a */
    private final AtomicBoolean f18834a = new AtomicBoolean(false);
    /* renamed from: b */
    private final /* synthetic */ kpw f18835b;
    /* renamed from: c */
    private final /* synthetic */ fvy f18836c;

    public fwm(fvy fvy, kpw kpw) {
        this.f18836c = fvy;
        this.f18835b = kpw;
    }

    public final void close() {
        if (!this.f18834a.getAndSet(true)) {
            boolean z;
            fvy fvy = this.f18836c;
            ilb ilb = fvy.f4972e;
            if (fvy.f4973f.decrementAndGet() > 0) {
                z = true;
            } else {
                z = false;
            }
            ilb.mo8826a(Boolean.valueOf(z));
            this.f18836c.f4971d.m2973a();
            this.f18835b.mo15641a(Boolean.valueOf(true));
        }
    }
}
