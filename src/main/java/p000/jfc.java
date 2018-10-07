package p000;

import android.opengl.GLES20;

/* compiled from: PG */
/* renamed from: jfc */
public final class jfc extends jfa {
    jfc(int i) {
        super(i);
    }

    public final void close() {
        GLES20.glDeleteProgram(this.f26563e);
    }

    /* renamed from: a */
    public final int mo15717a(String str) {
        return GLES20.glGetUniformLocation(this.f26563e, str);
    }
}
