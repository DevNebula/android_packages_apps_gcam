package p000;

import android.widget.FrameLayout;

/* compiled from: PG */
/* renamed from: cgc */
final class cgc implements Runnable {
    /* renamed from: a */
    public final /* synthetic */ cfk f2128a;

    cgc(cfk cfk) {
        this.f2128a = cfk;
    }

    public final void run() {
        hio hio = null;
        FrameLayout frameLayout = this.f2128a.f23057E;
        if (frameLayout != null) {
            int width = frameLayout.getWidth();
            int c = this.f2128a.f23059G.mo7832c();
            try {
                err e;
                cre d = this.f2128a.f23059G.mo7836d(0);
                if (d != cre.f2792c) {
                    e = d.mo5692e();
                } else {
                    e = null;
                }
                if (e != null) {
                    hio = e.mo6528a(width, width);
                }
                this.f2128a.f23173h.post(new cgd(this, e, hio, c));
            } catch (Throwable e2) {
                bli.m899e(cfk.f23052a, "exception generating thumbnail", e2);
                this.f2128a.f23173h.post(new cge(this));
            }
        }
    }
}
