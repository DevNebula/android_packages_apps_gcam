package p000;

/* compiled from: PG */
/* renamed from: inq */
public enum inq implements inu {
    AMR_NB("audio/3gpp"),
    AMR_WB("audio/amr-wb"),
    AAC("audio/mp4a-latm"),
    HE_AAC("audio/mp4a-latm"),
    AAC_ELD("audio/mp4a-latm");
    
    /* renamed from: a */
    public final String f21093a;

    private inq(String str) {
        this.f21093a = str;
    }

    /* renamed from: a */
    public final String mo8652a() {
        return this.f21093a;
    }

    /* renamed from: a */
    public static inq m12554a(int i) {
        switch (i) {
            case 1:
                return AMR_NB;
            case 2:
                return AMR_WB;
            case 3:
                return AAC;
            case 4:
                return HE_AAC;
            case 5:
                return AAC_ELD;
            default:
                StringBuilder stringBuilder = new StringBuilder(41);
                stringBuilder.append("Unsupported audio codec type: ");
                stringBuilder.append(i);
                throw new IllegalArgumentException(stringBuilder.toString());
        }
    }
}
