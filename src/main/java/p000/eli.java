package p000;

import android.opengl.GLES20;

/* compiled from: PG */
/* renamed from: eli */
public final class eli extends ejq {
    /* renamed from: e */
    private int f17533e;
    /* renamed from: f */
    private String f17534f;

    public eli() {
        this.f17533e = 0;
        this.f17534f = "precision mediump float;                            \nuniform float uAlphaFactor;                         \nvarying vec2 vTexCoord;                             \nuniform sampler2D sTexture;                         \nvoid main()                                         \n{                                                   \n  gl_FragColor = texture2D( sTexture, vTexCoord);   \n  gl_FragColor.a = gl_FragColor.a * uAlphaFactor;   \n}                                                   \n";
        this.f3898d = ejq.m1851a("uniform mat4 uMvpMatrix;                   \nattribute vec4 aPosition;                   \nattribute vec2 aTextureCoord;               \nvarying vec2 vTexCoord;                     \nvoid main()                                 \n{                                           \n   gl_Position = uMvpMatrix * aPosition;    \n   vTexCoord = aTextureCoord;               \n}                                           \n", this.f17534f);
        this.f3895a = ejq.m1850a(this.f3898d, "aPosition");
        this.f3896b = ejq.m1850a(this.f3898d, "aTextureCoord");
        this.f3897c = ejq.m1852b(this.f3898d, "uMvpMatrix");
        this.f17533e = ejq.m1852b(this.f3898d, "uAlphaFactor");
        GLES20.glUseProgram(this.f3898d);
        GLES20.glUniform1f(this.f17533e, 1.0f);
    }

    /* renamed from: a */
    public final void mo13159a(float f) {
        GLES20.glUniform1f(this.f17533e, f);
    }
}
