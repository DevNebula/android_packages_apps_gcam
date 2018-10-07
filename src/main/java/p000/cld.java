package p000;

import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* renamed from: cld */
final class cld implements izi {
    cld() {
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo9217a(Object obj) {
        jis jis = (jis) obj;
        Map hashMap = new HashMap();
        for (jip jip : jis.mo9471b()) {
            jiy a = jiy.m4574a(jip.f21537a);
            if (!hashMap.containsKey(a)) {
                hashMap.put(a, jip);
            }
        }
        return hashMap;
    }
}
