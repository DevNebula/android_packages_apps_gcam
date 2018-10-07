package p000;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: knp */
final class knp {
    /* renamed from: a */
    public static final knp f8745a = new knp(null, null);
    /* renamed from: b */
    public final Runnable f8746b;
    /* renamed from: c */
    public final Executor f8747c;
    public knp next;

    knp(Runnable runnable, Executor executor) {
        this.f8746b = runnable;
        this.f8747c = executor;
    }
}
