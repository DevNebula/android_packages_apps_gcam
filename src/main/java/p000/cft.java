package p000;

import android.graphics.Bitmap;

/* compiled from: PG */
/* renamed from: cft */
final class cft implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ Bitmap f2111a;
    /* renamed from: b */
    private final /* synthetic */ int f2112b;
    /* renamed from: c */
    private final /* synthetic */ cfk f2113c;

    cft(cfk cfk, Bitmap bitmap, int i) {
        this.f2113c = cfk;
        this.f2111a = bitmap;
        this.f2112b = i;
    }

    public final void run() {
        cfk cfk = this.f2113c;
        cfk.f23190y.mo7473a(cfk.f23060H.mo12925b());
        this.f2113c.f23190y.mo7471a(this.f2111a, this.f2112b);
        kow.m13878a(this.f2113c.f23185t.mo7422a(new gss(this.f2111a, iqm.m4095a(this.f2112b))), new cfu(), kpq.f8776a);
    }
}
