package p000;

import android.opengl.GLES20;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* renamed from: jes */
final class jes implements Callable {
    /* renamed from: a */
    private final /* synthetic */ jer f8117a;

    jes(jer jer) {
        this.f8117a = jer;
    }

    /* renamed from: a */
    private final jfc m4494a() {
        jfc jfc = new jfc(GLES20.glCreateProgram());
        try {
            for (jhs c : this.f8117a.f8115a) {
                GLES20.glAttachShader(jfc.f26563e, ((jfd) ((jff) c.mo15044c()).mo15035c()).f26563e);
            }
            GLES20.glLinkProgram(jfc.f26563e);
            int[] iArr = new int[1];
            GLES20.glGetProgramiv(jfc.f26563e, 35714, iArr, 0);
            if (iArr[0] == 0) {
                throw new bpm(GLES20.glGetProgramInfoLog(jfc.f26563e));
            }
            for (jhs c2 : this.f8117a.f8115a) {
                GLES20.glDetachShader(jfc.f26563e, ((jfd) ((jff) c2.mo15044c()).mo15035c()).f26563e);
            }
            this.f8117a.f8115a.close();
            return jfc;
        } catch (Exception e) {
            jfc.close();
            throw e;
        } catch (Throwable th) {
            this.f8117a.f8115a.close();
        }
    }
}
