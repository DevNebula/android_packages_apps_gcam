package p000;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* renamed from: fkw */
final class fkw implements fjk {
    /* renamed from: a */
    public final fxy f18387a;
    /* renamed from: b */
    private final Set f18388b;
    /* renamed from: c */
    private final fjk f18389c;

    fkw(Set set, fjk fjk) {
        this.f18388b = set;
        this.f18389c = fjk;
        List arrayList = new ArrayList();
        for (fkv fkv : this.f18388b) {
            arrayList.add(fkv.f18385a);
        }
        this.f18387a = new fxy(arrayList);
    }

    /* renamed from: a */
    public final fjn mo6831a(int i, int i2, fju fju) {
        return new fky(this.f18389c.mo6831a(i, i2, fju), this);
    }

    /* renamed from: a */
    public final fjl mo6830a() {
        return new fkx(this, this.f18389c.mo6830a());
    }

    /* renamed from: b */
    public final ilp mo6832b() {
        return this.f18387a.f18888a;
    }

    /* renamed from: c */
    public final int mo6833c() {
        return this.f18389c.mo6833c();
    }
}
