package p000;

import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* renamed from: bch */
public final class bch implements kwk {
    /* renamed from: a */
    private final kwk f11171a;

    public bch(kwk kwk) {
        this.f11171a = kwk;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo10566a() {
        Object kpt;
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.f11171a.mo10566a();
        if (scheduledExecutorService instanceof kpn) {
            kpn kpt2 = (kpn) scheduledExecutorService;
        } else {
            kpt2 = new kpt(scheduledExecutorService);
        }
        return (kpn) ktm.m14219a(kpt2, "Cannot return null from a non-@Nullable @Provides method");
    }
}
