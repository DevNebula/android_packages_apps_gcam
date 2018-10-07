package p000;

import android.opengl.GLES20;

/* compiled from: PG */
/* renamed from: ejs */
public final class ejs extends ejq {
    /* renamed from: e */
    private int f17469e;
    /* renamed from: f */
    private String f17470f;

    public ejs() {
        this.f17470f = "precision mediump float;                       \nuniform vec4 uDrawColor;                       \nvoid main()                                    \n{                                              \n  gl_FragColor = uDrawColor;                   \n}                                              \n";
        this.f3898d = ejq.m1851a("uniform mat4 uMvpMatrix;                   \nattribute vec4 aPosition;                   \nvoid main()                                 \n{                                           \n   gl_Position = uMvpMatrix * aPosition;    \n   gl_PointSize = 5.5;                      \n}                                           \n", this.f17470f);
        this.f3895a = ejq.m1850a(this.f3898d, "aPosition");
        this.f3897c = ejq.m1852b(this.f3898d, "uMvpMatrix");
        this.f17469e = ejq.m1852b(this.f3898d, "uDrawColor");
    }

    /* renamed from: b */
    public final void mo13152b(float[] fArr) {
        GLES20.glUseProgram(this.f3898d);
        GLES20.glUniform4f(this.f17469e, fArr[0], fArr[1], fArr[2], fArr[3]);
    }
}
