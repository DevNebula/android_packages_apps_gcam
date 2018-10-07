package p000;

/* compiled from: PG */
/* renamed from: haj */
public final class haj implements kov {
    /* renamed from: a */
    private final /* synthetic */ gwv f19864a;

    public haj(gwv gwv) {
        this.f19864a = gwv;
    }

    /* renamed from: a */
    public final void mo10185a(Throwable th) {
        bli.m896d(gwv.f19748a, "ActiveFocusScanAnimation: not started");
    }

    /* renamed from: b_ */
    public final /* synthetic */ void mo10186b_(Object obj) {
        if (((Boolean) obj).booleanValue()) {
            bli.m896d(gwv.f19748a, "ActiveFocusScanAnimation: completed");
            this.f19864a.f19766q.mo12317b();
            return;
        }
        bli.m896d(gwv.f19748a, "ActiveFocusScanAnimation: cancelled");
    }
}
