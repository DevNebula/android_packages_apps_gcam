package p000;

/* compiled from: PG */
/* renamed from: evu */
public final class evu implements kwk {
    /* renamed from: a */
    private final kwk f17877a;

    private evu(kwk kwk) {
        this.f17877a = kwk;
    }

    /* renamed from: a */
    public static evu m10161a(kwk kwk) {
        return new evu(kwk);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo10566a() {
        kbg kbg = (kbg) this.f17877a.mo10566a();
        if (kbg.mo9709b()) {
            return (exb) ktm.m14219a((exb) kbg.mo9706a(), "Cannot return null from a non-@Nullable @Provides method");
        }
        throw new RuntimeException("Requested audio frame store not found");
    }
}
