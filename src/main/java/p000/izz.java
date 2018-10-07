package p000;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: izz */
public final class izz implements jaq {
    /* renamed from: a */
    private final kpk f21402a;

    public izz(kpk kpk) {
        jri.m13404b((Object) kpk);
        this.f21402a = kpk;
    }

    /* renamed from: a */
    public final void mo9282a(izh izh) {
        kpk kpk = this.f21402a;
        kpk.mo10200a(new jae(kpk, izh), kpq.f8776a);
    }

    /* renamed from: a */
    public final kpk mo9281a() {
        return this.f21402a;
    }

    /* renamed from: b */
    public final Object mo9284b() {
        try {
            Object obj = this.f21402a.get();
            if (obj != null) {
                return obj;
            }
            throw jar.m4449a(new IllegalStateException("Result value was null"));
        } catch (ExecutionException e) {
            throw jar.m4449a(e.getCause());
        }
    }

    /* renamed from: c */
    public final boolean mo9285c() {
        return this.f21402a.isDone();
    }

    /* renamed from: a */
    public final jaq mo9275a(Executor executor, izi izi) {
        jri.m13404b((Object) executor);
        jri.m13404b((Object) izi);
        kpk kpk = this.f21402a;
        Object jai = new jai(kpk, new jaf(izi), null, executor, jcd.f21428b);
        kpk.mo10200a(jai, kpq.f8776a);
        return jai.f7970a;
    }

    /* renamed from: a */
    public final jaq mo9276a(Executor executor, izi izi, izi izi2) {
        jri.m13404b((Object) executor);
        jri.m13404b((Object) izi);
        jri.m13404b((Object) izi2);
        kpk kpk = this.f21402a;
        Object jai = new jai(kpk, new jaf(izi), new jaf(izi2), executor, jcd.f21428b);
        kpk.mo10200a(jai, kpq.f8776a);
        return jai.f7970a;
    }

    /* renamed from: a */
    public final jaq mo9277a(Executor executor, jau jau) {
        jri.m13404b((Object) executor);
        jri.m13404b((Object) jau);
        kpk kpk = this.f21402a;
        Object jai = new jai(kpk, new jag(jau), null, executor, jcd.f21428b);
        kpk.mo10200a(jai, kpq.f8776a);
        return jai.f7970a;
    }

    /* renamed from: a */
    public final jaq mo9278a(Executor executor, jau jau, jau jau2) {
        jri.m13404b((Object) executor);
        jri.m13404b((Object) jau);
        jri.m13404b((Object) jau2);
        kpk kpk = this.f21402a;
        Object jai = new jai(kpk, new jag(jau), new jag(jau2), executor, jcd.f21428b);
        kpk.mo10200a(jai, kpq.f8776a);
        return jai.f7970a;
    }

    /* renamed from: a */
    public final jaq mo9279a(Executor executor, Runnable runnable) {
        jri.m13404b((Object) executor);
        jri.m13404b((Object) runnable);
        return mo9276a(executor, new jaa(runnable), new jab(runnable));
    }

    /* renamed from: a */
    public final jaq mo9280a(Executor executor, jlf jlf) {
        return mo9278a(executor, new jac(jlf), new jad(jlf));
    }

    /* renamed from: b */
    public final jaq mo9283b(Executor executor, izi izi) {
        jri.m13404b((Object) executor);
        jri.m13404b((Object) izi);
        return mo9276a(executor, new izk(), izi);
    }
}
