package p000;

import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;

/* compiled from: PG */
/* renamed from: jew */
final class jew extends jem {
    /* renamed from: e */
    private final /* synthetic */ EGLDisplay f26761e;

    jew(jfj jfj, EGLDisplay eGLDisplay, EGLSurface eGLSurface, EGLContext eGLContext, EGLConfig eGLConfig, jdc jdc, EGLDisplay eGLDisplay2) {
        this.f26761e = eGLDisplay2;
        super(jfj, eGLDisplay, eGLSurface, eGLContext, eGLConfig, 0, jdc);
    }

    /* renamed from: c */
    public final jas mo15028c() {
        EGL14.eglMakeCurrent(this.f26761e, EGL14.EGL_NO_SURFACE, EGL14.EGL_NO_SURFACE, EGL14.EGL_NO_CONTEXT);
        EGL14.eglDestroyContext(this.f26720b, this.f26722d);
        EGL14.eglDestroySurface(this.f26720b, this.f26721c);
        return jas.m12967d();
    }
}
