package p000;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: ews */
public final class ews implements kwk {
    /* renamed from: a */
    private final kwk f17939a;
    /* renamed from: b */
    private final kwk f17940b;
    /* renamed from: c */
    private final kwk f17941c;
    /* renamed from: d */
    private final kwk f17942d;
    /* renamed from: e */
    private final kwk f17943e;

    private ews(kwk kwk, kwk kwk2, kwk kwk3, kwk kwk4, kwk kwk5) {
        this.f17939a = kwk;
        this.f17940b = kwk2;
        this.f17941c = kwk3;
        this.f17942d = kwk4;
        this.f17943e = kwk5;
    }

    /* renamed from: a */
    public static ews m10190a(kwk kwk, kwk kwk2, kwk kwk3, kwk kwk4, kwk kwk5) {
        return new ews(kwk, kwk2, kwk3, kwk4, kwk5);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo10566a() {
        kwk kwk = this.f17939a;
        kwk kwk2 = this.f17940b;
        kwk kwk3 = this.f17941c;
        kwk kwk4 = this.f17942d;
        ccr ccr = (ccr) kwk.mo10566a();
        exd exd = (exd) kwk2.mo10566a();
        Executor executor = (Executor) kwk3.mo10566a();
        exf evo = new evo(ccr, exd, executor, ccr.mo12451c(), (iqp) kwk4.mo10566a(), (bmb) this.f17943e.mo10566a());
        exd.mo6664a(evo, executor);
        return (evo) ktm.m14219a(evo, "Cannot return null from a non-@Nullable @Provides method");
    }
}
