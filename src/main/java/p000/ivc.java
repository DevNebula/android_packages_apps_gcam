package p000;

/* compiled from: PG */
/* renamed from: ivc */
final class ivc implements ixd {
    /* renamed from: a */
    private final ixd f21302a;
    /* renamed from: b */
    private final /* synthetic */ ivb f21303b;

    ivc(ivb ivb, ixd ixd) {
        this.f21303b = ivb;
        this.f21302a = ixd;
    }

    /* renamed from: a */
    public final void mo9148a() {
        synchronized (this.f21303b.f26537a) {
            ivb ivb = this.f21303b;
            if (ivb.f26538b) {
                ivb.mo15560j();
                return;
            }
            this.f21302a.mo9148a();
        }
    }
}
