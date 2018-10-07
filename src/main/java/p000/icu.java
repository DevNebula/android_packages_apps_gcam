package p000;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.os.Handler;
import android.widget.ImageView;
import com.google.android.apps.refocus.image.RGBZ;
import com.google.android.apps.refocus.processing.DepthOfFieldOptions;
import com.google.android.apps.refocus.processing.FocusSettings;
import com.google.android.apps.refocus.processing.ProgressListener;
import com.google.android.apps.refocus.viewer.RGBZViewer$RenderProgress;
import com.google.android.gms.common.ConnectionResult;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

/* renamed from: icu */
public final class icu implements hsp, hsw, ied {
    /* renamed from: a */
    public boolean f20890a;
    /* renamed from: b */
    public Map f20891b;
    /* renamed from: c */
    public ConnectionResult f20892c;
    /* renamed from: d */
    public final Context f20893d;
    /* renamed from: e */
    public final bkw f20894e;
    /* renamed from: f */
    public ImageView f20895f;
    /* renamed from: g */
    public Bitmap f20896g;
    /* renamed from: h */
    public DepthOfFieldOptions f20897h;
    /* renamed from: i */
    public Bitmap f20898i;
    /* renamed from: j */
    public RGBZViewer$RenderProgress f20899j;
    /* renamed from: k */
    public hsk f20900k;
    /* renamed from: l */
    public float f20901l;
    /* renamed from: m */
    public FocusSettings f20902m;
    /* renamed from: n */
    public boolean f20903n;
    /* renamed from: o */
    public ProgressListener f20904o;
    /* renamed from: p */
    public CountDownLatch f20905p;
    /* renamed from: q */
    private final Handler f20906q;

    public icu() {
        ArrayList arrayList = new ArrayList();
    }

    /* renamed from: f */
    private final boolean m12338f() {
        boolean z = false;
        Lock lock = null;
        lock.lock();
        try {
            if (this.f20891b == null && this.f20890a) {
                z = true;
            }
            lock.unlock();
            return z;
        } catch (Throwable th) {
            lock.unlock();
        }
    }

    /* renamed from: a */
    public final ConnectionResult mo8394a() {
        mo8398b();
        while (m12338f()) {
            Condition condition = null;
            try {
                condition.await();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return new ConnectionResult(15, null);
            }
        }
        if (mo8400d()) {
            return ConnectionResult.f23348a;
        }
        ConnectionResult connectionResult = this.f20892c;
        return connectionResult == null ? new ConnectionResult(13, null) : connectionResult;
    }

    /* renamed from: a */
    public final void mo8396a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    /* JADX WARNING: Missing block: B:5:0x0014, code:
            r0 = null;
            r0.signalAll();
     */
    /* renamed from: c */
    public final void mo8399c() {
        /*
        r3 = this;
        r2 = 0;
        r2.lock();
        r0 = 0;
        r3.f20890a = r0;	 Catch:{ all -> 0x002b }
        r0 = 0;
        r3.f20891b = r0;	 Catch:{ all -> 0x002b }
        r0 = 0;
        r3.f20892c = r0;	 Catch:{ all -> 0x002b }
    L_0x000d:
        r0 = 0;
        r0 = r0.isEmpty();	 Catch:{ all -> 0x002b }
        if (r0 == 0) goto L_0x001c;
    L_0x0014:
        r0 = 0;
        r0.signalAll();	 Catch:{ all -> 0x002b }
        r2.unlock();
        return;
    L_0x001c:
        r0 = 0;
        r0 = r0.remove();	 Catch:{ all -> 0x002b }
        r0 = (p000.ich) r0;	 Catch:{ all -> 0x002b }
        r1 = 0;
        r0.mo13622a(r1);	 Catch:{ all -> 0x002b }
        r0.mo13620a();	 Catch:{ all -> 0x002b }
        goto L_0x000d;
    L_0x002b:
        r0 = move-exception;
        r2.unlock();
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: icu.c():void");
    }

    /* renamed from: d */
    public final boolean mo8400d() {
        boolean z = false;
        Lock lock = null;
        lock.lock();
        try {
            if (this.f20891b != null && this.f20892c == null) {
                z = true;
            }
            lock.unlock();
            return z;
        } catch (Throwable th) {
            lock.unlock();
        }
    }

    public icu(Context context, Handler handler, bkw bkw) {
        this.f20893d = context;
        this.f20906q = handler;
        this.f20894e = bkw;
    }

    /* renamed from: b */
    public final void mo8398b() {
        Lock lock = null;
        lock.lock();
        try {
            if (this.f20890a) {
                lock.unlock();
                return;
            }
            ifv ifv;
            this.f20890a = true;
            this.f20891b = null;
            this.f20892c = null;
            idv idv = null;
            idv.mo8385b();
            Map map = null;
            Iterable<hva> values = map.values();
            ice ice = new ice(values);
            for (hva hva : values) {
                ief ief = (ief) null.f7318g.get(hva.f7067b);
                if (ief != null) {
                    if (!ief.mo14993b()) {
                    }
                }
                Handler handler = null.f7319h;
                handler.sendMessage(handler.obtainMessage(2, ice));
                ifv = ice.f7293b.f7356a;
            }
            ice.f7293b.mo8431a();
            ifv = ice.f7293b.f7356a;
            ifv.mo8428a(new hzz(null), new icv(this));
        } finally {
            lock.unlock();
        }
    }

    /* renamed from: B_ */
    public final float mo8091B_() {
        m12339g();
        return this.f20901l / 0.016f;
    }

    /* renamed from: C_ */
    public final float[] mo8092C_() {
        m12339g();
        Bitmap bitmap = this.f20896g;
        if (bitmap == null) {
            return null;
        }
        DepthOfFieldOptions depthOfFieldOptions = this.f20897h;
        if (depthOfFieldOptions != null) {
            RGBZ rgbz = depthOfFieldOptions.rgbz;
            if (rgbz != null) {
                FocusSettings focusSettings = this.f20902m;
                if (focusSettings != null) {
                    float width = focusSettings.focalPointX * ((float) rgbz.getWidth());
                    float height = this.f20902m.focalPointY * ((float) this.f20897h.rgbz.getHeight());
                    RGBZ rgbz2 = this.f20897h.rgbz;
                    return m12337a((width * ((float) this.f20896g.getWidth())) / ((float) rgbz2.getWidth()), (height * ((float) this.f20896g.getHeight())) / ((float) rgbz2.getHeight()));
                }
            }
        }
        return m12337a(((float) bitmap.getWidth()) * 0.5f, ((float) this.f20896g.getHeight()) * 0.5f);
    }

    /* renamed from: a */
    private final float[] m12337a(float f, float f2) {
        float[] fArr = new float[]{f, f2};
        new Matrix(this.f20895f.getImageMatrix()).mapPoints(fArr);
        return fArr;
    }

    /* renamed from: a */
    public final void mo8093a(float f) {
        float f2 = 0.016f * f;
        hsk hsk = this.f20900k;
        if (hsk != null) {
            this.f20901l = f2;
            FocusSettings focusSettings = this.f20902m;
            focusSettings.blurAtInfinity = hsk.mo8087a(focusSettings.focalDistance, focusSettings.depthOfField, this.f20901l);
            mo13629e();
        }
    }

    /* renamed from: a */
    public final void mo8094a(int i, int i2) {
        float f = (float) i;
        float f2 = (float) i2;
        m12339g();
        DepthOfFieldOptions depthOfFieldOptions = this.f20897h;
        if (depthOfFieldOptions != null) {
            RGBZ rgbz = depthOfFieldOptions.rgbz;
            if (rgbz != null && rgbz.hasDepthmap() && this.f20896g != null) {
                rgbz = this.f20897h.rgbz;
                Matrix matrix = new Matrix();
                this.f20895f.getImageMatrix().invert(matrix);
                matrix.postScale(((float) rgbz.getWidth()) / ((float) this.f20896g.getWidth()), ((float) rgbz.getHeight()) / ((float) this.f20896g.getHeight()));
                float[] fArr = new float[]{f, f2};
                matrix.mapPoints(fArr);
                RGBZ rgbz2 = this.f20897h.rgbz;
                f2 = fArr[0];
                if (f2 >= 0.0f && f2 < ((float) rgbz2.getWidth())) {
                    f2 = fArr[1];
                    if (f2 >= 0.0f && f2 < ((float) rgbz2.getHeight())) {
                        this.f20902m.focalDistance = rgbz2.getDepth((int) fArr[0], (int) fArr[1]);
                        this.f20902m.focalPointX = fArr[0] / ((float) rgbz2.getWidth());
                        this.f20902m.focalPointY = fArr[1] / ((float) rgbz2.getHeight());
                        FocusSettings focusSettings = this.f20902m;
                        focusSettings.blurAtInfinity = this.f20900k.mo8087a(focusSettings.focalDistance, focusSettings.depthOfField, this.f20901l);
                        mo13629e();
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo8103a(Bitmap bitmap) {
        if (bitmap != null) {
            mo13628b(bitmap);
        }
        this.f20904o.onDone();
    }

    /* renamed from: e */
    public final void mo13629e() {
        DepthOfFieldOptions depthOfFieldOptions = this.f20897h;
        if (depthOfFieldOptions != null && depthOfFieldOptions.rgbz != null) {
            this.f20903n = true;
            RGBZViewer$RenderProgress rGBZViewer$RenderProgress = this.f20899j;
            if (rGBZViewer$RenderProgress != null) {
                rGBZViewer$RenderProgress.cancel();
            }
            depthOfFieldOptions = this.f20897h;
            FocusSettings focusSettings = this.f20902m;
            depthOfFieldOptions.focalDepth = focusSettings.focalDistance;
            depthOfFieldOptions.blurInfinity = focusSettings.blurAtInfinity * ((float) Math.max(depthOfFieldOptions.rgbz.getWidth(), this.f20897h.rgbz.getHeight()));
            this.f20897h.depthOfField = this.f20902m.depthOfField;
            this.f20899j = new RGBZViewer$RenderProgress(this, null);
            this.f20906q.removeCallbacks(null);
            this.f20906q.post(new hsu(this.f20893d, this.f20897h, this, this.f20899j, this.f20898i));
        }
    }

    /* renamed from: b */
    public final void mo13628b(Bitmap bitmap) {
        this.f20896g = bitmap;
        ImageView imageView = this.f20895f;
        if (imageView != null) {
            imageView.setImageBitmap(this.f20896g);
        }
    }

    /* renamed from: g */
    private final void m12339g() {
        try {
            this.f20905p.await();
        } catch (InterruptedException e) {
        }
    }

    /* renamed from: a */
    public final ich mo8395a(ich ich) {
        Queue queue = null;
        if (mo8400d()) {
            queue.f20963g.mo8293a(ich);
            return ((ict) queue.get(ich.f24595e)).mo8160a(0, ich);
        }
        queue.add(ich);
        return ich;
    }

    /* renamed from: b */
    public final ich mo8397b(ich ich) {
        Object obj = null;
        hum hum = ich.f24595e;
        obj.f20963g.mo8293a(ich);
        return ((ict) obj.get(hum)).mo8160a(1, ich);
    }
}
