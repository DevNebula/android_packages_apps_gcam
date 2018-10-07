package p000;

import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* renamed from: iob */
public enum iob {
    QUALITY_QCIF(2, ine.RES_QCIF),
    QUALITY_QVGA(7, ine.RES_QVGA),
    QUALITY_CIF(3, ine.RES_CIF),
    QUALITY_480P(4, ine.RES_480P),
    QUALITY_720P(5, ine.RES_720P),
    QUALITY_1080P(6, ine.RES_1080P),
    QUALITY_2160P(8, ine.RES_2160P);
    
    /* renamed from: j */
    private static final Map f7571j = null;
    /* renamed from: k */
    private static final Map f7572k = null;
    /* renamed from: a */
    public final int f7574a;
    /* renamed from: b */
    public final ine f7575b;

    static {
        f7571j = new HashMap();
        f7572k = new HashMap();
        iob[] values = iob.values();
        int length = values.length;
        int i;
        while (i < length) {
            iob iob = values[i];
            f7571j.put(iob.f7575b, iob);
            f7572k.put(Integer.valueOf(iob.f7574a), iob);
            i++;
        }
    }

    private iob(int i, ine ine) {
        this.f7574a = i;
        this.f7575b = ine;
    }

    /* renamed from: a */
    public static iob m3976a(ine ine) {
        return (iob) f7571j.get(ine);
    }
}
