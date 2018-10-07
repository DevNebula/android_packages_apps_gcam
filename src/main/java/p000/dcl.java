package p000;

/* renamed from: dcl */
final /* synthetic */ class dcl implements iqt {
    /* renamed from: a */
    private final dck f13717a;

    dcl(dck dck) {
        this.f13717a = dck;
    }

    /* renamed from: a */
    public final void mo8826a(Object obj) {
        dck dck = this.f13717a;
        Boolean bool = (Boolean) obj;
        String str = (String) ((dbu) dck.f23820a.mo2152d()).mo13019z().mo13673b();
        ilp b = dck.f23820a.f23818m;
        boolean z = !"on".equals(str) ? "auto".equals(str) ? bool.booleanValue() : false : true;
        b.mo8826a(Boolean.valueOf(z));
    }
}
