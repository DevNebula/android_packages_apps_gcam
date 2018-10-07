package p000;

import java.util.Set;

/* compiled from: PG */
/* renamed from: gpj */
public final class gpj implements kwk {
    /* renamed from: a */
    private final kwk f19443a;
    /* renamed from: b */
    private final kwk f19444b;

    private gpj(kwk kwk, kwk kwk2) {
        this.f19443a = kwk;
        this.f19444b = kwk2;
    }

    /* renamed from: a */
    public static gpj m11496a(kwk kwk, kwk kwk2) {
        return new gpj(kwk, kwk2);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo10566a() {
        Object a;
        kwk kwk = this.f19443a;
        kbg kbg = (kbg) this.f19444b.mo10566a();
        if (kbg.mo9709b()) {
            a = keu.m13727a(new gpi(kbg, kwk));
        } else {
            a = kgn.f24941a;
        }
        return (Set) ktm.m14219a(a, "Cannot return null from a non-@Nullable @Provides method");
    }
}
