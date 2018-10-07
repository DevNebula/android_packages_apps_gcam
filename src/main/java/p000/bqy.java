package p000;

import java.util.Set;

/* compiled from: PG */
/* renamed from: bqy */
public final class bqy implements kwk {
    /* renamed from: a */
    private final kwk f11711a;
    /* renamed from: b */
    private final kwk f11712b;
    /* renamed from: c */
    private final kwk f11713c;
    /* renamed from: d */
    private final kwk f11714d;

    private bqy(kwk kwk, kwk kwk2, kwk kwk3, kwk kwk4) {
        this.f11711a = kwk;
        this.f11712b = kwk2;
        this.f11713c = kwk3;
        this.f11714d = kwk4;
    }

    /* renamed from: a */
    public static bqy m7778a(kwk kwk, kwk kwk2, kwk kwk3, kwk kwk4) {
        return new bqy(kwk, kwk2, kwk3, kwk4);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo10566a() {
        Object a;
        kwk kwk = this.f11711a;
        kwk kwk2 = this.f11712b;
        kwk kwk3 = this.f11713c;
        bsn bsn = (bsn) kwk.mo10566a();
        bsq bsq = (bsq) kwk3.mo10566a();
        brm brm = (brm) this.f11714d.mo10566a();
        if (bsn.mo2107a((bsq) kwk2.mo10566a()) && bsn.mo2107a(bsq)) {
            a = keu.m13727a(new bqx(brm));
        } else {
            a = kgn.f24941a;
        }
        return (Set) ktm.m14219a(a, "Cannot return null from a non-@Nullable @Provides method");
    }
}
