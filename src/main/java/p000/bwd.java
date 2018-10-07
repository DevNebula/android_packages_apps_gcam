package p000;

import javax.microedition.khronos.egl.EGL10;

/* compiled from: PG */
/* renamed from: bwd */
public final class bwd implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ bwb f1681a;

    public bwd(bwb bwb) {
        this.f1681a = bwb;
    }

    public final void run() {
        bwb bwb = this.f1681a;
        bwb.f1673f.eglDestroySurface(bwb.f1670c, bwb.f1672e);
        bwb = this.f1681a;
        bwb.f1673f.eglDestroyContext(bwb.f1670c, bwb.f1671d);
        bwb = this.f1681a;
        bwb.f1673f.eglMakeCurrent(bwb.f1670c, EGL10.EGL_NO_SURFACE, EGL10.EGL_NO_SURFACE, EGL10.EGL_NO_CONTEXT);
        bwb = this.f1681a;
        bwb.f1673f.eglTerminate(bwb.f1670c);
        bwb = this.f1681a;
        bwb.f1672e = null;
        bwb.f1671d = null;
        bwb.f1670c = null;
    }
}
