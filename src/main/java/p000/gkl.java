package p000;

import android.os.SystemClock;

/* renamed from: gkl */
final /* synthetic */ class gkl implements Runnable {
    /* renamed from: a */
    private final gkk f5551a;
    /* renamed from: b */
    private final grw f5552b;
    /* renamed from: c */
    private final long f5553c;

    gkl(gkk gkk, grw grw, long j) {
        this.f5551a = gkk;
        this.f5552b = grw;
        this.f5553c = j;
    }

    public final void run() {
        boolean z;
        gkk gkk = this.f5551a;
        grw grw = this.f5552b;
        long j = this.f5553c;
        kow.m13878a(gkk.mo14912D(), new gkn(gkk, gkk.mo15542u()), kpq.f8776a);
        if (gkk.f26429g != null) {
            z = true;
        } else {
            z = false;
        }
        jri.m13405b(z);
        gkk.f24380A.mo15641a(new gko(gkk));
        gkk.f26428f.mo8900a(gkk.f26425c.mo7426b(), grw.f6021a, gkk.f26424b, ((float) (SystemClock.elapsedRealtime() - j)) / 1000.0f);
    }
}
