package p000;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* renamed from: fna */
public final class fna implements fne {
    /* renamed from: a */
    private final kpk f18476a;
    /* renamed from: b */
    private final int f18477b;
    /* renamed from: c */
    private final ilp f18478c;

    public fna(kpk kpk, int i) {
        this.f18476a = kpk;
        this.f18477b = i;
        ilp ilb = new ilb(Integer.valueOf(0));
        kow.m13878a(kpk, new fnb(ilb), kpq.f8776a);
        this.f18478c = ilq.m3889b(ilb);
    }

    /* renamed from: a */
    public final ilp mo6862a() {
        return this.f18478c;
    }

    /* renamed from: b */
    public final int mo6863b() {
        return this.f18477b;
    }

    /* renamed from: a */
    public final fng mo6861a(int i) {
        try {
            return ((fne) this.f18476a.get(0, TimeUnit.SECONDS)).mo6861a(i);
        } catch (ExecutionException e) {
            return null;
        } catch (TimeoutException e2) {
            return null;
        } catch (InterruptedException e3) {
            Thread.currentThread().interrupt();
            return null;
        }
    }
}
