package p000;

/* compiled from: PG */
/* renamed from: elh */
public final class elh extends ejq {
    /* renamed from: e */
    private String f17532e;

    public elh() {
        this.f17532e = "precision mediump float;                            \nvarying vec2 vTexCoord;                             \nuniform sampler2D sTexture;                         \nvoid main()                                         \n{                                                   \n  vec4 texcolor;                                    \n  texcolor = texture2D( sTexture, vTexCoord );      \n  texcolor.a = 0.85;                                \n  if (texcolor.r < .0001) texcolor.a = 0.0;         \n  gl_FragColor = texcolor;                          \n}                                                   \n";
        this.f3898d = ejq.m1851a("uniform mat4 uMvpMatrix;                   \nattribute vec4 aPosition;                   \nattribute vec2 aTextureCoord;               \nvarying vec2 vTexCoord;                     \nvoid main()                                 \n{                                           \n   gl_Position = uMvpMatrix * aPosition;    \n   vTexCoord = aTextureCoord;               \n}                                           \n", this.f17532e);
        this.f3895a = ejq.m1850a(this.f3898d, "aPosition");
        this.f3896b = ejq.m1850a(this.f3898d, "aTextureCoord");
        this.f3897c = ejq.m1852b(this.f3898d, "uMvpMatrix");
    }
}
