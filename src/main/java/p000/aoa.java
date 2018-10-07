package p000;

import android.util.Log;
import java.io.File;

/* compiled from: PG */
/* renamed from: aoa */
public final class aoa implements adr {
    /* renamed from: a */
    private static boolean m14930a(agn agn, File file) {
        try {
            arg.m648a(((any) agn.mo262b()).mo12284a(), file);
            return true;
        } catch (Throwable e) {
            if (!Log.isLoggable("GifEncoder", 5)) {
                return false;
            }
            Log.w("GifEncoder", "Failed to encode GIF drawable data", e);
            return false;
        }
    }

    /* renamed from: a */
    public final adh mo11619a(adp adp) {
        return adh.SOURCE;
    }
}
