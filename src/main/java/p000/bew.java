package p000;

import android.view.Surface;

/* compiled from: PG */
/* renamed from: bew */
final class bew implements koj {
    /* renamed from: a */
    private final /* synthetic */ bem f11224a;

    bew(bem bem) {
        this.f11224a = bem;
    }

    /* renamed from: a */
    private final kpk m7378a(ios ios) {
        kbg c;
        synchronized (this.f11224a.f22627s) {
            bem bem = this.f11224a;
            Surface surface = (Surface) ios.mo13690a().mo9706a();
            bem bem2 = this.f11224a;
            bem.f22624p = new bhs(surface, bem2.f22622n, bem2.f22632x);
        }
        kbg kbg = kau.f21835a;
        if (this.f11224a.f22618j.mo9709b()) {
            c = kbg.m4804c(((bjw) this.f11224a.f22618j.mo9706a()).mo12387a());
        } else {
            c = kbg;
        }
        bem bem3 = this.f11224a;
        return bem3.f22612d.mo1951a(bem3.f22621m, (Surface) ios.mo13690a().mo9706a(), c, kau.f21835a);
    }
}
