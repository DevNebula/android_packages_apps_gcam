package p000;

import java.util.Set;

/* compiled from: PG */
/* renamed from: ats */
public final class ats implements kwk {
    /* renamed from: a */
    private final kwk f10735a;
    /* renamed from: b */
    private final kwk f10736b;

    private ats(kwk kwk, kwk kwk2) {
        this.f10735a = kwk;
        this.f10736b = kwk2;
    }

    /* renamed from: a */
    public static ats m7058a(kwk kwk, kwk kwk2) {
        return new ats(kwk, kwk2);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo10566a() {
        kwk kwk = this.f10735a;
        Object obj = (aug) kwk.mo10566a();
        if (((ffc) this.f10736b.mo10566a()).mo9080s()) {
            obj = keu.m13727a(fds.m10416a(ken.m13708a(obj)));
        } else {
            obj = kgn.f24941a;
        }
        return (Set) ktm.m14219a(obj, "Cannot return null from a non-@Nullable @Provides method");
    }
}
