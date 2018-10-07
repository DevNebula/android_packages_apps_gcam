package p000;

import android.util.Log;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/* compiled from: PG */
/* renamed from: gm */
final class C0250gm extends FutureTask {
    /* renamed from: a */
    private final /* synthetic */ C0248gk f5648a;

    C0250gm(C0248gk c0248gk, Callable callable) {
        this.f5648a = c0248gk;
        super(callable);
    }

    protected final void done() {
        try {
            this.f5648a.mo7157c(get());
        } catch (Throwable e) {
            Log.w("AsyncTask", e);
        } catch (ExecutionException e2) {
            throw new RuntimeException("An error occurred while executing doInBackground()", e2.getCause());
        } catch (CancellationException e3) {
            this.f5648a.mo7157c(null);
        } catch (Throwable e4) {
            RuntimeException runtimeException = new RuntimeException("An error occurred while executing doInBackground()", e4);
        }
    }
}
