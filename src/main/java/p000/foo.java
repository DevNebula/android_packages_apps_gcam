package p000;

/* compiled from: PG */
/* renamed from: foo */
public final class foo implements kwk {
    /* renamed from: a */
    private final fpn f18524a;
    /* renamed from: b */
    private final kwk f18525b;
    /* renamed from: c */
    private final kwk f18526c;

    private foo(fpn fpn, kwk kwk, kwk kwk2) {
        this.f18524a = fpn;
        this.f18525b = kwk;
        this.f18526c = kwk2;
    }

    /* renamed from: a */
    public static foo m10767a(fpn fpn, kwk kwk, kwk kwk2) {
        return new foo(fpn, kwk, kwk2);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo10566a() {
        fpn fpn = this.f18524a;
        kwk kwk = this.f18525b;
        return (fne) ktm.m14219a(new fna(kny.m18475a(kny.m18475a((kpk) kwk.mo10566a(), new fpo(), kpq.f8776a), new fni((fnh) this.f18526c.mo10566a(), fpn.f4891b, 3), kpq.f8776a), 3), "Cannot return null from a non-@Nullable @Provides method");
    }
}
