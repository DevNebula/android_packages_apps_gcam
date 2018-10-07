package p000;

import android.opengl.GLES30;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* renamed from: jdn */
final class jdn implements Callable {
    /* renamed from: a */
    private final /* synthetic */ jhs f8090a;

    jdn(jhs jhs) {
        this.f8090a = jhs;
    }

    public final /* synthetic */ Object call() {
        jhs jhs = this.f8090a;
        int[] iArr = new int[1];
        GLES30.glGenFramebuffers(1, iArr, 0);
        int i = iArr[0];
        jfh jfh = (jfh) jhs.mo15044c();
        GLES30.glBindFramebuffer(36160, i);
        GLES30.glFramebufferTexture2D(36160, 36064, ((jfb) jfh.mo15035c()).mo15578e(), ((jfb) jfh.mo15035c()).mo15038i(), 0);
        jeu jeu = (jeu) jfh.f26560a.mo15034f().mo15035c();
        return new jey(jeu.mo15571h(), jeu.mo15569f(), jeu.mo15574l(), jeu.mo15568e(), jeu.mo15567d(), i, jfh.mo15718b(), jeu, i, jhs);
    }

    public final String toString() {
        return "GLRawCanvases.createForTexture";
    }
}
