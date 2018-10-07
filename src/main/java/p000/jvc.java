package p000;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* renamed from: jvc */
public final class jvc extends jum {
    /* renamed from: a */
    private final Set f24839a;

    public jvc(jum... jumArr) {
        Object b = khb.m4946b(jumArr.length);
        Collections.addAll(b, jumArr);
        this.f24839a = b;
    }

    /* renamed from: a */
    public final juh mo13869a(juh juh) {
        Collection hashSet = new HashSet();
        for (jum a : this.f24839a) {
            hashSet.addAll(ken.m13713a(a.mo13869a(juh).f8350a));
        }
        return new juh(hashSet);
    }

    public final String toString() {
        String a = kaz.m4791a(" | ").mo9693a(this.f24839a);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(a).length() + 2);
        stringBuilder.append("(");
        stringBuilder.append(a);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
