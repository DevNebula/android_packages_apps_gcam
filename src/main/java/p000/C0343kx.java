package p000;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.animation.AnimationUtils;

/* compiled from: PG */
/* renamed from: kx */
final class C0343kx implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ C0341kv f9106a;

    C0343kx(C0341kv c0341kv) {
        this.f9106a = c0341kv;
    }

    public final void run() {
        C0341kv c0341kv = this.f9106a;
        if (c0341kv.f8989e) {
            boolean z;
            if (c0341kv.f8987c) {
                c0341kv.f8987c = false;
                C0342kw c0342kw = c0341kv.f8985a;
                c0342kw.f9096e = AnimationUtils.currentAnimationTimeMillis();
                c0342kw.f9099h = -1;
                c0342kw.f9097f = c0342kw.f9096e;
                c0342kw.f9100i = 0.5f;
                c0342kw.f9098g = 0;
            }
            C0342kw c0342kw2 = this.f9106a.f8985a;
            if (c0342kw2.f9099h <= 0) {
                z = false;
            } else if (AnimationUtils.currentAnimationTimeMillis() <= c0342kw2.f9099h + ((long) c0342kw2.f9101j)) {
                z = false;
            } else {
                z = true;
            }
            if (z || !this.f9106a.mo10449b()) {
                this.f9106a.f8989e = false;
                return;
            }
            long uptimeMillis;
            C0341kv c0341kv2 = this.f9106a;
            if (c0341kv2.f8988d) {
                c0341kv2.f8988d = false;
                uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                c0341kv2.f8986b.onTouchEvent(obtain);
                obtain.recycle();
            }
            if (c0342kw2.f9097f == 0) {
                throw new RuntimeException("Cannot compute scroll delta before calling start()");
            }
            uptimeMillis = AnimationUtils.currentAnimationTimeMillis();
            float a = c0342kw2.mo10561a(uptimeMillis);
            long j = c0342kw2.f9097f;
            c0342kw2.f9097f = uptimeMillis;
            c0342kw2.f9098g = (int) ((((float) (uptimeMillis - j)) * (((-4.0f * a) * a) + (a * 4.0f))) * c0342kw2.f9095d);
            this.f9106a.mo10448b(c0342kw2.f9098g);
            C0315jm.m4615a(this.f9106a.f8986b, (Runnable) this);
        }
    }
}
