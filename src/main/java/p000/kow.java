package p000;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* compiled from: PG */
/* renamed from: kow */
public final class kow extends khx {
    /* renamed from: a */
    public static void m13878a(kpk kpk, kov kov, Executor executor) {
        jri.m13404b((Object) kov);
        kpk.mo10200a(new kox(kpk, kov), executor);
    }

    /* renamed from: a */
    public static kpk m13872a(Iterable iterable) {
        return new kol(ken.m13707a(iterable), true);
    }

    @SafeVarargs
    /* renamed from: a */
    public static kpk m13877a(kpk... kpkArr) {
        return new kol(ken.m13715b(kpkArr), true);
    }

    /* renamed from: b */
    public static Object m13879b(Future future) {
        jri.m13408b(future.isDone(), "Future was expected to be done: %s", (Object) future);
        return khx.m4996a(future);
    }

    /* renamed from: c */
    public static Object m13881c(Future future) {
        jri.m13404b((Object) future);
        try {
            return khx.m4996a(future);
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            if (cause instanceof Error) {
                throw new kon((Error) cause);
            }
            throw new kqe(cause);
        }
    }

    /* renamed from: b */
    public static kpk m13880b() {
        return new kpg();
    }

    /* renamed from: a */
    public static kpk m13874a(Throwable th) {
        jri.m13404b((Object) th);
        return new kpg(th);
    }

    /* renamed from: a */
    public static kpk m13873a(Object obj) {
        if (obj == null) {
            return kph.f26746a;
        }
        return new kph(obj);
    }

    /* renamed from: a */
    public static kpk m13876a(kpk kpk) {
        if (kpk.isDone()) {
            return kpk;
        }
        Runnable koy = new koy(kpk);
        kpk.mo10200a(koy, kpq.f8776a);
        return koy;
    }

    /* renamed from: a */
    public static kpk m13875a(koi koi, Executor executor) {
        Object kqb = new kqb(koi);
        executor.execute(kqb);
        return kqb;
    }
}
