package p000;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* renamed from: fcw */
public final class fcw implements kwk {
    /* renamed from: a */
    private final kwk f18133a;
    /* renamed from: b */
    private final kwk f18134b;

    private fcw(kwk kwk, kwk kwk2) {
        this.f18133a = kwk;
        this.f18134b = kwk2;
    }

    /* renamed from: a */
    public static fcw m10382a(kwk kwk, kwk kwk2) {
        return new fcw(kwk, kwk2);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo10566a() {
        return (ikp) ktm.m14219a(new ikp((ScheduledExecutorService) this.f18133a.mo10566a(), (long) ((Integer) this.f18134b.mo10566a()).intValue(), TimeUnit.SECONDS), "Cannot return null from a non-@Nullable @Provides method");
    }
}
