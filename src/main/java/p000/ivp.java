package p000;

import android.view.Surface;

/* compiled from: PG */
/* renamed from: ivp */
final class ivp implements iwi {
    /* renamed from: a */
    private final /* synthetic */ ivl f21325a;

    ivp(ivl ivl) {
        this.f21325a = ivl;
    }

    /* renamed from: a */
    public final void mo9126a(iwg iwg) {
    }

    /* renamed from: b */
    public final void mo9128b(iwg iwg) {
        this.f21325a.f21311d.mo15642a(new iwf());
        iwg.close();
        Surface c = iwg.mo9689a();
        if (c != null) {
            c.release();
        }
        if (!this.f21325a.f21309b.mo13666a()) {
            this.f21325a.f21308a.mo8838f("Capture session was closed, closing the capture session lifetime.");
            this.f21325a.f21309b.close();
        }
    }

    /* renamed from: c */
    public final void mo9129c(iwg iwg) {
        this.f21325a.f21308a.mo8838f("Capture session failed to configure!");
        Throwable iwf = new iwf("The capture session configuration failed!");
        this.f21325a.f21311d.mo15642a(iwf);
        iwg.close();
        if (!this.f21325a.f21309b.mo13666a()) {
            this.f21325a.f21308a.mo8838f("Capture session was closed, closing the capture session lifetime.");
            this.f21325a.f21309b.close();
            if (!this.f21325a.f21311d.isCancelled()) {
                this.f21325a.f21310c.mo8946a(iwf);
            }
        }
    }

    /* renamed from: d */
    public final void mo9130d(iwg iwg) {
        if (this.f21325a.f21311d.mo15641a((Object) iwg)) {
            this.f21325a.f21309b.mo8557a(new ivq(iwg));
            return;
        }
        iwg.close();
    }

    /* renamed from: e */
    public final void mo9131e(iwg iwg) {
    }

    /* renamed from: a */
    public final void mo9127a(iwg iwg, Surface surface) {
    }
}
