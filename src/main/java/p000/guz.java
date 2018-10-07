package p000;

import java.util.Set;

/* compiled from: PG */
/* renamed from: guz */
public final class guz implements kwk {
    /* renamed from: a */
    private final kwk f19646a;
    /* renamed from: b */
    private final kwk f19647b;
    /* renamed from: c */
    private final kwk f19648c;
    /* renamed from: d */
    private final kwk f19649d;

    private guz(kwk kwk, kwk kwk2, kwk kwk3, kwk kwk4) {
        this.f19646a = kwk;
        this.f19647b = kwk2;
        this.f19648c = kwk3;
        this.f19649d = kwk4;
    }

    /* renamed from: a */
    public static guz m11790a(kwk kwk, kwk kwk2, kwk kwk3, kwk kwk4) {
        return new guz(kwk, kwk2, kwk3, kwk4);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo10566a() {
        Object a;
        kwk kwk = this.f19646a;
        kwk kwk2 = this.f19647b;
        kwk kwk3 = this.f19648c;
        kbg kbg = (kbg) kwk3.mo10566a();
        kbg kbg2 = (kbg) this.f19649d.mo10566a();
        if (kbg.mo9709b() && kbg2.mo9709b()) {
            a = keu.m13727a(new gus(kbg, kwk, kbg2, kwk2));
        } else {
            a = kgn.f24941a;
        }
        return (Set) ktm.m14219a(a, "Cannot return null from a non-@Nullable @Provides method");
    }
}
