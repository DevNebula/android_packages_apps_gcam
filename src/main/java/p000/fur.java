package p000;

/* compiled from: PG */
/* renamed from: fur */
public final class fur implements kwk {
    /* renamed from: a */
    private final kwk f18808a;
    /* renamed from: b */
    private final kwk f18809b;

    private fur(kwk kwk, kwk kwk2) {
        this.f18808a = kwk;
        this.f18809b = kwk2;
    }

    /* renamed from: a */
    public static fur m10985a(kwk kwk, kwk kwk2) {
        return new fur(kwk, kwk2);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo10566a() {
        kwk kwk = this.f18808a;
        ftx ftx = (ftx) kwk.mo10566a();
        return (fuc) ktm.m14219a(new fuc(ftx, ftx, (fuh) this.f18809b.mo10566a()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
