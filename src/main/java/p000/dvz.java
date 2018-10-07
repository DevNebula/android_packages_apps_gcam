package p000;

import java.util.Set;

/* compiled from: PG */
/* renamed from: dvz */
public final class dvz implements kwk {
    /* renamed from: a */
    private final kwk f16877a;

    private dvz(kwk kwk) {
        this.f16877a = kwk;
    }

    /* renamed from: a */
    public static dvz m9642a(kwk kwk) {
        return new dvz(kwk);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo10566a() {
        Object obj;
        ivs ivs = (ivs) this.f16877a.mo10566a();
        if (ivs.mo9109b()) {
            obj = kgn.f24941a;
        } else {
            obj = keu.m13727a(kny.m18475a(ivs.f7864a, new dvx(), kpq.f8776a));
        }
        return (Set) ktm.m14219a(obj, "Cannot return null from a non-@Nullable @Provides method");
    }
}
