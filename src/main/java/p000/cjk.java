package p000;

import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* renamed from: cjk */
public final class cjk implements kwk {
    /* renamed from: a */
    private final kwk f12637a;
    /* renamed from: b */
    private final kwk f12638b;

    private cjk(kwk kwk, kwk kwk2) {
        this.f12637a = kwk;
        this.f12638b = kwk2;
    }

    /* renamed from: a */
    public static cjk m8366a(kwk kwk, kwk kwk2) {
        return new cjk(kwk, kwk2);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo10566a() {
        kwk kwk = this.f12637a;
        kwk kwk2 = this.f12638b;
        Set hashSet = new HashSet();
        gij gij = new gij();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= 3) {
                return (Set) ktm.m14219a(hashSet, "Cannot return null from a non-@Nullable @Provides method");
            }
            hashSet.add(new gil(gij, (gin) kwk.mo10566a(), (hju) kwk2.mo10566a()));
            i = i2 + 1;
        }
    }
}
