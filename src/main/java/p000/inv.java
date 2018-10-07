package p000;

/* compiled from: PG */
/* renamed from: inv */
public enum inv implements inu {
    H263("video/3gpp"),
    H264("video/avc"),
    MPEG_4_SP("video/mp4v-es"),
    HEVC("video/hevc");
    
    /* renamed from: a */
    public final String f21099a;

    private inv(String str) {
        this.f21099a = str;
    }

    /* renamed from: a */
    public final String mo8652a() {
        return this.f21099a;
    }

    /* renamed from: a */
    public static inv m12556a(int i) {
        switch (i) {
            case 1:
                return H263;
            case 2:
                return H264;
            case 3:
                return MPEG_4_SP;
            case 5:
                return HEVC;
            default:
                StringBuilder stringBuilder = new StringBuilder(41);
                stringBuilder.append("Unsupported video codec type: ");
                stringBuilder.append(i);
                throw new IllegalArgumentException(stringBuilder.toString());
        }
    }
}
