package p000;

import android.os.SystemClock;
import android.util.Log;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* renamed from: ioz */
public final class ioz extends Thread {
    /* renamed from: a */
    private final /* synthetic */ iow f7628a;

    public ioz(iow iow, String str) {
        this.f7628a = iow;
        super(str);
    }

    public final void run() {
        Log.v("AudioEncoder", "starting");
        Object obj;
        do {
            iow iow = this.f7628a;
            if (iow.f21185c.getRecordingState() != 3) {
                Log.d("AudioEncoder", "Receive stopping signal from AudioRecord.");
                obj = 1;
                continue;
            } else {
                int dequeueInputBuffer = iow.f21186d.dequeueInputBuffer(10000);
                if (dequeueInputBuffer >= 0) {
                    int i;
                    ByteBuffer inputBuffer = iow.f21186d.getInputBuffer(dequeueInputBuffer);
                    int read = iow.f21185c.read(inputBuffer, inputBuffer.limit());
                    int i2 = read / iow.f21184b;
                    int i3 = iow.f21188f;
                    long j = ((((long) i2) * 1000000) + ((long) (i3 / 2))) / ((long) i3);
                    int obj2;
                    if (read > 0) {
                        i = 0;
                        obj2 = null;
                    } else if (read < 0) {
                        StringBuilder stringBuilder = new StringBuilder(52);
                        stringBuilder.append("Read buffer from AudioRecord with error: ");
                        stringBuilder.append(read);
                        Log.e("AudioEncoder", stringBuilder.toString());
                        i = 4;
                        obj2 = 1;
                    } else if (iow.f21185c.getRecordingState() == 3) {
                        Log.w("AudioEncoder", "Read buffer from AudioRecord, but buffer size is 0.");
                        i = 4;
                        obj2 = 1;
                    } else {
                        Log.d("AudioEncoder", "Receive stopping signal from AudioRecord.");
                        i = 4;
                        obj2 = 1;
                    }
                    if (iow.f21190h < 0) {
                        iow.f21190h = SystemClock.uptimeMillis() * 1000;
                    }
                    iow.f21186d.queueInputBuffer(dequeueInputBuffer, 0, read, iow.f21190h, i);
                    iow.f21190h += j;
                    continue;
                } else {
                    obj2 = null;
                    continue;
                }
            }
        } while (obj2 == null);
        Log.v("AudioEncoder", "stopping");
    }
}
