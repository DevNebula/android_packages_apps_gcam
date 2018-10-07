package p000;

import android.media.MediaCodec.BufferInfo;
import android.util.Log;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.concurrent.Future;

/* renamed from: etq */
final /* synthetic */ class etq implements Runnable {
    /* renamed from: a */
    private final etp f4455a;
    /* renamed from: b */
    private final kpk f4456b;
    /* renamed from: c */
    private final jhf f4457c;

    etq(etp etp, kpk kpk, jhf jhf) {
        this.f4455a = etp;
        this.f4456b = kpk;
        this.f4457c = jhf;
    }

    public final void run() {
        etp etp = this.f4455a;
        Future future = this.f4456b;
        jhf jhf = this.f4457c;
        long j = -1;
        for (Long l : (List) kow.m13881c(future)) {
            if (l != null) {
                long longValue;
                if (j < 0 || l.longValue() < j) {
                    longValue = l.longValue();
                } else {
                    longValue = j;
                }
                j = longValue;
            }
        }
        j = Math.max(j, 0);
        etp.f17785b.mo15641a(Long.valueOf(j));
        if (etp.f17784a < j) {
            Log.e("AddMetaTrackMuxer", String.format("A shutter timestamp (%d) with value less than the starting timestamp (%d) was selected. Overwriting timestamp with starting timestamp.", new Object[]{Long.valueOf(etp.f17784a), r1}));
        }
        long max = Math.max(j, etp.f17784a);
        byte[] a = etp.m10090a(j, max, (kbg) kow.m13881c(etp.f17786c));
        BufferInfo bufferInfo = new BufferInfo();
        bufferInfo.size = a.length;
        bufferInfo.presentationTimeUs = max;
        jhf.mo9430a(ByteBuffer.wrap(a), bufferInfo);
        jhf.close();
    }
}
