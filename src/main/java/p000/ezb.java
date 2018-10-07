package p000;

import java.util.List;

/* compiled from: PG */
/* renamed from: ezb */
public final class ezb implements kwk {
    /* renamed from: a */
    private final kwk f18053a;
    /* renamed from: b */
    private final kwk f18054b;

    private ezb(kwk kwk, kwk kwk2) {
        this.f18053a = kwk;
        this.f18054b = kwk2;
    }

    /* renamed from: a */
    public static ezb m10278a(kwk kwk, kwk kwk2) {
        return new ezb(kwk, kwk2);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo10566a() {
        kwk kwk = this.f18053a;
        exk exk = (exk) kwk.mo10566a();
        this.f18054b.mo10566a();
        return (List) ktm.m14219a(eza.m2246a(exk), "Cannot return null from a non-@Nullable @Provides method");
    }
}
