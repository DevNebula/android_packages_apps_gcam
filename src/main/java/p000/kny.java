package p000;

import java.lang.reflect.UndeclaredThrowableException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* compiled from: PG */
/* renamed from: kny */
public abstract class kny extends knt implements Runnable {
    /* renamed from: e */
    private kpk f26773e;
    /* renamed from: f */
    private Object f26774f;

    kny(kpk kpk, Object obj) {
        this.f26773e = (kpk) jri.m13404b((Object) kpk);
        this.f26774f = jri.m13404b(obj);
    }

    /* renamed from: a */
    abstract Object mo15751a(Object obj, Object obj2);

    /* renamed from: b */
    abstract void mo15749b(Object obj);

    /* renamed from: a */
    protected final void mo15639a() {
        mo15640a(this.f26773e);
        this.f26773e = null;
        this.f26774f = null;
    }

    /* renamed from: a */
    public static kpk m18475a(kpk kpk, kaw kaw, Executor executor) {
        jri.m13404b((Object) kaw);
        knk koa = new koa(kpk, kaw);
        kpk.mo10200a(koa, khx.m4999a(executor, koa));
        return koa;
    }

    /* renamed from: a */
    public static kpk m18476a(kpk kpk, koj koj, Executor executor) {
        jri.m13404b((Object) executor);
        knk knz = new knz(kpk, koj);
        kpk.mo10200a(knz, khx.m4999a(executor, knz));
        return knz;
    }

    /* renamed from: b */
    protected final String mo15643b() {
        StringBuilder stringBuilder;
        kpk kpk = this.f26773e;
        Object obj = this.f26774f;
        String b = super.mo15643b();
        String str = "";
        if (kpk != null) {
            str = String.valueOf(kpk);
            stringBuilder = new StringBuilder(String.valueOf(str).length() + 16);
            stringBuilder.append("inputFuture=[");
            stringBuilder.append(str);
            stringBuilder.append("], ");
            str = stringBuilder.toString();
        }
        String valueOf;
        if (obj != null) {
            valueOf = String.valueOf(obj);
            stringBuilder = new StringBuilder((String.valueOf(str).length() + 11) + String.valueOf(valueOf).length());
            stringBuilder.append(str);
            stringBuilder.append("function=[");
            stringBuilder.append(valueOf);
            stringBuilder.append("]");
            return stringBuilder.toString();
        } else if (b == null) {
            return null;
        } else {
            valueOf = String.valueOf(str);
            str = String.valueOf(b);
            return str.length() == 0 ? new String(valueOf) : valueOf.concat(str);
        }
    }

    public final void run() {
        int i;
        int i2 = 1;
        Future future = this.f26773e;
        Object obj = this.f26774f;
        boolean isCancelled = isCancelled();
        if (future == null) {
            i = 1;
        } else {
            i = 0;
        }
        i |= isCancelled;
        if (obj != null) {
            i2 = 0;
        }
        if ((i2 | i) == 0) {
            this.f26773e = null;
            try {
                Object a;
                try {
                    a = mo15751a(obj, kow.m13879b(future));
                    mo15749b(a);
                } catch (UndeclaredThrowableException e) {
                    a = e.getCause();
                    mo15642a((Throwable) a);
                } catch (Throwable th) {
                    a = th;
                    mo15642a((Throwable) a);
                } finally {
                    this.f26774f = null;
                }
            } catch (CancellationException e2) {
                cancel(false);
            } catch (ExecutionException e3) {
                mo15642a(e3.getCause());
            } catch (Throwable e4) {
                mo15642a(e4);
            } catch (Throwable e42) {
                mo15642a(e42);
            }
        }
    }
}
