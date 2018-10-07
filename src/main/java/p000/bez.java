package p000;

import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* renamed from: bez */
public final class bez {
    /* renamed from: c */
    private static final String f1140c = bli.m887a("CdrCharacteristics");
    /* renamed from: a */
    public final ffc f1141a;
    /* renamed from: b */
    public final Map f1142b;

    public bez(ffc ffc, Map map) {
        this.f1141a = ffc;
        this.f1142b = map;
        for (inc inc : this.f1142b.keySet()) {
            String str = f1140c;
            String valueOf = String.valueOf(inc);
            String valueOf2 = String.valueOf(map.get(inc));
            StringBuilder stringBuilder = new StringBuilder((String.valueOf(valueOf).length() + 31) + String.valueOf(valueOf2).length());
            stringBuilder.append("checkResolutionListOrder: [");
            stringBuilder.append(valueOf);
            stringBuilder.append("] = ");
            stringBuilder.append(valueOf2);
            bli.m894c(str, stringBuilder.toString());
        }
    }

    /* renamed from: a */
    public final List mo1931a(inc inc) {
        Object obj = (List) this.f1142b.get(inc);
        jri.m13404b(obj);
        return obj;
    }

    /* renamed from: a */
    public final boolean mo1932a() {
        return this.f1141a.mo9083v();
    }

    /* renamed from: a */
    public final boolean mo1933a(inc inc, ine ine) {
        Object obj = (List) this.f1142b.get(inc);
        jri.m13404b(obj);
        return obj.contains(ine);
    }
}
