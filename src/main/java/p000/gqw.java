package p000;

/* compiled from: PG */
/* renamed from: gqw */
public final class gqw {
    /* renamed from: a */
    public kbg f6008a = kau.f21835a;
    /* renamed from: b */
    public klu f6009b = null;
    /* renamed from: c */
    private final gqx f6010c;

    public gqw(gqx gqx) {
        this.f6010c = gqx;
    }

    /* renamed from: a */
    public final void mo7358a() {
        klu klu = this.f6009b;
        if (klu != null) {
            this.f6010c.mo7362a(klu);
            this.f6009b = null;
        }
        this.f6008a = kau.f21835a;
    }

    /* renamed from: b */
    public final void mo7360b() {
        if (this.f6009b == null) {
            this.f6009b = new klu();
        }
        this.f6009b.f25302f = true;
        mo7358a();
    }

    /* renamed from: c */
    public final void mo7361c() {
        if (this.f6009b != null) {
            mo7360b();
            return;
        }
        this.f6009b = new klu();
        klu klu = this.f6009b;
        klu.f25297a = false;
        klu.f25299c = true;
        mo7358a();
    }

    /* renamed from: a */
    public final void mo7359a(boolean z) {
        klu klu = this.f6009b;
        if (klu == null) {
            mo7360b();
            return;
        }
        klu.f25301e = z;
        mo7358a();
    }
}
