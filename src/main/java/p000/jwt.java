package p000;

import android.util.Pair;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* renamed from: jwt */
public final class jwt implements jwp {
    /* renamed from: a */
    public Map f21786a = new HashMap();
    /* renamed from: b */
    private final jwp f21787b;

    public jwt(jwp jwp) {
        this.f21787b = jwp;
    }

    /* renamed from: a */
    public final float mo9581a(jky jky, jky jky2) {
        float a = this.f21787b.mo9581a(jky, jky2);
        this.f21786a.put(new Pair(Long.valueOf(jky.mo9481b()), Long.valueOf(jky2.mo9481b())), Float.valueOf(a));
        return a;
    }
}
