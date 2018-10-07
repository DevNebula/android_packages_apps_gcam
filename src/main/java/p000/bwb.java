package p000;

import android.graphics.SurfaceTexture;
import android.os.Handler;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import javax.microedition.khronos.opengles.GL10;

/* compiled from: PG */
/* renamed from: bwb */
public final class bwb {
    /* renamed from: a */
    public static final String f1667a = bli.m887a("SurfTexRenderer");
    /* renamed from: m */
    private static final int[] f1668m = new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 0, 12325, 0, 12326, 0, 12344};
    /* renamed from: b */
    public EGLConfig f1669b;
    /* renamed from: c */
    public EGLDisplay f1670c;
    /* renamed from: d */
    public EGLContext f1671d;
    /* renamed from: e */
    public EGLSurface f1672e;
    /* renamed from: f */
    public EGL10 f1673f;
    /* renamed from: g */
    public GL10 f1674g;
    /* renamed from: h */
    public volatile boolean f1675h = false;
    /* renamed from: i */
    public final Handler f1676i;
    /* renamed from: j */
    public final bwg f1677j;
    /* renamed from: k */
    public final Object f1678k = new Object();
    /* renamed from: l */
    public final Runnable f1679l = new bwc(this);

    public bwb(SurfaceTexture surfaceTexture, Handler handler, bwg bwg) {
        this.f1676i = handler;
        this.f1677j = bwg;
        this.f1676i.post(new bwe(this, surfaceTexture));
        Object obj = new Object();
        synchronized (obj) {
            this.f1676i.post(new bwf(obj));
            try {
                obj.wait();
            } catch (InterruptedException e) {
                bli.m896d(f1667a, "waitDone() interrupted");
            }
        }
        return;
    }

    /* renamed from: a */
    static EGLConfig m1043a(EGL10 egl10, EGLDisplay eGLDisplay) {
        int[] iArr = new int[1];
        if (egl10.eglChooseConfig(eGLDisplay, f1668m, null, 0, iArr)) {
            int i = iArr[0];
            if (i <= 0) {
                throw new IllegalArgumentException("No configs match configSpec");
            }
            EGLConfig[] eGLConfigArr = new EGLConfig[i];
            if (egl10.eglChooseConfig(eGLDisplay, f1668m, eGLConfigArr, i, iArr)) {
                return eGLConfigArr[0];
            }
            throw new IllegalArgumentException("eglChooseConfig#2 failed");
        }
        throw new IllegalArgumentException("eglChooseConfig failed");
    }
}
