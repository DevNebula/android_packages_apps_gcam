package p000;

import java.util.concurrent.Callable;

/* compiled from: PG */
/* renamed from: jav */
public final class jav implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ jbj f7994a;
    /* renamed from: b */
    private final /* synthetic */ Callable f7995b;

    public jav(jbj jbj, Callable callable, jcc jcc) {
        this.f7994a = jbj;
        this.f7995b = callable;
    }

    public final void run() {
        try {
            this.f7994a.mo13778a(jri.m13404b(this.f7995b.call()));
        } catch (Throwable e) {
            this.f7994a.mo13777a(jar.m4449a(e));
        }
    }

    public final String toString() {
        return this.f7995b.toString();
    }
}
