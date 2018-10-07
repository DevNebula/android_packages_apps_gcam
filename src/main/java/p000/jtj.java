package p000;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* renamed from: jtj */
public final class jtj {
    /* renamed from: a */
    public final jtl f8327a;
    /* renamed from: b */
    public float[] f8328b;
    /* renamed from: c */
    public float[] f8329c;
    /* renamed from: d */
    public float[] f8330d;
    /* renamed from: e */
    public float f8331e;
    /* renamed from: f */
    private final List f8332f = new ArrayList();
    /* renamed from: g */
    private final List f8333g = new ArrayList();

    jtj(jtl jtl) {
        this.f8327a = jtl;
    }

    /* renamed from: a */
    public final jtj mo9549a(jtv jtv) {
        this.f8333g.add(jqk.m13342a((Object) jtv));
        return this;
    }

    /* renamed from: a */
    public final jtj mo9550a(jxi jxi) {
        this.f8333g.add(m4686a(jxi.f8434a));
        return this;
    }

    /* renamed from: a */
    public final jtj mo9551a(jza jza) {
        this.f8333g.add(m4686a(jza.name()));
        return this;
    }

    /* renamed from: a */
    public final jtj mo9548a(jto jto) {
        this.f8332f.add(jto);
        return this;
    }

    /* renamed from: a */
    public final jti mo9547a() {
        return new jti(this.f8333g, this.f8331e, this.f8332f, this.f8328b, this.f8329c, this.f8330d);
    }

    /* renamed from: a */
    private final kbn m4686a(String str) {
        return jqk.m13343a(new jtk(this, str));
    }
}
