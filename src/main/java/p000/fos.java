package p000;

import android.view.Surface;
import java.util.Collection;
import java.util.Set;

/* compiled from: PG */
/* renamed from: fos */
public final class fos implements kwk {
    /* renamed from: a */
    private final kwk f18533a;
    /* renamed from: b */
    private final kwk f18534b;
    /* renamed from: c */
    private final kwk f18535c;
    /* renamed from: d */
    private final kwk f18536d;

    private fos(kwk kwk, kwk kwk2, kwk kwk3, kwk kwk4) {
        this.f18533a = kwk;
        this.f18534b = kwk2;
        this.f18535c = kwk3;
        this.f18536d = kwk4;
    }

    /* renamed from: a */
    public static fos m10771a(kwk kwk, kwk kwk2, kwk kwk3, kwk kwk4) {
        return new fos(kwk, kwk2, kwk3, kwk4);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo10566a() {
        kwk kwk = this.f18533a;
        kwk kwk2 = this.f18534b;
        kwk kwk3 = this.f18535c;
        Set<Object> set = (Set) kwk.mo10566a();
        Set<ivs> set2 = (Set) kwk2.mo10566a();
        Object obj = (Surface) kwk3.mo10566a();
        Object obj2 = (Surface) this.f18536d.mo10566a();
        Collection a = khb.m4923a(set.size());
        for (ivs add : set2) {
            a.add(add);
        }
        jri.m13404b(obj);
        jri.m13404b(obj2);
        jri.m13395a(set.contains(obj));
        jri.m13395a(set.contains(obj2));
        for (Object obj3 : set) {
            if (obj3.equals(obj) || obj3.equals(obj2)) {
                a.add(new ivs(ivs.m4321a(1, kow.m13873a(obj3))));
            } else {
                a.add(ivs.m4320a(kow.m13873a(obj3)));
            }
        }
        return (Set) ktm.m14219a(keu.m13732a(a), "Cannot return null from a non-@Nullable @Provides method");
    }
}
