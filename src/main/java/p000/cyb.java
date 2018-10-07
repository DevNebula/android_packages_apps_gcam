package p000;

/* compiled from: PG */
/* renamed from: cyb */
final class cyb implements kov {
    /* renamed from: a */
    private final /* synthetic */ cxz f13458a;

    cyb(cxz cxz) {
        this.f13458a = cxz;
    }

    /* renamed from: a */
    public final void mo10185a(Throwable th) {
        bli.m899e(cxz.f23711d, "Failed to start OneCamera!", th);
        this.f13458a.mo12353b();
    }

    /* renamed from: b_ */
    public final /* synthetic */ void mo10186b_(Object obj) {
        bli.m896d(cxz.f23711d, "onSurfaceDrawn called; completing CaptureModeUiStartup");
        this.f13458a.f23713f.mo8857b();
        this.f13458a.mo12353b();
    }
}
