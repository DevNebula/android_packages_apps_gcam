package p000;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

/* compiled from: PG */
/* renamed from: jwr */
public final class jwr implements jwp {
    /* renamed from: a */
    private final Map f21785a;

    public jwr(Map map) {
        this.f21785a = Collections.unmodifiableMap(new HashMap(map));
    }

    /* renamed from: a */
    public final float mo9581a(jky jky, jky jky2) {
        Iterator it = this.f21785a.entrySet().iterator();
        float f = 0.0f;
        while (true) {
            float f2 = f;
            if (!it.hasNext()) {
                return f2;
            }
            Entry entry = (Entry) it.next();
            f = (((jwp) entry.getKey()).mo9581a(jky, jky2) * ((Float) entry.getValue()).floatValue()) + f2;
        }
    }
}
