package p000;

import java.util.Set;

/* compiled from: PG */
/* renamed from: aty */
public final class aty implements kwk {
    /* renamed from: a */
    private final kwk f10756a;
    /* renamed from: b */
    private final kwk f10757b;
    /* renamed from: c */
    private final kwk f10758c;

    private aty(kwk kwk, kwk kwk2, kwk kwk3) {
        this.f10756a = kwk;
        this.f10757b = kwk2;
        this.f10758c = kwk3;
    }

    /* renamed from: a */
    public static aty m7070a(kwk kwk, kwk kwk2, kwk kwk3) {
        return new aty(kwk, kwk2, kwk3);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo10566a() {
        Object a;
        kwk kwk = this.f10756a;
        kwk kwk2 = this.f10757b;
        kwk kwk3 = this.f10758c;
        ffc ffc = (ffc) kwk.mo10566a();
        kwk2.mo10566a();
        if (ffc.mo9080s()) {
            a = keu.m13727a(fds.m10416a(ken.m13708a((fiw) kwk3.mo10566a())));
        } else {
            a = kgn.f24941a;
        }
        return (Set) ktm.m14219a(a, "Cannot return null from a non-@Nullable @Provides method");
    }
}
