package p000;

import android.util.LruCache;

/* compiled from: PG */
/* renamed from: jwl */
public final class jwl implements jwp {
    /* renamed from: a */
    public final boolean f21781a = true;
    /* renamed from: b */
    private final LruCache f21782b;
    /* renamed from: c */
    private final jwp f21783c;

    public jwl(jwp jwp, int i) {
        this.f21783c = jwp;
        this.f21782b = new LruCache(i);
    }

    /* renamed from: a */
    public final float mo9581a(jky jky, jky jky2) {
        jwm jwm = new jwm(this, jky, jky2);
        Float f = (Float) this.f21782b.get(jwm);
        if (f == null) {
            f = Float.valueOf(this.f21783c.mo9581a(jky, jky2));
            this.f21782b.put(jwm, f);
        }
        return f.floatValue();
    }
}
