package p000;

import android.media.MediaCodec.BufferInfo;
import android.media.MediaFormat;
import android.util.Log;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* renamed from: eur */
final class eur implements jhf {
    /* renamed from: a */
    private final jhf f17842a;
    /* renamed from: b */
    private final AtomicInteger f17843b;
    /* renamed from: c */
    private final AtomicBoolean f17844c;
    /* renamed from: d */
    private final /* synthetic */ eup f17845d;

    public eur(eup eup, jhf jhf, AtomicInteger atomicInteger, AtomicBoolean atomicBoolean) {
        this.f17845d = eup;
        this.f17842a = jhf;
        this.f17843b = atomicInteger;
        this.f17844c = atomicBoolean;
    }

    public final void close() {
        this.f17844c.set(true);
        try {
            this.f17842a.close();
            if (this.f17845d.mo13189c() == 0) {
                int i;
                eup eup = this.f17845d;
                ArrayList arrayList = new ArrayList();
                synchronized (eup.f17841c) {
                    i = -1;
                    for (euq euq : eup.f17840b) {
                        String string = ((MediaFormat) kow.m13879b(euq.f4484c)).getString("mime");
                        if (string.startsWith("video/")) {
                            arrayList.add(Integer.valueOf(euq.f4482a.get()));
                        } else if (string.equals("application/microvideo-meta-stream")) {
                            i = euq.f4482a.get();
                        }
                    }
                    eup.f17840b.clear();
                }
                if (i != -1) {
                    Object obj;
                    int size = arrayList.size();
                    int i2 = 0;
                    while (i2 < size) {
                        obj = arrayList.get(i2);
                        i2++;
                        if (Math.abs(((Integer) obj).intValue() - i) < 5) {
                            return;
                        }
                    }
                    StringBuilder stringBuilder = new StringBuilder();
                    int size2 = arrayList.size();
                    i2 = 0;
                    while (i2 < size2) {
                        obj = arrayList.get(i2);
                        i2++;
                        stringBuilder.append(((Integer) obj).intValue());
                        stringBuilder.append(",");
                    }
                    throw new RuntimeException(String.format("Number of motion and video frames substantially differ (video=%s motion=%d).", new Object[]{stringBuilder, Integer.valueOf(i)}));
                }
            }
        } catch (Throwable th) {
            Log.w("SanitizerMux", "Error occurred while closing", th);
            this.f17845d.f17839a.mo9416b().cancel(false);
        }
    }

    /* renamed from: a */
    public final void mo9430a(ByteBuffer byteBuffer, BufferInfo bufferInfo) {
        try {
            this.f17842a.mo9430a(byteBuffer, bufferInfo);
            this.f17843b.incrementAndGet();
        } catch (Throwable th) {
            Log.w("SanitizerMux", "Error occurred while writing", th);
            this.f17845d.f17839a.mo9416b().cancel(false);
        }
    }
}
