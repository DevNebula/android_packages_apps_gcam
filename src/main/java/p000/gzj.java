package p000;

/* compiled from: PG */
/* renamed from: gzj */
public final class gzj implements kov {
    /* renamed from: a */
    private final /* synthetic */ gwv f19841a;

    public gzj(gwv gwv) {
        this.f19841a = gwv;
    }

    /* renamed from: a */
    public final void mo10185a(Throwable th) {
        bli.m896d(gwv.f19748a, "PassiveFocusScanAnimation: not started");
    }

    /* renamed from: b_ */
    public final /* synthetic */ void mo10186b_(Object obj) {
        if (((Boolean) obj).booleanValue()) {
            bli.m896d(gwv.f19748a, "PassiveFocusScanAnimation: completed");
            this.f19841a.f19766q.mo12320c();
            return;
        }
        bli.m896d(gwv.f19748a, "PassiveFocusScanAnimation: cancelled");
    }

    /* renamed from: a */
    public static float m11912a(long j, long j2, float f) {
        if (j <= j2) {
            return 0.0f;
        }
        return ((float) (j - j2)) / f;
    }
}
