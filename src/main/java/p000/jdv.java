package p000;

import android.util.Log;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: jdv */
public class jdv implements jdu {
    /* renamed from: a */
    public final jdo f26560a;
    /* renamed from: b */
    private final jaq f26561b;

    protected jdv(jdo jdo, jaq jaq) {
        this.f26560a = jdo;
        this.f26561b = jaq;
        if (this.f26560a.mo15033e() && jli.m13200b(jaq) == null) {
            Log.e("GLContextObject", "Creating non-ready GL object on GL thread. This will likely cause a deadlock.");
        }
    }

    /* renamed from: a */
    public static jaq m18019a(jdo jdo, Callable callable) {
        if (!jdo.mo15033e()) {
            return jli.m13190a((Executor) jdo, callable);
        }
        try {
            return jli.m13199b(callable.call());
        } catch (Throwable e) {
            return jli.m13191a(kow.m13874a(jar.m4449a(e)));
        }
    }

    public void close() {
        jli.m13202c(mo13767a());
    }

    /* renamed from: a */
    public final jas mo13767a() {
        return jas.m12965a(mo15564a(ion.m4002a()));
    }

    /* renamed from: c */
    public final jez mo15035c() {
        if (this.f26560a.mo15033e()) {
            return mo15565d();
        }
        throw new IllegalStateException("raw should only be called from the GLContext thread");
    }

    /* renamed from: d */
    protected final jez mo15565d() {
        if (!this.f26560a.mo15033e()) {
            return (jez) jli.m13202c(this.f26561b);
        }
        jez jez = (jez) jli.m13200b(this.f26561b);
        if (jez != null) {
            return jez;
        }
        throw new RuntimeException("Waiting for incomplete GL object while on GL thread. This deadlocks the process.");
    }

    /* renamed from: a */
    public final jaq mo15564a(izi izi) {
        return jdv.m18019a(this.f26560a, new jdw(this, izi));
    }
}
