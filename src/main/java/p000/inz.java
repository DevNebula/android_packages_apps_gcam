package p000;

import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* renamed from: inz */
public enum inz {
    QUALITY_480P(2002, ine.RES_480P),
    QUALITY_720P(2003, ine.RES_720P),
    QUALITY_1080P(2004, ine.RES_1080P),
    QUALITY_2160P(2005, ine.RES_2160P);
    
    /* renamed from: f */
    private static final Map f7552f = null;
    /* renamed from: g */
    private static final Map f7553g = null;
    /* renamed from: a */
    public final int f7555a;
    /* renamed from: h */
    private final ine f7556h;

    static {
        f7552f = new HashMap();
        f7553g = new HashMap();
        inz[] values = inz.values();
        int length = values.length;
        int i;
        while (i < length) {
            inz inz = values[i];
            f7552f.put(inz.f7556h, inz);
            f7553g.put(Integer.valueOf(inz.f7555a), inz);
            i++;
        }
    }

    private inz(int i, ine ine) {
        this.f7555a = i;
        this.f7556h = ine;
    }

    /* renamed from: a */
    public static inz m3960a(ine ine) {
        return (inz) f7552f.get(ine);
    }
}
