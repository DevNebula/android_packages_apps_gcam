package p000;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* renamed from: kor */
final class kor extends koq {
    /* renamed from: a */
    private final kpk f26599a;

    kor(kpk kpk) {
        this.f26599a = (kpk) jri.m13404b((Object) kpk);
    }

    /* renamed from: a */
    public final void mo10200a(Runnable runnable, Executor executor) {
        this.f26599a.mo10200a(runnable, executor);
    }

    public final boolean cancel(boolean z) {
        return this.f26599a.cancel(z);
    }

    public final Object get() {
        return this.f26599a.get();
    }

    public final Object get(long j, TimeUnit timeUnit) {
        return this.f26599a.get(j, timeUnit);
    }

    public final boolean isCancelled() {
        return this.f26599a.isCancelled();
    }

    public final boolean isDone() {
        return this.f26599a.isDone();
    }
}
