package p000;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: jai */
final class jai implements Runnable {
    /* renamed from: a */
    public final jbj f7970a = jbj.m13001d();
    /* renamed from: b */
    public final jah f7971b;
    /* renamed from: c */
    public final jah f7972c;
    /* renamed from: d */
    public final Executor f7973d;
    /* renamed from: e */
    public final jcc f7974e;
    /* renamed from: f */
    private final kpk f7975f;

    public jai(kpk kpk, jah jah, jah jah2, Executor executor, jcc jcc) {
        this.f7975f = kpk;
        this.f7971b = jah;
        this.f7972c = jah2;
        this.f7973d = executor;
        this.f7974e = jcc;
    }

    /* renamed from: a */
    protected final void mo9263a(Throwable th) {
        this.f7970a.mo13777a(jar.m4449a(th));
    }

    /* renamed from: b */
    private final void m4436b(Throwable th) {
        jar a = jar.m4449a(th);
        if (this.f7972c != null) {
            try {
                this.f7973d.execute(new jak(this, a));
                return;
            } catch (Throwable th2) {
                mo9263a(th2);
                return;
            }
        }
        this.f7970a.mo13777a(a);
    }

    public final void run() {
        try {
            Object a = khx.m4996a(this.f7975f);
            if (a == null) {
                mo9263a(new IllegalStateException("Result value is null"));
                return;
            }
            try {
                this.f7973d.execute(new jaj(this, a));
            } catch (Throwable th) {
                mo9263a(th);
            }
        } catch (ExecutionException e) {
            m4436b(e.getCause());
        } catch (Throwable th2) {
            m4436b(th2);
        }
    }

    public final String toString() {
        return this.f7971b.toString();
    }
}
