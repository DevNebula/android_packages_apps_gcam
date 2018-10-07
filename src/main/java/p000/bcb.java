package p000;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* renamed from: bcb */
public final class bcb implements kwk {
    /* renamed from: a */
    private final kwk f11165a;

    private bcb(kwk kwk) {
        this.f11165a = kwk;
    }

    /* renamed from: a */
    public static bcb m7329a(kwk kwk) {
        return new bcb(kwk);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo10566a() {
        return (ExecutorService) ktm.m14219a((ScheduledExecutorService) this.f11165a.mo10566a(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
