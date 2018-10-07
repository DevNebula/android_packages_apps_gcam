package p000;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* renamed from: kpi */
abstract class kpi extends AtomicReference implements Runnable {
    /* renamed from: a */
    public static final Runnable f8769a = new kpj();
    /* renamed from: b */
    public static final Runnable f8770b = new kpj();

    /* renamed from: a */
    abstract void mo10193a(Object obj, Throwable th);

    /* renamed from: a */
    abstract boolean mo10194a();

    /* renamed from: b */
    abstract Object mo10195b();

    /* renamed from: c */
    abstract String mo10196c();

    kpi() {
    }

    public final void run() {
        Thread currentThread = Thread.currentThread();
        if (compareAndSet(null, currentThread)) {
            Object b;
            int a = mo10194a() ^ 1;
            if (a != 0) {
                try {
                    b = mo10195b();
                } catch (Throwable th) {
                    if (!compareAndSet(currentThread, f8769a)) {
                        while (get() == f8770b) {
                            Thread.yield();
                        }
                    }
                    if (a != 0) {
                        mo10193a(null, th);
                        return;
                    }
                    return;
                }
            }
            b = null;
            if (!compareAndSet(currentThread, f8769a)) {
                while (get() == f8770b) {
                    Thread.yield();
                }
            }
            if (a != 0) {
                mo10193a(b, null);
            }
        }
    }

    public final String toString() {
        String str;
        Runnable runnable = (Runnable) get();
        if (runnable == f8769a) {
            str = "running=[DONE]";
        } else if (runnable == f8770b) {
            str = "running=[INTERRUPTED]";
        } else if (runnable instanceof Thread) {
            str = ((Thread) runnable).getName();
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 21);
            stringBuilder.append("running=[RUNNING ON ");
            stringBuilder.append(str);
            stringBuilder.append("]");
            str = stringBuilder.toString();
        } else {
            str = "running=[NOT STARTED YET]";
        }
        String c = mo10196c();
        StringBuilder stringBuilder2 = new StringBuilder((String.valueOf(str).length() + 2) + String.valueOf(c).length());
        stringBuilder2.append(str);
        stringBuilder2.append(", ");
        stringBuilder2.append(c);
        return stringBuilder2.toString();
    }
}
