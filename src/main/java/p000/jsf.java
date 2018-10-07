package p000;

import java.util.HashMap;
import java.util.List;

/* compiled from: PG */
/* renamed from: jsf */
final class jsf implements izi {
    /* renamed from: a */
    private final /* synthetic */ jsb f21705a;

    jsf(jsb jsb) {
        this.f21705a = jsb;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo9217a(Object obj) {
        Object<jsp> obj2 = (List) obj;
        jri.m13404b((Object) obj2);
        Object hashMap = new HashMap();
        for (jsp jsp : obj2) {
            int intValue;
            String b = jsp.f8312a.mo9462b();
            if (hashMap.containsKey(b)) {
                intValue = ((Integer) hashMap.get(b)).intValue();
            } else {
                intValue = 0;
            }
            hashMap.put(b, Integer.valueOf(intValue + 1));
        }
        this.f21705a.f21699d.mo13778a(hashMap);
        return obj2;
    }
}
