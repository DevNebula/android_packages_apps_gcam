package p000;

/* compiled from: PG */
/* renamed from: dqh */
final class dqh implements kov {
    /* renamed from: a */
    private final /* synthetic */ dqf f16484a;

    dqh(dqf dqf) {
        this.f16484a = dqf;
    }

    /* renamed from: a */
    public final void mo10185a(Throwable th) {
        this.f16484a.f24051d.mo8838f("Failed to close the CameraDevice because Future<CameraDevice> failed.");
    }

    /* renamed from: b_ */
    public final /* synthetic */ void mo10186b_(Object obj) {
        ((iwl) obj).close();
        this.f16484a.f24051d.mo8838f("CameraDevice closed.");
    }
}
