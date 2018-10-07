package p000;

import android.os.SystemClock;
import java.util.concurrent.CountDownLatch;

/* compiled from: PG */
/* renamed from: gd */
final class C0683gd extends C0248gk implements Runnable {
    /* renamed from: a */
    public boolean f19058a;
    /* renamed from: h */
    private final CountDownLatch f19059h = new CountDownLatch(1);
    /* renamed from: i */
    private final /* synthetic */ C0682gc f19060i;

    C0683gd(C0682gc c0682gc) {
        this.f19060i = c0682gc;
    }

    /* renamed from: d */
    private final Object m11186d() {
        try {
            return this.f19060i.mo13322b();
        } catch (C0267hi e) {
            if (this.f5516f.get()) {
                return null;
            }
            throw e;
        }
    }

    /* renamed from: b */
    protected final void mo7156b() {
        try {
            this.f19060i.mo13321a(this);
        } finally {
            this.f19059h.countDown();
        }
    }

    /* renamed from: a */
    protected final void mo7154a(Object obj) {
        try {
            C0243gf c0243gf = this.f19060i;
            if (c0243gf.f18994a != this) {
                c0243gf.mo13321a(this);
            } else if (!c0243gf.f5366f) {
                SystemClock.uptimeMillis();
                c0243gf.f18994a = null;
                c0243gf.mo7097b(obj);
            }
            this.f19059h.countDown();
        } catch (Throwable th) {
            this.f19059h.countDown();
        }
    }

    public final void run() {
        this.f19058a = false;
        this.f19060i.mo13320a();
    }
}
