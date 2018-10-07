package p000;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* renamed from: fhw */
public final class fhw implements fhg {
    /* renamed from: a */
    public final AtomicInteger f18302a = new AtomicInteger(0);
    /* renamed from: b */
    public final ilb f18303b = new ilb(Boolean.valueOf(true));
    /* renamed from: c */
    private final fhg f18304c;

    public fhw(fhg fhg) {
        this.f18304c = fhg;
    }

    /* renamed from: a */
    public final fhh mo6790a() {
        boolean z;
        boolean z2 = true;
        int incrementAndGet = this.f18302a.incrementAndGet();
        ilb ilb = this.f18303b;
        if (incrementAndGet == 0) {
            z = true;
        } else {
            z = false;
        }
        ilb.mo8826a(Boolean.valueOf(z));
        try {
            return new fhx(this, this.f18304c.mo6790a());
        } catch (InterruptedException e) {
            int decrementAndGet = this.f18302a.decrementAndGet();
            ilb ilb2 = this.f18303b;
            if (decrementAndGet != 0) {
                z2 = false;
            }
            ilb2.mo8826a(Boolean.valueOf(z2));
            throw e;
        }
    }

    /* renamed from: b */
    public final ilp mo6791b() {
        return this.f18303b;
    }
}
