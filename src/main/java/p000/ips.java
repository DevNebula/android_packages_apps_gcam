package p000;

import android.media.MediaRecorder;
import android.media.MediaRecorder.OnErrorListener;
import android.media.MediaRecorder.OnInfoListener;
import android.util.Log;
import android.view.Surface;
import java.io.File;
import java.io.FileDescriptor;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* renamed from: ips */
public final class ips implements ipy {
    /* renamed from: c */
    private static final AtomicInteger f21200c = new AtomicInteger(0);
    /* renamed from: a */
    private final MediaRecorder f21201a;
    /* renamed from: b */
    private boolean f21202b = false;
    /* renamed from: d */
    private final int f21203d;

    public ips(MediaRecorder mediaRecorder) {
        this.f21201a = mediaRecorder;
        this.f21203d = f21200c.getAndIncrement();
        int i = this.f21203d;
        StringBuilder stringBuilder = new StringBuilder(20);
        stringBuilder.append(i);
        stringBuilder.append(" created.");
        Log.d("AMedRec", stringBuilder.toString());
    }

    /* renamed from: a */
    public final MediaRecorder mo8717a() {
        return this.f21201a;
    }

    /* renamed from: b */
    public final synchronized Surface mo8729b() {
        return !this.f21202b ? this.f21201a.getSurface() : null;
    }

    /* renamed from: c */
    public final synchronized void mo8731c() {
        if (!this.f21202b) {
            try {
                this.f21201a.pause();
            } catch (Throwable e) {
                throw new ipu(e);
            }
        }
    }

    /* renamed from: d */
    public final synchronized void mo8733d() {
        if (!this.f21202b) {
            try {
                this.f21201a.prepare();
            } catch (Throwable e) {
                throw new ipu(e);
            }
        }
    }

    /* renamed from: e */
    public final synchronized void mo8735e() {
        if (!this.f21202b) {
            this.f21201a.release();
            this.f21202b = true;
            int i = this.f21203d;
            StringBuilder stringBuilder = new StringBuilder(20);
            stringBuilder.append(i);
            stringBuilder.append(" released");
            Log.d("AMedRec", stringBuilder.toString());
        }
    }

    /* renamed from: f */
    public final synchronized void mo8737f() {
        if (!this.f21202b) {
            this.f21201a.reset();
        }
    }

    /* renamed from: g */
    public final synchronized void mo8739g() {
        if (!this.f21202b) {
            try {
                this.f21201a.resume();
            } catch (Throwable e) {
                throw new ipu(e);
            }
        }
    }

    /* renamed from: a */
    public final synchronized void mo8720a(int i) {
        if (!this.f21202b) {
            this.f21201a.setAudioChannels(i);
        }
    }

    /* renamed from: b */
    public final synchronized void mo8730b(int i) {
        if (!this.f21202b) {
            this.f21201a.setAudioEncoder(i);
        }
    }

    /* renamed from: c */
    public final synchronized void mo8732c(int i) {
        if (!this.f21202b) {
            this.f21201a.setAudioEncodingBitRate(i);
        }
    }

    /* renamed from: d */
    public final synchronized void mo8734d(int i) {
        if (!this.f21202b) {
            this.f21201a.setAudioSamplingRate(i);
        }
    }

    /* renamed from: e */
    public final synchronized void mo8736e(int i) {
        if (!this.f21202b) {
            this.f21201a.setAudioSource(i);
        }
    }

    /* renamed from: a */
    public final synchronized void mo8718a(double d) {
        if (!this.f21202b) {
            this.f21201a.setCaptureRate(d);
        }
    }

    /* renamed from: a */
    public final synchronized void mo8725a(Surface surface) {
        if (!this.f21202b) {
            this.f21201a.setInputSurface(surface);
        }
    }

    /* renamed from: a */
    public final synchronized void mo8719a(float f, float f2) {
        if (!this.f21202b) {
            this.f21201a.setLocation(f, f2);
        }
    }

    /* renamed from: f */
    public final synchronized void mo8738f(int i) {
        if (!this.f21202b) {
            this.f21201a.setMaxDuration(i);
        }
    }

    /* renamed from: a */
    public final synchronized void mo8722a(long j) {
        if (!this.f21202b) {
            this.f21201a.setMaxFileSize(j);
        }
    }

    /* renamed from: a */
    public final synchronized void mo8726a(File file) {
        if (!this.f21202b) {
            try {
                this.f21201a.setNextOutputFile(file);
            } catch (Throwable e) {
                throw new ipu(e);
            }
        }
    }

    /* renamed from: a */
    public final synchronized void mo8723a(OnErrorListener onErrorListener) {
        if (!this.f21202b) {
            this.f21201a.setOnErrorListener(onErrorListener);
        }
    }

    /* renamed from: a */
    public final synchronized void mo8724a(OnInfoListener onInfoListener) {
        if (!this.f21202b) {
            this.f21201a.setOnInfoListener(onInfoListener);
        }
    }

    /* renamed from: g */
    public final synchronized void mo8740g(int i) {
        if (!this.f21202b) {
            this.f21201a.setOrientationHint(i);
        }
    }

    /* renamed from: a */
    public final synchronized void mo8727a(FileDescriptor fileDescriptor) {
        if (!this.f21202b) {
            this.f21201a.setOutputFile(fileDescriptor);
        }
    }

    /* renamed from: a */
    public final synchronized void mo8728a(String str) {
        if (!this.f21202b) {
            this.f21201a.setOutputFile(str);
        }
    }

    /* renamed from: h */
    public final synchronized void mo8742h(int i) {
        if (!this.f21202b) {
            this.f21201a.setOutputFormat(i);
        }
    }

    /* renamed from: i */
    public final synchronized void mo8744i(int i) {
        if (!this.f21202b) {
            this.f21201a.setVideoEncoder(i);
        }
    }

    /* renamed from: j */
    public final synchronized void mo8745j(int i) {
        if (!this.f21202b) {
            this.f21201a.setVideoEncodingBitRate(i);
        }
    }

    /* renamed from: k */
    public final synchronized void mo8746k(int i) {
        if (!this.f21202b) {
            this.f21201a.setVideoFrameRate(i);
        }
    }

    /* renamed from: a */
    public final synchronized void mo8721a(int i, int i2) {
        if (!this.f21202b) {
            this.f21201a.setVideoSize(i, i2);
        }
    }

    /* renamed from: l */
    public final synchronized void mo8747l(int i) {
        if (!this.f21202b) {
            this.f21201a.setVideoSource(i);
        }
    }

    /* renamed from: h */
    public final synchronized void mo8741h() {
        if (!this.f21202b) {
            try {
                this.f21201a.start();
            } catch (Throwable e) {
                throw new ipu(e);
            }
        }
    }

    /* renamed from: i */
    public final synchronized void mo8743i() {
        if (!this.f21202b) {
            try {
                this.f21201a.stop();
            } catch (Throwable e) {
                throw new ipu(e);
            }
        }
    }
}
