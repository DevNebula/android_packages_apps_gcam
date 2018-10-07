package p000;

/* compiled from: PG */
/* renamed from: ejr */
public final class ejr extends ejq {
    /* renamed from: e */
    private String f17468e;

    public ejr() {
        this.f17468e = "precision mediump float;                            \nvarying vec2 vTexCoord;                             \nuniform sampler2D sTexture;                         \nvoid main()                                         \n{                                                   \n  gl_FragColor = texture2D( sTexture, vTexCoord );  \n}                                                   \n";
        this.f3898d = ejq.m1851a("uniform mat4 uMvpMatrix;                   \nattribute vec4 aPosition;                   \nattribute vec2 aTextureCoord;               \nvarying vec2 vTexCoord;                     \nvoid main()                                 \n{                                           \n   gl_Position = uMvpMatrix * aPosition;    \n   vTexCoord = aTextureCoord;               \n}                                           \n", this.f17468e);
        this.f3895a = ejq.m1850a(this.f3898d, "aPosition");
        this.f3896b = ejq.m1850a(this.f3898d, "aTextureCoord");
        this.f3897c = ejq.m1852b(this.f3898d, "uMvpMatrix");
    }
}
