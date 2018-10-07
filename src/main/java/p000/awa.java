package p000;

/* renamed from: awa */
final /* synthetic */ class awa implements iqt {
    /* renamed from: a */
    private final avy f10918a;
    /* renamed from: b */
    private final kpw f10919b;

    awa(avy avy, kpw kpw) {
        this.f10918a = avy;
        this.f10919b = kpw;
    }

    /* renamed from: a */
    public final void mo8826a(Object obj) {
        avy avy = this.f10918a;
        knk knk = this.f10919b;
        gvd gvd = (gvd) obj;
        if (gvd.mo7465b() && !gvd.mo7464a()) {
            bli.m888a(avy.f10906a, "Tracker is not tracking, stopping tracking touch to focus.");
            knk.mo15641a(aua.m719a());
            avy.mo12323a();
        }
    }
}
