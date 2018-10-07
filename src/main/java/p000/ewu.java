package p000;

import java.util.Set;

/* compiled from: PG */
/* renamed from: ewu */
public final class ewu implements kwk {
    /* renamed from: a */
    private final kwk f17945a;
    /* renamed from: b */
    private final kwk f17946b;
    /* renamed from: c */
    private final kwk f17947c;
    /* renamed from: d */
    private final kwk f17948d;

    private ewu(kwk kwk, kwk kwk2, kwk kwk3, kwk kwk4) {
        this.f17945a = kwk;
        this.f17946b = kwk2;
        this.f17947c = kwk3;
        this.f17948d = kwk4;
    }

    /* renamed from: a */
    public static ewu m10193a(kwk kwk, kwk kwk2, kwk kwk3, kwk kwk4) {
        return new ewu(kwk, kwk2, kwk3, kwk4);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo10566a() {
        return (Set) ktm.m14219a(euh.m2178a(this.f17945a, (bmb) this.f17946b.mo10566a(), (etg) this.f17947c.mo10566a(), (ird) this.f17948d.mo10566a()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
