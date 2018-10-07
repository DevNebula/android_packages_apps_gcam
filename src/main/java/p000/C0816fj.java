package p000;

/* compiled from: PG */
/* renamed from: fj */
final class C0816fj extends C0677fd {
    /* renamed from: a */
    private C0678fh f24263a;

    C0816fj(C0678fh c0678fh) {
        this.f24263a = c0678fh;
    }

    /* renamed from: a */
    public final void mo6738a(C0219ex c0219ex) {
        C0678fh c0678fh = this.f24263a;
        c0678fh.f18268r--;
        if (c0678fh.f18268r == 0) {
            c0678fh.f18269s = false;
            c0678fh.mo6648c();
        }
        c0219ex.mo6644b((C0224fc) this);
    }

    /* renamed from: c */
    public final void mo6740c() {
        C0678fh c0678fh = this.f24263a;
        if (!c0678fh.f18269s) {
            c0678fh.mo6655f();
            this.f24263a.f18269s = true;
        }
    }
}
