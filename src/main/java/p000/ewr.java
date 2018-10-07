package p000;

import java.util.Set;

/* compiled from: PG */
/* renamed from: ewr */
public final class ewr implements kwk {
    /* renamed from: a */
    private final kwk f17934a;
    /* renamed from: b */
    private final kwk f17935b;
    /* renamed from: c */
    private final kwk f17936c;
    /* renamed from: d */
    private final kwk f17937d;
    /* renamed from: e */
    private final kwk f17938e;

    private ewr(kwk kwk, kwk kwk2, kwk kwk3, kwk kwk4, kwk kwk5) {
        this.f17934a = kwk;
        this.f17935b = kwk2;
        this.f17936c = kwk3;
        this.f17937d = kwk4;
        this.f17938e = kwk5;
    }

    /* renamed from: a */
    public static ewr m10188a(kwk kwk, kwk kwk2, kwk kwk3, kwk kwk4, kwk kwk5) {
        return new ewr(kwk, kwk2, kwk3, kwk4, kwk5);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo10566a() {
        kwk kwk = this.f17934a;
        return (Set) ktm.m14219a(euh.m2181b((Integer) kwk.mo10566a(), this.f17935b, (bmb) this.f17936c.mo10566a(), (etg) this.f17937d.mo10566a(), (ird) this.f17938e.mo10566a()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
