package p000;

import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* renamed from: imz */
public enum imz {
    AAC(3, inb.AAC),
    AAC_ELD(5, inb.AAC),
    HE_AAC(4, inb.AAC),
    AMR_NB(1, inb.AMR_NB),
    AMR_WB(2, inb.AMR_WB),
    VORBIS(6, inb.VORBIS);
    
    /* renamed from: i */
    private static final Map f7479i = null;
    /* renamed from: a */
    public final int f7481a;
    /* renamed from: b */
    public final inb f7482b;

    static {
        f7479i = new HashMap();
        imz[] values = imz.values();
        int length = values.length;
        int i;
        while (i < length) {
            imz imz = values[i];
            f7479i.put(Integer.valueOf(imz.f7481a), imz);
            i++;
        }
    }

    private imz(int i, inb inb) {
        this.f7481a = i;
        this.f7482b = inb;
    }

    /* renamed from: a */
    public static imz m3920a(int i) {
        imz imz = (imz) f7479i.get(Integer.valueOf(i));
        if (imz != null) {
            return imz;
        }
        StringBuilder stringBuilder = new StringBuilder(43);
        stringBuilder.append("unknown CamcorderProfile value: ");
        stringBuilder.append(i);
        throw new IllegalArgumentException(stringBuilder.toString());
    }
}
