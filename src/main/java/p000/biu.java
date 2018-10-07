package p000;

import android.media.MediaRecorder;
import android.media.MediaRecorder.OnErrorListener;

/* compiled from: PG */
/* renamed from: biu */
final class biu implements OnErrorListener {
    /* renamed from: a */
    private final /* synthetic */ bis f1224a;

    biu(bis bis) {
        this.f1224a = bis;
    }

    public final void onError(MediaRecorder mediaRecorder, int i, int i2) {
        Object obj = 1;
        String str;
        StringBuilder stringBuilder;
        if (i == 1) {
            str = bis.f22762a;
            stringBuilder = new StringBuilder(47);
            stringBuilder.append("MEDIA_RECORDER_ERROR_UNKNOWN: extra=");
            stringBuilder.append(i2);
            bli.m891b(str, stringBuilder.toString());
        } else if (i == 100) {
            str = bis.f22762a;
            stringBuilder = new StringBuilder(42);
            stringBuilder.append("MEDIA_ERROR_SERVER_DIED: extra=");
            stringBuilder.append(i2);
            bli.m891b(str, stringBuilder.toString());
        } else if (i2 == -1007) {
            String str2 = bis.f22762a;
            StringBuilder stringBuilder2 = new StringBuilder(57);
            stringBuilder2.append("MEDIA_ERROR_MALFORMED: what=");
            stringBuilder2.append(i);
            stringBuilder2.append(" extra=");
            stringBuilder2.append(i2);
            bli.m891b(str2, stringBuilder2.toString());
            obj = null;
        } else {
            str = bis.f22762a;
            stringBuilder = new StringBuilder(57);
            stringBuilder.append("MediaRecorder onError: what=");
            stringBuilder.append(i);
            stringBuilder.append(" extra=");
            stringBuilder.append(i2);
            bli.m891b(str, stringBuilder.toString());
        }
        if (obj != null) {
            this.f1224a.f22763b.mo13702b();
        }
    }
}
