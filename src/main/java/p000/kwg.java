package p000;

import java.util.List;

/* compiled from: PG */
/* renamed from: kwg */
public final class kwg {
    /* renamed from: a */
    private final List f9102a;
    /* renamed from: b */
    private final List f9103b;

    kwg(int i, int i2) {
        this.f9102a = ktm.m14223a(i);
        this.f9103b = ktm.m14223a(i2);
    }

    /* renamed from: a */
    public final kwg mo10564a(kwk kwk) {
        this.f9103b.add(kwk);
        return this;
    }

    /* renamed from: b */
    public final kwg mo10565b(kwk kwk) {
        this.f9102a.add(kwk);
        return this;
    }

    /* renamed from: a */
    public final kwf mo10563a() {
        return new kwf(this.f9102a, this.f9103b);
    }
}
