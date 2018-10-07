package p000;

import java.util.Collection;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: ckh */
final class ckh implements Runnable {
    /* renamed from: a */
    public final fkp f2283a;
    /* renamed from: b */
    public final kpw f2284b;
    /* renamed from: c */
    public final kpk f2285c;
    /* renamed from: d */
    public final C0556wd f2286d;
    /* renamed from: e */
    private final fre f2287e;
    /* renamed from: f */
    private final Executor f2288f;
    /* renamed from: g */
    private final iqm f2289g;
    /* renamed from: h */
    private final Collection f2290h;

    public ckh(fkp fkp, fre fre, Executor executor, Collection collection, kpw kpw, kpk kpk, iqm iqm, C0556wd c0556wd) {
        jri.m13404b((Object) fkp);
        jri.m13404b((Object) fre);
        jri.m13404b((Object) collection);
        jri.m13404b((Object) kpw);
        jri.m13404b((Object) kpk);
        this.f2283a = fkp;
        this.f2287e = fre;
        this.f2288f = executor;
        this.f2290h = collection;
        this.f2284b = kpw;
        this.f2285c = kpk;
        this.f2289g = iqm;
        this.f2286d = c0556wd;
    }

    public final void run() {
        try {
            frj a = fri.m10892a(this.f2283a).mo6876a(this.f2290h);
            a.f4895a = this.f2289g;
            kow.m13878a(this.f2287e.mo6872a(a.mo6875a()), new cki(this), this.f2288f);
        } catch (Throwable e) {
            this.f2284b.mo15642a(e);
        } finally {
            this.f2283a.close();
        }
    }
}
