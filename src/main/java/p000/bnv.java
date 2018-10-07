package p000;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* renamed from: bnv */
public final class bnv {
    /* renamed from: a */
    public final bcy f1377a;
    /* renamed from: b */
    public final AtomicReference f1378b = new AtomicReference();
    /* renamed from: c */
    private final hcd f1379c;
    /* renamed from: d */
    private boolean f1380d = false;

    public bnv(hcd hcd, bcy bcy) {
        this.f1379c = hcd;
        this.f1377a = bcy;
    }

    /* renamed from: a */
    public final synchronized void mo2061a() {
        this.f1379c.mo7670a(hbf.PHOTO_IDLE);
    }

    /* renamed from: a */
    public final synchronized void mo2062a(boolean z) {
        if (this.f1380d) {
            this.f1379c.mo7670a(hbf.PHOTO_IDLE);
            if (z) {
                this.f1377a.mo1903a();
            }
            this.f1380d = false;
        }
    }

    /* renamed from: b */
    public final synchronized void mo2063b(boolean z) {
        if (!this.f1380d) {
            this.f1379c.mo7670a(hbf.PHOTO_BURST);
            if (z) {
                this.f1377a.mo1905a(true);
            }
            this.f1380d = true;
        }
    }
}
