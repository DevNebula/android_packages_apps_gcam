package p000;

import java.util.Collection;
import java.util.Set;

/* compiled from: PG */
/* renamed from: fot */
public final class fot implements kwk {
    /* renamed from: a */
    private final kwk f18537a;
    /* renamed from: b */
    private final kwk f18538b;

    private fot(kwk kwk, kwk kwk2) {
        this.f18537a = kwk;
        this.f18538b = kwk2;
    }

    /* renamed from: a */
    public static fot m10773a(kwk kwk, kwk kwk2) {
        return new fot(kwk, kwk2);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo10566a() {
        kwk kwk = this.f18537a;
        Set<Object> set = (Set) kwk.mo10566a();
        Set<ivs> set2 = (Set) this.f18538b.mo10566a();
        Collection a = khb.m4923a(set.size());
        for (ivs add : set2) {
            a.add(add);
        }
        for (Object a2 : set) {
            a.add(ivs.m4320a(kow.m13873a(a2)));
        }
        return (Set) ktm.m14219a(keu.m13732a(a), "Cannot return null from a non-@Nullable @Provides method");
    }
}
