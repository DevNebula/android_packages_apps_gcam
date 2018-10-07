package p000;

import android.media.AudioFormat;
import android.media.AudioRecord;
import android.media.AudioTimestamp;
import android.util.Log;

/* compiled from: PG */
/* renamed from: jfp */
public final class jfp implements AutoCloseable {
    /* renamed from: a */
    private final AudioRecord f8131a;
    /* renamed from: b */
    private final AudioFormat f8132b;
    /* renamed from: c */
    private final jfq f8133c;
    /* renamed from: d */
    private final int f8134d = 1;
    /* renamed from: e */
    private final AudioTimestamp f8135e;
    /* renamed from: f */
    private long f8136f;

    public jfp(AudioRecord audioRecord) {
        this.f8131a = audioRecord;
        this.f8132b = audioRecord.getFormat();
        this.f8133c = new jfq(this.f8132b);
        this.f8135e = new AudioTimestamp();
    }

    public final synchronized void close() {
        this.f8131a.release();
    }

    /* renamed from: a */
    public final synchronized void mo9382a() {
        this.f8136f = 0;
        jfq jfq = this.f8133c;
        synchronized (jfq.f8137a) {
            jfq.f8138b = 0;
        }
        this.f8131a.startRecording();
    }

    /* renamed from: b */
    public final synchronized void mo9383b() {
        try {
            this.f8131a.stop();
        } catch (Throwable e) {
            Log.w("AudioStreamImpl", "Error while closing AudioStream.", e);
        }
        return;
    }
}
