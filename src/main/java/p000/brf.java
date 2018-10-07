package p000;

/* compiled from: PG */
/* renamed from: brf */
public final class brf implements kwk {
    /* renamed from: a */
    private final kwk f11729a;

    private brf(kwk kwk) {
        this.f11729a = kwk;
    }

    /* renamed from: a */
    public static brf m7787a(kwk kwk) {
        return new brf(kwk);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo10566a() {
        hjf hjf = (hjf) this.f11729a.mo10566a();
        boolean z = !hjf.mo7904b() ? !hjf.mo7905c() ? hjf.mo7906d() : true : true;
        return (bsq) ktm.m14219a(new bsq("camera.enable_vesper", z), "Cannot return null from a non-@Nullable @Provides method");
    }
}
