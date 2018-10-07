package p000;

import android.graphics.SurfaceTexture;
import com.google.android.libraries.smartburst.filterfw.RenderTarget;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import javax.microedition.khronos.opengles.GL10;

/* compiled from: PG */
/* renamed from: bwe */
final class bwe implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ SurfaceTexture f1682a;
    /* renamed from: b */
    private final /* synthetic */ bwb f1683b;

    bwe(bwb bwb, SurfaceTexture surfaceTexture) {
        this.f1683b = bwb;
        this.f1682a = surfaceTexture;
    }

    public final void run() {
        this.f1683b.f1673f = (EGL10) EGLContext.getEGL();
        bwb bwb = this.f1683b;
        bwb.f1670c = bwb.f1673f.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
        if (this.f1683b.f1670c == EGL10.EGL_NO_DISPLAY) {
            throw new RuntimeException("eglGetDisplay failed");
        }
        int[] iArr = new int[2];
        bwb bwb2 = this.f1683b;
        if (bwb2.f1673f.eglInitialize(bwb2.f1670c, iArr)) {
            String str = bwb.f1667a;
            int i = iArr[0];
            int i2 = iArr[1];
            StringBuilder stringBuilder = new StringBuilder(36);
            stringBuilder.append("EGL version: ");
            stringBuilder.append(i);
            stringBuilder.append('.');
            stringBuilder.append(i2);
            bli.m896d(str, stringBuilder.toString());
            iArr = new int[]{RenderTarget.EGL_CONTEXT_CLIENT_VERSION, 2, 12344};
            bwb2 = this.f1683b;
            bwb2.f1669b = bwb.m1043a(bwb2.f1673f, bwb2.f1670c);
            bwb2 = this.f1683b;
            bwb2.f1671d = bwb2.f1673f.eglCreateContext(bwb2.f1670c, bwb2.f1669b, EGL10.EGL_NO_CONTEXT, iArr);
            EGLContext eGLContext = this.f1683b.f1671d;
            if (eGLContext == null || eGLContext == EGL10.EGL_NO_CONTEXT) {
                throw new RuntimeException("failed to createContext");
            }
            bwb = this.f1683b;
            bwb.f1672e = bwb.f1673f.eglCreateWindowSurface(bwb.f1670c, bwb.f1669b, this.f1682a, null);
            EGLSurface eGLSurface = this.f1683b.f1672e;
            if (eGLSurface == null || eGLSurface == EGL10.EGL_NO_SURFACE) {
                throw new RuntimeException("failed to createWindowSurface");
            }
            bwb = this.f1683b;
            EGL10 egl10 = bwb.f1673f;
            EGLDisplay eGLDisplay = bwb.f1670c;
            EGLSurface eGLSurface2 = bwb.f1672e;
            if (egl10.eglMakeCurrent(eGLDisplay, eGLSurface2, eGLSurface2, bwb.f1671d)) {
                bwb2 = this.f1683b;
                bwb2.f1674g = (GL10) bwb2.f1671d.getGL();
                return;
            }
            throw new RuntimeException("failed to eglMakeCurrent");
        }
        throw new RuntimeException("eglInitialize failed");
    }
}
