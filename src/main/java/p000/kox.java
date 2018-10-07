package p000;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* compiled from: PG */
/* renamed from: kox */
final class kox implements Runnable {
    /* renamed from: a */
    private final Future f8764a;
    /* renamed from: b */
    private final kov f8765b;

    kox(Future future, kov kov) {
        this.f8764a = future;
        this.f8765b = kov;
    }

    public final void run() {
        Throwable e;
        try {
            this.f8765b.mo10186b_(kow.m13879b(this.f8764a));
        } catch (ExecutionException e2) {
            this.f8765b.mo10185a(e2.getCause());
        } catch (RuntimeException e3) {
            e = e3;
            this.f8765b.mo10185a(e);
        } catch (Error e4) {
            e = e4;
            this.f8765b.mo10185a(e);
        }
    }

    public final String toString() {
        kbd b = jqk.m13350b((Object) this);
        b.mo9704a().f8551b = this.f8765b;
        return b.toString();
    }
}
