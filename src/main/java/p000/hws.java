package p000;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;

/* renamed from: hws */
public final class hws {
    /* renamed from: a */
    private static Object f7150a = new Object();
    /* renamed from: b */
    private static boolean f7151b;
    /* renamed from: c */
    private static int f7152c;

    /* renamed from: a */
    public static int m3623a(Context context) {
        synchronized (f7150a) {
            if (f7151b) {
            } else {
                f7151b = true;
                try {
                    Bundle bundle = iad.f7237a.mo8300a(context).mo8298a(context.getPackageName(), 128).metaData;
                    if (bundle != null) {
                        bundle.getString("com.google.app.id");
                        f7152c = bundle.getInt("com.google.android.gms.version");
                    }
                } catch (Throwable e) {
                    Log.wtf("MetadataValueReader", "This should never happen.", e);
                }
            }
        }
        return f7152c;
    }
}
