package p000;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* compiled from: PG */
/* renamed from: jdp */
final class jdp extends izq implements jdo {
    /* renamed from: f */
    private static final Callable f26554f = new jds();
    /* renamed from: a */
    public final jbj f26555a = jbj.m13001d();
    /* renamed from: b */
    public volatile boolean f26556b = true;
    /* renamed from: c */
    private final Executor f26557c;
    /* renamed from: d */
    private final jaq f26558d;
    /* renamed from: e */
    private final HashMap f26559e = new HashMap();

    public jdp(Executor executor) {
        this.f26557c = executor;
        this.f26558d = jli.m13190a(this.f26557c, f26554f);
    }

    /* renamed from: b */
    protected final void mo15027b() {
        for (jhs close : m18013h()) {
            close.close();
        }
        ((jdk) jli.m13202c(this.f26555a)).close();
        this.f26556b = false;
        jli.m13202c(jas.m12967d());
    }

    /* renamed from: c */
    protected final jas mo15028c() {
        return jas.m12965a(jli.m13198b(m18013h(), this.f26557c, jdt.f21436a).mo9277a(this.f26557c, new jaw(this.f26555a)).mo9277a(this.f26557c, new jdr()).mo9277a(this.f26557c, new jdq(this)));
    }

    public final void execute(Runnable runnable) {
        if (this.f26556b) {
            this.f26557c.execute(runnable);
            return;
        }
        throw new RejectedExecutionException("Attempting to execute task on a GLContext that is already closed!");
    }

    /* renamed from: h */
    private final Collection m18013h() {
        Collection arrayList;
        synchronized (this.f26559e) {
            arrayList = new ArrayList(this.f26559e.values());
            this.f26559e.clear();
        }
        return arrayList;
    }

    /* renamed from: d */
    public final jfj mo15032d() {
        return ((jeu) ((jdk) jli.m13192a(this.f26555a)).mo15565d()).mo15571h();
    }

    /* renamed from: e */
    public final boolean mo15033e() {
        return jli.m13200b(this.f26558d) == Thread.currentThread();
    }

    /* renamed from: g */
    protected static jas m18012g() {
        return jas.m12967d();
    }

    /* renamed from: f */
    public final jdk mo15034f() {
        return (jdk) jli.m13192a(this.f26555a);
    }
}
