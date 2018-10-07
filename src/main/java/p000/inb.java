package p000;

/* compiled from: PG */
/* renamed from: inb */
public enum inb {
    AAC("audio/mp4a-latm"),
    AMR_NB("audio/amr-wb"),
    AMR_WB("audio/3gpp"),
    VORBIS("audio/vorbis");
    
    /* renamed from: e */
    private final String f7501e;

    private inb(String str) {
        this.f7501e = str;
    }

    public final String toString() {
        return this.f7501e;
    }
}
