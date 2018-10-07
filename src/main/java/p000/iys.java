package p000;

import android.util.Log;

/* compiled from: PG */
/* renamed from: iys */
final class iys implements kov {
    iys() {
    }

    /* renamed from: a */
    public final void mo10185a(Throwable th) {
    }

    /* renamed from: b_ */
    public final /* synthetic */ void mo10186b_(Object obj) {
        AutoCloseable autoCloseable = (AutoCloseable) obj;
        if (autoCloseable != null) {
            try {
                autoCloseable.close();
            } catch (Throwable e) {
                Log.e("BundleJpegCommand", "Unable to close object.", e);
            }
        }
    }
}
