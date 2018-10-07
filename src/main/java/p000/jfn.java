package p000;

import android.opengl.EGL14;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;

/* compiled from: PG */
/* renamed from: jfn */
public final class jfn extends jhr {
    /* renamed from: a */
    private final EGLDisplay f26738a;

    public jfn(EGLDisplay eGLDisplay, EGLSurface eGLSurface) {
        super(eGLSurface);
        this.f26738a = eGLDisplay;
    }

    /* renamed from: a */
    protected final /* synthetic */ void mo15580a(Object obj) {
        EGL14.eglDestroySurface(this.f26738a, (EGLSurface) obj);
    }
}
