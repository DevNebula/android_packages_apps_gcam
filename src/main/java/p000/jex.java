package p000;

import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;

/* compiled from: PG */
/* renamed from: jex */
final class jex extends jem {
    /* renamed from: e */
    private final /* synthetic */ jeu f26762e;
    /* renamed from: f */
    private final /* synthetic */ jhs f26763f;

    jex(jfj jfj, EGLDisplay eGLDisplay, EGLSurface eGLSurface, EGLContext eGLContext, EGLConfig eGLConfig, jdc jdc, jeu jeu, jhs jhs) {
        this.f26762e = jeu;
        this.f26763f = jhs;
        super(jfj, eGLDisplay, eGLSurface, eGLContext, eGLConfig, 0, jdc);
    }

    /* renamed from: c */
    public final jas mo15028c() {
        try {
            this.f26762e.mo15570g();
            return this.f26763f.mo13767a();
        } catch (Throwable th) {
            return jas.m12965a(this.f26763f.mo13767a().mo9275a(kpq.f8776a, ion.m4017b(th)));
        }
    }
}
