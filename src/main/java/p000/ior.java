package p000;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Log;
import android.util.Range;
import android.view.Surface;

/* compiled from: PG */
/* renamed from: ior */
public final class ior implements iqo {
    /* renamed from: a */
    public final Object f21125a;
    /* renamed from: b */
    public final MediaCodec f21126b;
    /* renamed from: c */
    public final Surface f21127c;
    /* renamed from: d */
    public final ioo f21128d;
    /* renamed from: e */
    public Thread f21129e;
    /* renamed from: f */
    public float f21130f;
    /* renamed from: g */
    public long f21131g;
    /* renamed from: h */
    public final float f21132h;
    /* renamed from: i */
    public long f21133i = Long.MAX_VALUE;
    /* renamed from: j */
    public ipk f21134j;
    /* renamed from: k */
    private final boolean f21135k;
    /* renamed from: l */
    private final ird f21136l;
    /* renamed from: m */
    private final int f21137m;
    /* renamed from: n */
    private final Range f21138n;

    public ior(inp inp, iok iok, ioo ioo, kbg kbg, ird ird) {
        inu a = inv.m12556a(inp.mo8645c());
        String str = a.f21099a;
        MediaFormat createVideoFormat = MediaFormat.createVideoFormat(str, inp.mo8649g().mo8639c().f7695a, inp.mo8649g().mo8639c().f7696b);
        createVideoFormat.setInteger("color-format", iok.f7600b);
        createVideoFormat.setInteger("bitrate", inp.mo8650h());
        createVideoFormat.setInteger("frame-rate", inp.mo8643a().f7509g);
        createVideoFormat.setInteger("i-frame-interval", 1);
        String valueOf = String.valueOf(createVideoFormat);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 33);
        stringBuilder.append("configure video encoding format: ");
        stringBuilder.append(valueOf);
        Log.i("VideoEncoder", stringBuilder.toString());
        this.f21126b = ins.m3955a(a);
        jri.m13404b(this.f21126b);
        this.f21126b.configure(createVideoFormat, null, null, 1);
        this.f21135k = kbg.mo9709b();
        if (kbg.mo9709b()) {
            Log.d("VideoEncoder", "persistent surface will be used");
            this.f21127c = (Surface) kbg.mo9706a();
            this.f21126b.setInputSurface(this.f21127c);
        } else if (iok == iok.SURFACE) {
            Log.d("VideoEncoder", "surface will be used");
            this.f21127c = this.f21126b.createInputSurface();
        } else {
            Log.d("VideoEncoder", "no surface will be used");
            this.f21127c = null;
        }
        this.f21128d = ioo;
        this.f21136l = ird;
        this.f21137m = inp.mo8650h();
        this.f21138n = this.f21126b.getCodecInfo().getCapabilitiesForType(str).getVideoCapabilities().getBitrateRange();
        this.f21125a = new Object();
        this.f21134j = ipk.READY;
        this.f21130f = 0.0f;
        this.f21131g = 0;
        this.f21132h = ((float) inp.mo8643a().f7508f) / ((float) inp.mo8643a().f7509g);
    }

    /* renamed from: a */
    public final int mo13687a(float f) {
        synchronized (this.f21125a) {
            StringBuilder stringBuilder;
            if (this.f21134j != ipk.STARTED) {
                String valueOf = String.valueOf(this.f21134j);
                stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 17);
                stringBuilder.append("illegal state as ");
                stringBuilder.append(valueOf);
                Log.e("VideoEncoder", stringBuilder.toString());
                return -1;
            }
            int intValue = ((Integer) this.f21138n.clamp(Integer.valueOf((int) (((float) this.f21137m) * f)))).intValue();
            float f2 = ((float) this.f21137m) * f;
            stringBuilder = new StringBuilder(52);
            stringBuilder.append("Request bit rate ");
            stringBuilder.append(f2);
            stringBuilder.append(" but get ");
            stringBuilder.append(intValue);
            Log.d("VideoEncoder", stringBuilder.toString());
            Bundle bundle = new Bundle();
            bundle.putInt("video-bitrate", intValue);
            this.f21126b.setParameters(bundle);
            return intValue;
        }
    }

    public final void close() {
        mo13688a(SystemClock.uptimeMillis() * 1000);
    }

    /* renamed from: a */
    private final boolean m12576a() {
        synchronized (this.f21125a) {
            if (this.f21134j != ipk.STARTED) {
                throw new IllegalStateException("encoding is not yet started.");
            }
        }
        if (this.f21127c != null) {
            String valueOf = String.valueOf(iok.SURFACE);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 64);
            stringBuilder.append("As ");
            stringBuilder.append(valueOf);
            stringBuilder.append("is used as color format, you are not allowed to add data here");
            throw new IllegalStateException(stringBuilder.toString());
        }
        int dequeueInputBuffer = this.f21126b.dequeueInputBuffer(10000);
        if (dequeueInputBuffer < 0) {
            return false;
        }
        this.f21126b.getInputBuffer(dequeueInputBuffer).clear();
        this.f21126b.queueInputBuffer(dequeueInputBuffer, 0, 0, 0, 4);
        return true;
    }

    /* renamed from: a */
    public final void mo13688a(long j) {
        synchronized (this.f21125a) {
            if (this.f21134j == ipk.STARTED || this.f21134j == ipk.PAUSED) {
                this.f21133i = j - ((long) this.f21130f);
                long j2 = this.f21133i;
                StringBuilder stringBuilder = new StringBuilder(39);
                stringBuilder.append("request to stop at ");
                stringBuilder.append(j2);
                Log.d("VideoEncoder", stringBuilder.toString());
                this.f21136l.mo8856a("VideoEncoder#stop");
                if (this.f21134j == ipk.PAUSED) {
                    Log.d("VideoEncoder", "firing signal of end of input stream because current state is PAUSE");
                    this.f21126b.signalEndOfInputStream();
                }
                if (this.f21127c == null) {
                    if (m12576a()) {
                        Log.d("VideoEncoder", "write a video frame with EOS signal");
                    } else {
                        Log.d("VideoEncoder", "fails to write a video frame with EOS signal");
                    }
                }
                try {
                    jri.m13404b(this.f21129e);
                    this.f21129e.join();
                    Log.d("VideoEncoder", "encoding thread stopped");
                    this.f21126b.stop();
                    Log.d("VideoEncoder", "mediaCodec resources stopped");
                    this.f21134j = ipk.STOPPED;
                    this.f21136l.mo8857b();
                } catch (Throwable e) {
                    throw new RuntimeException("Unable to stop VideoEncoder", e);
                }
            }
            if (this.f21134j != ipk.CLOSED) {
                this.f21126b.release();
                Surface surface = this.f21127c;
                if (!(surface == null || this.f21135k)) {
                    surface.release();
                }
                this.f21134j = ipk.CLOSED;
            }
        }
    }
}
