package p000;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* compiled from: PG */
/* renamed from: kni */
public abstract class kni extends knt implements Runnable {
    /* renamed from: e */
    private kpk f26770e;
    /* renamed from: f */
    private Class f26771f;
    /* renamed from: g */
    private Object f26772g;

    kni(kpk kpk, Class cls, Object obj) {
        this.f26770e = (kpk) jri.m13404b((Object) kpk);
        this.f26771f = (Class) jri.m13404b((Object) cls);
        this.f26772g = jri.m13404b(obj);
    }

    /* renamed from: a */
    abstract Object mo15748a(Object obj, Throwable th);

    /* renamed from: b */
    abstract void mo15749b(Object obj);

    /* renamed from: a */
    protected final void mo15639a() {
        mo15640a(this.f26770e);
        this.f26770e = null;
        this.f26771f = null;
        this.f26772g = null;
    }

    /* renamed from: a */
    public static kpk m18470a(kpk kpk, Class cls, kaw kaw, Executor executor) {
        knk knj = new knj(kpk, cls, kaw);
        kpk.mo10200a(knj, khx.m4999a(executor, knj));
        return knj;
    }

    /* renamed from: b */
    protected final String mo15643b() {
        kpk kpk = this.f26770e;
        Class cls = this.f26771f;
        Object obj = this.f26772g;
        String b = super.mo15643b();
        String str = "";
        if (kpk != null) {
            str = String.valueOf(kpk);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 16);
            stringBuilder.append("inputFuture=[");
            stringBuilder.append(str);
            stringBuilder.append("], ");
            str = stringBuilder.toString();
        }
        String valueOf;
        if (cls != null && obj != null) {
            valueOf = String.valueOf(cls);
            String valueOf2 = String.valueOf(obj);
            StringBuilder stringBuilder2 = new StringBuilder(((String.valueOf(str).length() + 29) + String.valueOf(valueOf).length()) + String.valueOf(valueOf2).length());
            stringBuilder2.append(str);
            stringBuilder2.append("exceptionType=[");
            stringBuilder2.append(valueOf);
            stringBuilder2.append("], fallback=[");
            stringBuilder2.append(valueOf2);
            stringBuilder2.append("]");
            return stringBuilder2.toString();
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
        int i2;
        int i3 = 1;
        Future future = this.f26770e;
        Class cls = this.f26771f;
        Object obj = this.f26772g;
        if (future == null) {
            i = 1;
        } else {
            i = 0;
        }
        if (cls == null) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        i2 |= i;
        if (obj != null) {
            i3 = 0;
        }
        if (((i3 | i2) | isCancelled()) == 0) {
            Object b;
            Throwable th;
            this.f26770e = null;
            try {
                b = kow.m13879b(future);
                th = null;
            } catch (ExecutionException e) {
                th = (Throwable) jri.m13404b(e.getCause());
                b = null;
            } catch (Throwable th2) {
                th = th2;
                b = null;
            }
            if (th == null) {
                mo15641a(b);
            } else if (cls.isInstance(th)) {
                Object a;
                try {
                    a = mo15748a(obj, th);
                    mo15749b(a);
                } catch (Throwable th3) {
                    a = th3;
                    mo15642a((Throwable) a);
                } finally {
                    this.f26771f = null;
                    this.f26772g = null;
                }
            } else {
                mo15642a(th);
            }
        }
    }
}
