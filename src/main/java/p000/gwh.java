package p000;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: gwh */
public final class gwh implements kwk {
    /* renamed from: a */
    private final kwk f19724a;
    /* renamed from: b */
    private final kwk f19725b;

    public gwh(kwk kwk, kwk kwk2) {
        this.f19724a = kwk;
        this.f19725b = kwk2;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo10566a() {
        kwk kwk = this.f19724a;
        Context context = (Context) kwk.mo10566a();
        Executor executor = (Executor) this.f19725b.mo10566a();
        kpw d = kpw.m18486d();
        executor.execute(new gwf(context, d));
        return (kpk) ktm.m14219a(d, "Cannot return null from a non-@Nullable @Provides method");
    }
}
