package p000;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: ccz */
public final class ccz implements kwk {
    /* renamed from: a */
    private final kwk f12199a;
    /* renamed from: b */
    private final kwk f12200b;

    private ccz(kwk kwk, kwk kwk2) {
        this.f12199a = kwk;
        this.f12200b = kwk2;
    }

    /* renamed from: a */
    public static ccz m8130a(kwk kwk, kwk kwk2) {
        return new ccz(kwk, kwk2);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo10566a() {
        kwk kwk = this.f12199a;
        kwk kwk2 = this.f12200b;
        kwk.mo10566a();
        return (Executor) ktm.m14219a(new ijx(ijy.m3846a((ikb) kwk2.mo10566a(), "IrisQ")), "Cannot return null from a non-@Nullable @Provides method");
    }
}
