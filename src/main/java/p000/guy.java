package p000;

import java.util.Set;

/* compiled from: PG */
/* renamed from: guy */
public final class guy implements kwk {
    /* renamed from: a */
    private final kwk f19645a;

    private guy(kwk kwk) {
        this.f19645a = kwk;
    }

    /* renamed from: a */
    public static guy m11788a(kwk kwk) {
        return new guy(kwk);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo10566a() {
        Object a;
        kbg kbg = (kbg) this.f19645a.mo10566a();
        if (kbg.mo9709b()) {
            a = keu.m13727a(new gut(kbg));
        } else {
            a = kgn.f24941a;
        }
        return (Set) ktm.m14219a(a, "Cannot return null from a non-@Nullable @Provides method");
    }
}
