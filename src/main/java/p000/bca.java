package p000;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* compiled from: PG */
/* renamed from: bca */
public final class bca implements kwk {
    /* renamed from: a */
    private final kwk f11163a;
    /* renamed from: b */
    private final kwk f11164b;

    public bca(kwk kwk, kwk kwk2) {
        this.f11163a = kwk;
        this.f11164b = kwk2;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo10566a() {
        kwk kwk = this.f11163a;
        return (Executor) ktm.m14219a(new ikh((ikd) this.f11164b.mo10566a(), (ExecutorService) kwk.mo10566a()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
