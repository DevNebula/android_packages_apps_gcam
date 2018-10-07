package p000;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* renamed from: evw */
public final class evw implements kwk {
    /* renamed from: a */
    private final kwk f17880a;
    /* renamed from: b */
    private final kwk f17881b;
    /* renamed from: c */
    private final kwk f17882c;

    private evw(kwk kwk, kwk kwk2, kwk kwk3) {
        this.f17880a = kwk;
        this.f17881b = kwk2;
        this.f17882c = kwk3;
    }

    /* renamed from: a */
    public static evw m10165a(kwk kwk, kwk kwk2, kwk kwk3) {
        return new evw(kwk, kwk2, kwk3);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo10566a() {
        Object etm;
        kwk kwk = this.f17880a;
        kwk kwk2 = this.f17881b;
        kwk kwk3 = this.f17882c;
        kbg kbg = (kbg) kwk.mo10566a();
        if (kbg.mo9709b()) {
            ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) kwk3.mo10566a();
            etm = new etm((jfp) kwk2.mo10566a(), (exb) kbg.mo9706a(), TimeUnit.MICROSECONDS.convert(33333, TimeUnit.MICROSECONDS), scheduledExecutorService);
        } else {
            etm = new evt();
        }
        return (etl) ktm.m14219a(etm, "Cannot return null from a non-@Nullable @Provides method");
    }
}
