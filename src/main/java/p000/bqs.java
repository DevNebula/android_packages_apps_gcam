package p000;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* compiled from: PG */
/* renamed from: bqs */
public final class bqs implements kwk {
    /* renamed from: a */
    private final kwk f11703a;

    public bqs(kwk kwk) {
        this.f11703a = kwk;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo10566a() {
        return (Executor) ktm.m14219a(new ikh((ikd) this.f11703a.mo10566a(), Executors.newCachedThreadPool(iel.m3779d("FaceBeau", 0))), "Cannot return null from a non-@Nullable @Provides method");
    }
}
