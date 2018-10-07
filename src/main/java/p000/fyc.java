package p000;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* renamed from: fyc */
final class fyc implements fyr {
    /* renamed from: a */
    private AtomicBoolean f24331a = new AtomicBoolean(false);
    /* renamed from: b */
    private final /* synthetic */ fyb f24332b;

    fyc(fyb fyb) {
        this.f24332b = fyb;
    }

    public final void close() {
        fyr fyr = null;
        boolean z = true;
        if (!this.f24331a.getAndSet(true)) {
            fyb fyb = this.f24332b;
            synchronized (fyb.f5047b) {
                fyb.f5049d--;
                if (fyb.f5049d < 0) {
                    z = false;
                }
                jri.m13405b(z);
                if (fyb.f5048c && fyb.f5049d == 0) {
                    fyr = fyb.f5046a;
                }
            }
            if (fyr != null) {
                fyr.close();
            }
        }
    }
}
