package p000;

import android.os.Handler;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: ijx */
public class ijx implements Executor {
    /* renamed from: a */
    private final Handler f7408a;

    public ijx(Handler handler) {
        this.f7408a = handler;
    }

    public void execute(Runnable runnable) {
        this.f7408a.post(runnable);
    }
}
