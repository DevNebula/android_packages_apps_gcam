package p000;

import android.util.Log;

/* compiled from: PG */
/* renamed from: ezs */
public final class ezs implements kov {
    /* renamed from: a */
    private final /* synthetic */ kpk f18075a;
    /* renamed from: b */
    private final /* synthetic */ Throwable f18076b;

    public ezs(kpk kpk, Throwable th) {
        this.f18075a = kpk;
        this.f18076b = th;
    }

    /* renamed from: a */
    public final void mo10185a(Throwable th) {
        if (!this.f18075a.isDone()) {
            Log.w("MvLogging", "Future timed out", th);
            Log.w("MvLogging", "Check done at ", this.f18076b);
        }
    }

    /* renamed from: b_ */
    public final void mo10186b_(Object obj) {
    }
}
