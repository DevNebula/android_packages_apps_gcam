package p000;

import java.util.concurrent.ExecutorService;

/* compiled from: PG */
/* renamed from: gue */
public final class gue implements kwk {
    /* renamed from: a */
    private final kwk f19612a;
    /* renamed from: b */
    private final kwk f19613b;
    /* renamed from: c */
    private final kwk f19614c;
    /* renamed from: d */
    private final kwk f19615d;

    private gue(kwk kwk, kwk kwk2, kwk kwk3, kwk kwk4) {
        this.f19612a = kwk;
        this.f19613b = kwk2;
        this.f19614c = kwk3;
        this.f19615d = kwk4;
    }

    /* renamed from: a */
    public static gue m11771a(kwk kwk, kwk kwk2, kwk kwk3, kwk kwk4) {
        return new gue(kwk, kwk2, kwk3, kwk4);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo10566a() {
        kwk kwk = this.f19612a;
        kwk kwk2 = this.f19613b;
        kwk kwk3 = this.f19614c;
        kwk kwk4 = this.f19615d;
        ExecutorService executorService = (ExecutorService) kwk.mo10566a();
        gsx gsx = (gsx) kwk2.mo10566a();
        kwk3.mo10566a();
        return (guf) ktm.m14219a(new gug(gsx, executorService, (gub) kwk4.mo10566a()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
