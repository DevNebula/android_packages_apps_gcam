package p000;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* renamed from: iga */
public final class iga extends ifv {
    /* renamed from: a */
    public final Object f20992a = new Object();
    /* renamed from: b */
    public final ifz f20993b = new ifz();
    /* renamed from: c */
    public boolean f20994c;
    /* renamed from: d */
    public Exception f20995d;

    iga() {
    }

    /* renamed from: a */
    public final ifv mo8428a(Executor executor, ifu ifu) {
        ifz ifz = this.f20993b;
        ify ify = new ify(executor, ifu);
        synchronized (ifz.f7362a) {
            if (ifz.f7363b == null) {
                ifz.f7363b = new ArrayDeque();
            }
            ifz.f7363b.add(ify);
        }
        synchronized (this.f20992a) {
            if (this.f20994c) {
                this.f20993b.mo8434a(this);
            }
        }
        return this;
    }

    /* renamed from: a */
    public final Exception mo8429a() {
        Exception exception;
        synchronized (this.f20992a) {
            exception = this.f20995d;
        }
        return exception;
    }

    /* renamed from: a */
    public final boolean mo13650a(Exception exception) {
        htl.m3489b((Object) exception, (Object) "Exception must not be null");
        synchronized (this.f20992a) {
            if (this.f20994c) {
                return false;
            }
            this.f20994c = true;
            this.f20995d = exception;
            this.f20993b.mo8434a(this);
            return true;
        }
    }

    /* renamed from: b */
    public final boolean mo8430b() {
        boolean z = false;
        synchronized (this.f20992a) {
            if (this.f20994c && this.f20995d == null) {
                z = true;
            }
        }
        return z;
    }

    /* renamed from: c */
    public final void mo13651c() {
        htl.m3479a(this.f20994c ^ 1, (Object) "Task is already complete");
    }
}
