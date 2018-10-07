package p000;

import android.opengl.EGL14;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import java.util.Arrays;

/* compiled from: PG */
/* renamed from: jdm */
public final class jdm implements izi {
    /* renamed from: a */
    private final /* synthetic */ jhs f21433a;
    /* renamed from: b */
    private final /* synthetic */ izv f21434b;

    public jdm(jhs jhs, izv izv) {
        this.f21433a = jhs;
        this.f21434b = izv;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo9217a(Object obj) {
        jeu jeu = (jeu) obj;
        jhs jhs = this.f21433a;
        izu izu = this.f21434b;
        int[] iArr = new int[]{12344};
        EGLDisplay f = jeu.mo15569f();
        jhs jht = new jht(new jfn(f, EGL14.eglCreateWindowSurface(f, jeu.mo15567d(), jhs.mo15044c(), iArr, 0)), Arrays.asList(new ize[]{jhs}));
        return new jex(jeu.mo15571h(), jeu.mo15569f(), (EGLSurface) jht.mo15044c(), jeu.mo15568e(), jeu.mo15567d(), (jdc) jcc.m4457a(jeu.mo15572j(), izu), jeu, jht);
    }

    public final String toString() {
        return "GLRawCanvases.createForSurface";
    }
}
