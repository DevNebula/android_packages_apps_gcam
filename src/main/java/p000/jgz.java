package p000;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: jgz */
class jgz implements jgx {
    /* renamed from: a */
    public final int f21478a;
    /* renamed from: b */
    public final kpk f21479b;
    /* renamed from: c */
    public final kpk f21480c;
    /* renamed from: d */
    public final kpk f21481d;
    /* renamed from: e */
    public final kpk f21482e;
    /* renamed from: f */
    public final kpw f21483f;
    /* renamed from: g */
    public final kpw f21484g;
    /* renamed from: h */
    public final kpw f21485h;
    /* renamed from: i */
    public final List f21486i = new ArrayList();
    /* renamed from: j */
    private final List f21487j = new ArrayList();
    /* renamed from: k */
    private final List f21488k = new ArrayList();
    /* renamed from: l */
    private final List f21489l = new ArrayList();
    /* renamed from: m */
    private final List f21490m = new ArrayList();
    /* renamed from: n */
    private final Executor f21491n;
    /* renamed from: o */
    private final boolean f21492o;
    /* renamed from: p */
    private boolean f21493p;

    public jgz(kpk kpk, kpk kpk2, kpk kpk3, kpk kpk4, boolean z, Executor executor) {
        this.f21479b = kpk;
        this.f21480c = kpk2;
        this.f21481d = kpk3;
        this.f21482e = kpk4;
        this.f21478a = 0;
        this.f21492o = z;
        this.f21491n = executor;
        this.f21483f = kpw.m18486d();
        this.f21484g = kpw.m18486d();
        this.f21485h = kpw.m18486d();
    }

    /* renamed from: a */
    public final synchronized jhf mo9414a(jhe jhe) {
        jhf jhg;
        if (this.f21493p) {
            throw new IllegalStateException("Muxer already started. No tracks can be added now.");
        }
        kpk d = kpw.m18486d();
        this.f21488k.add(jhe.f8198a);
        this.f21486i.add(new jha(this, jhe, d));
        jhg = new jhg(d, this.f21483f, this.f21484g, jhe, this.f21491n);
        this.f21490m.add(jhg.f21498e);
        this.f21487j.add(jhg.f21497d);
        this.f21489l.add(jhg);
        if (this.f21492o) {
            jhg = jgn.m13076a(jhg);
        }
        return jhg;
    }

    /* renamed from: a */
    public final synchronized void mo9415a() {
        if (this.f21493p) {
            throw new IllegalStateException("Muxer already started. Cannot call start twice.");
        }
        this.f21493p = true;
        kow.m13877a(this.f21479b, this.f21480c, this.f21481d, this.f21482e).mo10200a(new jhb(this), this.f21491n);
        Iterable c = khb.m4955c(this.f21488k);
        c.addAll(this.f21490m);
        kpk a = kow.m13872a(c);
        a.mo10200a(new jhc(this, a), this.f21491n);
        kow.m13872a(this.f21487j).mo10200a(new jhd(this), this.f21491n);
    }

    /* renamed from: b */
    public final kpk mo9416b() {
        return this.f21485h;
    }
}
