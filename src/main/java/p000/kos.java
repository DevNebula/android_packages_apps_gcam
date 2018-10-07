package p000;

import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* renamed from: kos */
public abstract class kos extends kdy implements Future {
    protected kos() {
    }

    /* renamed from: b */
    protected abstract Future mo9820F_();

    public boolean cancel(boolean z) {
        return mo9820F_().cancel(z);
    }

    public Object get() {
        return mo9820F_().get();
    }

    public Object get(long j, TimeUnit timeUnit) {
        return mo9820F_().get(j, timeUnit);
    }

    public boolean isCancelled() {
        return mo9820F_().isCancelled();
    }

    public boolean isDone() {
        return mo9820F_().isDone();
    }
}
