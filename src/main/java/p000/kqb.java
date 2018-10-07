package p000;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.RunnableFuture;

/* compiled from: PG */
/* renamed from: kqb */
final class kqb extends knt implements RunnableFuture {
    /* renamed from: e */
    private volatile kpi f26780e;

    kqb(koi koi) {
        this.f26780e = new kqc(this, koi);
    }

    private kqb(Callable callable) {
        this.f26780e = new kqd(this, callable);
    }

    /* renamed from: a */
    protected final void mo15639a() {
        super.mo15639a();
        if (mo15645c()) {
            kpi kpi = this.f26780e;
            if (kpi != null) {
                Runnable runnable = (Runnable) kpi.get();
                if ((runnable instanceof Thread) && kpi.compareAndSet(runnable, kpi.f8770b)) {
                    ((Thread) runnable).interrupt();
                    kpi.set(kpi.f8769a);
                }
            }
        }
        this.f26780e = null;
    }

    /* renamed from: a */
    static kqb m18490a(Runnable runnable, Object obj) {
        return new kqb(Executors.callable(runnable, obj));
    }

    /* renamed from: a */
    static kqb m18491a(Callable callable) {
        return new kqb(callable);
    }

    /* renamed from: b */
    protected final String mo15643b() {
        kpi kpi = this.f26780e;
        if (kpi == null) {
            return super.mo15643b();
        }
        String valueOf = String.valueOf(kpi);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 7);
        stringBuilder.append("task=[");
        stringBuilder.append(valueOf);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    public final void run() {
        kpi kpi = this.f26780e;
        if (kpi != null) {
            kpi.run();
        }
        this.f26780e = null;
    }
}
