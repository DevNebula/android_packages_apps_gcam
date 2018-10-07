package p000;

import android.util.Log;

/* compiled from: PG */
/* renamed from: jgi */
public final class jgi extends jgj {
    /* renamed from: a */
    private final AutoCloseable f24741a;

    public jgi(jgk jgk, AutoCloseable autoCloseable) {
        super(jgk);
        this.f24741a = autoCloseable;
    }

    /* renamed from: a */
    public final void mo9408a(int i) {
        try {
            this.f24741a.close();
        } catch (Throwable e) {
            Log.w("CloseOnStopListener", "Exception while trying to close object.", e);
        }
        super.mo9408a(i);
    }
}
