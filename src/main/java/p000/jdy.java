package p000;

import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLUtils;
import android.util.Log;
import com.google.android.libraries.smartburst.filterfw.RenderTarget;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* renamed from: jdy */
final class jdy implements Callable {
    /* renamed from: a */
    private final jfj f8093a;
    /* renamed from: b */
    private final jdg f8094b;

    public jdy(jfj jfj, jdg jdg) {
        this.f8093a = jfj;
        this.f8094b = jdg;
    }

    public final /* synthetic */ Object call() {
        jfj jfj = this.f8093a;
        jdg jdg = this.f8094b;
        izu a = izu.m4426a(1, 1);
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        String valueOf;
        String str;
        if (eglGetDisplay == EGL14.EGL_NO_DISPLAY) {
            valueOf = String.valueOf(GLUtils.getEGLErrorString(EGL14.eglGetError()));
            str = "EGL Error: Bad display: ";
            if (valueOf.length() == 0) {
                valueOf = new String(str);
            } else {
                valueOf = str.concat(valueOf);
            }
            throw new jdh(valueOf);
        }
        int i;
        synchronized (jev.f8118a) {
            if (jev.f8118a[0] != 0 || EGL14.eglInitialize(eglGetDisplay, jev.f8118a, 0, jev.f8118a, 1)) {
            } else {
                String str2 = "EGL Error: eglInitialize failed: ";
                valueOf = String.valueOf(GLUtils.getEGLErrorString(EGL14.eglGetError()));
                if (valueOf.length() == 0) {
                    valueOf = new String(str2);
                } else {
                    valueOf = str2.concat(valueOf);
                }
                throw new jdh(valueOf);
            }
        }
        int[] iArr = new int[1];
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int a2 = jdg.f8085a.f21431c.mo9320a();
        int length = jdg.f8085a.f21430b.length;
        int[] iArr2 = new int[15];
        iArr2[0] = 12352;
        iArr2[1] = 4;
        iArr2[2] = 12324;
        iArr2[3] = a2;
        iArr2[4] = 12323;
        if (length >= 2) {
            i = a2;
        } else {
            i = 0;
        }
        iArr2[5] = i;
        iArr2[6] = 12322;
        if (length >= 3) {
            i = a2;
        } else {
            i = 0;
        }
        iArr2[7] = i;
        iArr2[8] = 12321;
        if (length < 4) {
            a2 = 0;
        }
        iArr2[9] = a2;
        iArr2[10] = 12325;
        iArr2[11] = 0;
        iArr2[12] = 12326;
        iArr2[13] = 0;
        iArr2[14] = 12344;
        if (!EGL14.eglChooseConfig(eglGetDisplay, iArr2, 0, eGLConfigArr, 0, 1, iArr, 0)) {
            throw new IllegalArgumentException("EGL Error: eglChooseConfig failed!");
        } else if (iArr[0] == 0) {
            throw new IllegalArgumentException("Could not find suitable EGLConfig!");
        } else {
            EGLConfig eGLConfig = eGLConfigArr[0];
            EGLContext eglCreateContext = EGL14.eglCreateContext(eglGetDisplay, eGLConfig, EGL14.EGL_NO_CONTEXT, new int[]{RenderTarget.EGL_CONTEXT_CLIENT_VERSION, jfj.f8126a, 12344}, 0);
            if (eglCreateContext == null || eglCreateContext == EGL14.EGL_NO_CONTEXT) {
                throw jdh.m4478a(jfj);
            }
            EGLSurface eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eglGetDisplay, eGLConfig, new int[]{12375, a.f7958a[0], 12374, a.mo9245b(), 12344}, 0);
            if (eglCreatePbufferSurface == EGL14.EGL_NO_SURFACE) {
                valueOf = String.valueOf(GLUtils.getEGLErrorString(EGL14.eglGetError()));
                str = "EGL Error: Bad surface: ";
                if (valueOf.length() == 0) {
                    valueOf = new String(str);
                } else {
                    valueOf = str.concat(valueOf);
                }
                throw new jdh(valueOf);
            }
            EGL14.eglMakeCurrent(eglGetDisplay, eglCreatePbufferSurface, eglCreatePbufferSurface, eglCreateContext);
            jem jew = new jew(jev.m4495a(), eglGetDisplay, eglCreatePbufferSurface, eglCreateContext, eGLConfig, (jdc) jcc.m4457a(jdg.f8085a, a), eglGetDisplay);
            if (jew.f26719a.compareTo(jfj) >= 0) {
                return jew;
            }
            valueOf = String.valueOf(jfj);
            str = String.valueOf(jew.f26719a);
            StringBuilder stringBuilder = new StringBuilder((String.valueOf(valueOf).length() + 17) + String.valueOf(str).length());
            stringBuilder.append("Wanted ");
            stringBuilder.append(valueOf);
            stringBuilder.append(" but got: ");
            stringBuilder.append(str);
            Log.e("GLRootCanvasCore", stringBuilder.toString());
            jew.close();
            throw jdh.m4478a(jfj);
        }
    }
}
