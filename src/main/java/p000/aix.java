package p000;

import android.util.Log;
import java.io.File;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* renamed from: aix */
public final class aix implements adi {
    /* renamed from: a */
    private static boolean m6566a(ByteBuffer byteBuffer, File file) {
        try {
            arg.m648a(byteBuffer, file);
            return true;
        } catch (Throwable e) {
            if (!Log.isLoggable("ByteBufferEncoder", 3)) {
                return false;
            }
            Log.d("ByteBufferEncoder", "Failed to write data", e);
            return false;
        }
    }
}
