package p000;

/* compiled from: PG */
/* renamed from: ind */
public enum ind {
    MPEG_4(2, 0, ixx.MPEG4),
    WEBM(9, 1, ixx.WEBM),
    THREE_GPP(1, -1, ixx.THREE_GPP);
    
    /* renamed from: a */
    public final int f7514a;
    /* renamed from: b */
    public final int f7515b;
    /* renamed from: c */
    public final ixx f7516c;

    private ind(int i, int i2, ixx ixx) {
        this.f7514a = i;
        this.f7515b = i2;
        this.f7516c = ixx;
    }

    /* renamed from: a */
    public static boolean m3935a(ioa ioa) {
        int e = ioa.mo8660e();
        if (e == 2 || e == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static ind m3936b(ioa ioa) {
        jri.m13395a(ind.m3935a(ioa));
        int e = ioa.mo8660e();
        switch (e) {
            case 1:
                return THREE_GPP;
            case 2:
                return MPEG_4;
            default:
                StringBuilder stringBuilder = new StringBuilder(41);
                stringBuilder.append("file format is not supported: ");
                stringBuilder.append(e);
                throw new IllegalArgumentException(stringBuilder.toString());
        }
    }
}
