package p000;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* renamed from: gec */
public final class gec implements kwk {
    /* renamed from: a */
    private final kwk f19101a;

    public gec(kwk kwk) {
        this.f19101a = kwk;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo10566a() {
        return (ikq) ktm.m14219a(new ikq(new ikp((ScheduledExecutorService) this.f19101a.mo10566a(), 10, TimeUnit.SECONDS)), "Cannot return null from a non-@Nullable @Provides method");
    }
}
