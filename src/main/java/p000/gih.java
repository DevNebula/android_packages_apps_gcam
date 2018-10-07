package p000;

import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* renamed from: gih */
public enum gih {
    INACTIVE(0),
    PASSIVE_SCAN(1),
    PASSIVE_FOCUSED(2),
    ACTIVE_SCAN(3),
    FOCUSED_LOCKED(4),
    NOT_FOCUSED_LOCKED(5),
    PASSIVE_UNFOCUSED(6);
    
    /* renamed from: h */
    public static final Map f5479h = null;
    /* renamed from: i */
    public final int f5481i;

    static {
        f5479h = new HashMap();
        gih[] values = gih.values();
        int length = values.length;
        int i;
        while (i < length) {
            gih gih = values[i];
            f5479h.put(Integer.valueOf(gih.f5481i), gih);
            i++;
        }
    }

    private gih(int i) {
        this.f5481i = i;
    }
}
