package p000;

import android.media.MediaCodec;
import android.media.MediaCodec.Callback;
import android.media.MediaFormat;
import android.os.Handler;
import android.util.Log;
import android.view.Surface;
import java.util.Deque;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* renamed from: jfw */
public final class jfw {
    /* renamed from: a */
    public final MediaCodec f8147a;
    /* renamed from: b */
    public final AtomicInteger f8148b = new AtomicInteger(3);
    /* renamed from: c */
    public final Surface f8149c;
    /* renamed from: d */
    public final Surface f8150d;
    /* renamed from: e */
    public final Deque f8151e = new ConcurrentLinkedDeque();
    /* renamed from: f */
    public final kpw f8152f;
    /* renamed from: g */
    public final AtomicBoolean f8153g;
    /* renamed from: h */
    public final AtomicBoolean f8154h;
    /* renamed from: i */
    public final AtomicBoolean f8155i = new AtomicBoolean(false);
    /* renamed from: j */
    public final AtomicBoolean f8156j;
    /* renamed from: k */
    public volatile jhm f8157k = jhm.f8204a;
    /* renamed from: l */
    public volatile jgk f8158l = jgk.f8175b;
    /* renamed from: m */
    private final boolean f8159m;
    /* renamed from: n */
    private final jft f8160n;

    public jfw(MediaCodec mediaCodec, MediaFormat mediaFormat, kaw kaw, boolean z, Handler handler) {
        Surface surface = null;
        this.f8147a = mediaCodec;
        this.f8159m = z;
        this.f8149c = null;
        this.f8152f = kpw.m18486d();
        this.f8154h = new AtomicBoolean(false);
        this.f8153g = new AtomicBoolean(false);
        this.f8156j = new AtomicBoolean(false);
        this.f8160n = new jft(this);
        Callback callback = this.f8160n;
        if (handler == null) {
            mediaCodec.setCallback(callback);
        } else {
            mediaCodec.setCallback(callback, handler);
        }
        try {
            mediaCodec.configure(mediaFormat, null, null, mediaCodec.getCodecInfo().isEncoder());
            if (kaw != null) {
                surface = (Surface) kaw.mo9689a(mediaCodec);
            }
            this.f8150d = surface;
        } catch (Throwable e) {
            String valueOf = String.valueOf(e.getDiagnosticInfo());
            String str = "Error while configuring codec: ";
            if (valueOf.length() == 0) {
                valueOf = new String(str);
            } else {
                valueOf = str.concat(valueOf);
            }
            Log.w("AsynchMediaCodec", valueOf, e);
            throw e;
        }
    }

    /* renamed from: a */
    public final int mo9390a() {
        synchronized (this) {
            if (this.f8151e.isEmpty()) {
                return -1;
            }
            int intValue = ((Integer) this.f8151e.removeFirst()).intValue();
            return intValue;
        }
    }

    /* renamed from: b */
    public final void mo9392b() {
        if (this.f8156j.getAndSet(false)) {
            this.f8147a.stop();
        }
        if (!this.f8152f.isDone()) {
            this.f8147a.release();
            Surface surface = this.f8150d;
            if (surface != null && this.f8159m) {
                surface.release();
            }
            this.f8152f.mo15641a(Boolean.valueOf(true));
        }
    }

    /* renamed from: a */
    public final void mo9391a(int i) {
        this.f8148b.set(2);
        if (this.f8150d == null) {
            this.f8147a.queueInputBuffer(i, 0, 0, 0, 4);
        } else {
            this.f8147a.signalEndOfInputStream();
        }
    }
}
