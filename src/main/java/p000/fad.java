package p000;

/* compiled from: PG */
/* renamed from: fad */
public final class fad implements kwk {
    /* renamed from: a */
    private final kwk f18084a;

    private fad(kwk kwk) {
        this.f18084a = kwk;
    }

    /* renamed from: a */
    public static fad m10320a(kwk kwk) {
        return new fad(kwk);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo10566a() {
        Object fjt;
        kbg kbg = (kbg) this.f18084a.mo10566a();
        if (kbg.mo9709b()) {
            fjt fjt2 = (fjt) kbg.mo9706a();
        } else {
            fjt2 = new fjt();
        }
        return (fjt) ktm.m14219a(fjt2, "Cannot return null from a non-@Nullable @Provides method");
    }
}
