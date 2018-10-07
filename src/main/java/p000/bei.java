package p000;

import android.view.Surface;

/* compiled from: PG */
/* renamed from: bei */
final class bei implements koj {
    /* renamed from: a */
    private final /* synthetic */ bea f11206a;

    bei(bea bea) {
        this.f11206a = bea;
    }

    /* renamed from: a */
    private final kpk m7363a(biw biw) {
        synchronized (this.f11206a.f22604w) {
            bea bea = this.f11206a;
            Surface d = biw.mo1972d();
            bea bea2 = this.f11206a;
            bea.f22601t = new bhs(d, bea2.f22599r, bea2.f22579B);
        }
        jri.m13395a(biw.mo1974f() ^ 1);
        kbg kbg = kau.f21835a;
        if (this.f11206a.f22595n.mo9709b()) {
            kbg = kbg.m4804c(((bjw) this.f11206a.f22595n.mo9706a()).mo12387a());
        }
        bea bea3 = this.f11206a;
        return bea3.f22585d.mo1951a(bea3.f22598q, biw.mo1972d(), kbg, kau.f21835a);
    }
}
