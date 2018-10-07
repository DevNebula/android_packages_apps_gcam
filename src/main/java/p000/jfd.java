package p000;

import android.opengl.GLES20;

/* compiled from: PG */
/* renamed from: jfd */
public final class jfd extends jfa {
    jfd(int i, String str) {
        super(i);
        GLES20.glShaderSource(this.f26563e, str);
    }

    public final void close() {
        GLES20.glDeleteShader(this.f26563e);
    }
}
