package p000;

import android.opengl.GLES20;

/* compiled from: PG */
/* renamed from: elj */
public final class elj extends ejq {
    /* renamed from: e */
    public int f17535e;
    /* renamed from: f */
    private int f17536f;
    /* renamed from: g */
    private String f17537g;

    public elj() {
        this.f17537g = "precision mediump float;                            \nuniform float uBrightness;                          \nuniform float uAlpha;                               \nvarying vec2 vTexCoord;                             \nuniform sampler2D sTexture;                         \nvoid main()                                         \n{                                                   \n  gl_FragColor = texture2D( sTexture, vTexCoord);   \n  gl_FragColor.rgb *= uBrightness * uAlpha;         \n  gl_FragColor.a = gl_FragColor.a * uAlpha;         \n}                                                   \n";
        this.f3898d = ejq.m1851a("uniform mat4 uMvpMatrix;                   \nattribute vec4 aPosition;                   \nattribute vec2 aTextureCoord;               \nvarying vec2 vTexCoord;                     \nvoid main()                                 \n{                                           \n   gl_Position = uMvpMatrix * aPosition;    \n   vTexCoord = aTextureCoord;               \n}                                           \n", this.f17537g);
        this.f3895a = ejq.m1850a(this.f3898d, "aPosition");
        this.f3896b = ejq.m1850a(this.f3898d, "aTextureCoord");
        this.f3897c = ejq.m1852b(this.f3898d, "uMvpMatrix");
        this.f17535e = ejq.m1852b(this.f3898d, "uBrightness");
        this.f17536f = ejq.m1852b(this.f3898d, "uAlpha");
        GLES20.glUseProgram(this.f3898d);
        GLES20.glUniform1f(this.f17535e, 0.5f);
        GLES20.glUniform1f(this.f17536f, 0.5f);
    }

    /* renamed from: a */
    public final void mo13160a(float f) {
        GLES20.glUniform1f(this.f17536f, f);
    }
}
