package p000;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import com.google.android.GoogleCamera.R;
import com.google.android.apps.refocus.processing.DepthmapTask;
import com.google.android.libraries.smartburst.filterfw.RenderTarget;

@TargetApi(19)
/* compiled from: PG */
/* renamed from: cqb */
public final class cqb {
    /* renamed from: a */
    public static final int f2754a = R.color.photo_placeholder;
    /* renamed from: e */
    private static final String f2755e = bli.m887a("GlideFlmMgr");
    /* renamed from: f */
    private static iqp f2756f;
    /* renamed from: b */
    public final iqp f2757b;
    /* renamed from: c */
    public final int f2758c;
    /* renamed from: d */
    public final int f2759d;
    /* renamed from: g */
    private final Context f2760g;

    static {
        iqp iqp = new iqp(512, 384);
    }

    public cqb(Context context, bkw bkw) {
        this.f2760g = context;
        int a = ije.m3829a(bkw.f1283a, "camera:filmstrip_tiny_bounds", 512);
        this.f2757b = new iqp(a, a);
        this.f2758c = ije.m3829a(bkw.f1283a, "camera:filmstrip_maximum_smooth_pixels", 5000000);
        this.f2759d = ije.m3829a(bkw.f1283a, "camera:filmstrip_tiny_bounds", 22500000);
    }

    /* renamed from: a */
    public final acj mo5664a() {
        return acc.m100b(this.f2760g).mo11608a();
    }

    /* renamed from: b */
    public final acj mo5666b() {
        return acc.m100b(this.f2760g).mo11609a(Drawable.class);
    }

    /* renamed from: a */
    static iqp m1445a(iqp iqp, double d, iqp iqp2) {
        int i = iqp.f7695a;
        int i2 = iqp.f7696b;
        if (((double) (i * i2)) < d && i < iqp2.f7695a && i2 < iqp2.f7696b) {
            return iqp;
        }
        double min = Math.min(Math.sqrt(d / ((double) iqp.mo8812a())), 1.0d);
        int round = (int) Math.round(((double) iqp.f7695a) * min);
        i = (int) Math.round(min * ((double) iqp.f7696b));
        i2 = iqp2.f7695a;
        if (round <= i2 && i <= iqp2.f7696b) {
            return new iqp(round, i);
        }
        double d2 = (double) iqp.f7695a;
        double d3 = ((double) i2) / d2;
        min = ((double) iqp2.f7696b) / ((double) iqp.f7696b);
        if (d3 <= min) {
            min = d3;
        }
        return new iqp(Math.min((int) Math.round(d2 * min), iqp2.f7695a), Math.min((int) Math.round(min * ((double) iqp.f7696b)), iqp2.f7696b));
    }

    /* renamed from: c */
    public static iqp m1446c() {
        if (f2756f == null) {
            Integer num;
            EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
            int[] iArr = new int[2];
            EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1);
            EGLConfig[] eGLConfigArr = new EGLConfig[1];
            int[] iArr2 = new int[1];
            EGL14.eglChooseConfig(eglGetDisplay, new int[]{12351, 12430, 12329, 0, 12352, 4, 12339, 1, 12344}, 0, eGLConfigArr, 0, 1, iArr2, 0);
            if (iArr2[0] == 0) {
                bli.m898e(f2755e, "No EGL configurations found!");
                num = null;
            } else {
                EGLConfig eGLConfig = eGLConfigArr[0];
                EGLSurface eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eglGetDisplay, eGLConfig, new int[]{12375, 64, 12374, 64, 12344}, 0);
                EGLContext eglCreateContext = EGL14.eglCreateContext(eglGetDisplay, eGLConfig, EGL14.EGL_NO_CONTEXT, new int[]{RenderTarget.EGL_CONTEXT_CLIENT_VERSION, 2, 12344}, 0);
                EGL14.eglMakeCurrent(eglGetDisplay, eglCreatePbufferSurface, eglCreatePbufferSurface, eglCreateContext);
                int[] iArr3 = new int[1];
                GLES20.glGetIntegerv(3379, iArr3, 0);
                int i = iArr3[0];
                EGL14.eglMakeCurrent(eglGetDisplay, EGL14.EGL_NO_SURFACE, EGL14.EGL_NO_SURFACE, EGL14.EGL_NO_CONTEXT);
                EGL14.eglDestroySurface(eglGetDisplay, eglCreatePbufferSurface);
                EGL14.eglDestroyContext(eglGetDisplay, eglCreateContext);
                EGL14.eglTerminate(eglGetDisplay);
                num = Integer.valueOf(i);
            }
            if (num == null) {
                f2756f = new iqp(DepthmapTask.MAX_REFERENCE_SIZE_HR_PX, DepthmapTask.MAX_REFERENCE_SIZE_HR_PX);
            } else if (num.intValue() > 4096) {
                f2756f = new iqp(4096, 4096);
            } else {
                f2756f = new iqp(num.intValue(), num.intValue());
            }
        }
        return f2756f;
    }

    /* renamed from: a */
    public final aqg mo5665a(adl adl, iqp iqp) {
        iqp a = cqb.m1445a(iqp, (double) this.f2758c, cqb.m1446c());
        return new aqg().mo1695a(adl).mo1704b(f2754a).mo1709e().mo1705b(a.f7695a, a.f7696b);
    }
}
