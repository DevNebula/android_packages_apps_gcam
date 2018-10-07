package p000;

import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* renamed from: ffo */
public final class ffo implements kwk {
    /* renamed from: a */
    private final kwk f18220a;
    /* renamed from: b */
    private final kwk f18221b;

    private ffo(kwk kwk, kwk kwk2) {
        this.f18220a = kwk;
        this.f18221b = kwk2;
    }

    /* renamed from: a */
    public static ffo m10479a(kwk kwk, kwk kwk2) {
        return new ffo(kwk, kwk2);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo10566a() {
        kwk kwk = this.f18220a;
        ikb ikb = (ikb) kwk.mo10566a();
        ikb ikb2 = (ikb) this.f18221b.mo10566a();
        ScheduledExecutorService e = iel.m3780e("SchCameraEx", 1);
        e.getClass();
        ikb.mo8557a(new ffk(e));
        e.getClass();
        ikb2.mo8557a(new ffl(e));
        return (ScheduledExecutorService) ktm.m14219a(e, "Cannot return null from a non-@Nullable @Provides method");
    }
}
