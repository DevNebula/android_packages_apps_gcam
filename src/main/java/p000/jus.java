package p000;

import java.util.List;

/* compiled from: PG */
/* renamed from: jus */
public final class jus extends jum {
    /* renamed from: a */
    private final List f24813a;

    private jus(List list) {
        jri.m13404b((Object) list);
        this.f24813a = list;
    }

    /* renamed from: a */
    public final juh mo13869a(juh juh) {
        for (jum a : this.f24813a) {
            juh = a.mo13869a(juh);
        }
        return juh;
    }

    /* renamed from: a */
    public static jus m16687a(jum... jumArr) {
        return new jus(khb.m4924a((Object[]) jumArr));
    }

    public final String toString() {
        String a = kaz.m4791a(",").mo9693a(this.f24813a);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(a).length() + 30);
        stringBuilder.append("ChainedSegmentFilter[filters=");
        stringBuilder.append(a);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
