package p000;

import java.util.Set;

/* compiled from: PG */
/* renamed from: bxr */
public final class bxr implements kwk {
    /* renamed from: a */
    private final kwk f11931a;
    /* renamed from: b */
    private final kwk f11932b;

    private bxr(kwk kwk, kwk kwk2) {
        this.f11931a = kwk;
        this.f11932b = kwk2;
    }

    /* renamed from: a */
    public static bxr m7950a(kwk kwk, kwk kwk2) {
        return new bxr(kwk, kwk2);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo10566a() {
        Object a;
        kwk kwk = this.f11931a;
        kwk kwk2 = this.f11932b;
        if (((Integer) kwk.mo10566a()).intValue() >= 0) {
            a = keu.m13727a(fds.m10416a(ken.m13708a((fiw) kwk2.mo10566a())));
        } else {
            a = kgn.f24941a;
        }
        return (Set) ktm.m14219a(a, "Cannot return null from a non-@Nullable @Provides method");
    }
}
