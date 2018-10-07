package p000;

import android.os.Binder;
import android.os.Process;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* renamed from: gp */
final class C0253gp implements Callable {
    /* renamed from: a */
    private final /* synthetic */ C0248gk f5978a;

    C0253gp() {
    }

    C0253gp(C0248gk c0248gk) {
        this.f5978a = c0248gk;
        this();
    }

    public final Object call() {
        Throwable th;
        Object obj;
        this.f5978a.f5517g.set(true);
        try {
            Process.setThreadPriority(10);
            Object a = this.f5978a.mo7153a();
            try {
                Binder.flushPendingCommands();
                this.f5978a.mo7155b(a);
                return a;
            } catch (Throwable th2) {
                Object obj2 = a;
                th = th2;
                obj = obj2;
                try {
                    this.f5978a.f5516f.set(true);
                    throw th;
                } catch (Throwable th3) {
                    this.f5978a.mo7155b(obj);
                }
            }
        } catch (Throwable th4) {
            th = th4;
            obj = null;
        }
    }
}
