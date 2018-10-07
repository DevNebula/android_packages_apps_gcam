package p000;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* compiled from: PG */
/* renamed from: bce */
public final class bce implements kwk {
    /* renamed from: a */
    private final kwk f11167a;
    /* renamed from: b */
    private final kwk f11168b;

    private bce(kwk kwk, kwk kwk2) {
        this.f11167a = kwk;
        this.f11168b = kwk2;
    }

    /* renamed from: a */
    public static bce m7334a(kwk kwk, kwk kwk2) {
        return new bce(kwk, kwk2);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo10566a() {
        kwk kwk = this.f11167a;
        return (Executor) ktm.m14219a(new ikh((ikd) this.f11168b.mo10566a(), (ExecutorService) kwk.mo10566a()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
