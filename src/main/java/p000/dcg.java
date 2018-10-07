package p000;

import android.content.Intent;

/* compiled from: PG */
/* renamed from: dcg */
final class dcg implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ cfh f3191a;
    /* renamed from: b */
    private final /* synthetic */ dcf f3192b;

    dcg(dcf dcf, cfh cfh) {
        this.f3192b = dcf;
        this.f3191a = cfh;
    }

    public final void run() {
        if (this.f3192b.f23807c.mo9709b()) {
            this.f3191a.mo12467a((Intent) this.f3192b.f23807c.mo9706a());
        } else {
            this.f3191a.mo12465a();
        }
    }
}
