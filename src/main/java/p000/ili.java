package p000;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: ili */
final class ili implements iqt {
    /* renamed from: a */
    private Object f21044a = null;
    /* renamed from: b */
    private final /* synthetic */ Executor f21045b;
    /* renamed from: c */
    private final /* synthetic */ iqt f21046c;

    ili(Executor executor, iqt iqt) {
        this.f21045b = executor;
        this.f21046c = iqt;
    }

    /* renamed from: a */
    public final void mo8826a(Object obj) {
        if (!kbf.m16778b(this.f21044a, obj)) {
            this.f21044a = obj;
            this.f21045b.execute(new ilj(this.f21046c, obj));
        }
    }
}
