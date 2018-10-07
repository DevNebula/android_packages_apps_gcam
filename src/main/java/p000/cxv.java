package p000;

/* compiled from: PG */
/* renamed from: cxv */
public final class cxv implements kwk {
    /* renamed from: a */
    private final kwk f13446a;

    public cxv(kwk kwk) {
        this.f13446a = kwk;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo10566a() {
        cec cec = (cec) this.f13446a.mo10566a();
        iut iut = iut.BACK;
        if (awl.m741d(cec.f1887c)) {
            iut = iut.FRONT;
        }
        iur b = cec.f1885a.mo9091b(iut);
        if (b == null) {
            b = cec.f1885a.mo9093c();
        }
        jri.m13391a((Object) b, (Object) "There does not appear to be a camera!");
        return (ced) ktm.m14219a(new ced(cec.f1886b, b, cec.f1885a.mo13218b(b).mo9064c()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
