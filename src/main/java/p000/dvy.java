package p000;

import java.util.Set;

/* compiled from: PG */
/* renamed from: dvy */
public final class dvy implements kwk {
    /* renamed from: a */
    private final kwk f16876a;

    private dvy(kwk kwk) {
        this.f16876a = kwk;
    }

    /* renamed from: a */
    public static dvy m9640a(kwk kwk) {
        return new dvy(kwk);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo10566a() {
        Object a;
        ivs ivs = (ivs) this.f16876a.mo10566a();
        if (ivs.mo9109b()) {
            a = keu.m13727a(ilq.m3877a(fds.m10411a(), kny.m18475a(ivs.mo9108a(), new dvw(), kpq.f8776a)));
        } else {
            a = kgn.f24941a;
        }
        return (Set) ktm.m14219a(a, "Cannot return null from a non-@Nullable @Provides method");
    }
}
