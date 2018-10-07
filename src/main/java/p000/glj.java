package p000;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: glj */
public final class glj {
    /* renamed from: a */
    private final kwk f5607a;
    /* renamed from: b */
    private final kwk f5608b;
    /* renamed from: c */
    private final kwk f5609c;
    /* renamed from: d */
    private final kwk f5610d;
    /* renamed from: e */
    private final kwk f5611e;
    /* renamed from: f */
    private final kwk f5612f;
    /* renamed from: g */
    private final kwk f5613g;
    /* renamed from: h */
    private final kwk f5614h;
    /* renamed from: i */
    private final kwk f5615i;

    public glj(kwk kwk, kwk kwk2, kwk kwk3, kwk kwk4, kwk kwk5, kwk kwk6, kwk kwk7, kwk kwk8, kwk kwk9) {
        this.f5607a = (kwk) glj.m2641a(kwk, 1);
        this.f5608b = (kwk) glj.m2641a(kwk2, 2);
        this.f5609c = (kwk) glj.m2641a(kwk3, 3);
        this.f5610d = (kwk) glj.m2641a(kwk4, 4);
        this.f5611e = (kwk) glj.m2641a(kwk5, 5);
        this.f5612f = (kwk) glj.m2641a(kwk6, 6);
        this.f5613g = (kwk) glj.m2641a(kwk7, 7);
        this.f5614h = (kwk) glj.m2641a(kwk8, 8);
        this.f5615i = (kwk) glj.m2641a(kwk9, 9);
    }

    /* renamed from: a */
    private static Object m2641a(Object obj, int i) {
        if (obj != null) {
            return obj;
        }
        StringBuilder stringBuilder = new StringBuilder(93);
        stringBuilder.append("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        stringBuilder.append(i);
        throw new NullPointerException(stringBuilder.toString());
    }

    /* renamed from: a */
    public final glf mo7187a(String str, long j, kbg kbg) {
        return new glf((gnh) glj.m2641a((gnh) this.f5607a.mo10566a(), 1), (gmp) glj.m2641a((gmp) this.f5608b.mo10566a(), 2), (Executor) glj.m2641a((Executor) this.f5609c.mo10566a(), 3), (gsp) glj.m2641a((gsp) this.f5610d.mo10566a(), 4), (gsl) glj.m2641a((gsl) this.f5611e.mo10566a(), 5), (hju) glj.m2641a((hju) this.f5612f.mo10566a(), 6), (grg) glj.m2641a((grg) this.f5613g.mo10566a(), 7), (gny) glj.m2641a((gny) this.f5614h.mo10566a(), 8), (gnu) glj.m2641a((gnu) this.f5615i.mo10566a(), 9), (String) glj.m2641a(str, 10), j, (kbg) glj.m2641a(kbg, 12));
    }
}
