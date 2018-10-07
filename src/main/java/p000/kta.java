package p000;

import java.util.Iterator;
import java.util.Map.Entry;

/* compiled from: PG */
/* renamed from: kta */
final class kta {
    kta() {
    }

    /* renamed from: a */
    public static ksy m5224a() {
        throw new NoSuchMethodError();
    }

    /* renamed from: a */
    public static int m5222a(Object obj) {
        ksz ksz = (ksz) obj;
        if (!ksz.isEmpty()) {
            Iterator it = ksz.entrySet().iterator();
            if (it.hasNext()) {
                Entry entry = (Entry) it.next();
                entry.getKey();
                entry.getValue();
                throw new NoSuchMethodError();
            }
        }
        return 0;
    }

    /* renamed from: a */
    public static Object m5223a(Object obj, Object obj2) {
        obj = (ksz) obj;
        ksz ksz = (ksz) obj2;
        if (!ksz.isEmpty()) {
            if (!obj.f8905a) {
                obj = obj.mo10299b();
            }
            obj.mo10298a();
            if (!ksz.isEmpty()) {
                obj.putAll(ksz);
            }
        }
        return obj;
    }
}
