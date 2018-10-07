package p000;

import java.util.Set;

/* compiled from: PG */
/* renamed from: bqz */
public final class bqz implements kwk {
    /* renamed from: a */
    private final kwk f11715a;
    /* renamed from: b */
    private final kwk f11716b;
    /* renamed from: c */
    private final kwk f11717c;
    /* renamed from: d */
    private final kwk f11718d;
    /* renamed from: e */
    private final kwk f11719e;

    private bqz(kwk kwk, kwk kwk2, kwk kwk3, kwk kwk4, kwk kwk5) {
        this.f11715a = kwk;
        this.f11716b = kwk2;
        this.f11717c = kwk3;
        this.f11718d = kwk4;
        this.f11719e = kwk5;
    }

    /* renamed from: a */
    public static bqz m7780a(kwk kwk, kwk kwk2, kwk kwk3, kwk kwk4, kwk kwk5) {
        return new bqz(kwk, kwk2, kwk3, kwk4, kwk5);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo10566a() {
        Object a;
        kwk kwk = this.f11715a;
        kwk kwk2 = this.f11716b;
        kwk kwk3 = this.f11717c;
        kwk kwk4 = this.f11718d;
        bsn bsn = (bsn) kwk.mo10566a();
        bsq bsq = (bsq) kwk3.mo10566a();
        ffc ffc = (ffc) kwk4.mo10566a();
        brm brm = (brm) this.f11719e.mo10566a();
        if (bsn.mo2107a((bsq) kwk2.mo10566a()) && bsn.mo2107a(bsq)) {
            a = keu.m13727a(aqe.m608a(new bqw(brm, ffc)));
        } else {
            a = kgn.f24941a;
        }
        return (Set) ktm.m14219a(a, "Cannot return null from a non-@Nullable @Provides method");
    }
}
