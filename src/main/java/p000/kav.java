package p000;

import java.lang.ref.WeakReference;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: PG */
/* renamed from: kav */
public final class kav {
    /* renamed from: a */
    private static final Map f8543a = new WeakHashMap();

    /* renamed from: a */
    static Map m4787a(Class cls) {
        Map map;
        synchronized (f8543a) {
            map = (Map) f8543a.get(cls);
            if (map == null) {
                Map hashMap = new HashMap();
                Iterator it = EnumSet.allOf(cls).iterator();
                while (it.hasNext()) {
                    Enum enumR = (Enum) it.next();
                    hashMap.put(enumR.name(), new WeakReference(enumR));
                }
                f8543a.put(cls, hashMap);
                map = hashMap;
            }
        }
        return map;
    }

    /* renamed from: a */
    public static kbg m4788a(Class cls, String str) {
        jri.m13404b((Object) cls);
        jri.m13404b((Object) str);
        return kbi.m4810a(cls, str);
    }
}
