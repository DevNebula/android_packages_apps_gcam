package p000;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* renamed from: knk */
public class knk extends koq {
    /* renamed from: a */
    public static final boolean f26595a = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
    /* renamed from: b */
    public static final Logger f26596b = Logger.getLogger(knk.class.getName());
    /* renamed from: c */
    public static final knl f26597c;
    /* renamed from: d */
    public static final Object f26598d = new Object();
    public volatile knp listeners;
    public volatile Object value;
    public volatile knw waiters;

    static {
        knl knu;
        Throwable th;
        Throwable th2 = null;
        try {
            knu = new knu();
            th = null;
        } catch (Throwable th3) {
            th2 = th3;
            th = th;
            knu = new kns();
        }
        f26597c = knu;
        if (th2 != null) {
            f26596b.logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "UnsafeAtomicHelper is broken!", th);
            f26596b.logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "SafeAtomicHelper is broken!", th2);
        }
    }

    /* renamed from: a */
    private final void m18167a(StringBuilder stringBuilder) {
        try {
            Object b = kow.m13879b(this);
            stringBuilder.append("SUCCESS, result=[");
            stringBuilder.append(m18172c(b));
            stringBuilder.append("]");
        } catch (ExecutionException e) {
            stringBuilder.append("FAILURE, cause=[");
            stringBuilder.append(e.getCause());
            stringBuilder.append("]");
        } catch (CancellationException e2) {
            stringBuilder.append("CANCELLED");
        } catch (RuntimeException e3) {
            stringBuilder.append("UNKNOWN, cause=[");
            stringBuilder.append(e3.getClass());
            stringBuilder.append(" thrown from get()]");
        }
    }

    /* renamed from: a */
    public final void mo10200a(Runnable runnable, Executor executor) {
        jri.m13391a((Object) runnable, (Object) "Runnable was null.");
        jri.m13391a((Object) executor, (Object) "Executor was null.");
        knp knp = this.listeners;
        if (knp != knp.f8745a) {
            knp knp2 = new knp(runnable, executor);
            do {
                knp2.next = knp;
                if (!f26597c.mo10172a(this, knp, knp2)) {
                    knp = this.listeners;
                } else {
                    return;
                }
            } while (knp != knp.f8745a);
        }
        knk.m18171b(runnable, executor);
    }

    /* renamed from: a */
    protected void mo15639a() {
    }

    public boolean cancel(boolean z) {
        int i;
        Object obj = this.value;
        if (obj == null) {
            i = 1;
        } else {
            i = 0;
        }
        if ((i | (obj instanceof knr)) == 0) {
            return false;
        }
        Object knm;
        knm knm2;
        if (f26595a) {
            knm2 = new knm(z, new CancellationException("Future.cancel() was called."));
        } else if (z) {
            knm2 = knm.f8739a;
        } else {
            knm2 = knm.f8740b;
        }
        Object obj2 = obj;
        boolean z2 = false;
        while (true) {
            if (f26597c.mo10171a(this, obj2, knm2)) {
                knk.m18168a(this);
                if (!(obj2 instanceof knr)) {
                    return true;
                }
                kpk kpk = ((knr) obj2).f8749b;
                if (kpk instanceof knt) {
                    int i2;
                    knk knk = (knk) kpk;
                    Object obj3 = knk.value;
                    if (obj3 == null) {
                        i2 = 1;
                    } else {
                        i2 = 0;
                    }
                    if ((i2 | (obj3 instanceof knr)) == 0) {
                        return true;
                    }
                    this = knk;
                    z2 = true;
                    obj2 = obj3;
                } else {
                    kpk.cancel(z);
                    return true;
                }
            }
            obj2 = this.value;
            if (!(obj2 instanceof knr)) {
                return z2;
            }
        }
    }

    /* renamed from: a */
    static void m18168a(knk knk) {
        Thread thread = null;
        while (true) {
            knw knw = knk.waiters;
            if (f26597c.mo10173a(knk, knw, knw.f8750a)) {
                knp knp;
                knp knp2;
                while (knw != null) {
                    Thread thread2 = knw.thread;
                    if (thread2 != null) {
                        knw.thread = null;
                        LockSupport.unpark(thread2);
                    }
                    knw = knw.next;
                }
                knk.mo15639a();
                do {
                    knp = knk.listeners;
                } while (!f26597c.mo10172a(knk, knp, knp.f8745a));
                Thread thread3 = thread;
                knp knp3 = knp;
                knp = thread3;
                while (knp3 != null) {
                    knp2 = knp3.next;
                    knp3.next = knp;
                    knp = knp3;
                    knp3 = knp2;
                }
                knp2 = knp;
                while (knp2 != null) {
                    knp = knp2.next;
                    Runnable runnable = knp2.f8746b;
                    if (runnable instanceof knr) {
                        Object obj = (knr) runnable;
                        knk = obj.f8748a;
                        if (knk.value == obj) {
                            if (f26597c.mo10171a(knk, obj, knk.m18166a(obj.f8749b))) {
                                thread = knp;
                            } else {
                                knp2 = knp;
                            }
                        } else {
                            knp2 = knp;
                        }
                    } else {
                        knk.m18171b(runnable, knp2.f8747c);
                        knp2 = knp;
                    }
                }
                return;
            }
        }
    }

    /* renamed from: b */
    private static void m18171b(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (Throwable e) {
            Logger logger = f26596b;
            Level level = Level.SEVERE;
            String valueOf = String.valueOf(runnable);
            String valueOf2 = String.valueOf(executor);
            StringBuilder stringBuilder = new StringBuilder((String.valueOf(valueOf).length() + 57) + String.valueOf(valueOf2).length());
            stringBuilder.append("RuntimeException while executing runnable ");
            stringBuilder.append(valueOf);
            stringBuilder.append(" with executor ");
            stringBuilder.append(valueOf2);
            logger.logp(level, "com.google.common.util.concurrent.AbstractFuture", "executeListener", stringBuilder.toString(), e);
        }
    }

    public Object get() {
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        int i;
        Object obj = this.value;
        if (obj != null) {
            i = 1;
        } else {
            i = 0;
        }
        if ((i & ((obj instanceof knr) ^ 1)) != 0) {
            return knk.mo15749b(obj);
        }
        knw knw = this.waiters;
        if (knw != knw.f8750a) {
            knw knw2 = new knw();
            do {
                knw2.mo10177a(knw);
                if (f26597c.mo10173a(this, knw, knw2)) {
                    Object obj2;
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            m18169a(knw2);
                            throw new InterruptedException();
                        }
                        obj2 = this.value;
                        if (obj2 != null) {
                            i = 1;
                        } else {
                            i = 0;
                        }
                    } while ((i & ((obj2 instanceof knr) ^ 1)) == 0);
                    return knk.mo15749b(obj2);
                }
                knw = this.waiters;
            } while (knw != knw.f8750a);
        }
        return knk.mo15749b(this.value);
    }

    public Object get(long j, TimeUnit timeUnit) {
        long toNanos = timeUnit.toNanos(j);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        int i;
        Object obj = this.value;
        if (obj != null) {
            i = 1;
        } else {
            i = 0;
        }
        if ((i & ((obj instanceof knr) ^ 1)) != 0) {
            return knk.mo15749b(obj);
        }
        long nanoTime;
        long j2;
        if (toNanos > 0) {
            nanoTime = System.nanoTime() + toNanos;
        } else {
            nanoTime = 0;
        }
        if (toNanos >= 1000) {
            knw knw = this.waiters;
            if (knw != knw.f8750a) {
                knw knw2 = new knw();
                do {
                    knw2.mo10177a(knw);
                    if (f26597c.mo10173a(this, knw, knw2)) {
                        j2 = toNanos;
                        do {
                            LockSupport.parkNanos(this, j2);
                            if (Thread.interrupted()) {
                                m18169a(knw2);
                                throw new InterruptedException();
                            }
                            obj = this.value;
                            if (obj != null) {
                                i = 1;
                            } else {
                                i = 0;
                            }
                            if ((i & ((obj instanceof knr) ^ 1)) != 0) {
                                return knk.mo15749b(obj);
                            }
                            j2 = nanoTime - System.nanoTime();
                        } while (j2 >= 1000);
                        m18169a(knw2);
                    } else {
                        knw = this.waiters;
                    }
                } while (knw != knw.f8750a);
            }
            return knk.mo15749b(this.value);
        }
        j2 = toNanos;
        while (j2 > 0) {
            obj = this.value;
            if (obj != null) {
                i = 1;
            } else {
                i = 0;
            }
            if ((i & ((obj instanceof knr) ^ 1)) != 0) {
                return knk.mo15749b(obj);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            j2 = nanoTime - System.nanoTime();
        }
        String knk = toString();
        if (isDone()) {
            String a = jqk.m13334a(timeUnit.toString());
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(a).length() + 68);
            stringBuilder.append("Waited ");
            stringBuilder.append(j);
            stringBuilder.append(" ");
            stringBuilder.append(a);
            stringBuilder.append(" but future completed as timeout expired");
            throw new TimeoutException(stringBuilder.toString());
        }
        String a2 = jqk.m13334a(timeUnit.toString());
        StringBuilder stringBuilder2 = new StringBuilder((String.valueOf(a2).length() + 33) + String.valueOf(knk).length());
        stringBuilder2.append("Waited ");
        stringBuilder2.append(j);
        stringBuilder2.append(" ");
        stringBuilder2.append(a2);
        stringBuilder2.append(" for ");
        stringBuilder2.append(knk);
        throw new TimeoutException(stringBuilder2.toString());
    }

    /* renamed from: b */
    private static Object mo15749b(Object obj) {
        if (obj instanceof knm) {
            Throwable th = ((knm) obj).f8742d;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        } else if (obj instanceof knn) {
            throw new ExecutionException(((knn) obj).f8744b);
        } else if (obj == f26598d) {
            return null;
        } else {
            return obj;
        }
    }

    /* renamed from: a */
    static Object m18166a(kpk kpk) {
        Throwable th;
        if (kpk instanceof knt) {
            Object obj = ((knk) kpk).value;
            if (!(obj instanceof knm)) {
                return obj;
            }
            knm knm = (knm) obj;
            if (!knm.f8741c) {
                return obj;
            }
            th = knm.f8742d;
            if (th != null) {
                return new knm(false, th);
            }
            return knm.f8740b;
        }
        Object b;
        try {
            b = kow.m13879b(kpk);
            if (b == null) {
                b = f26598d;
            }
        } catch (ExecutionException e) {
            b = new knn(e.getCause());
        } catch (Throwable th2) {
            b = new knm(false, th2);
        } catch (Throwable th22) {
            b = new knn(th22);
        }
        return b;
    }

    public boolean isCancelled() {
        return this.value instanceof knm;
    }

    public boolean isDone() {
        Object obj = this.value;
        return (obj != null ? 1 : 0) & ((obj instanceof knr) ^ 1);
    }

    /* renamed from: a */
    final void mo15640a(Future future) {
        int i;
        if (future != null) {
            i = 1;
        } else {
            i = 0;
        }
        if ((i & isCancelled()) != 0) {
            future.cancel(mo15645c());
        }
    }

    /* renamed from: b */
    protected String mo15643b() {
        Object obj = this.value;
        StringBuilder stringBuilder;
        if (obj instanceof knr) {
            String c = m18172c(((knr) obj).f8749b);
            stringBuilder = new StringBuilder(String.valueOf(c).length() + 12);
            stringBuilder.append("setFuture=[");
            stringBuilder.append(c);
            stringBuilder.append("]");
            return stringBuilder.toString();
        } else if (!(this instanceof ScheduledFuture)) {
            return null;
        } else {
            long delay = ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS);
            stringBuilder = new StringBuilder(41);
            stringBuilder.append("remaining delay=[");
            stringBuilder.append(delay);
            stringBuilder.append(" ms]");
            return stringBuilder.toString();
        }
    }

    /* renamed from: a */
    private final void m18169a(knw knw) {
        knw.thread = null;
        while (true) {
            knw knw2 = this.waiters;
            if (knw2 != knw.f8750a) {
                knw knw3 = null;
                while (knw2 != null) {
                    knw knw4 = knw2.next;
                    if (knw2.thread != null) {
                        knw3 = knw2;
                    } else if (knw3 != null) {
                        knw3.next = knw4;
                        if (knw3.thread != null) {
                        }
                    } else if (f26597c.mo10173a(this, knw2, knw4)) {
                    }
                    knw2 = knw4;
                }
                return;
            }
            return;
        }
    }

    /* renamed from: a */
    public boolean mo15641a(Object obj) {
        if (obj == null) {
            obj = f26598d;
        }
        if (!f26597c.mo10171a(this, null, obj)) {
            return false;
        }
        knk.m18168a(this);
        return true;
    }

    /* renamed from: a */
    public final boolean mo15642a(Throwable th) {
        if (!f26597c.mo10171a(this, null, new knn((Throwable) jri.m13404b((Object) th)))) {
            return false;
        }
        knk.m18168a(this);
        return true;
    }

    /* renamed from: b */
    protected boolean mo15644b(kpk kpk) {
        Object knr;
        jri.m13404b((Object) kpk);
        Object obj = this.value;
        if (obj == null) {
            if (kpk.isDone()) {
                if (!f26597c.mo10171a(this, null, knk.m18166a(kpk))) {
                    return false;
                }
                knk.m18168a(this);
                return true;
            }
            knr = new knr(this, kpk);
            if (f26597c.mo10171a(this, null, knr)) {
                try {
                    kpk.mo10200a(knr, kpq.f8776a);
                } catch (Throwable th) {
                    obj = knn.f8743a;
                }
                return true;
            }
            obj = this.value;
        }
        if (obj instanceof knm) {
            kpk.cancel(((knm) obj).f8741c);
        }
        return false;
        f26597c.mo10171a(this, knr, obj);
        return true;
    }

    public String toString() {
        String b;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.toString());
        stringBuilder.append("[status=");
        if (isCancelled()) {
            stringBuilder.append("CANCELLED");
        } else if (isDone()) {
            m18167a(stringBuilder);
        } else {
            try {
                b = mo15643b();
            } catch (RuntimeException e) {
                b = String.valueOf(e.getClass());
                StringBuilder stringBuilder2 = new StringBuilder(String.valueOf(b).length() + 38);
                stringBuilder2.append("Exception thrown from implementation: ");
                stringBuilder2.append(b);
                b = stringBuilder2.toString();
            }
            if (!kbi.m4811a(b)) {
                stringBuilder.append("PENDING, info=[");
                stringBuilder.append(b);
                stringBuilder.append("]");
            } else if (isDone()) {
                m18167a(stringBuilder);
            } else {
                stringBuilder.append("PENDING");
            }
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    /* renamed from: c */
    private final String m18172c(Object obj) {
        if (obj == this) {
            return "this future";
        }
        return String.valueOf(obj);
    }

    /* renamed from: c */
    protected final boolean mo15645c() {
        Object obj = this.value;
        return (obj instanceof knm) && ((knm) obj).f8741c;
    }
}
