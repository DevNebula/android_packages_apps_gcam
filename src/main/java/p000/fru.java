package p000;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* renamed from: fru */
public final class fru implements kwk {
    /* renamed from: a */
    private final kwk f18732a;
    /* renamed from: b */
    private final kwk f18733b;
    /* renamed from: c */
    private final kwk f18734c;
    /* renamed from: d */
    private final kwk f18735d;
    /* renamed from: e */
    private final kwk f18736e;
    /* renamed from: f */
    private final kwk f18737f;
    /* renamed from: g */
    private final kwk f18738g;
    /* renamed from: h */
    private final kwk f18739h;
    /* renamed from: i */
    private final kwk f18740i;
    /* renamed from: j */
    private final kwk f18741j;

    private fru(kwk kwk, kwk kwk2, kwk kwk3, kwk kwk4, kwk kwk5, kwk kwk6, kwk kwk7, kwk kwk8, kwk kwk9, kwk kwk10) {
        this.f18732a = kwk;
        this.f18733b = kwk2;
        this.f18734c = kwk3;
        this.f18735d = kwk4;
        this.f18736e = kwk5;
        this.f18737f = kwk6;
        this.f18738g = kwk7;
        this.f18739h = kwk8;
        this.f18740i = kwk9;
        this.f18741j = kwk10;
    }

    /* renamed from: a */
    public static fru m10910a(kwk kwk, kwk kwk2, kwk kwk3, kwk kwk4, kwk kwk5, kwk kwk6, kwk kwk7, kwk kwk8, kwk kwk9, kwk kwk10) {
        return new fru(kwk, kwk2, kwk3, kwk4, kwk5, kwk6, kwk7, kwk8, kwk9, kwk10);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo10566a() {
        kwk kwk = this.f18732a;
        kwk kwk2 = this.f18733b;
        kwk kwk3 = this.f18734c;
        kwk kwk4 = this.f18735d;
        kwk kwk5 = this.f18736e;
        kwk kwk6 = this.f18737f;
        kwk kwk7 = this.f18738g;
        kwk kwk8 = this.f18739h;
        kwk kwk9 = this.f18740i;
        kwk kwk10 = this.f18741j;
        ikb ikb = (ikb) kwk.mo10566a();
        kwk2.mo10566a();
        fij fij = (fij) kwk3.mo10566a();
        fne fne = (fne) kwk4.mo10566a();
        Executor executor = (Executor) kwk6.mo10566a();
        Executor executor2 = (Executor) kwk7.mo10566a();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) kwk8.mo10566a();
        iqz iqz = (iqz) kwk9.mo10566a();
        ird ird = (ird) kwk10.mo10566a();
        fjk a = ((fjm) kwk5.mo10566a()).mo6835a(new fjm[0]);
        fjl a2 = a.mo6830a();
        int min = Math.min(fne.mo6863b(), a.mo6833c());
        int min2 = Math.min(min, 1);
        iqo frk = new frk(fij, fne, a2, min2, min, Math.max(10, min2 * 3), executor2, executor, scheduledExecutorService, iqz, ird);
        ikb.mo8557a(frk);
        return (frk) ktm.m14219a(frk, "Cannot return null from a non-@Nullable @Provides method");
    }
}
