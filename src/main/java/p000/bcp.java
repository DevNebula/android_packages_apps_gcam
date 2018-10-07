package p000;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: bcp */
public final class bcp implements bbi {
    /* renamed from: a */
    private final Object f22569a = new Object();
    /* renamed from: b */
    private final List f22570b = new ArrayList();
    /* renamed from: c */
    private boolean f22571c = false;
    /* renamed from: d */
    private iqo f22572d = null;
    /* renamed from: e */
    private Throwable f22573e;
    /* renamed from: f */
    private boolean f22574f = false;

    private bcp() {
    }

    /* renamed from: a */
    public final void mo12349a(Runnable runnable, Executor executor) {
        Object obj;
        jri.m13404b((Object) runnable);
        jri.m13404b((Object) executor);
        Runnable ijo = new ijo(runnable, executor);
        synchronized (this.f22569a) {
            if (this.f22571c) {
                obj = 1;
            } else {
                this.f22570b.add(ijo);
                obj = null;
            }
        }
        if (obj != null) {
            ijo.run();
        }
    }

    public final void close() {
        boolean z;
        iqo iqo;
        synchronized (this.f22569a) {
            z = this.f22571c;
            this.f22571c = true;
            iqo = this.f22572d;
            this.f22572d = null;
        }
        if (iqo != null) {
            iqo.close();
        }
        if (!z) {
            m15006e();
        }
    }

    /* renamed from: d */
    public static bcp m15005d() {
        return new bcp();
    }

    /* renamed from: a */
    public final Throwable mo12348a() {
        Throwable th;
        synchronized (this.f22569a) {
            th = this.f22573e;
        }
        return th;
    }

    /* renamed from: b */
    public final boolean mo12350b() {
        boolean z;
        synchronized (this.f22569a) {
            z = this.f22571c;
        }
        return z;
    }

    /* renamed from: e */
    private final void m15006e() {
        ArrayList arrayList;
        synchronized (this.f22569a) {
            arrayList = new ArrayList(this.f22570b);
            this.f22570b.clear();
        }
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            ((Runnable) arrayList.get(i)).run();
            i = i2;
        }
    }

    /* renamed from: c */
    public final iqo mo12351c() {
        iqo iqo;
        synchronized (this.f22569a) {
            if (this.f22574f) {
                throw new IllegalStateException("remove() called multiple times. A CloseableFuture should only have a single owner.");
            }
            this.f22574f = true;
            iqo = this.f22572d;
            this.f22572d = null;
        }
        return iqo;
    }

    /* renamed from: a */
    public final boolean mo14558a(iqo iqo) {
        boolean z;
        boolean z2 = true;
        jri.m13404b((Object) iqo);
        synchronized (this.f22569a) {
            z = this.f22571c;
            if (!z) {
                boolean z3;
                if (this.f22572d == null) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                jri.m13405b(z3);
                if (this.f22573e != null) {
                    z2 = false;
                }
                jri.m13405b(z2);
                this.f22572d = iqo;
                this.f22571c = true;
            }
        }
        if (z) {
            iqo.close();
        } else {
            m15006e();
        }
        return z ^ 1;
    }

    /* renamed from: a */
    public final boolean mo14559a(Throwable th) {
        boolean z;
        boolean z2 = true;
        jri.m13404b((Object) th);
        synchronized (this.f22569a) {
            z = this.f22571c;
            if (!z) {
                boolean z3;
                if (this.f22572d == null) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                jri.m13405b(z3);
                if (this.f22573e != null) {
                    z2 = false;
                }
                jri.m13405b(z2);
                this.f22573e = th;
                this.f22571c = true;
            }
        }
        if (!z) {
            m15006e();
        }
        return z ^ 1;
    }
}
