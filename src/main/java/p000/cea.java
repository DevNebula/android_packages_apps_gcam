package p000;

/* compiled from: PG */
/* renamed from: cea */
public final class cea implements kwk {
    /* renamed from: a */
    private final kwk f12240a;
    /* renamed from: b */
    private final kwk f12241b;

    public cea(kwk kwk, kwk kwk2) {
        this.f12240a = kwk;
        this.f12241b = kwk2;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo10566a() {
        Object obj;
        kwk kwk = this.f12240a;
        kwk kwk2 = this.f12241b;
        switch (((hhx) kwk.mo10566a()).ordinal()) {
            case 1:
                ijk obj2 = (ijk) kwk2.mo10566a();
                break;
            default:
                obj2 = bbe.f11154a;
                break;
        }
        return (ijk) ktm.m14219a(obj2, "Cannot return null from a non-@Nullable @Provides method");
    }
}
