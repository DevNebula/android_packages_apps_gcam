package p000;

import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* renamed from: jvi */
public final class jvi implements juk {
    /* renamed from: a */
    public final juk f21767a;
    /* renamed from: b */
    private final Map f21768b = khb.m4958c();

    public jvi(juk juk) {
        this.f21767a = juk;
    }

    /* renamed from: a */
    public final List mo9570a(List list) {
        List list2 = (List) this.f21768b.get(list);
        if (list2 != null) {
            return list2;
        }
        list2 = this.f21767a.mo9570a(list);
        this.f21768b.put(list, list2);
        return list2;
    }

    public final String toString() {
        String obj = this.f21767a.toString();
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(obj).length() + 8);
        stringBuilder.append("cached[");
        stringBuilder.append(obj);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
