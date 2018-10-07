package p000;

import android.content.Context;
import android.util.Log;

/* renamed from: hwz */
final class hwz {
    /* renamed from: a */
    private static Context f7156a;

    static {
        Object obj = new Object();
    }

    /* renamed from: a */
    static synchronized void m3631a(Context context) {
        synchronized (hwz.class) {
            if (f7156a != null) {
                Log.w("GoogleCertificates", "GoogleCertificates has been initialized already");
            } else if (context != null) {
                f7156a = context.getApplicationContext();
            }
        }
    }
}
