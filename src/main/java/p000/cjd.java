package p000;

import java.util.Set;

/* compiled from: PG */
/* renamed from: cjd */
public final class cjd implements kwk {
    /* renamed from: a */
    private final kwk f12608a;
    /* renamed from: b */
    private final kwk f12609b;
    /* renamed from: c */
    private final kwk f12610c;

    private cjd(kwk kwk, kwk kwk2, kwk kwk3) {
        this.f12608a = kwk;
        this.f12609b = kwk2;
        this.f12610c = kwk3;
    }

    /* renamed from: a */
    public static cjd m8353a(kwk kwk, kwk kwk2, kwk kwk3) {
        return new cjd(kwk, kwk2, kwk3);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo10566a() {
        kwk kwk = this.f12608a;
        kwk kwk2 = this.f12609b;
        boa boa = (boa) kwk.mo10566a();
        Set set = (Set) kwk2.mo10566a();
        iqz a = ((ira) this.f12610c.mo10566a()).mo8854a("Burst");
        return (bnn) ktm.m14219a(new bnt(new bnp(boa, set, new ikc()), a, new iqx(a, "BurstSaveBroker throughput")), "Cannot return null from a non-@Nullable @Provides method");
    }
}
