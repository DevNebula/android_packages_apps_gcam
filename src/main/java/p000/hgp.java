package p000;

/* renamed from: hgp */
final /* synthetic */ class hgp implements iqt {
    /* renamed from: a */
    private final hgo f20097a;

    hgp(hgo hgo) {
        this.f20097a = hgo;
    }

    /* renamed from: a */
    public final void mo8826a(Object obj) {
        hgo hgo = this.f20097a;
        Integer num = (Integer) obj;
        if (!((eth) hgo.f20079c.mo9706a()).mo13180a().equals(hgo.m12041a(gon.m2713a(num.intValue())))) {
            hgo.f20080d.mo7307b("micro_tutorial_dismiss");
        }
        ((eth) hgo.f20079c.mo9706a()).mo13181a(hgo.m12041a(gon.m2713a(num.intValue())));
        if (hgo.f20084h.get()) {
            hgo.mo13538b(null);
        }
    }
}
