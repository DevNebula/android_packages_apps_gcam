package p000;

import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* renamed from: gie */
public enum gie {
    OFF(0),
    ON(1),
    ON_AUTO_FLASH(2),
    ON_ALWAYS_FLASH(3),
    ON_AUTO_FLASH_REDEYE(4),
    CONTROL_AE_MODE_ON_EXTERNAL_FLASH(5);
    
    /* renamed from: c */
    public static final Map f5447c = null;
    /* renamed from: d */
    public final int f5453d;

    static {
        f5447c = new HashMap();
        gie[] values = gie.values();
        int length = values.length;
        int i;
        while (i < length) {
            gie gie = values[i];
            f5447c.put(Integer.valueOf(gie.f5453d), gie);
            i++;
        }
    }

    private gie(int i) {
        this.f5453d = i;
    }
}
