package p000;

/* compiled from: PG */
/* renamed from: dqm */
public final class dqm implements kwk {
    /* renamed from: a */
    private final kwk f16506a;
    /* renamed from: b */
    private final kwk f16507b;

    private dqm(kwk kwk, kwk kwk2) {
        this.f16506a = kwk;
        this.f16507b = kwk2;
    }

    /* renamed from: a */
    public static dqm m9415a(kwk kwk, kwk kwk2) {
        return new dqm(kwk, kwk2);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo10566a() {
        kwk kwk = this.f16506a;
        dqf dqf = (dqf) kwk.mo10566a();
        ((ikb) this.f16507b.mo10566a()).mo8557a(dqf);
        return (fbj) ktm.m14219a(dqf, "Cannot return null from a non-@Nullable @Provides method");
    }
}
