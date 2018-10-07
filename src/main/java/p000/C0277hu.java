package p000;

import android.os.Handler;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* renamed from: hu */
final class C0277hu implements Runnable {
    /* renamed from: a */
    public final /* synthetic */ C0280hx f7028a;
    /* renamed from: b */
    private final /* synthetic */ Callable f7029b;
    /* renamed from: c */
    private final /* synthetic */ Handler f7030c;

    C0277hu(Callable callable, Handler handler, C0280hx c0280hx) {
        this.f7029b = callable;
        this.f7030c = handler;
        this.f7028a = c0280hx;
    }

    public final void run() {
        Object call;
        try {
            call = this.f7029b.call();
        } catch (Exception e) {
            call = null;
        }
        this.f7030c.post(new C0278hv(this, call));
    }
}
