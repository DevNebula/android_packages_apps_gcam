package p000;

import java.util.Arrays;

/* compiled from: PG */
/* renamed from: kbd */
public final class kbd {
    /* renamed from: a */
    private final String f8547a;
    /* renamed from: b */
    private final kbe f8548b = new kbe();
    /* renamed from: c */
    private kbe f8549c = this.f8548b;

    public kbd(String str) {
        this.f8547a = (String) jri.m13404b((Object) str);
    }

    /* renamed from: a */
    public final kbd mo9701a(String str, int i) {
        return mo9703a(str, String.valueOf(i));
    }

    /* renamed from: a */
    public final kbd mo9702a(String str, long j) {
        return mo9703a(str, String.valueOf(j));
    }

    /* renamed from: a */
    public final kbe mo9704a() {
        kbe kbe = new kbe();
        this.f8549c.f8552c = kbe;
        this.f8549c = kbe;
        return kbe;
    }

    /* renamed from: a */
    public final kbd mo9703a(String str, Object obj) {
        kbe a = mo9704a();
        a.f8551b = obj;
        a.f8550a = (String) jri.m13404b((Object) str);
        return this;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder(32);
        stringBuilder.append(this.f8547a);
        stringBuilder.append('{');
        kbe kbe = this.f8548b.f8552c;
        String str = "";
        while (kbe != null) {
            Object obj = kbe.f8551b;
            stringBuilder.append(str);
            str = kbe.f8550a;
            if (str != null) {
                stringBuilder.append(str);
                stringBuilder.append('=');
            }
            if (obj == null || !obj.getClass().isArray()) {
                stringBuilder.append(obj);
            } else {
                CharSequence deepToString = Arrays.deepToString(new Object[]{obj});
                stringBuilder.append(deepToString, 1, deepToString.length() - 1);
            }
            kbe = kbe.f8552c;
            str = ", ";
        }
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
