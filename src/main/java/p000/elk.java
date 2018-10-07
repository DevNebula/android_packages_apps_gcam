package p000;

import android.opengl.GLES20;

/* compiled from: PG */
/* renamed from: elk */
public final class elk extends ejq {
    /* renamed from: e */
    private int f17538e;
    /* renamed from: f */
    private String f17539f;

    public elk() {
        this.f17538e = 0;
        this.f17539f = "precision highp float;                            \nuniform float uAlphaFactor;                         \nvarying vec2 vTexCoord;                             \nuniform sampler2D sTexture;                         \nvoid main()                                         \n{                                                   \n  vec4 texcolor;                                    \n  texcolor = texture2D( sTexture, vTexCoord );      \n  texcolor.a = uAlphaFactor;                        \n  gl_FragColor = texcolor;                          \n}                                                   \n";
        this.f3898d = ejq.m1851a("uniform mat4 uMvpMatrix;                   \nattribute vec4 aPosition;                   \nattribute vec2 aTextureCoord;               \nvarying vec2 vTexCoord;                     \nvoid main()                                 \n{                                           \n   gl_Position = uMvpMatrix * aPosition;    \n   vTexCoord = aTextureCoord;               \n}                                           \n", this.f17539f);
        this.f3895a = ejq.m1850a(this.f3898d, "aPosition");
        this.f3896b = ejq.m1850a(this.f3898d, "aTextureCoord");
        this.f3897c = ejq.m1852b(this.f3898d, "uMvpMatrix");
        this.f17538e = ejq.m1852b(this.f3898d, "uAlphaFactor");
        GLES20.glUseProgram(this.f3898d);
        GLES20.glUniform1f(this.f17538e, 0.9f);
    }

    /* renamed from: a */
    public final void mo13161a(float f) {
        GLES20.glUniform1f(this.f17538e, f);
    }
}
