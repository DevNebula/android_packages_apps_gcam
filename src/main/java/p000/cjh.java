package p000;

/* compiled from: PG */
/* renamed from: cjh */
public final class cjh implements kwk {
    /* renamed from: a */
    private final kwk f12634a;

    private cjh(kwk kwk) {
        this.f12634a = kwk;
    }

    /* renamed from: a */
    public static cjh m8361a(kwk kwk) {
        return new cjh(kwk);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo10566a() {
        ixt a = new ixt().mo9166a(new ixu((ixr) this.f12634a.mo10566a()), 0.6f).mo9166a(new ixp(), 0.15f).mo9166a(new ixo(), 0.25f);
        jri.m13405b(a.f7896a.isEmpty() ^ 1);
        return (ixq) ktm.m14219a(new ixs(a.f7896a), "Cannot return null from a non-@Nullable @Provides method");
    }
}
