package p000;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: jdx */
public class jdx {
    static {
        jdx.class.getSimpleName();
    }

    private jdx() {
    }

    /* renamed from: a */
    public static jdo m4480a(jdo jdo) {
        return new jei(jdo);
    }

    /* renamed from: a */
    private static jdo m4481a(jdp jdp, Callable callable) {
        jaq a = jli.m13190a((Executor) jdp, callable);
        try {
            jli.m13204d(a);
            jdp.f26555a.mo13778a(new jdk(jdp, a));
            return jdp;
        } catch (jar e) {
            throw new RuntimeException("Failed to create GLContext!", e.getCause());
        }
    }

    /* renamed from: a */
    public static jdo m4479a(Executor executor, jdg jdg, jfj jfj) {
        return jdx.m4481a(new jdp(executor), new jdy(jfj, jdg));
    }
}
