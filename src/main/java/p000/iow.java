package p000;

import android.media.AudioRecord;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.SystemClock;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.Deque;

/* compiled from: PG */
/* renamed from: iow */
public final class iow implements iqo {
    /* renamed from: a */
    public final Object f21183a = new Object();
    /* renamed from: b */
    public final int f21184b;
    /* renamed from: c */
    public final AudioRecord f21185c;
    /* renamed from: d */
    public final MediaCodec f21186d;
    /* renamed from: e */
    public final ioo f21187e;
    /* renamed from: f */
    public final int f21188f;
    /* renamed from: g */
    public final Deque f21189g = new ArrayDeque();
    /* renamed from: h */
    public long f21190h = -1;
    /* renamed from: i */
    public long f21191i = Long.MAX_VALUE;
    /* renamed from: j */
    public long f21192j;
    /* renamed from: k */
    public long f21193k = 0;
    /* renamed from: l */
    public Thread f21194l;
    /* renamed from: m */
    public Thread f21195m;
    /* renamed from: n */
    public ipa f21196n;
    /* renamed from: o */
    private final ird f21197o;

    public iow(inm inm, AudioRecord audioRecord, ioo ioo, ird ird) {
        this.f21185c = audioRecord;
        this.f21188f = inm.f7532c;
        int encoding = audioRecord.getFormat().getEncoding();
        ina[] values = ina.values();
        int length = values.length;
        int i = 0;
        while (i < length) {
            ina ina = values[i];
            if (encoding != ina.f7494a) {
                i++;
            } else {
                this.f21184b = ina.f7495b * inm.f7533d;
                inu a = inq.m12554a(inm.f7530a.f7481a);
                String str = a.f21093a;
                MediaFormat mediaFormat = new MediaFormat();
                mediaFormat.setString("mime", str);
                if (a.f21093a.equals("audio/mp4a-latm")) {
                    Log.v("AudioEncoder", "Setting AAC profile");
                    mediaFormat.setInteger("aac-profile", ioj.LC.f7596b);
                }
                mediaFormat.setInteger("sample-rate", inm.f7532c);
                mediaFormat.setInteger("channel-count", inm.f7533d);
                mediaFormat.setInteger("bitrate", inm.f7531b);
                this.f21186d = ins.m3955a(a);
                jri.m13404b(this.f21186d);
                this.f21186d.configure(mediaFormat, null, null, 1);
                this.f21187e = ioo;
                this.f21197o = ird;
                this.f21196n = ipa.READY;
                return;
            }
        }
        StringBuilder stringBuilder = new StringBuilder(87);
        stringBuilder.append("Unable to find out number of bytes per sample for the provided audio format ");
        stringBuilder.append(encoding);
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public final void close() {
        mo13700a(SystemClock.uptimeMillis() * 1000);
        mo13699a();
    }

    /* renamed from: a */
    public final void mo13699a() {
        synchronized (this.f21183a) {
            if (this.f21196n != ipa.CLOSED) {
                this.f21186d.release();
                this.f21185c.release();
                this.f21196n = ipa.CLOSED;
            }
        }
    }

    /* renamed from: a */
    public final void mo13700a(long j) {
        synchronized (this.f21183a) {
            if (this.f21196n == ipa.STARTED || this.f21196n == ipa.PAUSED) {
                this.f21196n = ipa.STOPPED;
                this.f21191i = j - this.f21192j;
                long j2 = this.f21191i;
                StringBuilder stringBuilder = new StringBuilder(39);
                stringBuilder.append("request to stop at ");
                stringBuilder.append(j2);
                Log.d("AudioEncoder", stringBuilder.toString());
                this.f21197o.mo8856a("AudioEncoder#stop");
                try {
                    jri.m13404b(this.f21195m);
                    this.f21195m.join();
                    Log.d("AudioEncoder", "encoding thread stopped");
                    this.f21185c.stop();
                    Log.d("AudioEncoder", "AudioRecord stopped");
                    jri.m13404b(this.f21194l);
                    this.f21194l.join();
                    Log.d("AudioEncoder", "reading thread stopped");
                    this.f21186d.stop();
                    Log.d("AudioEncoder", "MediaCodec stopped");
                    this.f21197o.mo8857b();
                    this.f21196n = ipa.STOPPED;
                } catch (Throwable e) {
                    throw new RuntimeException("Unable to stop input thread AudioEncoder", e);
                } catch (Throwable e2) {
                    throw new RuntimeException("Unable to stop output thread AudioEncoder", e2);
                }
            }
        }
    }
}
