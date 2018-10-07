package p000;

import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* renamed from: gud */
public final class gud implements kwk {
    /* renamed from: a */
    private final kwk f19609a;
    /* renamed from: b */
    private final kwk f19610b;
    /* renamed from: c */
    private final kwk f19611c;

    public gud(kwk kwk, kwk kwk2, kwk kwk3) {
        this.f19609a = kwk;
        this.f19610b = kwk2;
        this.f19611c = kwk3;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo10566a() {
        kwk kwk = this.f19609a;
        kwk kwk2 = this.f19610b;
        kwk kwk3 = this.f19611c;
        kwk.mo10566a();
        gtx gtx = new gtx((guf) kwk3.mo10566a(), (ScheduledExecutorService) kwk2.mo10566a());
        gtx.mo7452b();
        return (gtx) ktm.m14219a(gtx, "Cannot return null from a non-@Nullable @Provides method");
    }
}
