package p000;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* renamed from: ijn */
final class ijn implements iqo {
    /* renamed from: a */
    private final AtomicBoolean f21008a = new AtomicBoolean(false);
    /* renamed from: b */
    private final /* synthetic */ ijl f21009b;

    ijn(ijl ijl) {
        this.f21009b = ijl;
    }

    public final void close() {
        boolean z = false;
        if (!this.f21008a.getAndSet(true)) {
            synchronized (this.f21009b.f21005d) {
                boolean z2;
                ijl ijl = this.f21009b;
                ijl.f21003b--;
                if (ijl.f21003b >= 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                jri.m13396a(z2, (Object) "The number of handles should never be negative.");
                ijl = this.f21009b;
                synchronized (ijl.f21005d) {
                    if (ijl.f21007f) {
                    } else {
                        if (ijl.f21003b == 0) {
                            ikq ikq = ijl.f21004c;
                            if (ikq != null) {
                                ikq.mo13671a(ijl.f21006e);
                            } else {
                                ijl.f21007f = true;
                                z = true;
                            }
                        }
                        if (z) {
                            ijl.f21002a.close();
                        }
                    }
                }
            }
        }
    }
}
