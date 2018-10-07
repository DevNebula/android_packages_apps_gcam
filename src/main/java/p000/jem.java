package p000;

import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES30;

/* compiled from: PG */
/* renamed from: jem */
abstract class jem extends izq implements jeu {
    /* renamed from: a */
    public final jfj f26719a;
    /* renamed from: b */
    public final EGLDisplay f26720b;
    /* renamed from: c */
    public final EGLSurface f26721c;
    /* renamed from: d */
    public final EGLContext f26722d;
    /* renamed from: e */
    private final EGLConfig f26723e;
    /* renamed from: f */
    private final int f26724f;
    /* renamed from: g */
    private final jdc f26725g;

    public jem(jfj jfj, EGLDisplay eGLDisplay, EGLSurface eGLSurface, EGLContext eGLContext, EGLConfig eGLConfig, int i, jdc jdc) {
        this.f26719a = jfj;
        this.f26720b = eGLDisplay;
        this.f26721c = eGLSurface;
        this.f26722d = eGLContext;
        this.f26723e = eGLConfig;
        this.f26724f = i;
        this.f26725g = jdc;
    }

    /* renamed from: d */
    public final EGLConfig mo15567d() {
        return this.f26723e;
    }

    /* renamed from: e */
    public final EGLContext mo15568e() {
        return this.f26722d;
    }

    /* renamed from: f */
    public final EGLDisplay mo15569f() {
        return this.f26720b;
    }

    /* renamed from: b */
    public final void mo15027b() {
        jli.m13202c(mo15028c());
    }

    /* renamed from: g */
    public final void mo15570g() {
        EGLDisplay eGLDisplay = this.f26720b;
        EGLSurface eGLSurface = this.f26721c;
        if (EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.f26722d)) {
            GLES30.glBindFramebuffer(36160, this.f26724f);
            izu izu = this.f26725g.f21429a;
            GLES30.glViewport(0, 0, izu.f7958a[0], izu.mo9245b());
        }
    }

    /* renamed from: h */
    public final jfj mo15571h() {
        return this.f26719a;
    }

    /* renamed from: i */
    public final int mo15038i() {
        return this.f26724f;
    }

    /* renamed from: j */
    public final jdc mo15572j() {
        return this.f26725g;
    }

    /* renamed from: k */
    public final void mo15573k() {
        if (this.f26724f == 0) {
            EGL14.eglSwapBuffers(this.f26720b, this.f26721c);
        }
    }

    /* renamed from: l */
    public final EGLSurface mo15574l() {
        return this.f26721c;
    }
}
