package p000;

import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES30;

/* compiled from: PG */
/* renamed from: jey */
final class jey extends jem {
    /* renamed from: e */
    private final /* synthetic */ jeu f26764e;
    /* renamed from: f */
    private final /* synthetic */ int f26765f = 0;
    /* renamed from: g */
    private final /* synthetic */ int f26766g;
    /* renamed from: h */
    private final /* synthetic */ jhs f26767h;

    jey(jfj jfj, EGLDisplay eGLDisplay, EGLSurface eGLSurface, EGLContext eGLContext, EGLConfig eGLConfig, int i, jdc jdc, jeu jeu, int i2, jhs jhs) {
        this.f26764e = jeu;
        this.f26766g = i2;
        this.f26767h = jhs;
        super(jfj, eGLDisplay, eGLSurface, eGLContext, eGLConfig, i, jdc);
    }

    /* renamed from: c */
    public final jas mo15028c() {
        try {
            this.f26764e.mo15570g();
            GLES30.glDeleteRenderbuffers(1, new int[]{0}, 0);
            GLES30.glDeleteFramebuffers(1, new int[]{this.f26766g}, 0);
            return this.f26767h.mo13767a();
        } catch (Throwable th) {
            return jas.m12965a(this.f26767h.mo13767a().mo9275a(kpq.f8776a, ion.m4017b(th)));
        }
    }
}
