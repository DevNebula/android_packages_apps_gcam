package p000;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.logging.Level;

/* compiled from: PG */
/* renamed from: koc */
abstract class koc extends koe implements Runnable {
    /* renamed from: a */
    public keh f21937a;
    /* renamed from: b */
    public final boolean f21938b;
    /* renamed from: d */
    private final boolean f21939d = true;
    /* renamed from: e */
    private final /* synthetic */ kob f21940e;

    koc(kob kob, keh keh, boolean z) {
        this.f21940e = kob;
        super(keh.size());
        this.f21937a = (keh) jri.m13404b((Object) keh);
        this.f21938b = z;
    }

    /* renamed from: a */
    abstract void mo14127a(boolean z, int i, Object obj);

    /* renamed from: b */
    abstract void mo14128b();

    /* renamed from: a */
    final void mo10179a(Set set) {
        if (!this.f21940e.isCancelled()) {
            kob.m18481a(set, ((knn) this.f21940e.value).f8744b);
        }
    }

    /* renamed from: a */
    final void mo14125a() {
        boolean z;
        int i = 0;
        int a = koe.f8756c.mo10180a(this);
        if (a >= 0) {
            z = true;
        } else {
            z = false;
        }
        jri.m13406b(z, (Object) "Less than 0 remaining futures");
        if (a == 0) {
            if ((this.f21939d & (this.f21938b ^ 1)) != 0) {
                Iterator c = this.f21937a.iterator();
                while (c.hasNext()) {
                    a = i + 1;
                    mo14126a(i, (kpk) c.next());
                    i = a;
                }
            }
            mo14128b();
        }
    }

    /* renamed from: a */
    private final void m13858a(Throwable th) {
        int a;
        int i = 1;
        jri.m13404b((Object) th);
        if (this.f21938b) {
            a = this.f21940e.mo15642a(th);
            if (a != 0) {
                mo14129d();
            } else {
                Set set = this.seenExceptions;
                if (set == null) {
                    set = Collections.newSetFromMap(new ConcurrentHashMap());
                    mo10179a(set);
                    koe.f8756c.mo10181a(this, set);
                    set = this.seenExceptions;
                }
                i = kob.m18481a(set, th);
            }
        } else {
            a = 0;
        }
        boolean z = th instanceof Error;
        if (((((a ^ 1) & this.f21938b) & i) | z) != 0) {
            String str;
            if (z) {
                str = "Input Future failed with Error";
            } else {
                str = "Got more than one input Future failure. Logging failures after the first";
            }
            kob.f26775e.logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFuture$RunningState", "handleException", str, th);
        }
    }

    /* renamed from: a */
    final void mo14126a(int i, Future future) {
        boolean z = false;
        if (this.f21938b) {
            z = true;
        } else if (!this.f21940e.isDone()) {
            z = true;
        } else if (this.f21940e.isCancelled()) {
            z = true;
        }
        jri.m13406b(z, (Object) "Future was done before all dependencies completed");
        try {
            jri.m13406b(future.isDone(), (Object) "Tried to set value from future which is not done");
            if (this.f21938b) {
                if (future.isCancelled()) {
                    knk knk = this.f21940e;
                    knk.f26776f = null;
                    knk.cancel(false);
                    return;
                }
                Object b = kow.m13879b(future);
                if (this.f21939d) {
                    mo14127a(this.f21938b, i, b);
                }
            } else if (this.f21939d && !future.isCancelled()) {
                mo14127a(this.f21938b, i, kow.m13879b(future));
            }
        } catch (ExecutionException e) {
            m13858a(e.getCause());
        } catch (Throwable th) {
            m13858a(th);
        }
    }

    /* renamed from: c */
    static void m13859c() {
    }

    /* renamed from: d */
    void mo14129d() {
        this.f21937a = null;
    }

    public final void run() {
        mo14125a();
    }
}
