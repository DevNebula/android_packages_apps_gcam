package p000;

import java.util.Set;

/* compiled from: PG */
/* renamed from: dqb */
public final class dqb implements kwk {
    /* renamed from: a */
    private final kwk f16479a;
    /* renamed from: b */
    private final kwk f16480b;

    private dqb(kwk kwk, kwk kwk2) {
        this.f16479a = kwk;
        this.f16480b = kwk2;
    }

    /* renamed from: a */
    public static dqb m9400a(kwk kwk, kwk kwk2) {
        return new dqb(kwk, kwk2);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo10566a() {
        kwk kwk = this.f16479a;
        kwk kwk2 = this.f16480b;
        Object a = kwk.mo10566a();
        kwk2.mo10566a();
        return (Set) ktm.m14219a(keu.m13727a(fds.m10416a(ken.m13708a((dqe) a))), "Cannot return null from a non-@Nullable @Provides method");
    }
}
