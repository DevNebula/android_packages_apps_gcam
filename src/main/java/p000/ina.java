package p000;

/* compiled from: PG */
/* renamed from: ina */
public enum ina {
    ENCODING_PCM_8BIT(3, 1),
    ENCODING_PCM_16BIT(2, 2),
    ENCODING_IEC61937(13, 2),
    ENCODING_DEFAULT(1, 2),
    ENCODING_PCM_FLOAT(4, 4);
    
    /* renamed from: a */
    public final int f7494a;
    /* renamed from: b */
    public final int f7495b;

    private ina(int i, int i2) {
        this.f7494a = i;
        this.f7495b = i2;
    }
}
